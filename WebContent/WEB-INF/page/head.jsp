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
<link href="<%=basePath%>css/reset.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>cssplugin/jquery.ui.all.css"/>
<script type="text/javascript" src="<%=basePath%>js/lib/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/lib/jquery.ui.core.js"></script>
<script type="text/javascript" src="<%=basePath%>js/lib/jquery.ui.datepicker.js"></script>
<script type="text/javascript" src="<%=basePath%>js/lib/index.js"></script>
</head>
    <body>
    	<div class="m_top">
    		<div class="logo">
			</div>
    		<div class="search">
    			<select id="s1_text1_bold">
    				 <option value="0" selected="">服务商</option>
                     <option value="1">服务商</option>
                 </select>
                 <input type="text" value="    请输入关键字"  id="s1_text_key"/>
                 <input type="button"  value="搜 索" id="s1_text_ser"/>                
    		</div>
    		<div  class="quit">
    			<span>退出</span>
    		</div>
    	</div>
    	    	<!--菜单列表部分-->
    	<div class="m_left">
    		<div class="member" style="text-align:center">
    			<div id="men_pic">
    				<img src="">	
    			</div>
				<p>欢迎您<span ><s:property value="user.userName"/>！！！</span></p>
    		</div>
			<ul  class="programa">
				<li><a href="#">公共频道</a></li>
				<li><a href="<%=basePath%>sendManage">发单管理</a></li>
				<li><a href="#">接单管理</a></li>
				<li><a href="#">财务管理</a></li>
				<li><a href="#">个人中心</a></li>
				<li><a href="#">帮    助</a></li>
			</ul>
    	</div>
    	</body>
    	<script type="text/javascript"  >

        $(function(){
          var $div_li = $(".programa li");
          $div_li.click(function(){
            $(this).css("background-color","#f78b26").siblings().css("background-color","#a6dff5");
            $(this).find('a').css("color","#fff").parent().siblings().find('a').css("color","#000");
            var index = $div_li.index(this);
            $(".m_rigth_all > div").eq(index).show().siblings().hide();
        //  }).hover(function(){
        //    $(this).css("background-color","#cceaf6");
        //  },function(){
        //    $(this).css("background-color","#a6dff5");
          });
        })
    </script>
</html>