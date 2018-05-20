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
    
    <title>My JSP 'self_pet.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
		*{
			margin:0px;
			padding:0px;
		}
		.row{
			margin:5px;
			border-bottom:1px dashed black;
			padding:10px;
		}
		#wrapper{
			width:100%;
		}
		#left{
			width:44%;
			float:left;
		}
		#right{
			width:52%;
			float:left;
			margin-left:20px;
			border:1px solid black;
			height:580px;
		}
		#act>span{
			background-color:lightgrey;
			border:1px solid black;
			padding:4px;
			margin:18px;
			
		}
		li{
			list-style-type:none;
		}
		th{
			border:1px solid black;
			background-color:lightgrey;
			padding:2px 3px;
		}
	</style>
  </head>
  
  <body>
    <div id="wrapper">
    	<div id="left">
    		<div class="row">
    			<span>宠物ID：<s:property value="pet.petName"/></span>
    			<a href="#">编辑宠物信息</a>
    		</div>
    		<div class="row"><s:property value="pet.petIntro"/></div>
    		<div class="row">
    			<ul>
    				<li>力量:<s:property value="pet.petStrength"/></li>
    				<li>能力:<s:property value="pet.petCute"/></li>
    				<li>爱心:<s:property value="pet.petLove"/></li>
    			</ul>
    		</div>
    		<div class="row">
    			<div id="pic" style="width:80%;height:240px;border:1px solid black;"></div>
    			<div id="act">
    				<span>喂食</span>
    				<span>讲故事</span>
    				<span>游戏</span>
    			</div>
    		</div>
    		<div id="dialog">
    			<span>写宠物日记124995123</span>
    			<s:form action="#" method="post">
	    			<div><s:textarea name="pet.petIntro" rows="4" cols="45"></s:textarea></div>
	    			<div><s:submit value="提交"/></div>
    			</s:form>
    		</div>
    	</div>
    	<div id="right">
    		<h2>宠物日记</h2>
    		<table cellpadding="0" cellspacing="50">
    			<tr>
    				<th>日期</th>
    				<th>标题</th>
    				<th>天气</th>
    				<th>操作</th>
    			</tr>
    		</table>
    	</div>
    </div>
  </body>
</html>
