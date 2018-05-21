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
        	<s:actionmessage/>
               <!-- target属性决定了这个连接的打开位置 ，默认是_blank -->
               <a href="<s:url namespace="/book" action="toInput"/>" target="contentFrame">添加书籍信息</a>
               <a href=""  target="contentFrame">删除书籍信息</a>
               <a href="" target="contentFrame">修改书籍信息</a>
               <a href="<s:url namespace="/book" action="loadBook"/>" target="contentFrame">查询书籍信息</a>                       
        </div>
        <div>
          <!-- iframe: inner frame 嵌入的页面窗口  -->
          <iframe id="contentFrame" width="99%" scrolling="no" height="480px" frameborder="0" name="contentFrame"  > 
          </iframe>
        </div>
     </div>
  </body>
</html>
