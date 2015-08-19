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
<title>${code.codeInfo },初学者论坛，beginCode,BeginCode</title>
<!-- Bootstrap -->
<link href="${ctx}/css/bootstrap.css" rel="stylesheet">
<link media="screen" href="${ctx}/css/pinglun.css" rel="stylesheet">
<script src="${ctx}/js/jquery.min.js"></script>

 
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body  >
		<jsp:include page="/page/core/top.jsp" />
 <div class="jumbotron">
      <div class="container">
        <h1>${code.codeInfo }</h1>
        <p> ${code.codeAbstract } </p>
      </div>
    </div>
	<div class="container .col-xs-" >
		<div class="row" >
					<div class="col-md-9" >
							  <div class="panel panel-primary" style="margin-top:0;" >
							  	<div class="panel-body">
							       <h3 >
							       
							       <span class="icon " style="background:#fd9c47;">荐</span>
							     <span class="icon " style="background:#fd6245;">顶</span> <span class="icon" style="background:#44ac57; "  title="原创博客">原</span> ${code.codeInfo }
							      </h3>
							       <hr style="border:none;border-top:2px solid blue; height:0;" />
    <p>${code.codeContent }
     
</p>
<span class="r blogAuthLabel"><b>作者</b>(${code.nickname }) &nbsp; | &nbsp;<b>阅读</b>(${code.viewCount })&nbsp;  
								</span>
								<p>
<form name="codeCommonForm" id="codeCommonForm" style="margin-top:20px;">
<div class="form-group">
   <input type="hidden" name="begincodeCodeId" id="begincodeCodeId" value="${code.begincodeCodeId }" />
   <textarea class="form-control required"  id="codeCommentContent" name="codeCommentContent"  rows="3" placeholder="一句话评论"></textarea>
   </div>
   <div class="form-group">
           <button type="button" id="pubCodeCommon" class="btn pub-btn btn-primary  r">发表评论</button>
      </div>

</form>
</p>
</div>

	

<!-- 评论开始 -->
<div class="row">
	<div class="col-md-12">
	<div id="comments"></div>
<nav>
  <ul class="pager">
  	<input type="hidden" name="currentPage" id="currentPage" value="0" />
    <li class="previous"><a href="#0" name="#0" id="prePage"><span aria-hidden="true">&larr;</span>上一页</a></li>
    <li class="next"><a href="#1" name="#1" id="nextPage">下一页 <span aria-hidden="true">&rarr;</span></a></li>
  </ul>
</nav>
</div>
</div>
	   

<!-- 评论结束 -->

 </div>
					</div>
					<div class="col-md-3">
<!-- 					   <div class="list-group"> -->
<!-- 							<a href="#" class="list-group-item active"> 相关代码</a>  -->
<!-- 							<div id="relationCodeTopFive"></div> -->
<!-- 						</div> -->
						<div class="list-group">
							<a href="#" class="list-group-item active"> 阅读排行 </a> 
							<div id="codeTopTen"></div>
						</div>
<!-- 						 <div class="list-group"> -->
<!-- 							<a href="#" class="list-group-item active"> 相关项目 </a>  -->
<%-- 							<c:forEach items="${relProStages }" var="proStage"> --%>
<%-- 							<a href="${ctx}/project/viewProStage/${proStage.project_stage_id}.html"	class="list-group-item">${proStage.stage_name }</a>   --%>
<%-- 							</c:forEach> --%>
							
<!-- 						</div> -->
					 
					</div>
			 </div>
			

	</div>
		<hr>
<!-- foot -->
	<jsp:include page="/page/core/foot.jsp" />
	<script src="${ctx}/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${ctx}/js/code/code.js"></script>
	<script type="text/javascript" src="${ctx}/js/code/codeComment.js"></script>
 	<script src="${ctx}/js/validate/jquery.validate.js"></script>
	<script src="${ctx}/js/validate/jquery.metadata.js"></script>
	<script src="${ctx}/js/validate/messages_zh.js"></script>
	<script type="text/javascript">
	var codIdId = ${code.begincodeCodeId };
	$(document).ready(function(e) {
		topTen();
		codeViewInit(codIdId);
	});

</script>
</body>
</html>