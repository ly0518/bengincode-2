package org.begincode.core.model;

import java.util.Date;

/** 
* @ClassName: CodeComment 
* @Description: 代码评论bean
* @author yangsj 
* @date 2015年8月1日 下午3:49:21 
*  
*/
public class CodeComment extends BaseModel{
    private Integer codeCommentId;

    private String codeCommentContent;

    private Date createDatatime;

    private Integer begincodeUserId;

    private String nickname;

    private String pic;

    private String commentStatus;

    private Integer begincodeCodeId;

    private Integer orderNumber;

    public Integer getCodeCommentId() {
        return codeCommentId;
    }

    public void setCodeCommentId(Integer codeCommentId) {
        this.codeCommentId = codeCommentId;
    }

    public String getCodeCommentContent() {
        return codeCommentContent;
    }

    public void setCodeCommentContent(String codeCommentContent) {
        this.codeCommentContent = codeCommentContent == null ? null : codeCommentContent.trim();
    }

    public Date getCreateDatatime() {
        return createDatatime;
    }

    public void setCreateDatatime(Date createDatatime) {
        this.createDatatime = createDatatime;
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
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus == null ? null : commentStatus.trim();
    }

    public Integer getbegincodeCodeId() {
        return begincodeCodeId;
    }

    public void setbegincodeCodeId(Integer begincodeCodeId) {
        this.begincodeCodeId = begincodeCodeId;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }
}