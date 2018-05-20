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
    
    <title>My JSP 'list_book.jsp' starting page</title>
    
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
    	<h3>全部书籍列表</h3>
    	<div>
    		<table>
    			<tr>
    				<th>书名</th>
    				<th>作者</th>
    				<th>价格</th>
    			</tr>
    			<s:iterator value="bookList">
    				<tr>
    					<td><s:property value="bookName"/></td>
    					<td><s:property value="bookAuthor"/></td>
    					<td><s:property value="price"/></td>
    				</tr>
    			</s:iterator>
    		</table>
    	</div>
    </div>
  </body>
</html>
