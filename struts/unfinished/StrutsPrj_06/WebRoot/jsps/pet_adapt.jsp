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
    
    <title>My JSP 'pet_adapt.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
	#form span,div{
		margin:15px;
		
	}
	#form{
		width:45%;
		float:left;
	}
	#picture{
		width:45%;
		float:left;
		
	}
	#pic{
		height:370px;
		border:1px solid black;
	}
	#submit{
		width:80%;
		margin-left:10%;
	}
	</style>
	</head>
  
  <body>
    <div id="wrapper">
    	
    		<s:form action="createPet" namespace="/pet" method="post">
    		<div id="form" >
    			<div>
    				<span>宠物名：</span>
    				<s:textfield name="pet.petName"></s:textfield>
    			</div>
    			<div>
    				<span>类：</span>
    				<s:select name="pet.petType" list="#{\"a\":'猫咪',\"b\":'狗',\"c\":'猪',\"d\":'兔子' }" headerValue="--请选择您喜欢的--" headerKey=""></s:select>
    			</div>
    			<div>
    				<span>性别：</span>
    				<s:checkboxlist name="pet.petSex" list="#{\"a\":'男',\"b\":'女' }" ></s:checkboxlist>
    			</div>
    			<div>
    				<span>力量：</span>
    				<s:textfield name="pet.petStrength"></s:textfield>
    			</div>
    			<div>
    				<span>能力：</span>
    				<s:textfield name="pet.petCute"></s:textfield>
    			</div>
    			<div>
    				<span>爱心：</span>
    				<s:textfield name="pet.petLove"></s:textfield>
    			</div>
    			<div>
    				<span>介绍：</span>
    				<s:textarea name="pet.petIntro" rows="4" cols="30"></s:textarea>
    			</div>
    			<div>
    				<span>主人名：</span>
    				<s:textfield name="pet.petOwnerName"></s:textfield>
    			</div>
    			<div>
    				<span>宠物Email：</span>
    				<s:textfield name="pet.petOwnerEmail"></s:textfield>
    			</div>
    			<div>
    				<span>密码：</span>
    				<s:textfield name="pet.petPass"></s:textfield>
    			</div>
    			</div>
    			<div id="picture">
    				<div id="pic"></div>
    				<div>
    					<s:submit id="submit" value="提交"></s:submit>
    				</div>
    			</div>
    		</s:form>
    	
    	
    </div>
  </body>
</html>
