/**   
 * @Title: BGContants.java 
 * @Package org.begincode.core.contant 
 * @Description: begincode静态常量 
 * @author liutao   
 * @date 2015年7月31日 下午6:00:26 
 * @version V1.0   
 */
package org.begincode.core.constant;

/**
 * @ClassName: BeginCodeConstant
 * @Description: begincode静态常量
 * @author liutao
 * @date 2015年7月31日 下午6:00:26
 * 
 */
public final class BeginCodeConstant {

	/**
	 * 删除标识 delete_flag, 1：可用 0：删除
	 */
	public final static String DELETE_FLAG_YES = "0";
	public final static String DELETE_FLAG_NOMAL = "1";
	
	/**
	 * 分页数据
	 * */
	public static final int PAGE_SIZE = 10;  //
	public static final int PAGE_SIZE_COMMENT = 5;
	
	
	/**
	 * 导航标识
	 * */
	public static final int NAV_VIDEO_COURSE = 1;
	public static final int NAV_CODE_SHARE = 2;
	
	/**
	 * 审核标识
	 * */
	public static final String CHECK_PAAS = "1";
	public static final String CHECK_WAIT = "0";
	
	/**
	 * 队列允许最大值，超过该值 触发更DB操作
	 * */
	public static final int MAX_QUEUE = 1024;

}
