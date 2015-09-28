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
import org.begincode.core.model.BlogType;
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

	@RequestMapping(value="/blogId/{blogId}", method = RequestMethod.GET)
	public String selBlogById(Model model,@PathVariable("blogId") int blogId) {
		Blog blog = blogService.findBlogById(blogId);
		model.addAttribute("blog", blog);
		model.addAttribute("user", userService.findUserById(blog.getBegincodeUserId()));
		model.addAttribute("blogTypes", blogTypeService.findBlogTypeByUserId(blog.getBegincodeUserId()));
		return "/page/blog/blog_edit";
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
	
	@RequestMapping(value = "/blogManage/typeId/{typeId}", method = RequestMethod.GET)
	public String blogManageByTypeId(Model model,@PathVariable("typeId") int typeId,HttpServletRequest request) {
		Blog blog = new Blog();
		blog.setBlogTypeId(typeId);
		Paginator page = new Paginator(0, BeginCodeConstant.PAGE_SIZE);
		PageList list = blogService.findBlogsByRecords(blog, page);
		model.addAttribute("blogs", list);
		model.addAttribute("pageinfo", list.getPaginator());
		model.addAttribute("blogTypeId", typeId);
		model.addAttribute("user",userService.findUserById(CookieOperation.getUser(request).getBegincodeUserId()));
		return "/page/blog/blog_manager";	
	}
	
	/** 
	* @Title: blogManage 
	* @Description: 博客管理
	* @param model
	* @param request
	* @return String   
	* @throws 
	*/
	@RequestMapping(value = "/blogManage", method = RequestMethod.GET)
	public String blogManage(Model model,HttpServletRequest request) {
		Map<String, String> cookieMap = CookieOperation.getCookie(request);
		logger.info("登陆用户"+cookieMap);
		if(cookieMap != null && cookieMap.get("openId") != null){
			BegincodeUser logUser = userFacade.findUser(cookieMap.get("openId"), cookieMap.get("accessToken"));
			logger.info("用户信息"+logUser.toString());
			if(logUser.getCheckFlag().equals(BeginCodeConstant.CHECK_PAAS)){
				model.addAttribute("user",logUser);
				Blog record = new Blog();
				record.setBegincodeUserId(logUser.getBegincodeUserId());
				Paginator page = new Paginator(0, BeginCodeConstant.PAGE_SIZE);
				PageList list = blogService.findBlogsByRecords(record, page);
				model.addAttribute("blogs",list);
				model.addAttribute("pageinfo", list.getPaginator());
				return "/page/blog/blog_manager";				
			}else{
				logger.info("用户未通过审核");
				return "forward:/blog";
			}
		}else{
//			抛出异常
			logger.info("未获得登陆信息");
			return "forward:/blog";
		}
	}
	
	@RequestMapping(value = "/userId", method = RequestMethod.GET)
	public String addBlogInit(Model model,HttpServletRequest request) {
		Map<String, String> cookieMap = CookieOperation.getCookie(request);
		logger.info("登陆用户"+cookieMap);
		if(cookieMap != null && cookieMap.get("openId") != null){
			BegincodeUser logUser = userFacade.findUser(cookieMap.get("openId"), cookieMap.get("accessToken"));
			logger.info("用户信息"+logUser.toString());
			if(logUser.getCheckFlag().equals(BeginCodeConstant.CHECK_PAAS)){
				model.addAttribute("user",logUser);
				model.addAttribute("blogTypes", blogTypeService.findBlogTypeByUserId(logUser.getBegincodeUserId()));
				return "/page/blog/blog_edit";				
			}else{
				logger.info("用户未通过审核");
				return "forward:/blog";
			}
		}else{
//			抛出异常
			logger.info("未获得登陆信息");
			return "forward:/blog";
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
	
	
	
	@RequestMapping(value = "/blogs/user", method = RequestMethod.GET)
	@ResponseBody
	public List getBlogsUser(HttpServletRequest request,Paginator pageinfo,String blogType) {
		BegincodeUser loginUser = CookieOperation.getUser(request);
		if (loginUser != null && pageinfo != null) {
			pageinfo.setLimit(BeginCodeConstant.PAGE_SIZE);
			Blog blog = new Blog();
			blog.setBegincodeUserId(loginUser.getBegincodeUserId());
			if(blogType != null && !blogType.equals("")){
				blog.setBlogTypeId(Integer.valueOf(blogType));
			}
			PageList list = blogService.findBlogsByRecords(blog, pageinfo);
			return list;
		} else {
			return null;
		}
	}
	
	@RequestMapping(value = "/topTen/userId", method = RequestMethod.GET)
	@ResponseBody
	public List findTopTenByUserId(HttpServletRequest request) {
		Map<String, String> cookieMap = CookieOperation.getCookie(request);
		if(cookieMap != null && cookieMap.get("userId") != null){
			Blog record = new Blog();
			record.setBegincodeUserId(Integer.valueOf(cookieMap.get("userId")));
			Paginator pageinfo = new Paginator(0,BeginCodeConstant.PAGE_SIZE);
			pageinfo.setOrderStr(" order by view_count desc ");
			return blogService.findBlogsByRecords(record, pageinfo);
		}else{
			return null;
		}
		  
	}
	@RequestMapping(value = "/topTen", method = RequestMethod.GET)
	@ResponseBody
	public List findTopTen() {
		return findTop(BeginCodeConstant.PAGE_SIZE);
	}

	@RequestMapping(value = "/top/{size}", method = RequestMethod.GET)
	@ResponseBody
	public List findTopSize(@PathVariable("size") int size){
		return findTop(size);
	}
	
	/** 
	* @Title: findTop 
	* @Description:  默认参数为null时查询10条记录
	* @param n
	* @return List   
	* @throws 
	*/
	private List findTop(int n){
		if(n <= 0){
			n = BeginCodeConstant.PAGE_SIZE;
		}
		Paginator pageinfo = new Paginator(0,n);
		pageinfo.setOrderStr(" order by create_datetime desc ");
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
	@RequestMapping(value = "/blogType/user", method = RequestMethod.POST)
	@ResponseBody
	public BlogType findBlogTypeByUser(HttpServletRequest request,String blogType) {
		Map<String, String> cookieMap = CookieOperation.getCookie(request);
		if(cookieMap != null && cookieMap.get("userId") != null){
			BlogType blogTypeEntity = new BlogType();
			blogTypeEntity.setBegincodeUserId(Integer.valueOf(cookieMap.get("userId")));
			blogTypeEntity.setBlogTypeName(blogType);
			blogTypeEntity.setDeleteFlag("1");
			blogTypeService.createBlogType(blogTypeEntity);
			if(blogTypeEntity.getBlogTypeId() != null){
				return blogTypeEntity;
			}else{
				return null;
			}
		}else{
			return null;
		}
	}
	@RequestMapping(value = "/blogType/user", method = RequestMethod.GET)
	@ResponseBody
	public List findBlogTypeByUser(HttpServletRequest request) {
		Map<String, String> cookieMap = CookieOperation.getCookie(request);
		if(cookieMap != null && cookieMap.get("userId") != null){
			return blogTypeService.findBlogTypeByUserId(Integer.valueOf(cookieMap.get("userId")));
		}else{
			return null;
		}
	}
	@RequestMapping(value = "/recommend", method = RequestMethod.GET)
	@ResponseBody
	public Blog findRecommend() {
		return blogService.findRecommendBlog();
	}
	@RequestMapping(value = "/blogType/{typeId}/size/{size}", method = RequestMethod.GET)
	@ResponseBody
	public List findBlogByTypeAndSize(@PathVariable("typeId") int typeId,@PathVariable("size") int size) {
		Paginator pageinfo = new Paginator(0, size);
		pageinfo.setOrderStr(" order by blog_id desc ");
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
		message.put("msg", "保存成功");
		blog.setCreateDatetime(new Date());
		blog.setDeleteFlag(BeginCodeConstant.DELETE_FLAG_NOMAL);
		blog.setBegincodeNavigationId(BeginCodeConstant.NAV_CODE_SHARE);
		blog.setBegincodeKeys(HtmlUtils.htmlEscape(blog.getBegincodeKeys()));
		blog.setBlogAbstract((HtmlUtils.htmlEscape(blog.getBlogAbstract())));
		blog.setBlogInfo(HtmlUtils.htmlEscape(blog.getBlogInfo()));
		if(blog.getBlogId() != null && blog.getBlogId() != 0){
			int returnValue = blogService.updateBlog(blog);
			if(returnValue <= 0){
				message.put("msg", "保存失败");
			}
		}else{
			blogService.createBlog(blog);
			if (blog.getBlogId() == null || blog.getBlogId() == 0) {
				message.put("msg", "保存失败");
			}  
		}
		return message;
	}
}
