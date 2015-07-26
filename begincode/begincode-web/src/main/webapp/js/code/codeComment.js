
function codeViewInit(codeId){
	jQuery.ajax({
		type : "GET",
		url : ctx + "/codeComment/codeId/"+codeId,
		data : "",
		dataType : "json",
		success : function(codes) {
			$("#comments").empty();
			$.each(codes,function(i) {
					var codeStr = getCodeViewLabel(codes[i]);
					$("#comments").append(codeStr);
			});
		}
	});
}

function getCodeViewLabel(codeComment){
	var str = " <div class=\"qa-comments\">" 
			+"<div class=\"qa-comment js-qa-comment\" data-cid=\"73785\"> "
      +"<div class=\"qa-comment-wrap clearfix \">"
      +"<div class=\"qa-comment-author\">"
      +" <a href=\"/myclub/otherquestion?uid=2037400\" title=\"qweasd199612223\">"
      +" <img src='"+codeComment.pic+"' width='40' height='40' />"
      +"  <span class=\"qa-comment-nick\">"+codeComment.nickname+"</span>"
      +" </a>"
      +"</div>"
      +"<div class=\"qa-comment-d \">"
      +"<!--             <div class=\"qa-triangle-left\"><i>dddd</i></div> -->"
      +"<div class=\"qa-comment-inner\">"
      +"<div class=\"qa-comment-c imgPreview\">"
      +"<div class=\"rich-text\">"
      +"<p>"+codeComment.codeCommentContent+" </p>"
      +"</div>"
      +"</div>"
      +"<div class=\"qa-comment-addon\">"
      +"<span class=\"qa-comment-time\">"+getFormatDate(codeComment.createDatatime)+"</span>"
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
$('#pubCodeCommon').click(function(){
	jQuery.ajax({
		type : "POST",
		url : ctx + "/codeComment",
		data : $('#codeCommonForm').serializeArray(),
		dataType : "json",
		success : function(codeComment) {
			var codeStr = getCodeViewLabel(codeComment);
			$("#comments").prepend(codeStr);
//			$("#codeTopTen").empty();
//			$.each(codes,function(i) {
//					var codeStr = "<a href=\""+ctx+"/code/"+codes[i].begincodeCodeId+" \" class=\"list-group-item\">"+codes[i].codeInfo+"<span class=\"view-count\">"+codes[i].viewCount+"</span></a>";
//					$("#codeTopTen").append(codeStr);
//			});
		}
	});
});

function changePageForComment(codeId,pageNo){
	jQuery.ajax({
		type : "GET",
		url : ctx + "/codeComment/"+codeId+"/"+pageNo,
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
	var begincodeCodeId = $("#begincodeCodeId").val();
	jQuery.ajax({
		type : "GET",
		url : ctx + "/codeComment/"+begincodeCodeId+"/"+currentPage,
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
	if(parseInt(currentPage) > 0){
		$("#currentPage").val(parseInt(currentPage)-parseInt(1));
	}
});
$('#nextPage').click(function(){
	var currentPage = $("#currentPage").val();
	var pageNo = parseInt(currentPage)+parseInt(1);
	
	var begincodeCodeId = $("#begincodeCodeId").val();
	jQuery.ajax({
		type : "GET",
		url : ctx + "/codeComment/"+begincodeCodeId+"/"+pageNo,
		data : "",
		dataType : "json",
		success : function(codeComments) {
			if(parseInt(codeComments.length) >= 0){
				$("#comments").empty();
				$.each(codeComments,function(i) {
						var codeStr = getCodeViewLabel(codeComments[i]);
						$("#comments").append(codeStr);
				});
				if(parseInt(codeComments.length) >= 5){
					$("#currentPage").val(parseInt(currentPage)+parseInt(1));
				}
			}
		}
	});
	
});