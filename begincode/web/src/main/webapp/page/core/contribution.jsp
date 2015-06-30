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
<title>BeginCode贡献榜,初学者论坛，beginer,BeginCode,begincode</title>
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
<jsp:include page="/page/core/top.jsp" />



 <div class="jumbotron">
      <div class="container">
        <h1>BeginCode贡献榜</h1>
        <p>此页，献给那些为我们提出宝贵建议，代码，网站内容的小伙伴们，感谢有你</p>
        
      </div>
    </div>
    
     
	
	<div class="container .col-xs-" >
		<div class="row">
					<div class="col-md-12" >
					<ul class="list-group panel panel-primary" style="margin-bottom:10px;">
						
						
							  <li class="list-group-item">
							  		<h5>本排名不分先后，不按贡献，随机</h5>
									<h4>
										1、冷水源：建站，主程序，运维，教程内容，博客分享
									</h4>
									<h4>
										2、年少丶：网站bug，博客分享，建议
									</h4>
									<h4>
									3、芝麻谷：个人头像上传，截图功能
									</h4>
							  </li>
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