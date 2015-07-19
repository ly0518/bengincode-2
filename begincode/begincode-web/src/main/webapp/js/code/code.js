$(document).ready(function(e) {
	$("#pagediv").pagination({
		items : totalCount,
		itemsOnPage : 10,
		cssStyle : 'light-theme',
		onPageClick : changePage
	});
});
function changePage() {
	var currentPage = $("#pagediv").pagination('getCurrentPage') - 1;
	jQuery.ajax({
		type : "GET",
		url : ctx + "/code/codesAbstract",
		data : "page=" + currentPage,
		dataType : "json",
		success : function(codes) {
			$("#codelist").empty();
			$.each(codes, function(i) {
				var codeStr = "<div class=\"media mediaborder\">"
						+ "<div class=\"media-body\">"
						+ "<h4 class=\"list-group-item-heading\">"
						+ codes[i].codeInfo + "</h4>"
						+ "<p class=\"list-group-item-text\">"
						+ codes[i].codeInfo + "</p>" + "<p>"
						+ "<span class=\"l blogKeyLabel\">" + "java,ckeditor"
						+ "</span><span class=\"r blogAuthLabel\">"
						+ "作者：冷水源，创建时间：2015-07-11，浏览次数:120"
						+ "</span></p></div></div>";
				$("#codelist").append(codeStr);
			});

		}
	});
}