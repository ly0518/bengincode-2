package org.begincode.web.control.code;


import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.begincode.code.service.CodeCommentService;
import org.begincode.code.service.CodeService;
import org.begincode.code.service.CodeTypeService;
import org.begincode.core.model.BegincodeCode;
import org.begincode.core.model.CodeComment;
import org.begincode.core.paginator.BeginCodeInterceptor;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.core.util.BeginCodeConstant;
import org.begincode.course.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/codeComment")
public class CodeCommentController {
	
	private Logger logger = Logger.getLogger(CodeController.class);
	
	@Autowired UserService userService;
	@Autowired CodeCommentService codeCommentService;
 
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public CodeComment selCodes(Model model,CodeComment codeComment){
		codeComment.setCommentStatus("1");
		codeComment.setCreateDatatime(new Date());
		codeComment.setOrderNumber(1);
		codeCommentService.createCodeCommentSelective(codeComment);
		return codeComment;  
	}
 
	
	@RequestMapping(value = "codeId/{codeId}", method = RequestMethod.GET)
	@ResponseBody
	public List findTopTen(Paginator pageinfo,@PathVariable("codeId") int codeId) {
			pageinfo.setLimit(BeginCodeConstant.PAGE_SIZE_COMMENT);
			pageinfo.setOrderStr(" order by create_datatime desc ");
			BeginCodeInterceptor.localPage.set(pageinfo);
			List list =  codeCommentService.findCodeComment(codeId);
			return list;
	}
 
 
}
