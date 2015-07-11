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
 <script src="${ctx}/js/jquery.min.js"></script>

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
         <h1>${navInfo.nav_word } 分类</h1>
        <p>${navInfo.nav_memo }类别简介</p>
      </div>
    </div>  
     
	
	<div class="container .col-xs-" >
		<div class="row">
					<div class="col-md-8" >
<!-- 					<ul class="list-group panel panel-primary" style="margin-bottom:10px;"> -->
						<c:forEach items="${codes.list}" var="code">
					
  <div class="media mediaborder">
  <div class="media-left media-middle">
    <a href="#">
      <img class="media-object img-responsive maxwidth" src="${ctx}/images/girl.jpg" alt="...">
    </a>
  </div>
  <div class="media-body">
     <h4 class="list-group-item-heading">ckEditor修改文件存储目录</h4>
    <p class="list-group-item-text">这个类只改变 <code>&lt;a&gt;</code> 的外观，不改变功能。可以自己写 JavaScript 禁用这里的链接。
    这个类只改变 <code>&lt;a&gt;</code> 的外观，不改变功能。可以自己写 JavaScript 禁用这里的链接。
    这个类只改变 <code>&lt;a&gt;</code> 的外观，不改变功能。可以自己写 JavaScript 禁用这里的链接。
    </p>
    <p><span class="l blogKeyLabel">java,ckeditor</span><span class="r blogAuthLabel">作者：冷水源，创建时间：2015-07-11，浏览次数:120</span></p>
  </div>
</div>
   
<!-- 							  <li class="list-group-item"> -->
<%-- 									<h3 style="color:#5bc0de"><a href="${ctx}/code/viewCode/${code.begincodeCodeId }.html"> ${code.codeInfo }</a></h3> --%>
<%-- 									<p><a style="TEXT-DECORATION:none;color:#000" href="${ctx}/code/viewCode/${code.begincodeCodeId}.html"> --%>
<%--    									 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${code.codeInfo}  --%>
<!--    									 </a></p> -->
<!-- 									<div class="row"> -->
<!-- 										<div  class="col-md-6"> -->
<!-- 										 <p style="text-align: left;"></p> -->
									
<!-- 									</div> -->
<!-- 										<div  class="col-md-6"> -->
<%-- 										 <p style="text-align: right;"> <b>作者</b>：${code.codeInfo} &nbsp;|&nbsp;<b>阅读</b>(${code.viewCount})&nbsp; --%>
									
<!-- 									</div> -->
<!-- 									</div> -->
									
<!-- 							  </li> -->
							  
							 
						</c:forEach>
<!-- 							 </ul> -->
							  
							<nav>
  <ul class="pagination">
    <li>
      <a href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li><a href="#">1</a></li>
    <li><a href="#">2</a></li>
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>
    <li>
      <a href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>

						    
					</div>
					<div class="col-md-4">
						<!--   -->	
						 <div class="list-group">
							<a href="#" class="list-group-item active"> 最新资源 </a> 
								<a href="${ctx}/down/viewDown/${book.bc_down_id}.html"	class="list-group-item">最新资源</a> 
								<a href="${ctx}/down/viewDown/${book.bc_down_id}.html"	class="list-group-item">最新资源</a> 
								<a href="${ctx}/down/viewDown/${book.bc_down_id}.html"	class="list-group-item">最新资源</a> 
							<c:forEach items="${books}" var="book" >
								<a href="${ctx}/down/viewDown/${book.bc_down_id}.html"	class="list-group-item">最新资源</a> 
							</c:forEach>
							
						</div>
						 <div class="list-group">
							<a href="#" class="list-group-item active"> 项目推荐 </a> 
						<a href="${ctx}/down/viewDown/${book.bc_down_id}.html"	class="list-group-item">最新资源</a> 
								<a href="${ctx}/down/viewDown/${book.bc_down_id}.html"	class="list-group-item">最新资源</a> 
								<a href="${ctx}/down/viewDown/${book.bc_down_id}.html"	class="list-group-item">最新资源</a> 
								<a href="${ctx}/down/viewDown/${book.bc_down_id}.html"	class="list-group-item">最新资源</a> 
							<c:forEach items="${projectStages}" var="projectStage" >
								<a href="${ctx}/project/viewProStage/${projectStage.project_stage_id}.html"	class="list-group-item">最新项目章节</a> 
							</c:forEach>
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