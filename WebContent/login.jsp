<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0"> 
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<title>欢迎登陆系统</title>
<link href="<%=basePath%>css/reset.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=basePath%>js/lib/jquery-1.9.1.js"></script>
<script type="text/javascript" src="<%=basePath%>js/login.js"></script>
</head>
<body>
	<div class="top">
		<div class="index_logo"></div>
	</div>
	<div class="c_trian">
		<div class="triangle"></div>	
	</div>
	<div class="bottom">
		<div class="b_left">
			<img src="<%=basePath%>mages/login_04.png" alt="">
		</div>
		<div class="b_right">
			<form action="login" method="post" id="form">
				<div class="lg">
					<img src="<%=basePath%>images/user.png" alt="" />
					<input id= "user_name" type="text" name="user.userName" class="user" />
					<span id ="error_user" class="error_user"></span>
				</div>
				<div class="lg">
					<img src="<%=basePath%>images/pass.png" alt="" />
					<input id ="password" type="password"  name="user.password" class="user">
					<span id ="error_password" class="error_user"></span>
				</div>
				<div class="lg">
					<label for="jzmm">
					<input name="" type="checkbox" value=""  id="jzmm"/> 记住密码
					</label>
					<a href="#">忘了密码</a>
				</div>
				<div class="lg">
					<input type="button"  value="登陆" id="login"  onclick="check()"/>
					<input type="button" value="注册" id="regist"  onclick="javascript:window.location.href='regist.jsp'"/ >
					
				</div>					
			</form>
		</div>
	</div>
	
</body>
</html>