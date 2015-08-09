<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/taglibsnoel.jsp"%>
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

	<ol class="breadcrumb">
		<li><a href="#">首页</a></li>
		<li><a href="#">空间管理</a></li>
		<li class="active">发布博文</li>
	</ol>

	<div class="container .col-xs-" style="margin-top: 20px">
		<div class="row">
			<div class="col-md-3">
				<div class="panel panel-primary" style="margin-bottom: 10px">
					<div class="panel-body">
						<div class="media" style="margin-bottom: 10px">
							<a class="media-left" href="#"> <img src="${user.pic}"
								style="width: 80px; height: 80px;" alt="...">
							</a>
							<div class="media-body">
								<h2 class="media-heading" id="nickName" style="color: #EA0000"></h2>
								<!-- 	修改资料 更改头像
						 -->${user.nickname}
							</div>
						</div>
						<!--   <ul class="nav nav-pills" role="tablist">
					   
						  	<li role="presentation" class="active"><a href="#">积分 <span class="badge">42</span></a></li>&nbsp;&nbsp;
						    <li role="presentation" class="active"><a href="#">课程 <span class="badge">2</span></a></li>
						</ul> -->
					</div>
				</div>

				<button type="button" class="btn btn-primary" id="addBlog"
					onclick="codeShare()" data-toggle="button" aria-pressed="false"
					autocomplete="off"
					style="border-radius: 0px; width: 100%; height: 60px; margin-bottom: 10px; font-weight: bold; font-size: 35px">
					发布博文</button>

				<div class="list-group" id="classList">
					<a href="#" class="list-group-item active"> 博客分类 </a>
				</div>
				<div class="list-group" id="readList">
					<a href="#" class="list-group-item active"> 阅读排行 </a>
				</div>
			</div>

			<div class="col-md-9">
				<div class="panel panel-primary" style="margin-top: 0;">
					<div class="panel-body">
						<form role="form" id="codeForm" name="codeForm" action=""
							method="post">

							<input type="hidden" name="nickname" id="nickname"
								value="${user.nickname }" /> <input type="hidden" name="pic"
								id="pic" value="${user.pic }" /> <input type="hidden"
								name="begincodeUserId" id="begincodeUserId"
								value="${user.begincodeUserId }" />
							<div class="form-group">
								<label for="codeTypeId"><span class="labelinfoblue"></span>代码分类</label>
								<select class="form-control" name="codeTypeId" id="codeTypeId"
									value="">
									<c:forEach items="${codeTypes }" var="codeType">
										<option value="${codeType.codeTypeId }">${codeType.codeTypeName}</option>
									</c:forEach>
								</select> <input type="hidden" name="codeTypeName" id="codeTypeName"
									value="" />
							</div>
							<div class="form-group">
								<label for="codeInfo"><span class="labelinfowarn"></span>代码标题</label>
								<input type="text" class="form-control required" id="codeInfo"
									name="codeInfo" value="" placeholder="博客标题">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1"><span
									class="labelinfosuccess"></span>代码摘要</label>
								<textarea class="form-control required" id="codeAbstract"
									name="codeAbstract" rows="3"
									placeholder="我们提议，为您的博客添加摘要，这也是给阅读者一个引导"></textarea>
							</div>
							<div class="form-group">
								<label id="bcContent" for="codeContent"><span
									class="labelinfodanger"></span>代码正文</label> <input type="hidden"
									name="codeContent" class="required" id="codeContent" value="" />
								<div id="summernote"></div>
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1"><span
									class="labelinfoblue"></span>关键字</label> <input type="text"
									class="form-control required" id="begincodeKeys"
									name="begincodeKeys" value=""
									placeholder="为你的博客定义关键字，逗号隔开，不要超过6个哦">
							</div>

							<div style="margin-top: 10px; text-align: center;">
								<button type="button" class="btn btn-primary" id="send"
									style="width: 100px;">提交</button>
								&nbsp;&nbsp;&nbsp;&nbsp;
								<button type="button" style="width: 100px;"
									class="btn btn-primary">保存草稿</button>
							</div>
							<div>
								<font color="red"><b>${msg }</b></font>
							</div>
						</form>
					</div>

				</div>
			</div>

		</div>
		<!-- foot -->
		<jsp:include page="/page/core/foot.jsp" />
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="${ctx}/js/bootstrap.min.js"></script>
		<script type="text/javascript"			src="${ctx}/js/summernote/lang/summernote-zh-CN.js"></script>
		<script src="${ctx}/js/summernote/summernote.min.js"></script>
		<link href="${ctx}/css/summernote/font-awesome.min.css"		rel="stylesheet">
		<link href="${ctx}/css/summernote/summernote.css" rel="stylesheet">
		<script src="${ctx}/js/validate/jquery.validate.js"></script>
		<script src="${ctx}/js/validate/jquery.metadata.js"></script>
		<script src="${ctx}/js/validate/messages_zh.js"></script>
		<script src="${ctx}/js/ajaxfileupload.js"></script>
		<script src="${ctx}/js/code/codeEdit.js"></script>
		<script>
			var ctx = "${ctx}";  
		</script>
</body>
</html>
