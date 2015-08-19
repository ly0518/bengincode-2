package org.begincode.web.control.blog;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.begincode.blog.service.BlogService;
import org.begincode.blog.service.BlogTypeService;
import org.begincode.core.constant.BeginCodeConstant;
import org.begincode.core.model.BegincodeUser;
import org.begincode.core.model.Blog;
import org.begincode.core.paginator.BeginCodeInterceptor;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.exception.BeginCodeException;
import org.begincode.task.queue.CountOperator;
import org.begincode.user.facade.UserFacade;
import org.begincode.user.service.UserService;
import org.begincode.web.control.cookie.CookieOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

/** 
* @ClassName: BlogController 
* @Description: 博客
* @author yangsj 
* @date 2015年8月1日 下午3:32:26 
*  
*/
@Controller
@RequestMapping("/blog")
public class BlogController {

	private Logger logger = Logger.getLogger(BlogController.class);

	@Autowired
	BlogService blogService;
	@Autowired
	BlogTypeService blogTypeService;
	@Autowired
	UserService userService;
	@Autowired
	UserFacade userFacade;
	@Autowired
	CountOperator countOperator;

	@RequestMapping(value="", method = RequestMethod.GET)
	public String selBlogList(Model model) {
		Paginator page = new Paginator(0, BeginCodeConstant.PAGE_SIZE);
		PageList list = blogService.findBlogs( page);
		model.addAttribute("blogs", list);
		model.addAttribute("pageinfo", list.getPaginator());
		return "/page/blog/blogs";
	}

	@RequestMapping(value = "/{blogId}", method = RequestMethod.GET)
	public String selBlogs(Model model, @PathVariable("blogId") int blogId) {
		Blog record = blogService.findBlogById(blogId);
		if(record == null){
			logger.info("blogId 不存在");
			throw  new BeginCodeException("blogId 不存在" +blogId);
		}
		//新增浏览次数
		countOperator.addBlogViewCount(blogId);
		model.addAttribute("blog", record);
		return "/page/blog/blog_view";
	}

	@RequestMapping(value = "/userId", method = RequestMethod.GET)
	public String addBlogInit(Model model,HttpServletRequest request) {
		Map<String, String> cookieMap = CookieOperation.getCookie(request);
		logger.info("登陆用户"+cookieMap);
		if(cookieMap != null){
			BegincodeUser logUser = userFacade.findUser(cookieMap.get("openId"), cookieMap.get("accessToken"));
			logger.info("用户信息"+logUser.toString());
			if(logUser.getCheckFlag().equals(BeginCodeConstant.CHECK_PAAS)){
				model.addAttribute("user",logUser);
				model.addAttribute("blogTypes", blogTypeService.findBlogTypeByUserId(logUser.getBegincodeUserId()));
				return "/page/blog/blog_edit";				
			}else{
				
				return request.getContextPath();
			}

		}else{
//			抛出异常
			logger.info("未获得登陆信息");
			return null;
		}
	}

	@RequestMapping(value = "/blogs", method = RequestMethod.GET)
	@ResponseBody
	public List getBlogs(Paginator pageinfo) {
		if (pageinfo != null) {
			pageinfo.setLimit(BeginCodeConstant.PAGE_SIZE);
			PageList list = blogService.findBlogs(pageinfo);
			return list;
		} else {
			return null;
		}
	}

	@RequestMapping(value = "/topTen", method = RequestMethod.GET)
	@ResponseBody
	public List findTopTen() throws IOException {
		Paginator pageinfo = new Paginator(0,BeginCodeConstant.PAGE_SIZE);
		pageinfo.setOrderStr(" order by view_count desc ");
		PageList list = blogService.findBlogs(pageinfo);
		return list;
	}

	@RequestMapping(value = "/blogType/{typeId}", method = RequestMethod.GET)
	@ResponseBody
	public List findRelationTopFive(@PathVariable("typeId") int typeId) {
		Paginator pageinfo = new Paginator(0, 5);
		pageinfo.setOrderStr(" order by view_count desc ");
		BeginCodeInterceptor.localPage.set(pageinfo);
		Blog blog = new Blog();
		blog.setBlogTypeId(typeId);
		PageList list = blogService.findBlogsByRecord(blog);
		return list;
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public Map addBlog(Blog blog) {
		Map message = new HashMap();
		blog.setCreateDatetime(new Date());
		blog.setDeleteFlag(BeginCodeConstant.DELETE_FLAG_NOMAL);
		blog.setBegincodeNavigationId(BeginCodeConstant.NAV_CODE_SHARE);
		blog.setBegincodeKeys(HtmlUtils.htmlEscape(blog.getBegincodeKeys()));
		blog.setBlogAbstract((HtmlUtils.htmlEscape(blog.getBlogAbstract())));
		blog.setBlogInfo(HtmlUtils.htmlEscape(blog.getBlogInfo()));
		blogService.createBlog(blog);
		if (blog.getBlogId() != null) {
			message.put("msg", "保存成功");
		} else {
			message.put("msg", "保存失败");
		}
		return message;
	}
}
