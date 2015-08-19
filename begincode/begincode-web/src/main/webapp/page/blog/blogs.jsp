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

<title>经典博文,初学者论坛,BeginCode,beginCode</title>
<!-- Bootstrap -->
<link href="${ctx}/css/bootstrap.css" rel="stylesheet">
<link href="${ctx}/css/simplePagination.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="${ctx}/js/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/js/jquery.simplePagination.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<jsp:include page="/page/core/top.jsp" />

	<div class="jumbotron">
		<div class="container">
			<h1>博文分享</h1>
			<p>&nbsp;&nbsp;&nbsp;&nbsp;开发经验分享，常用技术介绍，各种应用讲解</p>
		</div>
	</div>


	<div class="container .col-xs-">
		<div class="row">
			<div class="col-md-9">
				<div id="bloglist">
					<c:forEach items="${blogs}" var="blog">
						<div class="media mediaborder">
							<div class="media-left media-middle">
								<a href="#">
								<img class="media-object img-responsive maxwidth" src="${blog.pic}" alt="${blog.nickname}">
								</a> 
								<a href="#" target="_blank" title="${blog.nickname}" class="nickname">${blog.nickname}</a>
							</div>
							<div class="media-body">
								<h4 class="list-group-item-heading">
									<a href="${ctx}/blog/${blog.blogId}">${blog.blogInfo}</a>
								</h4>
								<p class="list-group-item-text">
									<a href="">${blog.blogAbstract}</a>
								</p>
								<span class="keyword-list l">
									<c:forTokens items="${blog.begincodeKeys}" delims="," var="keyword">
										<a href="#" target="_blank" class="list-tag">${keyword}</a>
									</c:forTokens>
								</span>
								<span class="r blogAuthLabel ">创建时间：
								<fmt:formatDate	pattern="yyyy-MM-dd" value="${blog.createDatetime }" />
									浏览次数:${blog.viewCount}
								</span>
							</div>
							
							
						</div>
					</c:forEach>
				</div>
				<div class="row center"  >
				  <div id="pagediv"  ></div>
				</div>
			</div>
			<div class="col-md-3">
				<!--  标签库暂未实现
				<div class="panel panel-primary ">
					<div class="panel-heading">BeginCode标签库</div>
					<div class="panel-body">
						<a href="/wenda/tag/tagId/3" class="hot-label" target="_self">JAVA</a>
						<a href="/wenda/tag/tagId/5" class="hot-label" target="_self">Html/CSS</a>
					</div>
				</div>
				 -->
				 	<button type="button" class="btn btn-primary" onclick="addBlog()" id="codeShare" data-toggle="button" aria-pressed="false" autocomplete="off" style="border-radius: 0px;width:100%;height:60px;margin-bottom:10px;font-weight:bold;font-size:35px">
			  创建博文
			</button>
				<div class="list-group">
				
					<a href="#" class="list-group-item active"> 阅读排行 </a>
					<div id="blogTopTen"></div>
				</div>

			</div>
		</div>

	</div>
	<hr>
	<!-- foot -->
	<jsp:include page="/page/core/foot.jsp" />
	<script src="${ctx}/css/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${ctx}/js/blog/blog.js"></script>
	<script type="text/javascript">
	$(document).ready(function(e) {
		$("#pagediv").pagination({
			items : ${pageinfo.totalCount},
			itemsOnPage : 10,
			cssStyle : 'light-theme',
			onPageClick : changePage
		});
		topTen();
	});
</script>
</body>
</html>