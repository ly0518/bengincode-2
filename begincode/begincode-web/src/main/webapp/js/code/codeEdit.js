	$(document).ready(function() {
		$("#codeForm").validate({
			errorPlacement:function(error,element) {  	
				error.appendTo(element.parent().children());
			}, 
			errorElement: "em"  
		});
		
		
		  $('#summernote').summernote({
			  onImageUpload: function (files, editor, $editable) {
				  	sendFile(files[0], editor, $editable);
				  },
// 		lang:'zh-CN',
 		  height: 300,
		  toolbar: [
				['style', ['style','bold', 'italic', 'underline', 'clear']],
				['font', ['strikethrough']],
				['fontsize', ['fontsize']],
				['color', ['color']],
				['layout', ['ul', 'ol', 'paragraph']],
				['height', ['height']],
				['insert', ['link', 'picture']]
				]
		  });
		  $('#send').click(function(){
			  if(QC.Login.check()){
			  if($("#codeForm").valid()){
				  var sHTML = $('#summernote').code();
					 $('#codeContent').val(sHTML);
					$("#codeTypeName").val($("#codeTypeId").find("option:selected").text());
					 $.ajax({
					        data: $('#codeForm').serializeArray(),
					        type: "POST",
					        url: ctx+"/code",
					        dataType : "json",
//		 			        cache: false,
//		 			        contentType: false,
//		 			        processData: false,
					        success: function (data) {
					            alert(data.msg);
					        }
					    });
			  }
		  }else{
			  alert("请先登录...");
		  }
		  });
	});