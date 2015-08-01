package org.begincode.web.control.code;


import org.apache.log4j.Logger;
import org.begincode.code.service.CodeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @ClassName: CodeTypeController 
* @Description: 代码分类
* @author yangsj 
* @date 2015年8月1日 下午3:32:42 
*  
*/
@Controller
@RequestMapping("/codeType")
public class CodeTypeController {
	
	private Logger logger = Logger.getLogger(CodeTypeController.class);
	@Autowired CodeTypeService codeTypeService;
	
	 
}
