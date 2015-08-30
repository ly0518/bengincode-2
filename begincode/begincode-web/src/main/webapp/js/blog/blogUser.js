	
	
	function addBlogType(){
		$("#blogTypeForm").modal('show');
	}
	function userTopTen() {
		jQuery.ajax({
			type : "GET",
			url : ctx + "/blog/topTen/userId",
			data : "",
			dataType : "json",
			success : function(blogs) {
				$.each(blogs,function(i) {
						var blogStr = "<a href=\""+ctx+"/blog/"+blogs[i].blogId+" \" class=\"list-group-item\"  target=\"_blank\"	 >"+blogs[i].blogInfo+"<span class=\"view-count\">"+blogs[i].viewCount+"</span></a>";
						$("#readList").append(blogStr);
				});
			}
		});
	}
	function blogTypes() {
		jQuery.ajax({
			type : "GET",
			url : ctx + "/blog/blogType/user",
			data : "",
			dataType : "json",
			success : function(blogTypes) {
				$.each(blogTypes,function(i) {
					var blogStr = "<a href=\""+ctx+"/blog/blogManage/typeId/"+blogTypes[i].blogTypeId+" \" class=\"list-group-item\"   	 >"+blogTypes[i].blogTypeName+"</a>";
						$("#classList").append(blogStr);
				});
			}
		});
	}
	
	function changeBlogUser(){
		var currentPage = $("#pagediv").pagination('getCurrentPage') - 1;
		var blogTypeId = $("#blogTypeId").val();
		var data = "page=" + currentPage;
		if(blogTypeId != ""){
			data += "&blogType="+blogTypeId;
		}
		jQuery.ajax({
					type : "GET",
					url : ctx + "/blog/blogs/user",
					data : data,
					dataType : "json",
					success : function(blogs) {
						$("#blogsList").empty();
						$.each(blogs,function(i) {
											var codeStr = " <li class=\"list-group-item\">"
													+ "<h3 style=\"color:#5bc0de\">"
													+"<a href=\""+ctx+"/blog/"+blogs[i].blogId+" \" >"
													+ blogs[i].blogInfo
													+ "</a></h3>"
													+ "<p>&nbsp;&nbsp;&nbsp;&nbsp; " 
													+ blogs[i].blogAbstract 
													+"</p>"
													+ "<div class=\"row\">"
													+ "<div  class=\"col-md-6\">"
													+ "<p style=\"text-align: left;\">"
													+ "分类名称："+blogs[i].blogTypeName+"</p>"
													+"</div>"
													+"<div  class=\"col-md-6\">"
													+ " <p style=\"text-align: right;\">" 
													+"<a href=\""+ctx+"/blog/blogId/"+blogs[i].blogId+"\">"
													+"<b>编辑</b></a>&nbsp; | &nbsp;<b>阅读</b>("+blogs[i].viewCount+")&nbsp;  </p>"
													+"</div>"
													+"</div>"
													+" </li>";
											$("#blogsList").append(codeStr);
										});

					}
				});
	}