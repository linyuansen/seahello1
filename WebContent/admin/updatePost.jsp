<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 <title>Update FItem</title>
</head>
<body>
<center>
<h1><font color="red">Update Post</font></h1>
<s:form action="post/update.action">
 <s:hidden name="post.id" value="%{post.id}"></s:hidden>
 <s:textfield name="post.userId" value="%{post.userId}" label="%{getText('userId')}"></s:textfield>
 <s:textfield name="post.title" value="%{post.title}" label="%{getText('title')}"></s:textfield>
 <s:textfield name="post.content" value="%{post.content}" label="%{getText('content')}"></s:textfield>

 
 <s:submit></s:submit>
</s:form>
</center>
</body>
</html>