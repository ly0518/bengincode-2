	
 		$(function(){
 	        /*
 	        *思路大概是先为每一个required添加必填的标记，用each()方法来实现。
 	        *在each()方法中先是创建一个元素。然后通过append()方法将创建的元素加入到父元素后面。
 	        *这里面的this用的很精髓，每一次的this都对应着相应的input元素，然后获取相应的父元素。
 	        *然后为input元素添加失去焦点事件。然后进行用户名、邮件的验证。
 	        *这里用了一个判断is()，如果是用户名，做相应的处理，如果是邮件做相应的验证。
 	        *在jQuery框架中，也可以适当的穿插一写原汁原味的javascript代码。比如验证用户名中就有this.value，和this.value.length。对内容进行判断。
 	        *然后进行的是邮件的验证，貌似用到了正则表达式。
 	        *然后为input元素添加keyup事件与focus事件。就是在keyup时也要做一下验证，调用blur事件就行了。用triggerHandler()触发器，触发相应的事件。
 	        *最后提交表单时做统一验证
 	        *做好整体与细节的处理
 	        */
 	        //如果是必填的，则加红星标识.
 			var checkBool = false;
 	        $("form :input.required").each(function(){
 	            var $required = $("<strong class='hight'>*</strong>"); //创建元素
 	            $(this).prev().append($required); //然后将它追加到文档中
 	        });
 	         //文本框失去焦点后
 	        $('form :input').blur(function(){
 	             var $parent = $(this).prev();
 	             $parent.find(".formtips").remove();
 	             //验证用户名
 	             if( $(this).is('#nickname') ){
 	                    if( this.value=="" || this.value.length < 2 || this.value.length > 25 ){
 	                        var errorMsg = '昵称需要2-25汉字之间.';
 	                        $parent.append('<span class="formtips onError hight">'+errorMsg+'</span>');
 	                        $(this).parent().addClass("has-error");
 	                       checkBool = true;
 	                    }else{
 	                    	 $(this).parent().removeClass("has-error");
 	                    	
 	                    }
 	             }
 	        }).keyup(function(){
 	           $(this).triggerHandler("blur");
 	        }).focus(function(){
 	             $(this).triggerHandler("blur");
 	        });//end blur

 	        
 	        //提交，最终验证。
 	         $('#send').click(function(){
 	                $("form :input.required").trigger('blur');
 	                if(checkBool){
 	                	return false;
 	                }else{
 	                	save();
 	                }
 	         });

 	        
 	})
 	//]]>
 