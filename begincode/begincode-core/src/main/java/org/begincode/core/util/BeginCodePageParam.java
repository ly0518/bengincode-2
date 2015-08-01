package org.begincode.core.util;

import org.begincode.core.paginator.BeginCodeInterceptor;
import org.begincode.core.paginator.domain.Paginator;

/** 
* @ClassName: BeginCodePageParam 
* @Description: 分页参数设置类
* @author yangsj 
* @date 2015年8月1日 下午3:39:07 
*  
*/
public class BeginCodePageParam {
	/** 
	* @Title: initPaginator 
	* @Description: 分页参数设置
	* @param page void   
	* @throws 
	*/
	public static void initPaginator(Paginator page){
		BeginCodeInterceptor.localPage.set(page);
	}
}
