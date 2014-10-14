<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.io.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags"  prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<s:head />
</head>
<body>
    <s:form action="fitem/fileUpload.action" method="post" enctype="multipart/form-data" >
        <s:file name="userImage" label="User Image" />
        <s:submit />
    </s:form>
    
    <div>
        You have uploaded the following file.
    <hr>
    File Name : ${userImageFileName} 

    Content Type : ${userImageContentType}
    </div>
    <div>
    <%
	String tempPath1 = "rcdl"+"\\"+"files"+"\\";//指定目录(本地)
	String tempPath2 = "rcdl"+"/"+"files"+"/";//指定目录(url)
		
	String realpath = request.getSession().getServletContext().getRealPath("\\");//服务器绝对路径
	realpath = realpath + tempPath1;
	
	String path = request.getContextPath();
	String basepath = request.getScheme()+"://"+request.getServerName()
					+":"+request.getServerPort()+path+"/";//服务器Url路径
	basepath = basepath + tempPath2;
	
	
	System.out.println(realpath);
	System.out.println(basepath);
	basepath = realpath = "d:\\files\\";
	File f = new File(realpath);
	if (!f.exists())
	{
		out.println(basepath+"查无文件");
		return;
	}
	File fa[] = f.listFiles();
	for(int i=0;i<fa.length;i++)
	{
		File fs = fa[i];
		if (!fs.isDirectory())
		{
			out.println("<a target=_blank "+"href=download.jsp?filepath="+realpath+fs.getName()+"&filename="+fs.getName()+">"+fs.getName()+"</a>");
			System.out.println("<a target=_blank "+"href=download.jsp?filepath="+realpath+fs.getName()+"&filename="+fs.getName()+">"+fs.getName()+"</a>");
			
			out.println("<br />");
		}
		else{
		}
	}
%>
    
    </div>
</body>
</html>