
function recommend(){
	
	jQuery.ajax({
		type : "GET",
		url : ctx + "/blog/recommend",
		data : "",
		dataType : "json",
		success : function(blogs) {
			$("#recommendImg").attr("src",blogs.pic);
			$("#recommendImg").attr("alt",blogs.nickname);
			$("#recommendTitle").append(blogs.blogInfo);
			var blogStr = "<a href=\""+ctx+"/blog/"+blogs.blogId+" \"   target=\"_blank\">"+blogs.blogInfo+"</a>";
			$("#recommendAbstract").append(blogStr);
		}
	});
}

//begincode开发
function topBegincode() {
	jQuery.ajax({
		type : "GET",
		url : ctx + "/blog/blogType/5/size/6",
		data : "",
		dataType : "json",
		success : function(blogs) {
			$.each(blogs,function(i) {
					var blogStr = "<a href=\""+ctx+"/blog/"+blogs[i].blogId+" \" class=\"list-group-item\"  target=\"_blank\"	 >"+blogs[i].blogInfo+"<span class=\"view-count\">"+blogs[i].viewCount+"</span></a>";
					$("#begincode").append(blogStr);
			});
		}
	});
}
//java集合框架
function topJavaCollection() {
	jQuery.ajax({
		type : "GET",
		url : ctx + "/blog/blogType/4/size/6",
		data : "",
		dataType : "json",
		success : function(blogs) {
			$.each(blogs,function(i) {
					var blogStr = "<a href=\""+ctx+"/blog/"+blogs[i].blogId+" \" class=\"list-group-item\"  target=\"_blank\"	 >"+blogs[i].blogInfo+"<span class=\"view-count\">"+blogs[i].viewCount+"</span></a>";
					$("#jdkCollection").append(blogStr);
			});
		}
	});
}
//开发工具
function topIDE() {
	jQuery.ajax({
		type : "GET",
		url : ctx + "/blog/blogType/2/size/6",
		data : "",
		dataType : "json",
		success : function(blogs) {
			$.each(blogs,function(i) {
					var blogStr = "<a href=\""+ctx+"/blog/"+blogs[i].blogId+" \" class=\"list-group-item\"  target=\"_blank\"	 >"+blogs[i].blogInfo+"<span class=\"view-count\">"+blogs[i].viewCount+"</span></a>";
					$("#javaIDE").append(blogStr);
			});
		}
	});
}
//开源框架
function topOpenSource() {
	jQuery.ajax({
		type : "GET",
		url : ctx + "/blog/blogType/6/size/6",
		data : "",
		dataType : "json",
		success : function(blogs) {
			$.each(blogs,function(i) {
					var blogStr = "<a href=\""+ctx+"/blog/"+blogs[i].blogId+" \" class=\"list-group-item\"  target=\"_blank\"	 >"+blogs[i].blogInfo+"<span class=\"view-count\">"+blogs[i].viewCount+"</span></a>";
					$("#openSource").append(blogStr);
			});
		}
	});
}

function topCodeShare() {
	jQuery.ajax({
		type : "GET",
		url : ctx + "/code/top/6",
		data : "",
		dataType : "json",
		success : function(codes) {
			$.each(codes,function(i) {
					var blogStr = "<a href=\""+ctx+"/code/"+codes[i].begincodeCodeId+" \"   class=\"list-group-item\" target=\"_blank\" >"+codes[i].codeInfo+"<span class=\"view-count\">"+codes[i].viewCount+"</span></a>";
					$("#codeShare").append(blogStr);
			});
		}
	});
}