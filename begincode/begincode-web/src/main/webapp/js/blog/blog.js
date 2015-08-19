
function changePage() {
	var currentPage = $("#pagediv").pagination('getCurrentPage') - 1;
	jQuery
			.ajax({
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
function getLabel(keywords){
	var str = "<div class=\"keyword-list l\">";
	var keyarr = keywords.split(",");
	if(keyarr.length == 0){
		return ;
	}
	for(var i=0;i<keyarr.length;i++){
		if(keyarr[i] != ""){
			str += " <a href=\"#\" target=\"_blank\" class=\"list-tag\">"+keyarr[i]+"</a>";
		}
	}
	str += "</div>";
	return str;
}

function addBlog(){
	if(QC.Login.check()){
		location.href =ctx+"/blog/userId";
	}else{
		alert("请先登录...");
		return false;
		
	}
}