package org.begincode.core.model;

/**
 * @ClassName: BegincodeNavigation
 * @Description: 网站导航
 * @author liutao
 * @date 2015年7月29日 下午5:52:11
 *
 */
public class BegincodeNavigation extends BaseModel {
	private Integer begincodeNavigationId;

	private String navName;

	private String navUrl;

	private Integer upNavId;

	private String navWord;

	private String navMemo;

	private String deleteFlag;

	public Integer getBegincodeNavigationId() {
		return begincodeNavigationId;
	}

	public void setBegincodeNavigationId(Integer begincodeNavigationId) {
		this.begincodeNavigationId = begincodeNavigationId;
	}

	public String getNavName() {
		return navName;
	}

	public void setNavName(String navName) {
		this.navName = navName == null ? null : navName.trim();
	}

	public String getNavUrl() {
		return navUrl;
	}

	public void setNavUrl(String navUrl) {
		this.navUrl = navUrl == null ? null : navUrl.trim();
	}

	public Integer getUpNavId() {
		return upNavId;
	}

	public void setUpNavId(Integer upNavId) {
		this.upNavId = upNavId;
	}

	public String getNavWord() {
		return navWord;
	}

	public void setNavWord(String navWord) {
		this.navWord = navWord == null ? null : navWord.trim();
	}

	public String getNavMemo() {
		return navMemo;
	}

	public void setNavMemo(String navMemo) {
		this.navMemo = navMemo == null ? null : navMemo.trim();
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
	}
}