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
					<ul class="list-group panel panel-primary" style="margin-bottom:10px;">
						<c:forEach items="${codes.list}" var="code">
							${code.codeInfo }
						
							  <li class="list-group-item">
									<h3 style="color:#5bc0de"><a href="${ctx}/code/viewCode/${code.bc_code_id}.html"> ${code.code_info }</a></h3>
									<p><a style="TEXT-DECORATION:none;color:#000" href="${ctx}/code/viewCode/${code.bc_code_id}.html">
   									 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${code.code_abstract} 
   									 </a></p>
									<div class="row">
										<div  class="col-md-6">
										 <p style="text-align: left;"></p>
									
									</div>
										<div  class="col-md-6">
										 <p style="text-align: right;"> <b>作者</b>：${code.writer} &nbsp;|&nbsp;<b>阅读</b>(${code.view_count})&nbsp;
									
									</div>
									</div>
									
							  </li>
							  
							 
						</c:forEach>
						  <li class="list-group-item">
									<h3 style="color:#5bc0de"><a href="${ctx}/code/viewCode/${code.bc_code_id}.html"> 代码名称</a></h3>
									<p><a style="TEXT-DECORATION:none;color:#000" href="${ctx}/code/viewCode/${code.bc_code_id}.html">
   									 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${code.code_abstract}代码简介
   									 </a></p>
									<div class="row">
										<div  class="col-md-6">
										 <p style="text-align: left;"></p>
									
									</div>
										<div  class="col-md-6">
										 <p style="text-align: right;"> <b>作者</b>：${code.writer} &nbsp;|&nbsp;<b>阅读</b>(${code.view_count})&nbsp;
									
									</div>
									</div>
									
							  </li>
							   <li class="list-group-item">
									<h3 style="color:#5bc0de"><a href="${ctx}/code/viewCode/${code.bc_code_id}.html"> 代码名称</a></h3>
									<p><a style="TEXT-DECORATION:none;color:#000" href="${ctx}/code/viewCode/${code.bc_code_id}.html">
   									 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${code.code_abstract}代码简介
   									 </a></p>
									<div class="row">
										<div  class="col-md-6">
										 <p style="text-align: left;"></p>
									
									</div>
										<div  class="col-md-6">
										 <p style="text-align: right;"> <b>作者</b>：${code.writer} &nbsp;|&nbsp;<b>阅读</b>(${code.view_count})&nbsp;
									
									</div>
									</div>
									
							  </li>
							 </ul>
							  
							
						    
					</div>
					<div class="col-md-4">
							 
						 <div class="list-group">
							<a href="#" class="list-group-item active"> 最新资源 </a> 
							<c:forEach items="${books}" var="book" >
								<a href="${ctx}/down/viewDown/${book.bc_down_id}.html"	class="list-group-item">${book.down_name}</a> 
							</c:forEach>
							
						</div>
						 <div class="list-group">
							<a href="#" class="list-group-item active"> 项目推荐 </a> 
							<c:forEach items="${projectStages}" var="projectStage" >
								<a href="${ctx}/project/viewProStage/${projectStage.project_stage_id}.html"	class="list-group-item">${projectStage.stage_name}</a> 
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