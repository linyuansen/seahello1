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
<script type="text/javascript" src="<%=basePath%>js/lib/jquery-1.9.1.min.js"></script>
  
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/jquery.ui.all.css"/>
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
    		<div class="member">
    			<div id="men_pic">
    				<img src="">	
    			</div>
				<p>用户:<span>PPPPPPPPPP</span></p>
    		</div>
			<ul  class="programa">
				<li><a href="#">发布需求</a></li>
				<li><a href="#">发布需求</a></li>
				<li><a href="#">个人中心</a></li>
				<li><a href="#">帮    助</a></li>
			</ul>
    	</div>
    	
    	<!--信息列表部分-->
    	<div class="m_right">
    		<div  class="mr_l">
    			<div class="mr_l_title">
    				<div class="title_dot">	
    				</div>
    				<div class="title_bt">
    					<span>需求中心</span>
    				</div>
    				<div class="more">
    					<span>more</span>
    				</div>
    			</div>
    			<div class="mr_l_cont">
    				<ul>
    					<li><span></span><a href="">box-shadow 属性向框添加一个或多个阴影。</a></li>
    					<li><span></span><a href="">box-shadow 属性向框添加一个或多个阴影。</a></li>
    					<li><span></span><a href="">box-shadow 属性向框添加一个或多个阴影。</a></li>
    					<li><span></span><a href="">box-shadow 属性向框添加一个或多个阴影。</a></li>
    					<li><span></span><a href="">box-shadow 属性向框添加一个或多个阴影。</a></li>
    					<li><span></span><a href="">box-shadow 属性向框添加一个或多个阴影。</a></li>
    				</ul>
    			</div>
    		</div>
    		<div  class="mr_l">
    			<div class="mr_l_title">
    				<div class="title_dot">	
    				</div>
    				<div class="title_bt">
    					<span>需求中心</span>
    				</div>
    				<div class="more">
    					<span>more</span>
    				</div>
    			</div>
    			<div class="mr_l_cont">
    				<ul>
    					<li><span></span><a href="">box-shadow 属性向框添加一个或多个阴影。</a></li>
    					<li><span></span><a href="">box-shadow 属性向框添加一个或多个阴影。</a></li>
    					<li><span></span><a href="">box-shadow 属性向框添加一个或多个阴影。</a></li>
    					<li><span></span><a href="">box-shadow 属性向框添加一个或多个阴影。</a></li>
    					<li><span></span><a href="">box-shadow 属性向框添加一个或多个阴影。</a></li>
    					<li><span></span><a href="">box-shadow 属性向框添加一个或多个阴影。</a></li>
    				</ul>
    			</div>
    		</div>
    		
    	</div>
    </body>
       
</html>