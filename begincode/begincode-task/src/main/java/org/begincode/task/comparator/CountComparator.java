package org.begincode.task.comparator;

import java.util.Comparator;

public class CountComparator<Integer> implements Comparator<Integer> {

	/** (非 Javadoc) 
	 * <p>Title: compare</p> 
	 * <p>Description:比较器，浏览次数等队列 </p> 
	 * @param o1
	 * @param o2
	 * @return  
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object) 
	 */
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 == null || o2 == null){
			throw new NullPointerException();
		}else{
			int a = (int) o1;
			int b = (int) o2;
			return a-b;
		}
	}

}
