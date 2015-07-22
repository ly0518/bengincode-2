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
<%-- 							       <img src="${ctx}/images/yuan.gif"/>&nbsp;<img src="${ctx}/images/jian.gif"/>&nbsp; --%>
							       ${code.codeInfo } </h3>
							       <hr style="border:none;border-top:2px solid blue; height:0;" />
    <p>${code.codeContent }
    <pre>
       <input type=   />
    </pre>
</p>
							       <p style="text-align: right;"><b>作者</b>(${code.nickname }) &nbsp; | &nbsp;<b>阅读</b>(${code.viewCount })&nbsp; </p>
<!-- <form > -->
<!--    <input type="text" class="form-control" placeholder="一句话评论">	 -->
<!--    <div id="pub-btm" class="pub-btm clearfix"> -->
<!--            <button type="button" class="btn pub-btn btn-primary r">发表评论</button> -->
<!--       </div> -->
<!-- </form> -->
<!-- 	<div id="course_note"> -->
<!--         <ul class="commentcon"> -->
<!--               <li> -->
<!--         <div class="notelist_headpic"> -->
<!--         <a href="/space/u/uid/1967307" target="_blank"><img src='http://img.mukewang.com/user/5557f91e0001115601000100-40-40.jpg' width='40' height='40' /></a> -->
<!--         </div> -->
<!--         <div class="notelist_content"> -->
<!--           <div class="u_name"> -->
<!--             <a href="/space/u/uid/1967307" target="_blank">一棵树被占用了</a> -->
<!--           </div> -->
<!--           <p>条理清晰，感谢分享</p> -->
<!--           <div class="notelist-bottom clearfix"> -->
<!--             <span title="创建时间" class="l timeago">时间：1天前</span> -->
<!--                         <a href="/video/5563" class="from-course">源自：1-2 事务与分布式事务原理与实践(二)</a> -->
<!--                         <div class="notelist-actions"> -->
<!--               <a title="赞" href="javascript:;" class="js-pl-praise list-praise "  data-id="51545"> -->
<!--                 <span class="icon icon_good "></span> -->
<!--                 <em>0</em></a> -->
<!--             </div> -->
<!--           </div> -->
         
<!--       </li> -->
<!--         <li> -->
<!--         <div class="notelist_headpic"> -->
<!--         <a href="/space/u/uid/1967307" target="_blank"><img src='http://img.mukewang.com/user/5557f91e0001115601000100-40-40.jpg' width='40' height='40' /></a> -->
<!--         </div> -->
<!--         <div class="notelist_content"> -->
<!--           <div class="u_name"> -->
<!--             <a href="/space/u/uid/1967307" target="_blank">一棵树被占用了</a> -->
<!--           </div> -->
<!--           <p>条理清晰，感谢分享</p> -->
<!--           <div class="notelist-bottom clearfix"> -->
<!--             <span title="创建时间" class="l timeago">时间：1天前</span> -->
<!--                         <div class="notelist-actions"> -->
<!--                 <em><a href="" >回复</a>（2）</em></a> -->
<!--             </div> -->
<!--           </div> -->
         
<!--       </li> -->
<!--             </ul> -->
<!-- <nav> -->
<!--   <ul class="pager"> -->
<!--     <li class="previous"><a href="#"><span aria-hidden="true">&larr;</span>上一页</a></li> -->
<!--     <li class="next"><a href="#">下一页 <span aria-hidden="true">&rarr;</span></a></li> -->
<!--   </ul> -->
<!-- </nav> -->
<!-- 		      </div> -->
</div>

	 </div>


					</div>
					<div class="col-md-3">
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
	<script type="text/javascript">
	$(document).ready(function(e) {
		topTen();
	});
</script>
</body>
</html>