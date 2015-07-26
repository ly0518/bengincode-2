
function changePage() {
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
		url : ctx + "/code/topTen",
		data : "",
		dataType : "json",
		success : function(codes) {
			$("#codeTopTen").empty();
			$.each(codes,function(i) {
					var codeStr = "<a href=\""+ctx+"/code/"+codes[i].begincodeCodeId+" \" class=\"list-group-item\">"+codes[i].codeInfo+"<span class=\"view-count\">"+codes[i].viewCount+"</span></a>";
					$("#codeTopTen").append(codeStr);
			});
		}
//		statusCode: {
//	        404: function() {
//	            alert( "找不到页面" );
//	        },
//	        302: function(data){
//	        	alert(JSON.stringify(data));
//	            alert("请求跳转"+data.status+data.responseJSON.url);
//	            window.location.href=data.responseJSON.url;
//	            $("#codeTopTen").empty();
//				$.each(codes,function(i) {
//						var codeStr = "<a href=\""+ctx+"/code/"+codes[i].begincodeCodeId+" \" class=\"list-group-item\">"+codes[i].codeInfo+"<span class=\"view-count\">"+codes[i].viewCount+"</span></a>";
//						$("#codeTopTen").append(codeStr);
//				});
//	        }
//	    }
	});
}
function relationTopFive(typeId) {
	jQuery.ajax({
		type : "GET",
		url : ctx + "/code/codeType/"+typeId,
		data : "",
		dataType : "json",
		success : function(codes) {
			$("#relationCodeTopFive").empty();
			$.each(codes,function(i) {
					var codeStr = "<a href=\""+ctx+"/code/"+codes[i].begincodeCodeId+" \" class=\"list-group-item\">"+codes[i].codeInfo+"<span class=\"view-count\">"+codes[i].viewCount+"</span></a>";
					$("#relationCodeTopFive").append(codeStr);
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