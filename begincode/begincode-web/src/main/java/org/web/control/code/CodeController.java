package org.web.control.code;


import org.apache.log4j.Logger;
import org.begincode.code.CodeService;
import org.blog.service.BlogService;
import org.core.model.BegincodeCode;
import org.core.util.PaginationResult;
import org.course.service.UserService;
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
		BegincodeCode record = new BegincodeCode();
		record.setBeginRowNum(6);
		record.setLimitNum(3);
		PaginationResult<BegincodeCode> codes = codeService.selCodeForPaper(record);
		System.out.println(codes.getList().size());
		model.addAttribute("codes", codes);
//		blogService.show();
		return "/page/code/codes.jsp";  
	}
	
}
