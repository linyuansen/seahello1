<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 <title>Update FItem</title>
</head>
<body>
<center>
<h1><font color="red">Update FItem</font></h1>
<s:form action="fitem/saveOrUpdateFItem.action">
 <s:hidden name="fitem.id" value="%{fitem.id}"></s:hidden>
 <s:textfield name="fitem.name" value="%{fitem.name}" label="%{getText('name')}"></s:textfield>
 <s:textfield name="fitem.dname" value="%{fitem.dname}" label="%{getText('dname')}"></s:textfield>
 <s:textfield name="fitem.url" value="%{fitem.url}" label="%{getText('url')}"></s:textfield>
 <s:textfield name="fitem.pv" value="%{fitem.pv}" label="%{getText('pv')}"></s:textfield>
 <s:textfield name="fitem.pic_m_dir" value="%{fitem.pic_m_dir}" label="%{getText('pic_m_dir')}"></s:textfield>
 <s:textfield name="fitem.pic_d_dir" value="%{fitem.pic_d_dir}" label="%{getText('pic_d_dir')}"></s:textfield>
 
 <s:submit></s:submit>
</s:form>
</center>
</body>
</html>