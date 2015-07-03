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
<meta name="Description"
	content="begincode www.begincode.net  初学者社区，志在让更多软件开发初学者能够掌握一门开发技术  " />
<!-- Bootstrap -->
<link media="screen" href="${ctx}/css/bootstrap.css" rel="stylesheet">
<script src="${ctx}/js/jquery.min.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
</head>
<body>
	<jsp:include page="/page/core/top.jsp" />
 <ol class="breadcrumb">
  <li><a href="#">首页</a></li>
  <li class="active">博文强识</li>
</ol>
     
	
	<div class="container .col-xs-" style="margin-top:10px; border-radius: 0px;">
		<div class="row" >
		<div class="col-md-3">
		<div class="panel panel-primary" style="margin-bottom:10px">
			<div class="panel-body" >
						<div class="media" style="margin-bottom:10px">
						   <a class="media-left" href="">
						    <img src="" id="pic" style="width:80px;height:80px;" alt="">
						  </a>
						    
						  <div class="media-body">
						    <h2 class="media-heading " style="color:#EA0000">${blogUserName}</h2>
						    	<p style="text-align:right">
						    	<!-- 修改资料 更改头像  -->
						    	</p>
						  </div>
						</div>
						<!-- 
					    <ul class="nav nav-pills" role="tablist">
						  	<li role="presentation" class="active"><a href="#">积分 <span class="badge">42</span></a></li>&nbsp;&nbsp;
						    <li role="presentation" class="active"><a href="#">课程 <span class="badge">2</span></a></li>
						</ul>
						 -->
			</div>
		</div>
		 <div class="row">
		 	<div class="col-md-12">
			
		 	 <div type="button" class="btn btn-primary" id="addBlog" data-toggle="button" aria-pressed="false" autocomplete="off" style="border-radius: 0px;width:100%;height:60px;margin-bottom:10px;font-weight:bold;font-size:14px">
			 他什么都没说
			</div>		
		 	</div>
		 	<!--  
		 	<div class="col-md-6">
			<button type="button" class="btn btn-primary" data-toggle="button" aria-pressed="false" autocomplete="off" style="border-radius: 0px;width:100%;height:40px;margin-bottom:10px;margin-left:0px;margin-right:0px;font-weight:bold;font-size:20px">
			  空间管理
			</button>
		 	
		 	</div>
		 	-->
		 </div>
		 <!-- 
			<button type="button" class="btn btn-primary" data-toggle="button" aria-pressed="false" autocomplete="off" style="border-radius: 0px;width:100%;height:60px;margin-bottom:10px;margin-left:0px;margin-right:0px;font-weight:bold;font-size:35px">
			  发布博文
			</button>
			  -->

						 <div class="list-group" id="classList">
							<a href="#" class="list-group-item active"> 博客分类 </a> 
							<a href="" class="list-group-item">分类</a>
						</div>
						 <div class="list-group" id="readList">
							<a href="#" class="list-group-item active"> 阅读排行</a> 
							 	<a href="" class="list-group-item">排行</a> 
						
						</div>
					</div>
					
					<div class="col-md-9" >
					<div class="panel panel-primary" style="margin-top:0;" >
						<div class="panel-body">
							       <h3 ><img src="${ctx}/images/yuan.gif"/>&nbsp;<img src="${ctx}/images/jian.gif"/>&nbsp;${blog.blog_title }标题 </h3>
							       <hr style="border:none;border-top:2px solid blue; height:0;" />
    <p style="font-size:12px;color:blue;">${blog.blog_abstract }简介</p>
    <p> ${blog.blog_content }  这是正文
</p> 
							       <p style="text-align: right;"><b>作者</b>(${blog.bc_user_name }) &nbsp; | &nbsp;<b>阅读</b>(${blog.view_count })&nbsp; </p>
		<form >
   <input type="text" class="form-control" placeholder="一句话评论">	
   <div id="pub-btm" class="pub-btm clearfix">
           <button type="button" class="btn pub-btn btn-primary r">发表评论</button>
      </div>
</form>
	<div id="course_note">
        <ul class="commentcon">
              <li>
        <div class="notelist_headpic">
        <a href="/space/u/uid/1967307" target="_blank"><img src='http://img.mukewang.com/user/5557f91e0001115601000100-40-40.jpg' width='40' height='40' /></a>
        </div>
        <div class="notelist_content">
          <div class="u_name">
            <a href="/space/u/uid/1967307" target="_blank">一棵树被占用了</a>
          </div>
          <p>条理清晰，感谢分享</p>
          <div class="notelist-bottom clearfix">
            <span title="创建时间" class="l timeago">时间：1天前</span>
                        <a href="/video/5563" class="from-course">源自：1-2 事务与分布式事务原理与实践(二)</a>
                        <div class="notelist-actions">
              <a title="赞" href="javascript:;" class="js-pl-praise list-praise "  data-id="51545">
                <span class="icon icon_good "></span>
                <em>0</em></a>
            </div>
          </div>
         
      </li>
        <li>
        <div class="notelist_headpic">
        <a href="/space/u/uid/1967307" target="_blank"><img src='http://img.mukewang.com/user/5557f91e0001115601000100-40-40.jpg' width='40' height='40' /></a>
        </div>
        <div class="notelist_content">
          <div class="u_name">
            <a href="/space/u/uid/1967307" target="_blank">一棵树被占用了</a>
          </div>
          <p>条理清晰，感谢分享</p>
          <div class="notelist-bottom clearfix">
            <span title="创建时间" class="l timeago">时间：1天前</span>
                        <div class="notelist-actions">
                <em><a href="" >回复</a>（2）</em></a>
            </div>
          </div>
         
      </li>
            </ul>
<nav>
  <ul class="pager">
    <li class="previous"><a href="#"><span aria-hidden="true">&larr;</span>上一页</a></li>
    <li class="next"><a href="#">下一页 <span aria-hidden="true">&rarr;</span></a></li>
  </ul>
</nav>
		      </div>
</div>
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
