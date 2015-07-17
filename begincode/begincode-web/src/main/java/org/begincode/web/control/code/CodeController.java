package org.begincode.web.control.code;


import org.apache.log4j.Logger;
import org.begincode.code.service.CodeService;
import org.begincode.core.model.BegincodeCode;
import org.begincode.core.paginator.BeginCodeInterceptor;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;
import org.begincode.core.util.PaginationResult;
import org.begincode.course.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/code")
public class CodeController {
	
	private Logger logger = Logger.getLogger(CodeController.class);
	
	@Autowired CodeService codeService;
//	@Autowired BlogService blogService;
	@Autowired UserService userService;
	@RequestMapping("/getAllCodes")
	public String selCodeList(Model model){
		Paginator page = new Paginator();
		page.setOrderStr(" order by begincode_code_id desc ");
		BeginCodeInterceptor.localPage.set(page);
		
		BegincodeCode record = new BegincodeCode();
		PageList list =  codeService.selCodeForPaper(record);
		System.out.println(list.size());
		System.out.println(list.getPaginator());
		model.addAttribute("codes", list);
		model.addAttribute("pageinfo", list.getPaginator());
		
		return "/page/code/codes.jsp";  
	}
	@RequestMapping("/getCodes")
	public String selCodes(Model model){
		BegincodeCode record = new BegincodeCode();
		PageList list =  codeService.selCodeForPaper(record);
		model.addAttribute("codes", list);
		return "/page/code/codes.jsp";  
	}
	
}
