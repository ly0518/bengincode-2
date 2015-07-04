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
<link media="screen" href="${ctx}/css/courseList.css" rel="stylesheet">
<script src="${ctx}/js/jquery.min.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
</head>
<body>
	<jsp:include page="/page/core/top.jsp" />
	<!-- -->
	<div class="jumbotron">
		<div class="container">
			<h1>JAVA_WEB开发指南</h1>
			<p>希望我们的努力能够助你成就开发之路，你的支持是我们的最大动力</p>
		</div>
	</div>

 
	<div class="container">
			 
		<div class="row">
			<h5 id="jumbotron" class="page-header">
				<ul class="nav nav-pills" role="tablist">
				 <li role="presentation" ><a href="#" class="nav-label">全部课程 </a></li>
  <li role="presentation" class="active"><a href="#">JAVA<span class="badge">42</span></a></li>
  <li role="presentation"><a href="#">框架</a></li>
  <li role="presentation"><a href="#">IO<span class="badge">3</span></a></li>
   <li role="presentation"><a href="#">多线程</a></li>
    <li role="presentation"><a href="#">前端</a></li>
    <li role="presentation"><a href="#">常用组件</a></li>
</ul>
			</h5>
			<!--
			<h5 id="jumbotron" class="page-header">
				<ul class="nav nav-pills" role="tablist">
				 <li role="presentation" ><a href="#" class="nav-label">课程难度</a></li>
  <li role="presentation" class="active"><a href="#">初级<span class="badge">42</span></a></li>
  <li role="presentation"><a href="#">中级</a></li>
  <li role="presentation"><a href="#">高级<span class="badge">3</span></a></li>
</ul>
			</h5>
			  -->
			  <!-- 已关注 开始 -->
			   <div class="col-md-12">
			  <div class="col-sm-6 col-md-3">
				<a class="thumbnail-bottom" href="www.baidu.com">
					<img class="img-responsive"
						src="http://img.mukewang.com/558ba3980001db0e06000338-240-135.jpg"
						alt="...">
					<div class="caption">
						<h4 class="media-heading">观察者模式</h4>
						<div class="tips">
							<p class="text-ellipsis">带动画效果的工具条，精彩不容错过！</p>
							<span class="l">更新完毕</span> <b class="follow-label"> 2476 人学习</b><b class="label-blue"> 已关注</b>
						</div>
					</div>
				</a>
			</div>
			 </div>
			 <div class="col-md-12">
			  <h5  id="jumbotron" class="page-header"></h5>
			 </div>
			  <!-- 已关注 结束 -->
			  
			  
			 <!-- 课程列表 开始 -->
			<div class="col-sm-6 col-md-3">
				<a class="thumbnail" href="www.baidu.com">
					<img class="img-responsive"
						src="http://img.mukewang.com/558ba3980001db0e06000338-240-135.jpg"
						alt="...">
					<div class="caption">
						<h4 class="media-heading">观察者模式</h4>
						<div class="tips">
							<p class="text-ellipsis">带动画效果的工具条，精彩不容错过！</p>
							<span class="l">更新完毕</span> <b class="follow-label"> 2476 人学习</b>
						</div>
					</div>
				</a>
			</div>
			<div class="col-sm-6 col-md-3">
				<a class="thumbnail" href="www.baidu.com">
					<img class="img-responsive"
						src="http://img.mukewang.com/558b55390001df0e06000338-240-135.jpg"
						alt="...">
					<div class="caption">
						<h4 class="media-heading">观察者模式</h4>
						<div class="tips">
							<p class="text-ellipsis">带动画效果的工具条，精彩不容错过！</p>
							<span class="l">更新完毕</span>  <b class="follow-label"> 2476 人学习</b>
						</div>
					</div>
				</a>
			</div>
			<div class="col-sm-6 col-md-3">
				<a class="thumbnail" href="www.baidu.com">
					<img class="img-responsive"
						src="http://img.mukewang.com/5567d48300010ba306000338-240-135.jpg"
						alt="...">
					<div class="caption">
						<h4 class="media-heading">观察者模式</h4>
						<div class="tips">
							<p class="text-ellipsis">带动画效果的工具条，精彩不容错过！</p>
							<span class="l">更新完毕</span>  <b class="follow-label"> 2476 人学习</b>
						</div>
					</div>
				</a>
			</div>
						<div class="col-sm-6 col-md-3">
				<a class="thumbnail" href="www.baidu.com">
					<img class="img-responsive"
						src="http://img.mukewang.com/557fff240001fbfb06000338-240-135.jpg"
						alt="...">
					<div class="caption">
						<h4 class="media-heading">观察者模式</h4>
						<div class="tips">
							<p class="text-ellipsis">带动画效果的工具条，精彩不容错过！</p>
							<span class="l">更新完毕</span>  <b class="follow-label"> 2476 人学习</b>
						</div>
					</div>
				</a>
			</div>
			
		</div>
		<!-- 课程列表结束 -->

		<div class="row">
			<div class="col-md-12">

				<!-- 分页 -->
				<nav>
					<ul class="pagination">
						<li><a href="#" aria-label="Previous"> <span
								aria-hidden="true">&laquo;</span>
						</a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#" aria-label="Next"> <span
								aria-hidden="true">&raquo;</span>
						</a></li>
					</ul>
				</nav>
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