

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
	var checkFlag= $.cookie('check');
	if(QC.Login.check()){
		if(checkFlag == "1"){
			location.href =ctx+"/blog/userId";
		}else{
			$("#msg").empty();
			$("#msg").append("<p>您的账户未通过审核，不能创建博文</p>");
			$("#msgModal").modal('show');
			return false;
		}
	}else{
		$("#msg").empty();
		$("#msg").append("<p>请先登录...</p>");
		$("#msgModal").modal('show');
		return false;
		
	}
}