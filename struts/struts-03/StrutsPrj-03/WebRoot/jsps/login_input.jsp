<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login_input.jsp' starting page</title>
    
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
    	<h3>登录</h3>
    	<pre>
            <a href="<%=path%>/login/language.do?request_locale=en_US">English</a> <a href="<%=path%>/login/language.do?request_locale=zh_CN">Chinese</a>
        </pre>
    	<s:form namespace="/login" action="login" method="post">
	    	<div>
	    		<!-- <span>用户名：</span>-->
	    		<s:property value="getText('login.username')"/>
	    		<s:textfield name="user.userName"></s:textfield>
	    		<s:fielderror fieldName="user.userName"></s:fielderror>
	    	</div>
	    	<div>
	    		<!-- <span>密码：</span> -->
	    		<s:property value="getText('login.password')"/>
	    		<s:textfield name="user.userPass"></s:textfield>
	    		<s:fielderror fieldName="user.userPass"></s:fielderror>
	    	</div>
	    	<div>
	    		<s:submit value="登录"></s:submit>
	    	</div>
    	</s:form>
    </div>
  </body>
</html>
