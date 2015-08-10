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
<title>关于我们,初学者论坛，beginer,BeginCode,begincode</title>
<!-- Bootstrap -->
<link href="${ctx}/css/bootstrap.css" rel="stylesheet">
 <script src="${ctx}/js/jquery.min.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<jsp:include page="/page/core/top.jsp" />



 <div class="jumbotron">
      <div class="container">
        <h1>BeginCode开发</h1>
        <p>记录BeginCode开发过程,开发计划,开发人员及负责内容</p>
      </div>
    </div>
     
	
	<div class="container .col-xs-" >
		<div class="row">
					<div class="col-md-8" >
					<ul class="list-group panel panel-primary" style="margin-bottom:10px;">
						
						
							  <li class="list-group-item">
							  		<h3>网站建设</h3>
							  		<dl class="dl-horizontal">
									  <dt>1、代码分享</dt>
									  <dd>QQ登录用户具有评论功能，审核通过的用户，具有分享代码功能，已上线</dd>
									</dl>
									<dl class="dl-horizontal">
									  <dt>2、视频教程</dt>
									  <dd>登陆用户能够浏览，评论，建设中</dd>
									</dl>
									<dl class="dl-horizontal">
									  <dt>3、网站技术</dt>
									  <dd>登录用户浏览，评论功能，建设中</dd>
									</dl>
							  		 <dl class="dl-horizontal">
									  <dt>4、问答交流</dt>
									  <dd>登录用户具有浏览，提问，回复功能。待开发</dd>
									</dl>
							  		 <dl class="dl-horizontal">
									  <dt>5、个人博客</dt>
									  <dd>审核通过的登录用户具有文章管理等功能。待开发</dd>
									</dl>
							  </li>
						</ul>
					</div>
					<div class="col-md-4" >
					<div class="list-group">  
							<a href="#" class="list-group-item active"> 开发人员 </a> 
							<a href="#"	class="list-group-item">芝麻谷</a>  
							<a href="#"	class="list-group-item">涛</a> 
							<a href="#"	class="list-group-item">杨</a>
							<a href="#"	class="list-group-item">等你加入...</a>  
					</div>
					</div>
			 </div>

	</div><hr>
<!-- foot -->
	<jsp:include page="/page/core/foot.jsp" />

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="${ctx}/js/bootstrap.min.js"></script>
</body>
</html>