package org.begincode.core.paginator.domain;

import java.io.Serializable;

/**
 * 分页器，根据page,limit,totalCount用于页面上分页显示多项内容，计算页码和当前页的偏移量，方便页面分页使用.
 *
 * @author badqiu
 * @author miemiedev
 */
public class Paginator implements Serializable {
    private static final long serialVersionUID = -2429864663690465105L;


    /**
     * 分页大小
     */
    private int limit;
    /**
     * 页数
     */
    private int page;
    /**
     * 总记录数
     */
    private int totalCount;

    public Paginator(int page, int limit) {
        super();
        this.limit = limit;
        this.page = page;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Paginator");
        sb.append("{page=").append(page);
        sb.append(", limit=").append(limit);
        sb.append(", totalCount=").append(totalCount);
        sb.append('}');
        return sb.toString();
    }


	public int getLimit() {
		return limit;
	}


	public void setLimit(int limit) {
		this.limit = limit;
	}


	public int getPage() {
		return page;
	}


	public void setPage(int page) {
		this.page = page;
	}


	public int getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
    
}
