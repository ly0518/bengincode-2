<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/taglibs.jsp"%>
<nav class="navbar navbar-default" role="navigation"
	style="margin-bottom: 0px;">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->

		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="http://www.begincode.net"><img
				alt="初学者论坛" src="${ctx}/images/navlogo.gif" style="height: 30px;"></a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">

			<ul class="nav navbar-nav">
				<li class=""><a href="http://www.begincode.net">首页</a></li>
				<li class="">
				<a href="${ctx}/video" class="dropdown-toggle"	>视频教程	</a>
				</li>
				<li class="">
					<a href="${ctx}/code" class="dropdown-toggle"	>代码分享</a>
			   </li>

				<li class="dropdown"><a href="#" class="dropdown-toggle">BeginCode开源 </a>
				 </li>
				<li class="dropdown">
				<li class=""><a href="${ctx}/goto/gotoPage?page=contribution"><font
						color="red">关于我们</font></a></li>
				</li>
			</ul>
			<div id="navbar" class="navbar-collapse collapse">
				<form class="navbar-form navbar-right">
					<div class="form-group">
						<input type="text" name="" class="form-control "
							placeholder="教程，资源">
					</div>
					<button type="submit" class="btn btn-primary">站内搜索</button>
				</form>
			</div>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>

