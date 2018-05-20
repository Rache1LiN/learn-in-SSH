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
    
    <title>My JSP 'list_members.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/list.css"></c:url>">
	<script type="text/javascript">
	  
	   function removeMember(userId,userName){
	       if(confirm("您确认要删除["+userName+"]信息吗 ?")){
	          location.href="<c:url value="deleteUser.action"/>?userId="+userId;
	       }
	       else
	          alert("you cancel operation!");
	   }
	   
	   function updateMember(userId){
	      location.href="<c:url value="preUpdate.action"/>?userId="+userId;
	   }
	
	</script>
  </head>
  
  <body>
    <div>
	     <div>用户信息列表</div>
	     <div>
	        <c:if test="${not empty memberList}">
		        <table id="listtable" cellpadding="0" cellspacing="0">
		          <tr>
		            <th>编号</th>
		            <th>姓名</th>
		            <th>性别</th>
		            <th>地址</th>
		            <th>电话</th>
		            <th>邮箱</th>  
		            <th>操作</th>                                                          
		          </tr>
		          <c:forEach var="member" items="${memberList}">
			          <tr>
			            <td>${member.userId}</td>
			            <td>${member.userName}</td>
			            <td>${member.userSex}</td>
			            <td>${member.userAddress}</td>
			            <td>${member.userPhone}</td>
			            <td>${member.userMail }</td>
			            <td>
			               <button onclick="updateMember(${member.userId});"> 修 改 </button>
			               <button onclick="removeMember(${member.userId},'${member.userName}');"> 删 除 </button>
			            </td>                                                            
			          </tr>          
		          </c:forEach>
		        </table>
	        </c:if>
	        <c:if test="${empty memberList }">
	            <div style="margin:30px; text-align:center">没有任何用户信息被找到!</div>
	        </c:if>
	     </div>
     </div>
  </body>
</html>
