package org.begincode.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName BegincodeCode
 * @Description: 代码分享Bean
 * @author yangsj
 * @Data 
 */
public class BegincodeCode extends BaseModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//主键
    private Integer begincodeCodeId;
    //标题
    private String codeInfo;
    //摘要
    private String codeAbstract;
    //下载路径
    private String codeDownloadUrl;
    //是否禁止评论，1可以评论，0不可以
    private String prohibitionMessage;
    //关键字
    private String begincodeKeys;
    //浏览次数
    private Integer viewCount;
    //目录标识
    private Integer begincodeNavigationId;
    //创建时间
    private Date createDatetime;
    //删除标识,1可用，0删除
    private String deleteFlag;
    //点赞数
    private Integer goodCount;
    //踩数
    private Integer badCount;
    //代码分类标识
    private Integer codeTypeId;
    //发布状态 ，1发布，0草稿
    private String releaseState;
    //审核标识,1通过，0未审核
    private String checkFlag;
    //代码分类名称
    private String codeTypeName;
    //代码内容
    private String codeContent;
    //用户标识
    private Integer begincodeUserId; 
    //用户昵称
    private String nickname;
    //用户头像url
    private String pic;

    public Integer getbegincodeCodeId() {
        return begincodeCodeId;
    }

    public void setbegincodeCodeId(Integer begincodeCodeId) {
        this.begincodeCodeId = begincodeCodeId;
    }

    public String getCodeInfo() {
        return codeInfo;
    }

    public void setCodeInfo(String codeInfo) {
        this.codeInfo = codeInfo == null ? null : codeInfo.trim();
    }

    public String getCodeDownloadUrl() {
        return codeDownloadUrl;
    }

    public void setCodeDownloadUrl(String codeDownloadUrl) {
        this.codeDownloadUrl = codeDownloadUrl == null ? null : codeDownloadUrl.trim();
    }

    public String getProhibitionMessage() {
        return prohibitionMessage;
    }

    public void setProhibitionMessage(String prohibitionMessage) {
        this.prohibitionMessage = prohibitionMessage == null ? null : prohibitionMessage.trim();
    }

    public String getBegincodeKeys() {
        return begincodeKeys;
    }

    public void setBegincodeKeys(String begincodeKeys) {
        this.begincodeKeys = begincodeKeys == null ? null : begincodeKeys.trim();
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getBegincodeNavigationId() {
        return begincodeNavigationId;
    }

    public void setBegincodeNavigationId(Integer begincodeNavigationId) {
        this.begincodeNavigationId = begincodeNavigationId;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public Integer getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(Integer goodCount) {
        this.goodCount = goodCount;
    }

    public Integer getBadCount() {
        return badCount;
    }

    public void setBadCount(Integer badCount) {
        this.badCount = badCount;
    }

    public Integer getCodeTypeId() {
        return codeTypeId;
    }

    public void setCodeTypeId(Integer codeTypeId) {
        this.codeTypeId = codeTypeId;
    }

    public String getReleaseState() {
        return releaseState;
    }

    public void setReleaseState(String releaseState) {
        this.releaseState = releaseState == null ? null : releaseState.trim();
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag == null ? null : checkFlag.trim();
    }

    public String getCodeTypeName() {
        return codeTypeName;
    }

    public void setCodeTypeName(String codeTypeName) {
        this.codeTypeName = codeTypeName == null ? null : codeTypeName.trim();
    }

    public String getCodeContent() {
        return codeContent;
    }

    public void setCodeContent(String codeContent) {
        this.codeContent = codeContent == null ? null : codeContent.trim();
    }

	public String getCodeAbstract() {
		return codeAbstract;
	}

	public void setCodeAbstract(String codeAbstract) {
		this.codeAbstract = codeAbstract;
	}

	public Integer getBegincodeUserId() {
		return begincodeUserId;
	}

	public void setBegincodeUserId(Integer begincodeUserId) {
		this.begincodeUserId = begincodeUserId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}
}