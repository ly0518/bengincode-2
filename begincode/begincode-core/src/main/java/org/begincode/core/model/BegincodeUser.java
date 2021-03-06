package org.begincode.core.model;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class BegincodeUser extends BaseModel{
    private Integer begincodeUserId;

    private String loginName;

    private String pwd;

    private String nickname;

    private Date cdate;

    private String sex;

    private String telPhone;

    private String email;

    private String receiveEmail;

    private String pic;

    private String checkFlag;

    private String gag;

    private String deleteFlag;

    private String inviteCode;
    
    private String course;

    private String openId;

    private String accessToken;

    private Integer userSourceId;

    public Integer getBegincodeUserId() {
        return begincodeUserId;
    }

    public void setBegincodeUserId(Integer begincodeUserId) {
        this.begincodeUserId = begincodeUserId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone == null ? null : telPhone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getReceiveEmail() {
        return receiveEmail;
    }

    public void setReceiveEmail(String receiveEmail) {
        this.receiveEmail = receiveEmail == null ? null : receiveEmail.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag == null ? null : checkFlag.trim();
    }

    public String getGag() {
        return gag;
    }

    public void setGag(String gag) {
        this.gag = gag == null ? null : gag.trim();
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public String getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode == null ? null : inviteCode.trim();
	}

	public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    public Integer getUserSourceId() {
        return userSourceId;
    }

    public void setUserSourceId(Integer userSourceId) {
        this.userSourceId = userSourceId;
    }
    
    public boolean checkUserNull(){
    	if(StringUtils.isNotEmpty(this.accessToken)&&StringUtils.isNotEmpty(this.openId)&&StringUtils.isNotEmpty(this.nickname)&&StringUtils.isNotEmpty(this.pic)&&StringUtils.isNotEmpty(this.sex)){
    		return true;
    	}
    	return false;
    }
}