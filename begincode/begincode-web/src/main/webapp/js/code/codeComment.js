
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

function changePages() {
	var currentPage = $("#pagediv").pagination('getCurrentPage') - 1;
	jQuery
			.ajax({
				type : "GET",
				url : ctx + "/code/codes",
				data : "page=" + currentPage,
				dataType : "json",
				success : function(codes) {
					$("#codelist").empty();
					$
							.each(
									codes,
									function(i) {
										var codeStr = "<div class=\"media mediaborder\">"
												+ "<div class=\"media-left media-middle\">"
												+ "<a href=\"#\"> "
												+ "<img class=\"media-object img-responsive maxwidth\" src=\""
												+ ctx
												+ "/images/"
												+ codes[i].pic
												+ "\" alt=\""
												+ codes[i].nickname
												+ "\" />"
												+ "</a>"
												+"<a href=\"#\" target=\"_blank\" title=\""+codes[i].nickname+"\" class=\"nickname\">"+codes[i].nickname+"</a>"
												+ "</div>"
												+ "<div class=\"media-body\">"
												+ "<h4 class=\"list-group-item-heading\">"
												+"<a href=\""+ctx+"/code/"+codes[i].begincodeCodeId+" \" >"
												+ codes[i].codeInfo
												+ "</a></h4>"
												+ "<p class=\"list-group-item-text\">"
												+"<a href=\""+ctx+"/code/"+codes[i].begincodeCodeId+" \" >"
												+ codes[i].codeAbstract
												+ "</a></p>"
												+ "<p>"
												+ getLabel(codes[i].begincodeKeys)
												+ " <span class=\"r blogAuthLabel\">"
												+ "作者："
												+ codes[i].nickname 
												+ "，创建时间:"
												+ getFormatDate(codes[i].createDatetime)
												+ ",浏览次数:"
												+ codes[i].viewCount
												+ "</span></p></div></div>";
										$("#codelist").append(codeStr);
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