<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="Description" content="begincode www.begincode.net  初学者社区，志在让更多软件开发初学者能够掌握一门开发技术  " />
<%@ include file="/commons/meta.jsp"%>
<title>经典博文,初学者论坛,BeginCode,beginCode</title>
<!-- Bootstrap -->
<link href="${ctx}/css/bootstrap.css" rel="stylesheet">
<link href="${ctx}/css/simplePagination.css" rel="stylesheet"	type="text/css" />
<script type="text/javascript" src="${ctx}/js/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/js/jquery.simplePagination.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
</head>
<body>
	<jsp:include page="/page/core/top.jsp" />
 <ol class="breadcrumb">
  <li class="active"> 首页 </li>
  <li class="active">空间管理</li>
</ol>
     
	
	<div class="container .col-xs-" style="margin-top:10px; border-radius: 0px;">
		<div class="row" >
		<div class="col-md-3">
		<div class="panel panel-primary" style="margin-bottom:10px">
			<div class="panel-body" >
						<div class="media" style="margin-bottom:5px">
						   <a class="media-left" href="">
						    <img src="${user.pic}" id="pic" style="width:80px;height:80px;" alt="${user.nickname}">
						  </a>
						  <div class="media-body"  >
						    <h2 class="media-heading " id="nickName" style="color:#EA0000">${user.nickname}</h2>
						  </div>
						</div>
						  <!--
					    <ul class="nav nav-pills" role="tablist">&nbsp;&nbsp;&nbsp;&nbsp;
						  	<li role="presentation" class="active"><a href="#">积分 <span class="badge">42</span></a></li>&nbsp;&nbsp;
						    <li role="presentation" class="active"><a href="#">课程 <span class="badge">2</span></a></li>
						</ul>
						-->
			</div>
		</div>
		 <div class="row">
		 	<div class="col-md-12">
		 		<button type="button" class="btn btn-primary" id="addBlog" onclick="addBlog()" data-toggle="button" aria-pressed="false" autocomplete="off" style="border-radius: 0px;width:100%;height:60px;margin-bottom:10px;font-weight:bold;font-size:35px">
			  发布博文
			</button>		
		 	</div>
		 	<!--  
		 	<div class="col-md-6">
			<button type="button" class="btn btn-primary" data-toggle="button" aria-pressed="false" autocomplete="off" style="border-radius: 0px;width:100%;height:40px;margin-bottom:10px;margin-left:0px;margin-right:0px;font-weight:bold;font-size:20px">
			  空间管理
			</button>
		 	</div>
		 	-->
		 </div>
					 <div class="list-group" id="classList">
						<a href="#" class="list-group-item active"> 博客分类</a>
					</div>
					<div class="list-group" id="readList">
						<a href="#" class="list-group-item active"> 阅读排行 </a>
					</div>
					</div>
					
					<div class="col-md-9" >
					<div class="panel panel-primary" style="margin-top:0;" >
						 <div class="panel-body" >
						<ol class="breadcrumb" style="background-color:#5bc0de;">
						  <li class="active"> 空间 </li>
						  <li class="active"> 博客</li>
						  <li class="active">分类</li>
						</ol >
						<ul class="list-group" style="margin-bottom:10px;" id="blogsList" >
							<c:forEach items="${blogs}" var="blog">
							  <li class="list-group-item">
									<h3 style="color:#5bc0de"><a href="${ctx}/blog/${blog.blogId}">${blog.blogInfo }</a></h3>
									<p>&nbsp;&nbsp;&nbsp;&nbsp;${blog.blogAbstract } </p>
									<div class="row">
										<div  class="col-md-6">
										 <p style="text-align: left;">分类名称：${blog.blogTypeName}</p>
									</div>
										<div  class="col-md-6">
										 <p style="text-align: right;"><a href="${ctx}/blog/blogId/${blog.blogId }"><b>编辑</b></a>&nbsp; | &nbsp;<b>阅读</b>(${blog.viewCount})&nbsp;  </p>
									
									</div>
									</div>
									
							  </li>
							</c:forEach>
						
						</ul>
						 <div class="row center"  >
						  <div id="pagediv"  ></div>
						</div>    
					</div></div>
					</div>
			 </div>
	</div>
	<input type="hidden" name="blogTypeId" id="blogTypeId" value="${blogTypeId}" />
<hr>
	<!-- foot -->
	<jsp:include page="/page/core/foot.jsp" />
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<!-- msg end -->
	<script src="${ctx}/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${ctx}/js/blog/blogUtil.js"></script>
	<script type="text/javascript" src="${ctx}/js/blog/blogUser.js"></script>
	<script type="text/javascript" src="${ctx}/js/jquery.cookie.js"></script>
	<script type="text/javascript">
	$(document).ready(function(e) {
		$("#pagediv").pagination({
			items : ${pageinfo.totalCount},
			itemsOnPage : 10,
			cssStyle : 'light-theme',
			onPageClick : changeBlogUser
		});
		var ctx = "${ctx}";  
		userTopTen();
		blogTypes();
	});
</script>
</body>
</html>