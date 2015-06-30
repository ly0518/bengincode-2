<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/taglibs.jsp"%>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="/commons/meta.jsp"%>
<title>BeginCode,初学者论坛，begincode,BeginCode</title>
<meta name="Description"
	content="begincode www.begincode.net  初学者社区，志在让更多软件开发初学者能够掌握一门开发技术  " />
<!-- Bootstrap -->
<link media="screen" href="${ctx}/css/bootstrap.css" rel="stylesheet">
<script src="${ctx}/js/jquery.min.js"></script>

<!-- Bootstrap -->
<link rel="stylesheet" href="${ctx}/jcrop/css/jquery.Jcrop.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/fileupload/css/jquery.fileupload.css">
<link rel="stylesheet" href="${ctx}/fileupload/css/jquery.fileupload-ui.css">
<noscript><link rel="stylesheet" href="${ctx}/fileupload/css/jquery.fileupload-noscript.css"></noscript>
<noscript><link rel="stylesheet" href="${ctx}/fileupload/css/jquery.fileupload-ui-noscript.css"></noscript>
<script src="${ctx}/js/jquery.min.js"></script>
<script src="${ctx}/jcrop/js/jquery.Jcrop.js"></script>
<script src="${ctx }/fileupload/js/vendor/jquery.ui.widget.js"></script>
<script src="${ctx }/fileupload/js/jquery.iframe-transport.js"></script>
<script src="${ctx }/fileupload/js/jquery.fileupload.js"></script>


<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
</head>
<body>
	<jsp:include page="/page/core/top.jsp" />
<ol class="breadcrumb">
    <li>
        <a href="#">首页</a>
    </li>
    <li class="active">空间管理</li>
</ol>
<div class="container .col-xs-" style="margin-top:10px; border-radius: 0px;">
    <div class="row">
        <div class="col-md-3">
            <div class="panel panel-primary" style="margin-bottom:10px">
                <div class="panel-body">
                    <div class="media" style="margin-bottom:5px">
                        <a class="media-left" href="">
                            <img src="" id="pic" style="width:80px;height:80px;" alt="">
                        </a>
                        <div class="media-body">
                            <h2 class="media-heading " id="nickName" style="color:#EA0000"></h2>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <button type="button" class="btn btn-primary" id="addBlog" data-toggle="button" aria-pressed="false" autocomplete="off" style="border-radius: 0px;width:100%;height:60px;margin-bottom:10px;font-weight:bold;font-size:35px">
			  发布博文
			</button>
                </div>
            </div>
            <div class="list-group" id="classList">
                <a href="#" class="list-group-item active"> 空间管理 </a>
                <a href="#userInfo" aria-controls="userInfo" role="tab" data-toggle="tab" class="list-group-item "> 修改资料 </a>
                <a href="#home" id="classFylab" aria-controls="home" role="tab" data-toggle="tab" class="list-group-item "> 博客分类 </a>
                <a href="#profile" aria-controls="profile" role="tab" data-toggle="tab" class="list-group-item "> 密码修改 </a>
                <a href="#updateIcon" aria-controls="updateIcon" role="tab" data-toggle="tab" class="list-group-item "> 修改头像 </a>
                <!-- 							<a href="#settings" aria-controls="settings" role="tab" data-toggle="tab" class="list-group-item "> 修改邮箱 </a>  -->
            </div>
        </div>
        <div class="col-md-9">
            <div class="panel panel-primary" style="margin-top:0;">
                <div class="panel-body">
                    <ol class="breadcrumb" style="background-color:#5bc0de;">
                        <li>
                            <a href="#">空间</a>
                        </li>
                        <li>
                            <a href="#">管理</a>
                        </li>
                    </ol >
                    <!-- Tab panes -->
                    <div class="tab-content">
                        <div role="tabpanel" class="tab-pane " id="home">
                            <table class="table table-striped table-bordered">
                                <tr class="info">
                                    <th>分类名称</th>
                                    <th>修改</th>
                                    <th>删除</th>
                                </tr>
                                <tbody id="classifyTab">
  								</tbody>
                            </table>
                            <form class="form-inline" role="form">
                                <div class="form-group">
                                    <p class="form-control-static">分类名称：</p>
                                </div>
                                <div class="form-group">
                                    <input type="hidden" name="classFyId" id="classFyId" value=""/>
                                    <input type="text" class="form-control" id="classfyName" placeholder="分类名称">
                                </div>
                                <button type="button" id="saveClassfy" class="btn btn-primary" style="margin-left:10px;">保存</button>
                            </form>
                        </div>
                        <div role="tabpanel" class="tab-pane" id="profile">
                            <form role="form" id="blogForm" action="${ctx}/user/updPassword" method="post">
                                <div class="form-group">
                                    <label for="exampleInputEmail1"><span class="labelinfowarn" ></span>原密码</label>
                                    <input type="password" class="form-control required" id="oldPwd" name="oldPwd" value="" placeholder="请输入原密码">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1"><span class="labelinfosuccess" ></span>新密码</label>
                                    <input type="password" class="form-control required" id="pwd" name="pwd" value="" placeholder="请输入新密码">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1"><span class="labelinfoblue" ></span>确认密码</label>
                                    <input type="password" class="form-control required" id="repwd" name="repwd" value="" placeholder="请再次输入新密码">
                                </div>
                                <div style="margin-top:10px;text-align:center;">
                                    <button type="button" class="btn btn-primary" id="send" style="width:100px;">提交</button>
                                </div>
                            </form>
                        </div>
                        <div role="tabpanel" class="tab-pane active" id="userInfo">
                            <form>	  	
                            
               <input type="hidden" name="bc_user_id" id="bc_user_id" value="${bcUser.bc_user_id }" />	
   <div class="form-group" >
    <label for="email"><span class="labelinfodanger" ></span>电子邮箱</label>
    <input  class="form-control required"    id="email" name="email" placeholder="电子邮箱" readonly="readonly"  value="${bcUser.email }"  >
  </div>
  
     <div class="form-group">
    <label for="nickname"><span class="labelinfowarn" ></span>昵称</label>
    <input   class="form-control required" id="nickname" name="nickname"  value="${bcUser.nickname }" placeholder="昵称">
  </div>
  <div class="form-group">
  <label for="sex"><span class="labelinfodanger" ></span>性别</label>
	   <select class="form-control" name="sex" id="sex"  value="${bcUser.sex }">
		  <option value="1" >男</option>
		  <option value="0" >女</option>
		</select>  
	</div>
  <div style="margin-top:10px;text-align:center;">
   <button type="button" class="btn btn-primary"  id="userSave"  style="width:100px;">修改资料</button> 
   </div>
<div style="margin-top:10px;text-align:center;color:red;font-weight:bold;" id="msgInfo">
   </div>
</p>
</form>
                        </div>
                        <div role="tabpanel" class="tab-pane" id="updateIcon">
                            <div class="container">
                                    <div class="row fileupload-buttonbar">
                                        <div class="col-lg-7">
                                            <!-- The fileinput-button span is used to style the file input field as button -->
                                            <span class="btn btn-success fileinput-button file-uploadspan">
                                                <i class="glyphicon glyphicon-plus"></i>
                                                <span>添加文件...</span>
                                                <input type="file" id="fileupload" name="files[]" data-url="${ ctx}/user/uploadImage" >
                                            </span>
                                        </div>
                                    </div>
                            </div>
                            <div class="container cutarea">
                                <div class="row">
                                    <div class="span12">
                                        <div class="jc-demo-box">
                                            <img src="" id="target" alt="[Jcrop Example]"/>
                                            <!-- This is the form that our event handler fills -->
                                            <form id="coords" class="coords" method="post" action="${ctx }/user/cutImage">
                                                <div class="inline-labels">
                                                    <label>
                                                        <input type="hidden" size="4" id="x1" name="x1"/>
                                                    </label>
                                                    <label>
                                                        <input type="hidden" size="4" id="y1" name="y1"/>
                                                    </label>
                                                    <label>
                                                        <input type="hidden" size="4" id="w" name="w"/>
                                                    </label>
                                                    <label>
                                                        <input type="hidden" size="4" id="h" name="h"/>
                                                    </label>
                                                    <label>
                                                        <input type="hidden" id="iconName" name="iconName"/>
                                                    </label>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<hr>
	<!-- foot -->
	<jsp:include page="/page/core/foot.jsp" />

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="${ctx}/js/bootstrap.min.js"></script>
</body>
</html>
