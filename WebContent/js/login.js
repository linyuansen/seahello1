/**
 * 验证用户名密码是否为空
 */
function check()
{
	var userName=$("#user_name").val();
	var password=$("#password").val();
	if(userName=="")
	{
		document.getElementById("error_user").innerHTML="亲，用户名不能为空哦!!";
	}
	else
	{
		document.getElementById("error_user").innerHTML="";
	}
	if(password=="")
	{
		document.getElementById("error_password").innerHTML="亲，密码不能为空哦!!";
	}
	else
	{
		document.getElementById("error_password").innerHTML="";
	}
	if(userName!=""&&password!="")
	{
		// 序列化表单的值
        var params=$("input").serialize();
		$.ajax({
			type:'post',
				url:'checkUser',
				data:params,
				dataType : 'json',
				success:function(data){
					var obj = data.jsonString;
					if(obj!='')
					{
						if(obj=='1')
						{
							document.getElementById("error_user").innerHTML="亲，用户名不存在!请重新输入!!";
						}
						if(obj=='2')
						{
							document.getElementById("error_password").innerHTML="亲，密码错误!请重新输入!!";
						}
						if(obj=='0')
						{
							$("#form").submit();
						}
					}
								
				}
				
				
		});
		
	}
};






$(function(){

	//验证用户名
	 var $user;
     $("#username").focus(function(event) {
     	 $user=$("#username").val().trim();
     	if($user =="" ||$user ==null ){
     		$("#msg_username").html("请输入用户名").css("color","#ccc");
     	}         	
     }).blur(function(event) {
     	 $user=$("#username").val().trim();
     	 $("#msg_username").html("");         	
     	var mat = /^[a-zA-Z_][a-zA-Z_0-9]{0,}$/; //用户名只能由字母数字下划线组成

     	if($user !="" ){
     		if(!$user.match(mat)){
     			$("#msg_username").html("用户名只能由字母数字下划线组成").css("color","#f00");
     		}else{
     			$("#msg_username").html("用户名可以使用").css("color","#23cddf");
//     			$.ajax({
//     				url: 'checkusername',
//     				type: 'POST',
//     				dataType: 'json',
//     				data: {username: $user}
//     			})
//     			.done(function() {
//     				console.log("success");
//     			})
//     			.fail(function() {
//     				console.log("error");
//     			})
//     			.always(function() {
//     				console.log("complete");
//     			});	
     		}
     	}
     	 
     });



     //密码
     
	 var $pwd;
     $("#passworded").focus(function(event) {
     	 $pwd=$("#passworded").val().trim();
     	if($pwd=="" ||$pwd ==null ){
     		$("#msg_pwd").html("请输入密码").css("color","#ccc");
     	}         	
     }).blur(function(event) {
     	 $pwd=$("#passworded").val().trim();
     	 $("#msg_pwd").html("");         	
     	var mat = /^[a-zA-Z_0-9]{6,16}$/; //密码只能是6-16位数字字母

     	if($pwd !="" ){
     		if(!$pwd.match(mat)){
     			$("#msg_pwd").html("密码只能是6-16位数字字母").css("color","#f00");
     		}else{
     			$("#msg_pwd").html("设置正确").css("color","#23cddf");
     		}
     	}
     	 
     });  

    //再次输入密码
    
	 var $repwd;
     $("#repassword").focus(function(event) {
     	 $repwd=$("#repassword").val().trim();
     	if($repwd =="" ||$repwd ==null ){
     		$("#msg_repwd").html("请再次输入密码").css("color","#ccc");
     	}         	
     }).blur(function(event) {
     	 $repwd=$("#password").val().trim();
     	 $("#msg_repwd").html("");         	

     	if($repwd!="" && $repwd == $pwd){
         $("#msg_repwd").html("<img src='11.jpg'>").css("color","#23cddf");     
           }else{
           	  $("#msg_repwd").html("两次密码不一样").css("color","#f00");     
           }
     	 
     });  


});
