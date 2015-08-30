
function changePage() {
	var currentPage = $("#pagediv").pagination('getCurrentPage') - 1;
	jQuery.ajax({
				type : "GET",
				url : ctx + "/blog/blogs",
				data : "page=" + currentPage,
				dataType : "json",
				success : function(blogs) {
					$("#bloglist").empty();
					$.each(blogs,function(i) {
										var codeStr = "<div class=\"media mediaborder\">"
												+ "<div class=\"media-left media-middle\">"
												+ "<a href=\"#\"> "
												+ "<img class=\"media-object img-responsive maxwidth\" src=\""
												+ blogs[i].pic
												+ "\" alt=\""
												+ blogs[i].nickname
												+ "\" />"
												+ "</a>"
												+"<a href=\"#\" target=\"_blank\" title=\""+blogs[i].nickname+"\" class=\"nickname\">"+blogs[i].nickname+"</a>"
												+ "</div>"
												+ "<div class=\"media-body\">"
												+ "<h4 class=\"list-group-item-heading\">"
												+"<a href=\""+ctx+"/blog/"+blogs[i].blogId+" \" >"
												+ blogs[i].blogInfo
												+ "</a></h4>"
												+ "<p class=\"list-group-item-text\">"
												+"<a href=\""+ctx+"/blog/"+blogs[i].blogId+" \" >"
												+ blogs[i].blogAbstract
												+ "</a></p>"
												+ "<p>"
												+ getLabel(blogs[i].begincodeKeys)
												+ " <span class=\"r blogAuthLabel\">"
												+ "作者："
												+ blogs[i].nickname 
												+ "，创建时间:"
												+ getFormatDate(blogs[i].createDatetime)
												+ ",浏览次数:"
												+ blogs[i].viewCount
												+ "</span></p></div></div>";
										$("#bloglist").append(codeStr);
									});

				}
			});
}

function topTen() {
	jQuery.ajax({
		type : "GET",
		url : ctx + "/blog/topTen",
		data : "",
		dataType : "json",
		success : function(blogs) {
			$("#blogTopTen").empty();
			$.each(blogs,function(i) {
					var blogStr = "<a href=\""+ctx+"/blog/"+blogs[i].blogId+" \" class=\"list-group-item\">"+blogs[i].blogInfo+"<span class=\"view-count\">"+blogs[i].viewCount+"</span></a>";
					$("#blogTopTen").append(blogStr);
			});
		}
	});
}
function relationTopFive(typeId) {
	jQuery.ajax({
		type : "GET",
		url : ctx + "/blog/blogType/"+typeId,
		data : "",
		dataType : "json",
		success : function(blogs) {
			$("#relationBlogTopFive").empty();
			$.each(blogs,function(i) {
					var blogStr = "<a href=\""+ctx+"/blog/"+blogs[i].blogId+" \" class=\"list-group-item\">"+blogs[i].blogInfo+"<span class=\"view-count\">"+blogs[i].viewCount+"</span></a>";
					$("#relationBlogTopFive").append(blogStr);
			});
		}
	});
}


