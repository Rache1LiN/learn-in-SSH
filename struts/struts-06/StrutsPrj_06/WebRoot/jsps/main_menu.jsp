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
    
    <title>My JSP 'main_menu.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <style>
  	h3{
  		margin:20px;
  	}
  	a{
  		margin:20px;
  	}
  	#login{	
  		width:100%;
  		height:45px;
  	}
  	#login form{
  		background:lightgrey;
  		float:right;
  		padding:10px;
  		border:1px solid black;
  	}
  	
  	#loginSub{
  		text-align:right;
  		
  	}
  	#wrapper{
  		width:800px;
  		
  	}
  	#navigation{
  		background:lightgrey;
  		width:100%;
  		height:35px;
  		padding:10px 0px;
  		
  	}
  	#navigation div{
  		width:390px;
  		float:right;
  	}
  </style>
  </head>
  
  <body>
    <div id="wrapper">
    	<h3>我的宝贝儿</h3>
    	<div>
    		<div>
    			<div id="login">
    			<form method="post" action="Login">
	    			<span>宠物：</span>
	    			<input type="text" name="pet.petName"/>
	    			<span>密码</span>
	    			<input type="text" name="pet.petPass"/>
	    			<input type="submit" value="提交"/>
    			</form>
				</div>
    		</div>
    		
    		<div id="navigation">
    			<div id="loginSub">
    				<span><s:actionerror/></span>
    			<a href="#" id="loginSub">登录</a>
    			</div>
    			<div>
    			<a href="<s:url namespace="/pet" action="addPet"></s:url>" target="contentFrame">领养宠物</a>
    			<a href="<s:url namespace="/pet" action="search"></s:url>" target="contentFrame">查询宠物</a>
    			<a href="<s:url namespace="/pet" action="selfPet"></s:url>" target="contentFrame">宠物信息</a>
    			</div>
    		    
    		</div>
    		<div>
            <!-- iframe: inner frame 嵌入的页面窗口  -->
            <iframe id="contentFrame" width="99%" scrolling="no" height="600px" frameborder="0" name="contentFrame"  > 
            </iframe>
        	</div>
    	</div>
    </div>
  </body>
</html>
