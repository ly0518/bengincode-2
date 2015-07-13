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
 <script src="${ctx}/js/jquery.min.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
</head>
<body>
	<jsp:include  page="/page/core/top.jsp"/> 
	
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
  <img src="${ctx}/images/photo1.jpg" alt="...">
  <div class="carousel-caption">
    <h3>我们</h3>
    <p>不曾放弃</p>
  </div>
</div>
    
   <div class="item">
  <img src="${ctx}/images/photo1.jpg" alt="...">
  <div class="carousel-caption">
    <h3>我们</h3>
    <p>一直在努力</p>
  </div>
</div>
   <div class="item">
  <img src="${ctx}/images/photo1.jpg" alt="...">
  <div class="carousel-caption">
    <h3>我们</h3>
    <p>这里没有大神</p>
  </div>
</div>

  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
 
 </br>
 <div class="container">
  
 <div class="row">
  <div class="col-md-3">
    <div class="thumbnail">
      <img src="${ctx}/images/image1.jpg" alt="...">
      <div class="caption">
        <h3>视频教程</h3>
        <p>BeginCode原创教程，注重实战</p>
        <p><a href="#" class="btn btn-primary" role="button">开始学习</a> </p>
      </div>
    </div>
  </div>
    <div class="col-md-3">
    <div class="thumbnail">
      <img src="${ctx}/images/image2.jpg" alt="...">
      <div class="caption">
        <h3>精彩博文</h3>
        <p>知识分享，共同提高</p>
        <p><a href="#" class="btn btn-primary" role="button">开始阅读</a></p>
      </div>
    </div>
  </div>
    <div class="col-md-3">
    <div class="thumbnail">
      <img src="${ctx}/images/image3.jpg" alt="...">
      <div class="caption">
        <h3>常见问答</h3>
        <p>你问我答，帮你解决实际问题</p>
        <p><a href="#" class="btn btn-primary" role="button">加入讨论</a></p>
      </div>
    </div>
  </div>
      <div class="col-md-3">
    <div class="thumbnail">
      <img src="${ctx}/images/image3.jpg" alt="...">
      <div class="caption">
        <h3>代码分享</h3>
        <p>直接干货，拿来就能用，</p>
        <p><a href="#" class="btn btn-primary" role="button">进去瞧瞧</a></p>
      </div>
    </div>
  </div>
</div>
</div>


	<!-- foot -->
 <jsp:include page="/page/core/foot.jsp"/> 
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="${ctx}/js/bootstrap.min.js"></script>
</body>
</html>
