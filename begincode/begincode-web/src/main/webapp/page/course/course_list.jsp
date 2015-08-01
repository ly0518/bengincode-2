<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../commons/taglibs.jsp"%>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
<title>BeginCode,初学者论坛，begincode,BeginCode</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="Description" content="begincode www.begincode.net  初学者社区，志在让更多软件开发初学者能够掌握一门开发技术  " />
<%@ include file="../../commons/meta.jsp"%>
<link href="${ctx}/css/simplePagination.css" rel="stylesheet">
<link media="screen" href="${ctx}/css/bootstrap.css" rel="stylesheet">
<link media="screen" href="${ctx}/css/courseList.css" rel="stylesheet">
<script src="${ctx}/js/jquery.min.js"></script>
</head>
<body>
	<jsp:include page="/page/core/top.jsp" />
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
				  <c:forEach items="${labels}" var="label" varStatus="varSt">
				  	 <li role="presentation" <c:if test="${varSt.index == 0}">class="active"</c:if>><a href="#">${label.courseTypeName}<span class="badge">${label.labelCourseCount}</span></a></li>
				  </c:forEach>
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
			<div class="col-md-12" id="attention_course">
			</div>
			<div class="col-md-12">
			  <h5  id="jumbotron" class="page-header"></h5>
			</div>
 			<!-- 已关注 结束 -->
			  
			 <!-- 课程列表 开始 -->
			<div class="col-md-12" id="recommend_course">
			</div>
		</div>
		<!-- 课程列表结束 -->
		<div class="row">
			<div id="pagediv">
			</div>
		</div>
	</div>
	<hr>
	<jsp:include page="/page/core/foot.jsp" />
	<script src="${ctx}/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${ctx}/js/jquery.min.js"></script>
	<script type="text/javascript" src="${ctx}/js/jquery.simplePagination.js"></script>
	<script src="${ctx}/js/course/course.js"></script>

</body>
</html>