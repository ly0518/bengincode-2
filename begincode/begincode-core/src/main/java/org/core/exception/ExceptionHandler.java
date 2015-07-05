package org.core.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;

public class ExceptionHandler extends DefaultHandlerExceptionResolver {
	private static final Logger logger = Logger.getLogger(ExceptionHandler.class);  
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		String errorMessage = "";
		if (ex instanceof BeginCodeException) {
			//自定义异常处理
			errorMessage="";
			logger.error("业务异常");
		}else{
			//其他异常处理
			errorMessage="";
			logger.error("系统内部错误错误");
		}
		ex.printStackTrace();
		try {
			//响应客户端信息
			response.getOutputStream().write(errorMessage.getBytes());
		} catch (IOException e) {
			//忽略
		}
		return new ModelAndView();
	}
}
