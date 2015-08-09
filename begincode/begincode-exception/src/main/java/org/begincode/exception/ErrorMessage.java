
/**   
* @Title: ErrorMessage.java 
* @Package org.begincode.exception 
* @Description: 
* @author yangsj   
* @date 2015年8月7日 上午8:10:40 
* @version V1.0   
*/
package org.begincode.exception;

import org.apache.commons.lang.builder.ToStringBuilder;

/** 
 * @ClassName: ErrorMessage 
 * @Description: 错误信息枚举
 * @author yangsj 
 * @date 2015年8月7日 上午8:10:40 
 *  
 */
public enum ErrorMessage {
	InvalidArgument(400,"InvalidArgument"),		//参数错误
	FileNotExist(405,"您要找的页面不存在，或已删除"),			//文件不存在，内容不存在，已删除
	InternalError(500,"系统内部异常，请重试");			//内部错误异常，
	
	private  int errorCode;
	private String errorMessage;
	private ErrorMessage(int errorCode,String errorMessage){
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
	
}
