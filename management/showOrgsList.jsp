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
  			List<Org_info> list =(List<Org_info>)request.getAttribute("list");
   %>
  <body>
  <font color="red" face="楷体"><h1 align="center">组织信息一览</h1></font>
  <hr style="height: 46px; ">
  <table border="1" bordercolor="blue" align="center">
  <tr><th>组织编号</th><th>组织名称</th><th>负责人</th><th>官方QQ群</th><th>邮箱</th><th>更多</th><th>删除</th><th>部门信息</th></tr>
  <%
  for(Org_info org:list)
  {%>
   <tr><th><%=org.getOrg_id()   %></th><th><%=org.getOrg_name() %></th><th><%=org.getOrg_admin() %></th><th><%=org.getOrg_qq() %></th><th><%=org.getOrg_email() %></th><th><a href="showOrgMore.action?org_id=<%=org.getOrg_id()  %>">更多</a></th>
   <th><a href="deleteOrgInfoAction.action?org_id=<%=org.getOrg_id()    %>">删除</a></th><th><a href="showDepartListByOrAction?org_id=<%=org.getOrg_id()   %>">下辖部门</a></th></tr>
  <% }
   %>
   <tr><th colspan="8"   align="right"><a href="behind index.jsp"><input type="button" value="返回"></a></th></tr>
   </table>
    
  </body>
</html>
