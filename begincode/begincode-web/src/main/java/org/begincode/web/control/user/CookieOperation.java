package org.begincode.web.control.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.begincode.core.model.BegincodeUser;

/** 
* @ClassName: CookieOperation 
* @Description: cookie操作
* @author yangsj 
* @date 2015年8月4日 下午11:13:16 
*  
*/
public class CookieOperation {
	
	/** 
	* @Title: addCookie 
	* @Description: 新增cookie，保存用户信息
	* @param response
	* @param user void   
	* @throws 
	*/
	public static void addCookie(HttpServletResponse response,BegincodeUser user){
		Cookie accessToken = new Cookie("accessToken",user.getAccessToken());
		Cookie openId = new Cookie("openId",user.getOpenId());
		accessToken.setPath("/");
		openId.setPath("/");
		response.addCookie(accessToken);
		response.addCookie(openId);
	}
	/** 
	* @Title: delCookie 
	* @Description: 删除cookie,设置立刻超时
	* @param response void   
	* @throws 
	*/
	public static void delCookie(HttpServletResponse response){
		Cookie accessToken = new Cookie("accessToken", null);
		Cookie openId = new Cookie("openId",null);
		accessToken.setMaxAge(0);
		openId.setMaxAge(0);
		accessToken.setPath("/");
		openId.setPath("/");
		response.addCookie(accessToken);
		response.addCookie(openId);
	}
	
	/** 
	* @Title: getCookie 
	* @Description: 获取cookie并返回map
	* @param request
	* @return Map<String,String>   
	* @throws 
	*/
	public static Map<String,String> getCookie(HttpServletRequest request){
		
		int exist = 0;
		Map<String,String> cookieMap = new HashMap();
		//测试使用
		cookieMap.put("accessToken",  "234234");
		cookieMap.put("openId",  "1231232s13");
		return cookieMap;
		
		//临时注释
//		Cookie[] cookies = request.getCookies();//获取cookie
//		if(cookies != null){
//			for(Cookie cookie : cookies){
//				if(cookie.getName().equals("accessToken")){
//					cookieMap.put("accessToken",  cookie.getValue());
//					exist++;
//				}
//				if(cookie.getName().equals("openId")){
//					cookieMap.put("openId", cookie.getValue());
//					exist++;
//				}
//			}
//		}else{
//			return null;
//		}
//		if(exist == 2){
//			return cookieMap;
//		}else{
//			return null;
//		}
		
	}
}
