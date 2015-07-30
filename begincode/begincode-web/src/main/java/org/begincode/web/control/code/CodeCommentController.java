package org.begincode.web.control.code;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.begincode.code.service.CodeCommentService;
import org.begincode.core.model.CodeComment;
import org.begincode.core.paginator.BeginCodeInterceptor;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.core.util.BeginCodeConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/codeComment")
public class CodeCommentController {

	private Logger logger = Logger.getLogger(CodeController.class);

	@Autowired
	CodeCommentService codeCommentService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public CodeComment addCodes(CodeComment codeComment) {
		System.out.println(codeComment.toString());
		codeComment.setCommentStatus("1");
		codeComment.setCreateDatatime(new Date());
		codeComment.setOrderNumber(1);
		codeCommentService.createCodeCommentSelective(codeComment);
		return codeComment;
	}

	@RequestMapping(value = "codeId/{codeId}", method = RequestMethod.GET)
	@ResponseBody
	public List findTopTen(Paginator pageinfo, @PathVariable("codeId") int codeId) {
		pageinfo.setLimit(BeginCodeConstant.PAGE_SIZE_COMMENT);
		pageinfo.setOrderStr(" order by create_datatime desc ");
		BeginCodeInterceptor.localPage.set(pageinfo);
		List list = codeCommentService.findCodeComment(codeId);
		return list;
	}

	@RequestMapping(value = "/{codeId}/{pageNo}", method = RequestMethod.GET)
	@ResponseBody
	public PageList<CodeComment> findTopTen(@PathVariable("codeId") int codeId, @PathVariable("pageNo") int pageNo) {
		Paginator pageinfo = new Paginator();
		pageinfo.setLimit(BeginCodeConstant.PAGE_SIZE_COMMENT);
		pageinfo.setPage(pageNo);
		pageinfo.setOrderStr(" order by create_datatime desc ");
		BeginCodeInterceptor.localPage.set(pageinfo);
		PageList list = codeCommentService.findCodeComment(codeId);
		return list;
	}

}
