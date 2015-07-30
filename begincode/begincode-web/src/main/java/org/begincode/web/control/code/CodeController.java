package org.begincode.web.control.code;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.begincode.code.service.CodeService;
import org.begincode.code.service.CodeTypeService;
import org.begincode.core.model.BegincodeCode;
import org.begincode.core.paginator.BeginCodeInterceptor;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.core.util.BeginCodeConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/code")
public class CodeController {

	private Logger logger = Logger.getLogger(CodeController.class);

	@Autowired
	CodeService codeService;
	@Autowired
	CodeTypeService codeTypeService;

	@RequestMapping("")
	public String selCodeList(Model model) {
		Paginator page = new Paginator(0, BeginCodeConstant.PAGE_SIZE);
		BeginCodeInterceptor.localPage.set(page);
		PageList list = codeService.findCodes();
		model.addAttribute("codes", list);
		model.addAttribute("pageinfo", list.getPaginator());
		return "/page/code/codes";
	}

	@RequestMapping(value = "/{codeId}", method = RequestMethod.GET)
	public String selCodes(Model model, @PathVariable("codeId") int codeId) {
		BegincodeCode record = codeService.findCodeById(codeId);
		model.addAttribute("code", record);
		return "/page/code/code_view";
	}

	@RequestMapping(value = "/userId", method = RequestMethod.GET)
	public String addCodeInit(Model model) {
		model.addAttribute("codeTypes", codeTypeService.selectCodeTypeByUserId(1));
		return "/page/code/code_edit";
	}

	@RequestMapping(value = "/codes", method = RequestMethod.GET)
	@ResponseBody
	public List getCodes(Paginator pageinfo) {
		if (pageinfo != null) {
			pageinfo.setLimit(BeginCodeConstant.PAGE_SIZE);
			BeginCodeInterceptor.localPage.set(pageinfo);
			PageList list = codeService.findCodes();
			return list;
		} else {
			return null;
		}
	}

	@RequestMapping(value = "/topTen", method = RequestMethod.GET)
	@ResponseBody
	public List findTopTen() throws IOException {
		Paginator pageinfo = new Paginator(0, BeginCodeConstant.PAGE_SIZE);
		pageinfo.setOrderStr(" order by view_count desc ");
		BeginCodeInterceptor.localPage.set(pageinfo);
		PageList list = codeService.findCodes();
		return list;
	}

	@RequestMapping(value = "/codeType/{typeId}", method = RequestMethod.GET)
	@ResponseBody
	public List findRelationTopFive(@PathVariable("typeId") int typeId) {
		Paginator pageinfo = new Paginator(0, 5);
		pageinfo.setOrderStr(" order by view_count desc ");
		BeginCodeInterceptor.localPage.set(pageinfo);
		BegincodeCode codeRecord = new BegincodeCode();
		codeRecord.setCodeTypeId(typeId);
		PageList list = codeService.findCodesByRecord(codeRecord);
		return list;
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public Map addCode(BegincodeCode codeRecord) {
		Map message = new HashMap();
		codeRecord.setCodeTypeId(1);
		codeRecord.setBegincodeUserId(1);
		codeService.createCode(codeRecord);
		if (codeRecord.getbegincodeCodeId() != null) {
			message.put("msg", "保存成功");
		} else {
			message.put("msg", "保存失败");
		}
		return message;
	}
}
