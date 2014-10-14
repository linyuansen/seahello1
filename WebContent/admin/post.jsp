<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 <title>My JSP 'list.jsp' starting page</title>
 <script type="text/javascript">
 function del(){
 if(window.confirm("确定要删除post")){
 return true;
 }
 return false;
 }
 </script>
 
</head>
<body>
<center>
<h1><font color="red">Create Post</font></h1>
<s:form action="post/create.action">
 <s:textfield name="post.userId" label="%{getText('userId')}"></s:textfield>
 <s:textfield name="post.title" label="%{getText('title')}"></s:textfield>
 <s:textfield name="post.content" label="%{getText('content')}"></s:textfield>
 <s:submit></s:submit> 
</s:form>

<h1><font color="red">PostList</font></h1>
<table border="1">
<tr>
 <td width="60">userId</td>
 <td width="60">title</td>
 <td width="60">content</td>
</tr>
<s:iterator value="listPost" id="us">
<tr>
 <td><s:property value="#us.userId"/></td>
 <td><s:property value="#us.title"/></td>
 <td><s:property value="#us.content"/></td>
 <td><s:a href="post/delete.action?post.id=%{#us.id}" onclick="return del()">delete</s:a></td>
 <td><s:a href="post/edit.action?post.id=%{#us.id}">edit</s:a></td>
</tr>
</s:iterator>
</table>
<br/><br/><br/>
<s:a href="index.jsp">主页</s:a>
<br/>
</center>
</body>
</html>