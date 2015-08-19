package org.begincode.task.comparator;

import java.util.Comparator;

public class CountComparator<T> implements Comparator<T> {

	/** (非 Javadoc) 
	 * <p>Title: compare</p> 
	 * <p>Description:比较器，浏览次数等队列 </p> 
	 * @param o1
	 * @param o2
	 * @return  
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object) 
	 */
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 == null || o2 == null){
			throw new RuntimeException("比较器参数不能为空！");
		}else{
			return (Integer) o1 - (Integer) o2;
		}
	}

}
