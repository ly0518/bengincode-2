package org.begincode.web.control.code;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.begincode.code.service.CodeService;
import org.begincode.code.service.CodeTypeService;
import org.begincode.core.constant.BeginCodeConstant;
import org.begincode.core.model.BegincodeCode;
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
* @ClassName: CodeController 
* @Description: 代码分享
* @author yangsj 
* @date 2015年8月1日 下午3:32:26 
*  
*/
@Controller
@RequestMapping("/code")
public class CodeController {

	private Logger logger = Logger.getLogger(CodeController.class);

	@Autowired
	CodeService codeService;
	@Autowired
	CodeTypeService codeTypeService;
	@Autowired
	UserService userService;
	@Autowired
	UserFacade userFacade;
	@Autowired
	CountOperator countOperator;

	@RequestMapping(value="", method = RequestMethod.GET)
	public String selCodeList(Model model) {
		Paginator page = new Paginator(0, BeginCodeConstant.PAGE_SIZE);
		PageList list = codeService.findCodes( page);
		model.addAttribute("codes", list);
		model.addAttribute("pageinfo", list.getPaginator());
		return "/page/code/codes";
	}

	@RequestMapping(value = "/{codeId}", method = RequestMethod.GET)
	public String selCodes(Model model, @PathVariable("codeId") int codeId) {
		
		BegincodeCode record = codeService.findCodeById(codeId);
		if(record == null){
			logger.info("codeId 不存在");
			throw  new BeginCodeException("codeId 不存在" +codeId);
		}
		//新增浏览次数
		countOperator.addCodeViewCount(codeId);
		model.addAttribute("code", record);
		return "/page/code/code_view";
	}

	@RequestMapping(value = "/userId", method = RequestMethod.GET)
	public String addCodeInit(Model model,HttpServletRequest request) {
		Map<String, String> cookieMap = CookieOperation.getCookie(request);
		logger.info("登陆用户"+cookieMap);
		if(cookieMap != null){
			BegincodeUser logUser = userFacade.findUser(cookieMap.get("openId"), cookieMap.get("accessToken"));
			logger.info("用户信息"+logUser.toString());
			if(logUser.getCheckFlag().equals(BeginCodeConstant.CHECK_PAAS)){
				model.addAttribute("user",logUser);
//				model.addAttribute("codeTypes", codeTypeService.findCodeTypeByUserId(logUser.getBegincodeUserId()));
				return "/page/code/code_edit";				
			}else{
				logger.info("用户未通过审核");
				return "redirect:/code";
			}
		}else{
//			抛出异常
			logger.info("未获得登陆信息");
			return "redirect:/code";
		}
	}
	@RequestMapping(value = "/topTen/userId", method = RequestMethod.GET)
	@ResponseBody
	public List findTopTenByUserId(HttpServletRequest request) {
		Map<String, String> cookieMap = CookieOperation.getCookie(request);
		if(cookieMap != null && cookieMap.get("userId") != null){
			BegincodeCode record = new BegincodeCode();
			record.setBegincodeUserId(Integer.valueOf(cookieMap.get("userId")));
			Paginator pageinfo = new Paginator(0,BeginCodeConstant.PAGE_SIZE);
			pageinfo.setOrderStr(" order by view_count desc ");
			return codeService.findCodesByRecords(record, pageinfo);
		}else{
			return null;
		}
		  
	}
	@RequestMapping(value = "/codes", method = RequestMethod.GET)
	@ResponseBody
	public List getCodes(Paginator pageinfo) {
		if (pageinfo != null) {
			pageinfo.setLimit(BeginCodeConstant.PAGE_SIZE);
			PageList list = codeService.findCodes(pageinfo);
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
		PageList list = codeService.findCodes(pageinfo);
		return list;
	}
	@RequestMapping(value = "/top/{size}", method = RequestMethod.GET)
	@ResponseBody
	public List findTopSize(@PathVariable("size") int size) throws IOException {
		Paginator pageinfo = new Paginator(0,size);
		pageinfo.setOrderStr(" order by begincode_code_id desc ");
		PageList list = codeService.findCodes(pageinfo);
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
		codeRecord.setCreateDatetime(new Date());
		codeRecord.setDeleteFlag(BeginCodeConstant.DELETE_FLAG_NOMAL);
		codeRecord.setBegincodeNavigationId(BeginCodeConstant.NAV_CODE_SHARE);
		codeRecord.setBegincodeKeys(HtmlUtils.htmlEscape(codeRecord.getBegincodeKeys()));
		codeRecord.setCodeAbstract(HtmlUtils.htmlEscape(codeRecord.getCodeAbstract()) );
		codeRecord.setCodeInfo(HtmlUtils.htmlEscape(codeRecord.getCodeInfo())  );;
		codeService.createCode(codeRecord);
		if (codeRecord.getbegincodeCodeId() != null) {
			message.put("msg", "保存成功");
		} else {
			message.put("msg", "保存失败");
		}
		return message;
	}
}
