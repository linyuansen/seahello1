<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <link rel="stylesheet" type="text/css" href="<%=basePath%>css/style.css"/>
        <script type="text/javascript" src="<%=basePath%>js/lib/jquery-1.9.1.js"></script>
		<script type="text/javascript" src="<%=basePath%>js/login.js"></script>
    </head>
    <body>
    	<div class="regist_top">
            <p>已有帐号  请<a href="#">登陆</a></p>
        </div>
        <div class="nav_bt">
                <img src="images/regist_03.png"/>
                <span>个人用户注册</span>
        </div>
        <div class="regist_cont">
            <div class="progress_bar">
                <img src="<%=basePath%>images/regist_07.png"/>
                <span style="color:#7dd300">填写</span>
                <img src="<%=basePath%>images/regist_09.png"/>
                <span>验证</span>
                <img src="<%=basePath%>images/regist_09.png"/>
                <span>注册成功</span>
            </div>
            <div  class="logon_message">
                <form method="post"  action="register"  id="r_form">
                    <label for="username">用户名</label>
                    <input type="text"  name="register.userName"  id="username" class="inpm"/>
                    <span id="msg_username"></span><br/>
                    <label for="username">昵称</label>
                    <input type="text"  name="register.nickName"  id="nickname" class="inpm"/>
                    <span id="msg_nickname"></span><br/>
                     <label for="gender">性别</label>
                     <div  class="inpm">
                     <input type="radio" name="register.gender" value="1" checked="checked" /><span>男</span>  
                    <input type="radio" name="register.gender" value="0" /><span> 女 </span>
                     </div> <br/>                   
                    <label for="phone" >手机号</label>
                    <input type="text"  name="register.phoneNumber"  id="phone"  class="inpm"/>
                    <span id="msg_phone"></span><br/>                   
                    <label for="password">设置密码</label>
                    <input type="password"  name="register.password"  id="passworded"  class="inpm"/>
                    <span id="msg_pwd"></span><br/>
                    <label for="repassword">确认密码</label>
                    <input type="password"  name="repassword"  id="repassword"  class="inpm"/>
                    <span id="msg_repwd"><img src="<%=basePath%>images/ok-1.png" alt=""/></span><br/>
                    <label for="verification">验证码</label>
                    <input type="text"  name="verification"  id="verification"  />
                    <img src=""/>
                    <span id="msg_check"></span><br/>
                    <div class="agreement">
                        <label  for="agree" >
                        <input name="agree" type="checkbox" value=""  id="agree"/>  同意《XXX服务条款》 
                        </label> 
                    </div>
                    <div class="next">
                        <input type="submit"  value="提 交"/>
                    </div>
                    <p class="problem"><a href="">注册遇到的问题？</a></p>
                </form>
            </div>
            <div  class="explain">
                
            </div>
        </div>
    </body>
       
</html>