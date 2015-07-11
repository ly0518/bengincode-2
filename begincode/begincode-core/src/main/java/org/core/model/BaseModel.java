package org.core.model;

import java.util.Date;

public class BaseModel {
    private Integer beginRowNum;
    private Integer limitNum;
	public Integer getBeginRowNum() {
		return beginRowNum;
	}
	public void setBeginRowNum(Integer beginRowNum) {
		this.beginRowNum = beginRowNum;
	}
	public Integer getLimitNum() {
		return limitNum;
	}
	public void setLimitNum(Integer limitNum) {
		this.limitNum = limitNum;
	}
    
}