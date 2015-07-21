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
	jQuery
			.ajax({
				type : "GET",
				url : ctx + "/code/codesAbstract",
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
												+ "</div>"
												+ "<div class=\"media-body\">"
												+ "<h4 class=\"list-group-item-heading\">"
												+ codes[i].codeInfo
												+ "</h4>"
												+ "<p class=\"list-group-item-text\">"
												+ codes[i].codeAbstract
												+ "</p>"
												+ "<p>"
												+ "<span class=\"l blogKeyLabel\">"
												+ "java,ckeditor"
												+ "</span><span class=\"r blogAuthLabel\">"
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

function getFormatDate(data) {
	var day = new Date(data);
	var Year = 0;
	var Month = 0;
	var Day = 0;
	var CurrentDate = "";
	// 初始化时间
	Year = day.getFullYear();// ie火狐下都可以
	Month = day.getMonth() + 1;
	Day = day.getDate();
	//Hour = day.getHours(); 
	// Minute = day.getMinutes(); 
	// Second = day.getSeconds(); 
	CurrentDate += Year + "-";
	if (Month >= 10) {
		CurrentDate += Month + "-";
	} else {
		CurrentDate += "0" + Month + "-";
	}
	if (Day >= 10) {
		CurrentDate += Day;
	} else {
		CurrentDate += "0" + Day;
	}
	return CurrentDate;
}