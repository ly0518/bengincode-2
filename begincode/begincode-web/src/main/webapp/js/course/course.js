$(document).ready(function(){
	// 加载已关注的视频教程
	$.ajax({
		type:'get',
		url:ctx+'/video/attention/1/0/4/list',
		dataType:'json',
		success:function(data){
 			if(data && null != data && data.result.length>0){
				var len = data.result.length;
				for (var i=0; i<len; i++){
					var attentionCourse = data.result[i];
					var comStatus = "连载中";
					if (attentionCourse.completionStatus == '1') comStatus='已完结';
					var attendCourseHtml = '<div class="col-sm-6 col-md-3">'+
								'<a class="thumbnail-bottom" href="www.baidu.com">'+
									'<img class="img-responsive" src="'+attentionCourse.coursePicUrl+'" alt="...">'+
									'<div class="caption">'+
										'<h4 class="media-heading">'+attentionCourse.courseName+'</h4>'+
										'<div class="tips">'+
											'<p class="text-ellipsis">'+attentionCourse.introduction+'</p>'+
											'<span class="l">'+comStatus+'</span> <b class="follow-label">'+attentionCourse.attentionCount+' 人学习</b><b class="label-blue"> 已关注</b>'+
										'</div>'+
									'</div>'+
								'</a>'+
							'</div>';
					$('#attention_course').append(attendCourseHtml);
  				}
			} else $('#attention_course').css("display","none");
		},
		error:function(){
			alert();
		}
	})
	
	// 加载视频教程
	$.ajax({
		type:"get",
		url:ctx+"/video/course/5/0/4/list",
		dataType:"json",
		success:function(data){
 			if(data && null != data && data.result.length>0){
 				var len = data.result.length;
				for (var i=0; i<len; i++){
					var attentionCourse = data.result[i];
					var comStatus = "连载中";
					if (attentionCourse.completionStatus == '1') comStatus='已完结';
					var courseHtml = '<div class="col-sm-6 col-md-3">'+
								'<a class="thumbnail" href="www.baidu.com">'+
								'<img class="img-responsive" src="'+attentionCourse.coursePicUrl+'" alt="...">'+
								'<div class="caption">'+
									'<h4 class="media-heading">'+attentionCourse.courseName+'</h4>'+
									'<div class="tips">'+
										'<p class="text-ellipsis">'+attentionCourse.introduction+'</p>'+
										'<span class="l">'+comStatus+'</span> <b class="follow-label">'+attentionCourse.attentionCount+'人学习</b>'+
									'</div>'+
								'</div>'+
							'</a>'+
						'</div>';
					$('#recommend_course').append(courseHtml);
				}
 			}
		},
		error:function(){
			
		}
	})
})