<%@ page language="java" import="java.util.*,entity.*,service.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台审核报名信息</title>
    
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
  	
  	Depart_infoService  depart_infoService =(Depart_infoService)request.getAttribute("depart_infoService");
  	Org_infoService   org_infoService=(Org_infoService)request.getAttribute("org_infoService");
  	Sign_info sign=(Sign_info)session.getAttribute("sign");
  	List<Depart_info> list=depart_infoService.findSomeByOrg_id(depart_infoService.getDepartInfo(sign.getDepartment_id()).getOrg_id());
  	 Student_infoService student_infoService=(Student_infoService)request.getAttribute("student_infoService");
   %>
   <form action="showSignListByStuIdAction!updateSignInfo.action" method="post">
   <h1>报名信息信息一览</h1>
  <hr style="height: 46px; ">
  <table border="1">
  <tr><th>姓名</th><th>性别</th><th>学院</th><th>专业</th><th>所报组织</th><th>所报部门</th><th>审核状况</th><th>是否调剂</th><th>调剂部门</th><th>日期</th><th>更多</th><th>保存</th></tr>
  
 <tr><th><%=student_infoService.getStu(sign.getStudent_id()).getStudent_name()  %></th>
  <th><%=student_infoService.getStu(sign.getStudent_id()).getStudent_sex()    %></th>
  <th><%=student_infoService.getStu(sign.getStudent_id()).getSdept()    %></th>
  <th><%=student_infoService.getStu(sign.getStudent_id()).getSmajor()    %></th>
 <th><%=org_infoService.getStudentInfo(depart_infoService.getDepartInfo(sign.getDepartment_id()).getOrg_id()).getOrg_name() %></th>
 <th><%=depart_infoService.getDepartInfo(sign.getDepartment_id()).getDepartment_name()    %></th>
 <th>
 		<select name="check_state">
 		
 				<option value=<%=1 %> selected>一审通过</option>
 				<option value=<%=2 %> selected>二审通过</option>
 				<option value=<%=3 %> selected>不予通过</option>
 		</select>
 </th>
 <th><%=sign.getAdjust()==1?"是":"否"  %></th>
<th>
	<select name="other">
	<option value=0>--请选择--</option>
	<%
			for(Depart_info depart:list)
			{%>
			<option value=<%=depart.getDepartment_id() %>><%=depart.getDepartment_name() %></option>	
			<%}
	 %>
	</select>	
</th>
 <th><%=sign.getDate()   %></th>
 <th>更多</th>
<th><input type=submit value="提交"></th>


 </tr> 
  
   </table>
   
   </form>
  </body>
</html>
