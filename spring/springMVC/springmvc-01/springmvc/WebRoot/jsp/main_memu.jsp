<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main_memu.jsp' starting page</title>
    
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
               <!-- target属性决定了这个连接的打开位置 ，默认是_blank -->
               <a href="<c:url value="/jsp/register_input.jsp"/>" target="contentFrame">添加用户</a>
               <a href="loadSelf.action?userId=${userId}" target="contentFrame">查询个人信息</a> 
               <a href="<c:url value="/loadAll.action"/>" target="contentFrame">加载所有用户</a>                      
        </div>
        <div>
          <!-- iframe: inner frame 嵌入的页面窗口  -->
          <iframe id="contentFrame" width="99%" scrolling="no" height="480px" frameborder="0" name="contentFrame"  > 
          </iframe>
        </div>
     </div>
  </body>
</html>
