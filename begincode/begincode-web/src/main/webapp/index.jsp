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
<link href="${ctx}/css/simplePagination.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${ctx}/js/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/js/jquery.simplePagination.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
</head>
<script type="text/javascript">
$(document).ready(function(e) {
	 $("#pagediv").pagination({
	      items: 50,
	      itemsOnPage: 10,
	      cssStyle: 'light-theme'   
	  });
});
</script>
<body>
	<jsp:include  page="/page/core/top.jsp"/> 
	
 
 <div class="container">
  <ul class="paginList">
         <div id="pagediv"></div>
        </ul>
</div>


	<!-- foot -->
 <jsp:include page="/page/core/foot.jsp"/> 
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="${ctx}/js/bootstrap.min.js"></script>
</body>
</html>
