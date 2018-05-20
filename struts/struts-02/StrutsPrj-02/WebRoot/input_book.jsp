<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'input_book.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div>
    	<s:form namespace="/book" action="create">
    	<div>
    		<span>书名：</span>
    		<s:textfield name="book.bookName" size="20"></s:textfield>
    	</div>
        <div>
    		<span>作者：</span>
    		<s:textfield name="book.bookAuthor" size="20"></s:textfield>
    	</div>
    	<div>
    		<span>价格：</span>
    		<s:textfield name="book.price" size="20"></s:textfield>
    	</div>
    	<div>
    		<s:submit value="添加"></s:submit>
    	</div>
    	</s:form>
    </div>
  </body>
</html>
