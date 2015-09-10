<%@ page language="java" import="java.util.*,entity.*,service.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台报名信息一览</title>
    
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
  <%
  	List<Sign_info> list=(List<Sign_info>)request.getAttribute("list");
  	Depart_infoService  depart_infoService =(Depart_infoService)request.getAttribute("depart_infoService");
  	Org_infoService   org_infoService=(Org_infoService)request.getAttribute("org_infoService");
   	Student_infoService student_infoService=(Student_infoService)request.getAttribute("student_infoService");
   %>
   
   <h1>报名信息信息一览</h1>
  <hr style="height: 46px; ">
  <table border="1">
  <tr><th>姓名</th><th>性别</th><th>学院</th><th>专业</th><th>所报组织</th><th>所报部门</th><th>审核状况</th><th>是否调剂</th><th>调剂部门</th><th>日期</th><th>更多</th><th>审核</th><th>删除</th></tr>
  <%
  for(Sign_info sign:list)
  {%>
  <tr><th><%=student_infoService.getStu(sign.getStudent_id()).getStudent_name()  %></th>
  <th><%=student_infoService.getStu(sign.getStudent_id()).getStudent_sex()    %></th>
  <th><%=student_infoService.getStu(sign.getStudent_id()).getSdept()    %></th>
  <th><%=student_infoService.getStu(sign.getStudent_id()).getSmajor()    %></th>
  <th><%=org_infoService.getStudentInfo(depart_infoService.getDepartInfo(sign.getDepartment_id()).getOrg_id()).getOrg_name() %></th>
 <th><%=depart_infoService.getDepartInfo(sign.getDepartment_id()).getDepartment_name()    %></th>
 <th><%=sign.getCheck_state()==0?"未开始审核:请稍等":"正在审核，请耐心等候"   %></th>
 <th><%=sign.getAdjust()==1?"是":"否"  %></th>
<th><%=sign.getOther()==0?"无被调部门":depart_infoService.findById(sign.getOther()).getDepartment_name()  %></th>
 <th><%=sign.getDate()   %></th>
 <th><a href="showSignListByStuIdAction!showStuInfo?signment_id=<%=sign.getSignment_id()  %>">更多</a></th>
<th><a href="showSignListByStuIdAction!toUpdate?signment_id=<%=sign.getSignment_id()  %>">审核</a></th>
 <th><a href="showSignListByStuIdAction!deleteSignInfo?signment_id=<%=sign.getSignment_id()  %>">删除</a></th>

 </tr> 
  <% }
   %>
  <tr ><th colspan="13"  align="right"><a href="behind index.jsp">返回</a></th></tr>
   </table>
  </body>
</html>
