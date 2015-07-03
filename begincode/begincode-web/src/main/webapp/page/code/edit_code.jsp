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
<title>博文编辑,初学者论坛,BeginCode,beginCode</title>
<!-- Bootstrap -->
	<link href="${ctx}/css/bootstrap.css" rel="stylesheet">
	<script charset="utf-8" src="${ctx}/kindeditor/kindeditor.js"></script>
	<script charset="utf-8" src="${ctx}/kindeditor/lang/zh_CN.js"></script>
	 <script src="${ctx}/js/jquery.min.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript">
//初始化编辑器  K.create("#demoEditor" )  中demoEditor 为文本编辑器的id

	var editor;
	KindEditor.options.filterMode = true;
	KindEditor.ready(function(K){
		editor = K.create("#blogContent",{
			cssPath:'${ctx}/kindeditor/plugins/code/ke.css',
			uploadJson : '${ctx}/kindeditor/jsp/upload_json.jsp',
			fileManagerJson : '${ctx}/kindeditor/jsp/file_manager_json.jsp',filterMode : true,
			items : [
						'fontname', 'fontsize', '|', 'forecolor', 'code','hilitecolor', 'bold', 'italic', 'underline',
						'removeformat', '|', 'justifyleft', 'justifycenter', 'justifyright', 'insertorderedlist',
						'insertunorderedlist', '|', 'emoticons' ,'|', 'link','|', 'image','|', 'table'],
						afterChange:function(){
							//文字变更，去掉错误提示
							$("#bcContent").find(".formtips").remove();
						}
		});

	});
	


</script>

</head>
<body >
	<jsp:include page="/page/core/top.jsp" />
	
<ol class="breadcrumb">
  <li><a href="#">首页</a></li>
  <li><a href="#">空间管理</a></li>
  <li class="active">发布博文</li>
</ol>
     
	
	<div class="container .col-xs-" style="margin-top:20px" >
		<div class="row" >
		<div class="col-md-3">
		<div class="panel panel-primary" style="margin-bottom:10px" >
			<div class="panel-body" >
						<div class="media" style="margin-bottom:10px">
						  <a class="media-left" href="#">
						    <img src="${ctx}/images/girl.jpg" style="width:80px;height:80px;" alt="...">
						  </a>
						  <div class="media-body">
						    <h2 class="media-heading" id="nickName" style="color:#EA0000"></h2>
						    <!-- 	修改资料 更改头像
						 -->
						  </div>
						</div>
					   <!--   <ul class="nav nav-pills" role="tablist">
					   
						  	<li role="presentation" class="active"><a href="#">积分 <span class="badge">42</span></a></li>&nbsp;&nbsp;
						    <li role="presentation" class="active"><a href="#">课程 <span class="badge">2</span></a></li>
						</ul> -->
			</div>
		</div>
		 
			<button type="button" class="btn btn-primary" id="addBlog" data-toggle="button" aria-pressed="false" autocomplete="off" style="border-radius: 0px;width:100%;height:60px;margin-bottom:10px;font-weight:bold;font-size:35px">
			  发布博文
			</button>
			 
						 <div class="list-group" id="classList">
							<a href="#" class="list-group-item active"> 博客分类 </a>  
						</div>
						  <div class="list-group" id="readList">
							<a href="#" class="list-group-item active"> 阅读排行 </a>  
						</div>
					</div>
					
					<div class="col-md-9" >
							  <div class="panel panel-primary" style="margin-top:0;" >
							  	<div class="panel-body">
							  	<form role="form" id="blogForm" action="${ctx}/blog/saveBlog" method="post">
							  	<input type="hidden" name="blogId" value="${blog.bc_blog_id }"/>
   <div class="form-group">
    <label for="exampleInputPassword1"><span class="labelinfoblue" ></span>归属板块</label>
	   <select class="form-control" name="classify" value="${blog.bc_classify_id }">
	   	<c:forEach items="${classifyList }" var="classify" varStatus="status" >
	   		<option value="${classify.bc_classify_id }" >${classify.classify_note}</option>
	   	</c:forEach>
		</select>  
	</div>
  <div class="form-group">
    <label for="exampleInputEmail1"><span class="labelinfowarn" ></span>代码标题</label>
    <input type="email" class="form-control required" id="blogTitle" name="blogTitle" value="${blog.blog_title }" placeholder="博客标题">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1" ><span class="labelinfosuccess" ></span>代码摘要</label>
    <input type="text" class="form-control" id="abstract" name="abstract" value="${blog.blog_abstract }" placeholder="我们提议，为您的博客添加摘要，这也是给阅读者一个引导">
  </div>
  <div class="form-group">
  	<label id="bcContent"><span class="labelinfodanger" ></span>代码正文</label>
  	 <textarea id="blogContent" name="content" class="required" style="width:100%;height:500px">   ${blog.blog_content }</textarea>
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1"><span class="labelinfoblue" ></span>关键字</label>
    <input type="text" class="form-control" id="bckeyword" name="bckeyword" value="${blog.blog_keyword }" placeholder="为你的博客定义关键字，逗号隔开，不要超过6个哦">
  </div>

   <div style="margin-top:10px;text-align:center;">
   <button type="button" class="btn btn-primary" id="send" style="width:100px;">提交</button> &nbsp;&nbsp;&nbsp;&nbsp;<button type="button" style="width:100px;" class="btn btn-primary">保存草稿</button>
   </div>
   <div><font color="red"><b>${msg }</b></font></div>
</form>
								</div>

							  </div>
					</div>
					
			 </div>
			
<!-- foot -->
	<jsp:include page="/page/core/foot.jsp" />

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="${ctx}/js/bootstrap.min.js"></script>
</body>
</html>
