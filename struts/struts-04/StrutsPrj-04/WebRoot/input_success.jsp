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
    
    <title>My JSP 'input_success.jsp' starting page</title>
    
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
    		<div>
    			<span>姓名：</span>
    			<s:property value="user.userName"/>
    		</div>
    		<div>
    			<span>密码：</span>
    			<s:property value="user.userPass"/>
    		</div>
    		<div>
    			<span>性别：</span>
    			<s:if test='user.userSex=="a"'>男</s:if>
    			<s:if test='user.userSex=="b"'>女</s:if>
    		</div>
    		<div>爱好的运动：[
    			<s:iterator value="user.userHobby" var="hobby">
    				<s:if test='#hobby=="a"'>游泳&nbsp</s:if>
    				<s:if test='#hobby=="b"'>跑步&nbsp</s:if>
    				<s:if test='#hobby=="c"'>乒乓球&nbsp</s:if>
    				<s:if test='#hobby=="d"'>羽毛球&nbsp</s:if>
    				<s:if test='#hobby=="e"'>网球&nbsp</s:if>
    			</s:iterator>
    			
    		]</div>
    		<div>
    		<table border="8"><tr><th>喜爱的书籍</th></tr>
    			<s:iterator value="user.userPerBook" var="book">
    				<s:if test='#book=="a"'><tr><td>小说</td></tr></s:if>
    				<s:if test='#book=="b"'><tr><td>散文</td></tr></s:if>
    				<s:if test='#book=="c"'><tr><td>诗歌</td></tr></s:if>
    				<s:if test='#book=="d"'><tr><td>古典文学</td></tr></s:if>
    				<s:if test='#book=="e"'><tr><td>现代文学</td></tr></s:if>
    			</s:iterator>
    			</table>
    		</div>
    		<div>
    			<span>留言：</span>
    			<s:property value="user.userMemo"/>
    		</div>
    		
    </div>
  </body>
</html>
