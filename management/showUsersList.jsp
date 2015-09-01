<%@ page language="java" import="java.util.*,entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showUsersList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <%
  			List<Student_info> list =(List<Student_info>)session.getAttribute("stuList");
   %>
  <body>
   <h1>学生信息一览</h1>
  <hr style="height: 46px; ">
  <table border="1">
  <tr><th>学号</th><th>姓名</th><th>性别</th><th>专业</th><th></th><th></th><th></th><th></th></tr>
  <%
  for(Student_info stu:list)
  {%>
  
  <% }
   %>
   </table>
  </body>
</html>
