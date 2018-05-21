<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'calc.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<style type="text/css">
	  
	  ul{
	    list-style-type:none;
	  }
	  
	  li{
	    color:red;
	    border:1px solid yellow;
	  }
	
	</style>

  </head>
  
  <body>
    <h3>登录</h3>
    <s:actionerror/>
    <s:form action="demo" namespace="/sample" method="post">
      <div>
        <span>用户名:</span>
        <s:textfield name="userName"></s:textfield>
      </div>    
      <div>
        <span>密码:</span>
        <s:textfield name="userPWD"></s:textfield>
      </div>       
      <div>
        <s:submit value="登录"></s:submit>
      </div>  
    </s:form>

  </body>
</html>
