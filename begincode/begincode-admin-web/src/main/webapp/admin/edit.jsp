<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<head>
  <meta charset="utf-8">
  <title>Dashboard, Free HTML5 Admin Template</title>
  <meta name="keywords" content="" />
  <meta name="description" content="" />
 
 <script src="http://cdn.gbtags.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.gbtags.com/twitter-bootstrap/3.2.0/js/bootstrap.js"></script>
<script src="http://cdn.gbtags.com/summernote/0.5.2/summernote.min.js"></script>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/summernote-zh-CN.js"></script> --%>
 <style type="text/css">
 @import url('http://cdn.gbtags.com/twitter-bootstrap/3.2.0/css/bootstrap.css');
@import url('http://cdn.gbtags.com/font-awesome/4.1.0/css/font-awesome.min.css');
@import url('http://cdn.gbtags.com/summernote/0.5.2/summernote.css');
 </style>
</head>
<body>
 <div   id="summernote"  >summernote 1</div>
 <button id="formButton">保存</button>
	<script type="text/javascript">
	$(document).ready(function() {
		  $('#summernote').summernote({
			  onImageUpload: function (files, editor, $editable) {
				  sendFile(files, editor, $editable);
				  }
		  });
		  $('#formButton').click(function(){
			 var sHTML = $('#summernote').code();
			 alert(sHTML);
			 $('#summernote').code("杨双军"+sHTML);
		  });
	});
	function sendFile(file, editor, welEditable) {
	    data = new FormData();
	    data.append("file", file);
	    url = "http://localhost/spichlerz/uploads";
	    $.ajax({
	        data: data,
	        type: "POST",
	        url: url,
	        cache: false,
	        contentType: false,
	        processData: false,
	        success: function (url) {
	            editor.insertImage(welEditable, url);
	        }
	    });
	}
	</script>
</body>
</html>