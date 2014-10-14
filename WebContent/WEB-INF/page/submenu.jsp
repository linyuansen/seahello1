<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
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