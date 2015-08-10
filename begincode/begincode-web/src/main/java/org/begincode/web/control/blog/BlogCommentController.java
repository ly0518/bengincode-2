package org.begincode.web.control.blog;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.begincode.blog.service.BlogCommentService;
import org.begincode.core.constant.BeginCodeConstant;
import org.begincode.core.model.BegincodeUser;
import org.begincode.core.model.BlogComment;
import org.begincode.core.paginator.BeginCodeInterceptor;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.user.facade.UserFacade;
import org.begincode.web.control.cookie.CookieOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

 
/** 
* @ClassName: BlogCommentController 
* @Description: 博客评论控制器
* @author yangsj 
* @date 2015年8月1日 下午3:47:40 
*  
*/
@Controller
@RequestMapping("/blogComment")
public class BlogCommentController {

	private Logger logger = Logger.getLogger(BlogCommentController.class);

	@Autowired
	BlogCommentService blogCommentService;
	@Autowired
	UserFacade userFacade;
	 
	/** 
	* @Title: addBlogComment 
	* @Description: 新增博客评论
	* @param blogComment
	* @return BlogComment   
	* @throws 
	*/
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public BlogComment addBlogComment(BlogComment blogComment,HttpServletRequest request) {
		BegincodeUser begincodeUser =  new  BegincodeUser();
		Map<String,String> userMap = CookieOperation.getCookie(request);
		if(userMap != null && StringUtils.isNotEmpty(userMap.get("accessToken")) && StringUtils.isNotEmpty(userMap.get("openId"))){
			begincodeUser = userFacade.findUser(userMap.get("openId"), userMap.get("accessToken"));
		}
		//评论内容转码
		blogComment.setBlogCommentContent(HtmlUtils.htmlEscape(blogComment.getBlogCommentContent()));
		logger.info(blogComment.toString());
		blogComment.setCommentStatus("1");
		blogComment.setCreateDatatime(new Date());
		blogComment.setOrderNumber(1);
		blogComment.setNickname(begincodeUser.getNickname());
		blogComment.setPic(begincodeUser.getPic());
		blogCommentService.createBlogCommentSelective(blogComment);
		return blogComment;
	}

	@RequestMapping(value = "/blogId/{blogId}", method = RequestMethod.GET)
	@ResponseBody
	public List findTopTen(Paginator pageinfo, @PathVariable("blogId") int blogId) {
		pageinfo.setLimit(BeginCodeConstant.PAGE_SIZE_COMMENT);
		pageinfo.setOrderStr(" order by create_datatime desc ");
		BeginCodeInterceptor.localPage.set(pageinfo);
		List list = blogCommentService.findBlogCommentByBlogId(blogId);
		return list;
	}

	@RequestMapping(value = "/{blogId}/{pageNo}", method = RequestMethod.GET)
	@ResponseBody
	public PageList<BlogComment> findTopTen(@PathVariable("blogId") int blogId, @PathVariable("pageNo") int pageNo) {
		Paginator pageinfo = new Paginator();
		pageinfo.setLimit(BeginCodeConstant.PAGE_SIZE_COMMENT);
		pageinfo.setPage(pageNo);
		pageinfo.setOrderStr(" order by create_datatime desc ");
		BeginCodeInterceptor.localPage.set(pageinfo);
		PageList list = blogCommentService.findBlogCommentByBlogId(blogId);
		return list;
	}

}
