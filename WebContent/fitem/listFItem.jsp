<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 <title>My JSP 'list.jsp' starting page</title>
 <script type="text/javascript">
 function del(){
 if(window.confirm("确定要删除fitem")){
 return true;
 }
 return false;
 }
 </script>
 
</head>
<body>
<center>
<h1><font color="red">FItemList</font></h1>
<table border="1">
<tr>
 <td width="60">名称</td>
 <td width="60">详细名称</td>
 <td width="60">淘宝地址</td>
 <td width="60">访问量</td>
 <td width="60">小图</td>
 <td width="60">大图</td>
</tr>
<s:iterator value="listFitem" id="us">
<tr>
 <td><s:property value="#us.name"/></td>
 <td><s:property value="#us.dname"/></td>
 <td><s:property value="#us.url"/></td>
 <td><s:property value="#us.pv"/></td>
 <td><s:property value="#us.pic_m_dir"/></td>
 <td><s:property value="#us.pic_d_dir"/></td>
 <td><s:a href="fitem/deleteFItem.action?fitem.id=%{#us.id}" onclick="return del()">delete</s:a></td>
 <td><s:a href="fitem/editFItem.action?fitem.id=%{#us.id}">edit</s:a></td>
</tr>
</s:iterator>
</table>
<br/><br/><br/>
<s:a href="index.jsp">主页</s:a>
<br/><br/><br/>
<s:a href="genereteExcel.action">生成EXCEL表格</s:a>
</center>
</body>
</html>