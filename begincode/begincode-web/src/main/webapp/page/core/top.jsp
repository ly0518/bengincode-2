<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/taglibs.jsp"%>
<meta property="qc:admins" content="3674276520625716374566547" />
<script type="text/javascript"
	src="http://qzonestyle.gtimg.cn/qzone/openapi/qc_loader.js"
	data-appid="101230380"
	data-redirecturi="http://www.begincode.net/page/welcome.jsp"
	charset="utf-8"></script>
<script type="text/javascript">

 var reqd;
	 //调用QC.Login方法，指定btnId参数将按钮绑定在容器节点中
	 QC.Login({
             //btnId：插入按钮的节点id，必选
             btnId:"qqLoginBtn",
             //用户需要确认的scope授权项，可选，默认all
              scope : "get_user_info,upload_pic,get_user_cbinfo",//展示授权，全部可用授权可填 all
             //按钮尺寸，可用值[A_XL| A_L| A_M| A_S|  B_M| B_S| C_S]，可选，默认B_S
             size: "B_M",
             display : "pc"//应用场景，可选
           }, function(reqData, opts){//登录成功
                 reqd = reqData; 
                
     //根据返回数据，更换按钮显示状态方法
            var dom = document.getElementById(opts['btnId']),
           _logoutTemplate=[
                 //昵称
                '<span>{nickname}</span>',
                 //退出
                 '<span><a href="javascript:QC.Login.signOut();">退出</a></span>'
                   ].join("");
                dom && (dom.innerHTML = QC.String.format(_logoutTemplate, {
                         nickname : QC.String.escHTML(reqData.nickname),
                         figureurl : reqData.figureurl
                   }));
          QC.Login.getMe(function(openId, accessToken){
               	 //调用注册或者存储方法
               	 regUser(reqd.nickname,reqd.figureurl,reqd.gender,reqd.province,reqd.city,reqd.year,openId,accessToken);
         });
 }, function(opts){//注销成功
		alert('QQ登录 注销成功');
   }
);
	 
	 
	function regUser(nickName,figureurl,gender,province,city,year,openId,accessToken){
		jQuery.ajax({
			type : "POST",
			url : ctx + "/user/",
			data : "nickname="+nickName+"&pic="+figureurl+"&sex="+gender+"&openId="+openId+"&accessToken="+accessToken,
			dataType : "json" ,
			success : function(codes) {
				alert(codes);
			}
		});
	}
 
</script>

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
<!-- 				<li class=""><a href="http://www.begincode.net">首页</a></li> -->
<%-- 				<li class=""><a href="${ctx}/video" class="dropdown-toggle">视频教程 --%>
<!-- 				</a></li> -->
				<li class=""><a href="${ctx}/code" class="dropdown-toggle">代码分享</a>
				</li>

<!-- 				<li class="dropdown"><a href="#" class="dropdown-toggle">BeginCode开源 -->
<!-- 				</a></li> -->
				<li class="dropdown">
				<li class=""><a href="${ctx}/page/core/about.jsp"><font
						color="red">关于我们</font></a></li>
				<!-- 				</li> -->
				<!-- 				<li class="dropdown"><a href="#" class="dropdown-toggle"><span id="qqLoginBtn" ></span> </a> -->
				<!-- 				 </li> -->
			</ul>
			<div id="navbar" class="navbar-collapse collapse">

				<form class="navbar-form navbar-right">
					<div class="form-group">
						<span id="qqLoginBtn"></span> 
						<input type="text" name=""	class="form-control " placeholder="教程，资源">
					</div>
					
					<button type="submit"  class="btn btn-primary">站内搜索</button>
				</form>
			</div>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>

