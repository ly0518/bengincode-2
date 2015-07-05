package org.core.model;

public class BegincodeNavigation {
    private Integer begincodeNavigationId;

    private String navName;

    private String navUrl;

    private Integer upNavId;

    private String navWord;

    private String navMemo;

    private String deleteFlag1;

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

    public String getDeleteFlag1() {
        return deleteFlag1;
    }

    public void setDeleteFlag1(String deleteFlag1) {
        this.deleteFlag1 = deleteFlag1 == null ? null : deleteFlag1.trim();
    }
}