package org.web.control;


import org.apache.log4j.Logger;
import org.code.CodeService;
import org.core.model.BegincodeCode;
import org.core.util.PaginationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/code")
public class CodeController {
	
	private Logger logger = Logger.getLogger(CodeController.class);
	
	@Autowired CodeService codeService;
	
	@RequestMapping("/getAllCodes")
	public String selCodeList(Model model){
		BegincodeCode record = new BegincodeCode();
		PaginationResult<BegincodeCode> codes = codeService.selCodeForPaper(record);
		model.addAttribute("codes", codes);
		return "page/code/codes";  
	}
	
}
