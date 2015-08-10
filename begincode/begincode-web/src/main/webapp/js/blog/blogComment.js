
function blogViewInit(blogId){
	jQuery.ajax({
		type : "GET",
		url : ctx + "/blogComment/blogId/"+blogId,
		data : "",
		dataType : "json",
		success : function(codes) {
			$("#comments").empty();
			$.each(codes,function(i) {
					var codeStr = getBlogViewLabel(codes[i]);
					$("#comments").append(codeStr);
			});
		}
	});
}

function getBlogViewLabel(blogComment){
	var str = " <div class=\"qa-comments\">" 
			+"<div class=\"qa-comment js-qa-comment\" data-cid=\"73785\"> "
      +"<div class=\"qa-comment-wrap clearfix \">"
      +"<div class=\"qa-comment-author\">"
      +" <a href=\"/myclub/otherquestion?uid=2037400\" title=\"qweasd199612223\">"
      +" <img src='"+blogComment.pic+"' width='40' height='40' />"
      +"  <span class=\"qa-comment-nick\">"+blogComment.nickname+"</span>"
      +" </a>"
      +"</div>"
      +"<div class=\"qa-comment-d \">"
      +"<!--             <div class=\"qa-triangle-left\"><i>dddd</i></div> -->"
      +"<div class=\"qa-comment-inner\">"
      +"<div class=\"qa-comment-c imgPreview\">"
      +"<div class=\"rich-text\">"
      +"<p>"+blogComment.blogCommentContent+" </p>"
      +"</div>"
      +"</div>"
      +"<div class=\"qa-comment-addon\">"
      +"<span class=\"qa-comment-time\">"+getFormatDate(blogComment.createDatatime)+"</span>"
      +"<div class=\"qa-comment-addon-r\">"
      +"<span class=\"qa-total-reply js-reply-item-reply\" ><i  class=\"icon-msg\"></i><span class=\"js-qa-tr-num\">回复</span></span>"
      +"<span class=\"js-qa-comment-support qa-comment-support  js-qacom-supported-user\" data-ids=\"269205-73785\"><i  class=\"icon-thumb\"></i><span></span></span>"
      +"</div>"
      +"</div>"
      +"</div>"
      +"</div>"
      +"</div>"
      +"</div></div>"
	return str;
}
$('#pubBlogCommon').click(function(){
//	if(QC.Login.check()){
		if($("#blogCommonForm").valid()){
						jQuery.ajax({
							type : "POST",
							url : ctx + "/blogComment",
							data : $('#blogCommonForm').serializeArray(),
							dataType : "json",
							success : function(blogComment) {
								if(blogComment.blogCommentId != ""){
									var codeStr = getBlogViewLabel(blogComment);
									$("#comments").prepend(codeStr);
									$("#blogCommentContent").val("");
								}
							}
				});		
		}
//	}else{
//		alert("请先登录....");
//	}
	

});

function changePageForComment(blogId,pageNo){
	jQuery.ajax({
		type : "GET",
		url : ctx + "/blogComment/"+blogId+"/"+pageNo,
		data : "",
		dataType : "json",
		success : function(codeComments) {
			$("#comments").empty();
			$.each(codeComments,function(i) {
					var codeStr = getCodeViewLabel(codeComments[i]);
					$("#comments").append(codeStr);
			});
			
		}
	});
}

$('#prePage').click(function(){
	var currentPage = $("#currentPage").val();
	if(parseInt(currentPage) > 0){
		currentPage = parseInt(currentPage)-parseInt(1)
		$("#currentPage").val(currentPage);
	}
	var blogId = $("#blogId").val();
	jQuery.ajax({
		type : "GET",
		url : ctx + "/blogComment/"+blogId+"/"+currentPage,
		data : "",
		dataType : "json",
		success : function(blogComments) {
			$("#comments").empty();
			$.each(blogComments,function(i) {
					var codeStr = getBlogViewLabel(blogComments[i]);
					$("#comments").append(codeStr);
			});
		}
	});
	
});
$('#nextPage').click(function(){
	var currentPage = $("#currentPage").val();
	var pageNo = parseInt(currentPage)+parseInt(1);
	var blogId = $("#blogId").val();
	jQuery.ajax({
		type : "GET",
		url : ctx + "/blogComment/"+blogId+"/"+pageNo,
		data : "",
		dataType : "json",
		success : function(blogComments) {
			if(parseInt(blogComments.length) > 0){
				$("#comments").empty();
				$.each(blogComments,function(i) {
						var codeStr = getBlogViewLabel(blogComments[i]);
						$("#comments").append(codeStr);
				});
				if(parseInt(blogComments.length) >= 5){
					$("#currentPage").val(parseInt(currentPage)+parseInt(1));
				}
			}
		}
	});
	
});