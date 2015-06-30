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
<title>${project.project_name },项目介绍,初学者论坛,beginer,BeginCode,begincode</title>
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
        <h1>${project.project_name }BeginCode开发过程</h1>
        <p>${project.project_intro }详细介绍BeginCode各阶段代码</p>
        
      </div>
    </div>
    
     
	
	<div class="container .col-xs-" >
		<div class="row">
					<div class="col-md-12" >
					<ul class="list-group panel panel-primary" style="margin-bottom:10px;">
					 <li class="list-group-item">
									<h3 style="color:#5bc0de"><a href="${ctx}/project/viewProStage/${proStage.project_stage_id}.html"> ${proStage.stage_name }项目阶段名称</a></h3>
									<p><a style="TEXT-DECORATION:none;color:#000" href="${ctx}/project/viewProStage/${proStage.project_stage_id}.html">
   									 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${proStage.stage_abstract} 
   									 </a></p>
									<div class="row">
										<div  class="col-md-6">
										 <p style="text-align: left;"></p>
									
										</div>
										<div  class="col-md-6">
										 <p style="text-align: right;"> <b>作者</b>：${proStage.writer }&nbsp;|&nbsp;<b>阅读</b>(${proStage.view_count })&nbsp;
									
									</div>
									</div>
									
							  </li>
							   <li class="list-group-item">
									<h3 style="color:#5bc0de"><a href="${ctx}/project/viewProStage/${proStage.project_stage_id}.html"> ${proStage.stage_name }项目阶段名称</a></h3>
									<p><a style="TEXT-DECORATION:none;color:#000" href="${ctx}/project/viewProStage/${proStage.project_stage_id}.html">
   									 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${proStage.stage_abstract} 
   									 </a></p>
									<div class="row">
										<div  class="col-md-6">
										 <p style="text-align: left;"></p>
									
										</div>
										<div  class="col-md-6">
										 <p style="text-align: right;"> <b>作者</b>：${proStage.writer }&nbsp;|&nbsp;<b>阅读</b>(${proStage.view_count })&nbsp;
									
									</div>
									</div>
									
							  </li>
						<c:forEach items="${proStages}" var="proStage">
						
						
							  <li class="list-group-item">
									<h3 style="color:#5bc0de"><a href="${ctx}/project/viewProStage/${proStage.project_stage_id}.html"> ${proStage.stage_name }</a></h3>
									<p><a style="TEXT-DECORATION:none;color:#000" href="${ctx}/project/viewProStage/${proStage.project_stage_id}.html">
   									 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${proStage.stage_abstract} 
   									 </a></p>
									<div class="row">
										<div  class="col-md-6">
										 <p style="text-align: left;"></p>
									
										</div>
										<div  class="col-md-6">
										 <p style="text-align: right;"> <b>作者</b>：${proStage.writer }&nbsp;|&nbsp;<b>阅读</b>(${proStage.view_count })&nbsp;
									
									</div>
									</div>
									
							  </li>
						 
						</c:forEach>
							 </ul>
					</div>
			 </div>

	</div><hr>
<!-- foot -->
	<jsp:include page="/page/core/foot.jsp" />

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="${ctx}/js/bootstrap.min.js"></script>
</body>
</html>