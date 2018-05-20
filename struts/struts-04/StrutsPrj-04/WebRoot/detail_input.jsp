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
    
    <title>My JSP 'detail_input.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<style type="text/css">
		*{
			margin:10px;
			
		}
		#submit{
			margin-left:450px;
		}
		#reset{
			margin-left:450px;
		}
	</style>
  </head>
  
  <body>
    <div id="wrapper">
    	<s:form  namespace="/detail" action="detail" method="post" id="form">
    		<div>
    			<span>姓名：</span>
    			<s:textfield name="user.userName"></s:textfield>
    			<s:fielderror fieldName="user.userName"></s:fielderror>
    		</div>
    		<div>
    			<span>密码：</span>
    			<s:textfield name="user.userPass"></s:textfield>
    			<s:fielderror fieldName="user.userPass"></s:fielderror>
    		</div>
    		<div>
    			<span>性别：</span>
    			<s:radio name="user.userSex" list="#{\"a\":'男',\"b\":'女' }"></s:radio>
    			<s:fielderror fieldName="user.userSex"></s:fielderror>
    		</div>
    		<div>
    			<span>爱好运动：</span>
    			<s:checkboxlist name="user.userHobby" list="#{\"a\":'游泳',\"b\":'跑步',\"c\":'乒乓球',\"d\":'羽毛球',\"e\":'网球' }"></s:checkboxlist>
    			<s:fielderror fieldName="user.userHobby"></s:fielderror>
    		</div>
    		<div>
    			<span>喜欢文学书：</span>
    			<s:select name="user.userPerBook" list="#{\"a\":'小说',\"b\":'散文',\"c\":'诗歌',\"d\":'古典文学',\"e\":'现代文学' }" headerValue="--请选择您喜欢的--" headerKey="" multiple="true"></s:select>
    			<s:fielderror fieldName="user.userPerBook"></s:fielderror>
    		</div>
    		<div>
    			<span>留言</span>
    			<s:textarea name="user.userMemo" rows="8" cols="60"></s:textarea>
    			<s:fielderror fieldName="user.userMemo"></s:fielderror>
    		</div>
    		<div id="submit">
    		<s:submit value="提交表单" ></s:submit>
    		</div>
    		<div id="reset">
    		<button  onclick="clean();">重置表单</button>
    		</div>
    	</s:form>
    </div>
    <script type="text/javascript">
		function $(Id)
		{
			return document.getElementById(Id);
		}
		function clean(){
		$("form").reset();
		}
	</script>
  </body>
</html>
