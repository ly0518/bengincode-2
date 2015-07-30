/**   
 * @Title: CourseRuntimeException.java 
 * @Package org.begincode.course.exception 
 * @Description: TODO 
 * @author liutao   
 * @date 2015年7月30日 下午2:00:09 
 * @version V1.0   
 */
package org.begincode.course.exception;

import org.begincode.exception.BeginCodeException;

/**
 * @ClassName: CourseRuntimeException
 * @Description: 课程内部异常
 * @author liutao
 * @date 2015年7月30日 下午2:00:09
 * 
 */
public class CourseRuntimeException extends BeginCodeException {

	/**
	 * 错误码
	 */
	private String code;

	public CourseRuntimeException(String message) {
		super(message);
	}

	public CourseRuntimeException(String code, String message) {
		super(message);
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 数据库操作异常
	 */
	public final static String COS0001 = "COS0001";

}
