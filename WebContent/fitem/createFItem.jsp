<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 <title>Save User</title>
</head>
<body>
<center>
<h1><font color="red">Create User</font></h1>
<s:form action="fitem/saveOrUpdateFItem.action">
 <s:textfield name="fitem.name" label="%{getText('name')}"></s:textfield>
 <s:textfield name="fitem.dname" label="%{getText('dname')}"></s:textfield>
 <s:textfield name="fitem.url" label="%{getText('url')}"></s:textfield>
 <s:textfield name="fitem.pv" label="%{getText('pv')}"></s:textfield>
 <s:textfield name="fitem.pic_m_dir" label="%{getText('pic_m_dir')}"></s:textfield>
 <s:textfield name="fitem.pic_d_dir" label="%{getText('pic_d_dir')}"></s:textfield>
 <s:submit></s:submit>
 
</s:form>
</center>
</body>
</html>