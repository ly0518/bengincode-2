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
<title>代码分享,初学者论坛,BeginCode,beginCode</title>
<!-- Bootstrap -->
<link href="${ctx}/css/bootstrap.css" rel="stylesheet">
<link href="${ctx}/css/simplePagination.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${ctx}/js/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/js/jquery.simplePagination.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<script type="text/javascript">
	var totalCount = ${	pageinfo.totalCount	};
</script>
<body>
	<jsp:include page="/page/core/top.jsp" />

	<div class="jumbotron">
		<div class="container">
			<h1>${navInfo.nav_word }分类</h1>
			<p>${navInfo.nav_memo }类别简介</p>
		</div>
	</div>


	<div class="container .col-xs-">
		<div class="row">
			<div class="col-md-8">
				<div id="codelist">
				<c:forEach items="${codes}" var="code">
					<div class="media mediaborder">
<!-- 						<div class="media-left media-middle"> -->
<!-- 							<a href="#"> <img -->
<!-- 								class="media-object img-responsive maxwidth" -->
<%-- 								src="${ctx}/images/girl.jpg" alt="..."> --%>
<!-- 							</a> -->
<!-- 						</div> -->
						<div class="media-body">
							<h4 class="list-group-item-heading">ckEditor修改文件存储目录</h4>
							<p class="list-group-item-text">
								&nbsp;&nbsp;&nbsp;&nbsp;这个类只改变
								<code>&lt;a&gt;</code>
								的外观，不改变功能。可以自己写 JavaScript 禁用这里的链接。 这个类只改变
								<code>&lt;a&gt;</code>
								的外观，不改变功能。可以自己写 JavaScript 禁用这里的链接。 这个类只改变
								<code>&lt;a&gt;</code>
								的外观，不改变功能。可以自己写 JavaScript 禁用这里的链接。
							</p>
							<p>
								<span class="l blogKeyLabel">java,ckeditor</span><span
									class="r blogAuthLabel">作者：冷水源，创建时间：2015-07-11，浏览次数:120</span>
							</p>
						</div>
					</div>
				</c:forEach>
				</div>
				<div class="row">
					<div id="pagediv"></div>
				</div>
			</div>
			<div class="col-md-4">
				<!--   -->
				<div class="list-group">
					<a href="#" class="list-group-item active"> 最新资源 </a> 
					<a href="${ctx}/down/viewDown/${book.bc_down_id}.html"	class="list-group-item">最新资源</a>
					<a href="${ctx}/down/viewDown/${book.bc_down_id}.html"  class="list-group-item">最新资源</a>
					<a href="${ctx}/down/viewDown/${book.bc_down_id}.html"  class="list-group-item">最新资源</a>
					<c:forEach items="${books}" var="book">
						<a href="${ctx}/down/viewDown/${book.bc_down_id}.html"
							class="list-group-item">最新资源</a>
					</c:forEach>
				</div>
				<div class="list-group">
					<a href="#" class="list-group-item active"> 项目推荐 </a> 
					<a href="${ctx}/down/viewDown/${book.bc_down_id}.html" class="list-group-item">最新资源</a> <a
						href="${ctx}/down/viewDown/${book.bc_down_id}.html"
						class="list-group-item">最新资源</a> <a
						href="${ctx}/down/viewDown/${book.bc_down_id}.html"
						class="list-group-item">最新资源</a> <a
						href="${ctx}/down/viewDown/${book.bc_down_id}.html"
						class="list-group-item">最新资源</a>
					<c:forEach items="${projectStages}" var="projectStage">
						<a
							href="${ctx}/project/viewProStage/${projectStage.project_stage_id}.html"
							class="list-group-item">最新项目章节</a>
					</c:forEach>
				</div>

			</div>
		</div>

	</div>
	<hr>
	<!-- foot -->
	<jsp:include page="/page/core/foot.jsp" />

	<script src="${ctx}/css/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${ctx}/js/code/code.js"></script>
</body>
</html>