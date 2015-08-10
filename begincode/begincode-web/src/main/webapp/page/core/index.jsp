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
<script type="text/javascript">
	location.href="${ctx}/code";
</script>
<body>
	<jsp:include  page="/page/core/top.jsp"/> 

 <!-- Main jumbotron for a primary marketing message or call to action -->
 <!-- 
    <div class="jumbotron">
      <div class="container">
        <h1>专注开发过程、逐步深入、常用demo、简单案例</h1>
        <p>希望我们的努力能够助你成就开发之路，你的支持是我们的最大动力</p>
      </div>
    </div>
     -->
   <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    <li data-target="#carousel-example-generic" data-slide-to="3"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
   <div class="item active">
  <div class="jumbotron">
      <div class="container">
        <h1>原创视频</h1>
        <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;网站开发团队，站内会员，邀请的一线开发人员，精心制作的视频教程，</p>
      </div>
    </div>
</div>
    <div class="item ">
   <div class="jumbotron">
      <div class="container">
        <h1>系列博文</h1>
        <p >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;针对某一系列知识点，第三方组件，分享的应用文章</p>
      </div>
    </div>
</div>
    
   <div class="item">
  <div class="jumbotron">
      <div class="container">
        <h1>代码分享</h1>
        <p >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;主流框架，插件，工具，使用demo分享</p>
      </div>
    </div>
    
</div>
   <div class="item">
  <div class="jumbotron">
      <div class="container">
        <h1>开放源代码</h1>
        <p >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;分享BeginCode网站源代码及技术实现细节----<a href="http://git.oschina.net/yangsj/begincode-2" target="_blank"><font color="#ffffff">http://git.oschina.net/yangsj/begincode-2</font></a></p>
      </div>
    </div>
    
</div>
<!--      <div class="item active"> -->
<!--   <div class="jumbotron"> -->
<!--       <div class="container"> -->
<!--         <h1>可能我们没有多么优秀</h1> -->
<!--         <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;但我们喜欢技术，喜欢分享，喜欢与你成为朋友----BeginCode</p> -->
<!--       </div> -->
<!--     </div> -->
<!-- </div> -->
<!--     <div class="item "> -->
<!--    <div class="jumbotron"> -->
<!--       <div class="container"> -->
<!--         <h1>可能这里没有神一样的架构师</h1> -->
<!--         <p >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;但这里只有一群奋斗在一线，热爱分享“技术，博文，代码”的----攻城狮</p> -->
<!--       </div> -->
<!--     </div> -->
<!-- </div> -->
    
<!--    <div class="item"> -->
<!--   <div class="jumbotron"> -->
<!--       <div class="container"> -->
<!--         <h1>可能我们懂得不多</h1> -->
<!--         <p >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;但我们愿意竭尽所能，只是希望你对我们的了解更加彻底----开放源码</p> -->
<!--       </div> -->
<!--     </div> -->
    
<!-- </div> -->
<!--    <div class="item"> -->
<!--   <div class="jumbotron"> -->
<!--       <div class="container"> -->
<!--         <h1>我们要做的只是</h1> -->
<!--         <p >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;一个有内容，有干货，有分享精神的技术网站</p> -->
<!--       </div> -->
<!--     </div> -->
    
<!-- </div> -->

  </div>
  
  <!-- Controls
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="false"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="false"></span>
    <span class="sr-only">Next</span>
  </a> -->
</div>

    <div class="container">
    	<div class="row">
			<div class="col-md-12">
				<div class="media" style=" border-color: #f3485a; border-bottom:2px solid red;margin-bottom:10px;">
				  <a class="media-left" href="#">
				    <img src="http://123.57.17.244:81/image/iconsavepath/show.jpg" alt="${blogShow.bc_user_name}" style="width:70px; ">
				  </a>
				  <div class="media-body">
				    <h3 class="media-heading" style="color:red">今日推荐：${blogShow.blog_title}博文标题</h3>
				    <p>
				   	 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="${ctx}/blog/selBlogView/${blogShow.bc_blog_id}.html"	 target="_blank" >博文简介${blogShow.blog_abstract}</a>
				  	</p>
				  </div>
				</div>
			</div>
		</div>
      <!-- Example row of columns -->
      <div class="row">
       <div class="col-md-12">
      	  <div class="row">
                   <div class="col-md-6">
          			<div class="list-group">
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
					</div>
        </div>
        <div class="col-md-6">
          	<div class="list-group">
							<a href="#" class="list-group-item active">最新博文 </a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">最新界面上线<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">最新界面上线<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">最新界面上线<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">最新界面上线<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">最新界面上线<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">最新界面上线<span class="view-count">12</span></a>
							 <c:forEach items="${jwebchapters }" var="jwebchapter">
									<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">${jwebchapter.chapter_title }</a>
								</c:forEach>
					</div>
       </div>
       </div>
       <div class="jumnbotron">
            <p>	分享:分享我们的知识;专注:专注个人技术的提升;</p>
          </div>
          	  <div class="row">
                   <div class="col-md-6">
          			<div class="list-group">
							<a href="#" class="list-group-item active">最新代码 </a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">第一章，jdk安装规范<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">第一章，jdk安装规范<span class="view-count">1202</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">第一章，jdk安装规范<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">最新界面上线<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">最新界面上线<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">最新界面上线<span class="view-count">12</span></a>
							 <c:forEach items="${jwebchapters }" var="jwebchapter">
									<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">${jwebchapter.chapter_title }</a>
								</c:forEach>
					</div>
        </div>
        <div class="col-md-6">
          	<div class="list-group">
							<a href="#" class="list-group-item active">组件，框架</a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">最新界面上线<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">最新界面上线<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">最新界面上线<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">最新界面上线<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">最新界面上线<span class="view-count">12</span></a>
							<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">最新界面上线<span class="view-count">12</span></a>
							 <c:forEach items="${jwebchapters }" var="jwebchapter">
									<a href="${ctx}/chapter/viewChapter/${jwebchapter.course_chapter_id}.html" target="_blank"	class="list-group-item">${jwebchapter.chapter_title }</a>
								</c:forEach>
					</div>
       </div>
       </div>
          
       </div>
<!--        <div class="col-md-3"> -->
<!--        <div class="list-group"> -->
<!-- 		  <a href="#" class="list-group-item "> -->
<!-- 		    <h4 class="list-group-item-heading">王大锤</h4> -->
<!-- 		    <p class="list-group-item-text">今天天气正好</p> -->
<!-- 		  </a> -->
<!-- 		  <a href="#" class="list-group-item "> -->
<!-- 		    <h4 class="list-group-item-heading">王大锤</h4> -->
<!-- 		    <p class="list-group-item-text">今天天气正好</p> -->
<!-- 		  </a> -->
<!-- 		  <a href="#" class="list-group-item  "> -->
<!-- 		    <h4 class="list-group-item-heading">王大锤</h4> -->
<!-- 		    <p class="list-group-item-text">今天天气正好</p> -->
<!-- 		  </a> -->
<!-- 		  <a href="#" class="list-group-item "> -->
<!-- 		    <h4 class="list-group-item-heading">王大锤</h4> -->
<!-- 		    <p class="list-group-item-text">今天天气正好</p> -->
<!-- 		  </a> -->
<!-- 		  <a href="#" class="list-group-item "> -->
<!-- 		    <h4 class="list-group-item-heading">王大锤</h4> -->
<!-- 		    <p class="list-group-item-text">今天天气正好</p> -->
<!-- 		  </a> -->
<!-- 		  <a href="#" class="list-group-item "> -->
<!-- 		    <h4 class="list-group-item-heading">王大锤</h4> -->
<!-- 		    <p class="list-group-item-text">今天天气正好</p> -->
<!-- 		  </a> -->
<!-- 		  <a href="#" class="list-group-item "> -->
<!-- 		    <h4 class="list-group-item-heading">王大锤</h4> -->
<!-- 		    <p class="list-group-item-text">今天天气正好</p> -->
<!-- 		  </a> -->
<!-- 		  <a href="#" class="list-group-item "> -->
<!-- 		    <h4 class="list-group-item-heading">王大锤</h4> -->
<!-- 		    <p class="list-group-item-text">今天天气正好</p> -->
<!-- 		  </a> -->
<!-- 		  <a href="#" class="list-group-item "> -->
<!-- 		    <h4 class="list-group-item-heading">王大锤</h4> -->
<!-- 		    <p class="list-group-item-text">今天天气正好</p> -->
<!-- 		  </a> -->
<!-- 		  <a href="#" class="list-group-item "> -->
<!-- 		    <h4 class="list-group-item-heading">王大锤</h4> -->
<!-- 		    <p class="list-group-item-text">今天天气正好</p> -->
<!-- 		  </a> -->
<!-- 		  <a href="#" class="list-group-item "> -->
<!-- 		    <h4 class="list-group-item-heading">王大锤</h4> -->
<!-- 		    <p class="list-group-item-text">今天天气正好</p> -->
<!-- 		  </a> -->
		 
<!-- 		</div> -->
<!--        </div> -->
      </div>
     
				<hr>
				<div class="row">
					<div class="col-md-12">
						<div class="list-group">
							<a href="#" class="list-group-item active"> 项目专区：分享我们做的"小玩意"</a>
												<a href="${ctx}/project/viewProStage/${proStage.project_stage_id}.html" target="_blank"		class="list-group-item">界面原型<span class="view-count">12/122</span></a>
												<a href="${ctx}/project/viewProStage/${proStage.project_stage_id}.html" target="_blank"		class="list-group-item">界面原型<span class="view-count">12/122</span></a>
												<a href="${ctx}/project/viewProStage/${proStage.project_stage_id}.html" target="_blank"		class="list-group-item">界面原型<span class="view-count">12/122</span></a>
												<a href="${ctx}/project/viewProStage/${proStage.project_stage_id}.html" target="_blank"		class="list-group-item">界面原型<span class="view-count">12/122</span></a>
												<a href="${ctx}/project/viewProStage/${proStage.project_stage_id}.html" target="_blank"		class="list-group-item">界面原型<span class="view-count">12/122</span></a>
												<a href="${ctx}/project/viewProStage/${proStage.project_stage_id}.html" target="_blank"		class="list-group-item">界面原型<span class="view-count">12/122</span></a>
												<a href="${ctx}/project/viewProStage/${proStage.project_stage_id}.html" target="_blank"		class="list-group-item">界面原型<span class="view-count">12/122</span></a>
												<a href="${ctx}/project/viewProStage/${proStage.project_stage_id}.html" target="_blank"		class="list-group-item">界面原型<span class="view-count">12/122</span></a>
				
									<c:forEach items="${proStages }" var="proStage">
									<a href="${ctx}/project/viewProStage/${proStage.project_stage_id}.html" target="_blank"		class="list-group-item">${proStage.stage_name }</a>
									</c:forEach>
									
						</div>
					</div>
				</div>
      </div>
<hr>
	<!-- foot -->
 <jsp:include page="/page/core/foot.jsp"/> 
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="${ctx}/js/bootstrap.min.js"></script>
</body>
</html>
