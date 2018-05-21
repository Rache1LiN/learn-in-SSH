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
    
    <title>My JSP 'pet_search.jsp' starting page</title>
    
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
			padding:0px;
			margin:0px;
		}
		#wrapper{
			width:100%;
			height:400px;
			border:1px solid black;
		}
		#left{
			float:left;
			width:20%;
			margin:17% 5%;
			border:1px solid black;
		}
		#right{
			width:69%;
			float:left;

		}
		
		th{
		  border-bottom:1px solid black;
		}
		
		td{
		  text-align:center;
		  border-bottom:1px dotted gray;
		}
		.row{
			padding:5px;
		}
	</style>
  </head>
  
  <body>
    <div id="wrapper">
    	<div id="left">
    		<s:form action="search" namespace="/pet" method="post">
    			<div class="row">
	    			<span>宠物名：</span>
	    			<s:textfield size="5" name="name" ></s:textfield>
	    		</div>
	    		<div class="row">
	    			<span>排序方式：</span>
	    			<s:select name="style" list="#{\"a\":'活力',\"b\":'聪明',\"c\":'可爱' }" headerKey="" headerValue="默认" ></s:select>
	    		</div>
	    		<div class="row"><s:submit value="查找"></s:submit></div>
    		</s:form>
    	</div>
    	<div id="right">
    		<table cellpadding="30" cellspacing="35">
    			<tr>
    				<th>宠物名</th>
    				<th>类别</th>
    				<th>力量</th>
    				<th>聪明</th>
    				<th>爱心</th>
    				<th>主人</th>
    			</tr>
    			<s:iterator value="petList">
    				<tr>
    					<td><s:property value="petName"/></td>
    					<td><s:property value="petType"/></td>
    					<td><s:property value="petStrength"/></td>
    					<td><s:property value="petCute"/></td>
    					<td><s:property value="petLove"/></td>
    					<td><s:property value="petOwnerName"/></td>
    				</tr>
    			</s:iterator>
    		</table>
    	</div>
    </div>
  </body>
</html>
