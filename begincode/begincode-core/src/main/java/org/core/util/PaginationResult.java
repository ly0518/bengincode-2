package org.core.util;

import java.io.Serializable;
import java.util.List;

public class PaginationResult<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	private int pageSize;// 每页大小
	private int totleSize;// 总共多少条
	private int totlePage;// 总共多少页
	private int pageIndex;// 当前第几页
	private List<T> list; // 对象记录结果集

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotleSize() {
		return totleSize;
	}

	public void setTotleSize(int totleSize) {
		this.totleSize = totleSize;
	}

	public int getTotlePage() {
		return totlePage;
	}

	public void setTotlePage(int totlePage) {
		this.totlePage = totlePage;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
