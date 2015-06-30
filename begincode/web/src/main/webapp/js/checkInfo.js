	

//验证数字(整数、浮点数都可以通过)

	function isfloat(checkInfo,checkValue){
		var oNum = checkValue;
    	  if(!oNum) {
    	  	alert(checkInfo+"格式不正确,请输入浮点数，");
	  	    return false;
		  }
	    var strP=/^\d+(\.\d+)?$/;
	     if(!strP.test(oNum)) {
		   alert(checkInfo+"格式不正确,请输入浮点数，");
	  	   return false;
     	}
		try{
		  	if(parseFloat(oNum)!=oNum){ 
		  		alert(checkInfo+"格式不正确,请输入浮点数，");
		  		return false;
		  	}
		  }catch(ex){
			  alert(checkInfo+"格式不正确,请输入浮点数，");
		    return false;
	
	 }
	 return true;
	}

//验证正整数

	function isNumber(checkInfo,checkValue){
		var oNum = checkValue;
		if(!oNum) {
		  alert(checkInfo+"格式不正确,请输入整数，");
		  return false;
		}
		var strP=/^\d+$/; //正整数
		if(!strP.test(oNum)) {
		  alert(checkInfo+"格式不正确,请输入整数，");
		  return false;
		}
		return true;
	}
	//验证正整数

	function isNumberNoAlert(checkValue){
		var oNum = checkValue;
		if(!oNum) {
		  return false;
		}
		var strP=/^\d+$/; //正整数
		if(!strP.test(oNum)) {
		  return false;
		}
		return true;
	}
//验证字符串长度，不允许超过60
	function checkStrLenSix(checkInfo,checkValue){
		if(checkValue == "" || checkValue.length > 60){
			alert(checkInfo+"必填项，且不能超过60个字符");
			return false;
		}
		return true;
	}
	//验证必填
	function checkMustInput(checkInfo,checkValue){
		if(checkValue == "" || checkValue.length > 500){
			alert(checkInfo+"必填项");
			return false;
		}
		return true;
	}
	//验证字符串长度，不允许超过500
	function checkStrLenfivehundred(checkInfo,checkValue){
		if(checkValue == "" || checkValue.length > 500){
			alert(checkInfo+"必填项，且不能超过500个字符");
			return false;
		}
		return true;
	}
	function checkMaxlen(checkInfo,checkValue,len){
		if(checkValue == "" || checkValue.length > len){
			alert(checkInfo+"必填项，且不能超过"+len+"个字符");
			return false;
		}
		return true;
	}
	//验证邮箱
	function isEmail(text){
		var require=/\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*/;
		return require.test(text);
	}
	function commitYesOrNo(){
		 if(confirm("确定要提交数据吗？")){
			 return true;
		 }else{
			 return false;
		 }
			
	}
	function passYesOrNo(){
		 if(confirm("确定要通过该数据吗？")){
			 return true;
		 }else{
			 return false;
		 }
			
	}
	function backtYesOrNo(){
		 if(confirm("确定要驳回该数据吗？")){
			 return true;
		 }else{
			 return false;
		 }
			
	}
	function delYesOrNo(){
		 if(confirm("确定要删除该数据吗？")){
			 return true;
		 }else{
			 return false;
		 }
			
	}

