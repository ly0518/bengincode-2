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
<meta name="Description" content="begincode www.begincode.net  初学者社区，志在让更多软件开发初学者能够掌握一门开发技术  "/> 
<!-- Bootstrap -->
<link  media="screen" href="${ctx}/css/bootstrap.css" rel="stylesheet">
<link href="${ctx}/css/simplePagination.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${ctx}/js/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/js/jquery.simplePagination.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
</head>
<script type="text/javascript">
$(document).ready(function(e) {
	 $("#pagediv").pagination({
	      items: 50,
	      itemsOnPage: 10,
	      cssStyle: 'light-theme'   
	  });
});
</script>
<body>
	<jsp:include  page="/page/core/top.jsp"/> 
	
 
 <div class="container">
 <div class="row">
  <div class="col-xs-12 col-sm-6 col-md-8"><div class="list-group">
							<a href="#" class="list-group-item active">最新章节 </a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">第一章，jdk安装规范<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">第一章，jdk安装规范<span class="view-count">1202</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">第一章，jdk安装规范<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">第一章，jdk安装规范<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">第一章，jdk安装规范<span class="view-count">1202</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">第一章，jdk安装规范<span class="view-count">12</span></a>
							 <c:forEach items="${jwebchapters }" var="jwebchapter">
									<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">${jwebchapter.chapter_title }</a>
								</c:forEach>
					</div></div>
  <div class="col-xs-6 col-md-4"><div class="list-group">
							<a href="#" class="list-group-item active">最新章节 </a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">第一章，jdk安装规范<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">第一章，jdk安装规范<span class="view-count">1202</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">第一章，jdk安装规范<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">第一章，jdk安装规范<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">第一章，jdk安装规范<span class="view-count">1202</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">第一章，jdk安装规范<span class="view-count">12</span></a>
							 <c:forEach items="${jwebchapters }" var="jwebchapter">
									<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">${jwebchapter.chapter_title }</a>
								</c:forEach>
					</div></div>
</div>
  <ul class="paginList">
         <div id="pagediv"></div>
        </ul>
</div>


	<!-- foot -->
 <jsp:include page="/page/core/foot.jsp"/> 
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="${ctx}/js/bootstrap.min.js"></script>
</body>
</html>
