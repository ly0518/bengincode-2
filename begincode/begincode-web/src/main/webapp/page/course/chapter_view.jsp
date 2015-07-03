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
<link media="screen" href="${ctx}/css/pinglun.css" rel="stylesheet">
<script src="${ctx}/js/jquery.min.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
</head>
<body>
	<jsp:include page="/page/core/top.jsp" />
 <div class="bs-docs-header" id="content"  style="margin-bottom:20px;">
      <div class="container">
        <h1>${chapter.chapter_title }</h1>
        <p> ${chapter.chapter_keyword }</p>
      </div>
    </div>
	<div class="container .col-xs-" >
		<div class="row" >
					<div class="col-md-8" >
							  <div class="panel panel-primary" style="margin-top:0;" >
							  	<div class="panel-body">
							       <h3 ><img src="${ctx}/images/yuan.gif"/>&nbsp;<img src="${ctx}/images/jian.gif"/>&nbsp;${chapter.chapter_title } </h3>
							       <hr style="border:none;border-top:2px solid blue; height:0;" />
    <p style="font-size:12px;color:blue;">${chapter.cha_abstract }</p>
    <p>${chapter.chapter_content }
    JAVA开发环境下载，安装，Eclipse安装及Hello World

一般讲JAVA环境安装都是jdk、环境变量、javac，等等一些命令，

然后用记事本编写个helloworld ，让大家运行，这些都是java基础的一些必备基础，个人认为可以当做理论知识有所了解，但不要拘泥于此。此篇文章主要让大家从0基础尽快完成JAVA环境的搭建和尽快进入代码阶段。

1、首先安装jdk，该安装包需要到官网下载，现在JAVA属于oracle公司旗下的产品，所以官网地址都已经在Oracle网址下：

http://www.oracle.com/technetwork/java/javase/downloads/index.html

现在最新版本是8，由于个人习惯问题，我一般都不用最新的，所以下载个7就可以了，为了更直观一些截图如下：
</p>
							       <p style="text-align: right;"><b>评论</b>(123) &nbsp; | &nbsp;<b>阅读</b>(${chapter.view_count })&nbsp;</p>
	
	<form >
   <input type="text" class="form-control" placeholder="一句话评论">	
   <div id="pub-btm" class="pub-btm clearfix">
           <button type="button" class="btn pub-btn btn-primary r">发表评论</button>
      </div>
</form>
	
<div class="qa-comment js-qa-comment" data-cid="73795">

        
        <div class="qa-comment-wrap clearfix ">
        <div class="qa-comment-author">
            <a href="/myclub/otherquestion?uid=1166823" title="红色玻璃杯">
                <img src='http://img.mukewang.com/user/545846070001a15002200220-40-40.jpg' width='40' height='40' />
                <span class="qa-comment-nick">红色玻璃杯</span>
                            </a>
        </div>
        <div class="qa-comment-d ">
            <!-- <div class="qa-triangle-left"><i></i></div> -->
            <div class="qa-comment-inner">
                <div class="qa-comment-c imgPreview">
                    <div class="rich-text">
                        <p>比较好</p>
                    </div>
                </div>
                <div class="qa-comment-addon">
                    <span class="qa-comment-time">28秒前</span>
                    <div class="qa-comment-addon-r">
                        <span class="qa-total-reply js-reply-item-reply" ><i  class="icon-msg"></i><span class="js-qa-tr-num">回复</span></span>
                        <span class="js-qa-comment-support qa-comment-support  js-qacom-supported-user" data-ids="269205-73795"><i  class="icon-thumb"></i><span>0</span></span>
                    </div>
                </div>
            </div>
        </div>
    </div>
        <div class="qa-reply">
        <div class="qa-reply-header"></div>
        <div class="qa-replies">
            <div class="qa-reply-c">
               <!--  <p class="qa-reply-loading">
                   加载中...
               </p>  -->
                <!-- 默认显示三条回复的回复 -->

                                            </div>

            <!-- 回复框 -->
            <div class="js-qa-reply-ibox qa-reply-ibox  clearfix" style="display:none">
                <div class="qa-reply-iavator l">
                                        <a href="/myclub/otherquestion?uid=1166823" title="红色玻璃杯">
                        <img src='http://img.mukewang.com/user/545846070001a15002200220-40-40.jpg' width='40' height='40' />
                    </a>
                                    </div>
                <div class="qa-reply-iwrap">
                    <div class="qa-reply-iarea">
                        <textarea name="" id="" class="js-reply-ipt-default ipt"  placeholder="写下你的评论...">写下你的评论...</textarea>
                    </div>
                </div>
                <div class="qa-reply-ifoot clearfix">
                    <div class="qa-reply-footright r">
                        <span class="qa-tips"></span>
                        <button class="btn-normal btn-mini js-ipt-cancel">取消</button>
                        <button class="btn-mini btn-green  js-ipt-submit">提交</button>
                    </div>
                </div>
            </div>

        </div>
    </div>
</div>

<div class="qa-comment js-qa-comment" data-cid="73796">

        
        <div class="qa-comment-wrap clearfix ">
        <div class="qa-comment-author">
            <a href="/myclub/otherquestion?uid=1166823" title="红色玻璃杯">
                <img src='http://img.mukewang.com/user/545846070001a15002200220-40-40.jpg' width='40' height='40' />
                <span class="qa-comment-nick">红色玻璃杯</span>
                            </a>
        </div>
        <div class="qa-comment-d ">
            <!-- <div class="qa-triangle-left"><i></i></div> -->
            <div class="qa-comment-inner">
                <div class="qa-comment-c imgPreview">
                    <div class="rich-text">
                        <p>能回答我自己么</p>
                    </div>
                </div>
                <div class="qa-comment-addon">
                    <span class="qa-comment-time">2秒前</span>
                    <div class="qa-comment-addon-r">
                        <span class="qa-total-reply js-reply-item-reply" ><i  class="icon-msg"></i><span class="js-qa-tr-num">回复</span></span>
                        <span class="js-qa-comment-support qa-comment-support  js-qacom-supported-user" data-ids="269205-73796"><i  class="icon-thumb"></i><span>0</span></span>
                    </div>
                </div>
            </div>
        </div>
    </div>
        <div class="qa-reply">
        <div class="qa-reply-header"></div>
        <div class="qa-replies">
            <div class="qa-reply-c">
               <!--  <p class="qa-reply-loading">
                   加载中...
               </p>  -->
                <!-- 默认显示三条回复的回复 -->

                                            </div>

            <!-- 回复框 -->
            <div class="js-qa-reply-ibox qa-reply-ibox  clearfix" style="display:inline">
                <div class="qa-reply-iavator l">
                                        <a href="/myclub/otherquestion?uid=1166823" title="红色玻璃杯">
                        <img src='http://img.mukewang.com/user/545846070001a15002200220-40-40.jpg' width='40' height='40' />
                    </a>
                                    </div>
                <div class="qa-reply-iwrap">
                    <div class="qa-reply-iarea">
                        <textarea name="" id="" class="js-reply-ipt-default ipt"  placeholder="写下你的评论...">写下你的评论...</textarea>
                    </div>
                </div>
                <div class="qa-reply-ifoot clearfix">
                    <div class="qa-reply-footright r">
                        <span class="qa-tips"></span>
                        <button class="btn-normal btn-mini js-ipt-cancel">取消</button>
                        <button class="btn-mini btn-green  js-ipt-submit">提交</button>
                    </div>
                </div>
            </div>

        </div>
    </div>

 
<nav>
  <ul class="pager">
    <li class="previous"><a href="#"><span aria-hidden="true">&larr;</span>上一页</a></li>
    <li class="next"><a href="#">下一页 <span aria-hidden="true">&rarr;</span></a></li>
  </ul>
</nav>
		</div>

	 </div>
  
					</div></div>
					<div class="col-md-4">
						<div class="list-group">
							<a href="#" class="list-group-item active"> 其他章节 </a> 
							<c:forEach items="${relchapter}" var="chapter">
							<a href="${ctx}/chapter/viewChapter/${chapter.course_chapter_id}.html"	class="list-group-item">${chapter.chapter_title }</a>
							</c:forEach>
						</div>
						 <div class="list-group">
							<a href="#" class="list-group-item active"> 最新评论 </a> 
							<c:forEach items="${relCodes}" var="code">
							<a href="${ctx}/code/viewCode/${code.bc_code_id}.html" class="list-group-item">${code.code_info}</a> 
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