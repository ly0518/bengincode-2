/**   
 * @Title: CourseUtils.java 
 * @Package org.begincode.course.utils 
 * @Description: TODO 
 * @author liutao   
 * @date 2015年7月31日 下午5:13:18 
 * @version V1.0   
 */
package org.begincode.course.utils;

import org.begincode.core.paginator.BeginCodeInterceptor;
import org.begincode.core.paginator.domain.Paginator;

/**
 * @ClassName: CourseUtils
 * @Description: 课程模块工具类
 * @author liutao
 * @date 2015年7月31日 下午5:13:18
 * 
 */
public final class CourseUtils {

	/**
	 * @Description: 这里用一句话描述这个方法的作用
	 * @param page
	 *            第几页
	 * @param limit
	 *            显示多少
	 * @param orderColumnSql
	 *            排序sql语句
	 * @throws
	 */
	public final static void setPaginator(Paginator pageinfo) {
		BeginCodeInterceptor.localPage.set(pageinfo);
	}
}
