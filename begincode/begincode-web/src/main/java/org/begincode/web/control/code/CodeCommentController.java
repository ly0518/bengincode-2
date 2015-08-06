package org.begincode.web.control.code;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.begincode.code.service.CodeCommentService;
import org.begincode.core.contant.Contants;
import org.begincode.core.model.BegincodeUser;
import org.begincode.core.model.CodeComment;
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

 
/** 
* @ClassName: CodeCommentController 
* @Description: 代码分享评论控制器
* @author yangsj 
* @date 2015年8月1日 下午3:47:40 
*  
*/
@Controller
@RequestMapping("/codeComment")
public class CodeCommentController {

	private Logger logger = Logger.getLogger(CodeCommentController.class);

	@Autowired
	CodeCommentService codeCommentService;
	@Autowired
	UserFacade userFacade;
	 
	/** 
	* @Title: addCodeComment 
	* @Description: 新增代码评论
	* @param codeComment
	* @return CodeComment   
	* @throws 
	*/
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public CodeComment addCodeComment(CodeComment codeComment,HttpServletRequest request) {
		BegincodeUser begincodeUser =  new  BegincodeUser();
		Map<String,String> userMap = CookieOperation.getCookie(request);
		if(userMap != null && StringUtils.isNotEmpty(userMap.get("accessToken")) && StringUtils.isNotEmpty(userMap.get("openId"))){
			begincodeUser = userFacade.findUser(userMap.get("openId"), userMap.get("accessToken"));
		}
		
		logger.info(codeComment.toString());
		codeComment.setCommentStatus("1");
		codeComment.setCreateDatatime(new Date());
		codeComment.setOrderNumber(1);
		codeComment.setNickname(begincodeUser.getNickname());
		codeComment.setPic(begincodeUser.getPic());
		codeCommentService.createCodeCommentSelective(codeComment);
		return codeComment;
	}

	@RequestMapping(value = "codeId/{codeId}", method = RequestMethod.GET)
	@ResponseBody
	public List findTopTen(Paginator pageinfo, @PathVariable("codeId") int codeId) {
		pageinfo.setLimit(Contants.PAGE_SIZE_COMMENT);
		pageinfo.setOrderStr(" order by create_datatime desc ");
		BeginCodeInterceptor.localPage.set(pageinfo);
		List list = codeCommentService.findCodeCommentByCodeId(codeId);
		return list;
	}

	@RequestMapping(value = "/{codeId}/{pageNo}", method = RequestMethod.GET)
	@ResponseBody
	public PageList<CodeComment> findTopTen(@PathVariable("codeId") int codeId, @PathVariable("pageNo") int pageNo) {
		Paginator pageinfo = new Paginator();
		pageinfo.setLimit(Contants.PAGE_SIZE_COMMENT);
		pageinfo.setPage(pageNo);
		pageinfo.setOrderStr(" order by create_datatime desc ");
		BeginCodeInterceptor.localPage.set(pageinfo);
		PageList list = codeCommentService.findCodeCommentByCodeId(codeId);
		return list;
	}

}
