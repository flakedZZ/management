<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'help.jsp' starting page</title>
    
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
   <p align="center"> <font color="red" size="6" face="楷体"><Stong>系统使用指南</Stong></font></p><br>
    1.进入系统，可以以游客身份了解各个社团组织(目前开发仅以武协作为样例)的信息，<br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;但没有注册或登录情况下不能参与报名<p>
    2.普通用户：进入组织后选择相应部门通过查看更多了解部门情况，并在此点击报名，跳转到<br>
    填写个人简历界面，点击提交可以完成报名。在主页上的查看报名信息可以查看当前的报名情况<br>
    如果不满意所报的组织，可以删掉，并和之前一样重新报名新部门。<p>
    3。管理员：通过管理面板进入后台主页,首先组织负责人注册组织，完事儿了各部的部门负责人员进<br>
          入部门注册页面进行部门注册。对于报名管理部分，通过查询报名信息查到所有的报名信息，<br>
          工作人员在这里通过点击审核可以填写审核状态，通过更多链接可以更加详细学生信息，在这个界面里面也有一个审核<br>
          功能，让管理员更方便审核。对于未审核的可以在后来通过删除键进行删除。<br><p></p>
      4.对于系统权限设置的想法：<br>
      此系统中,有两处区分：第一,普通用户与管理员间的区分，目前已经议妥。<br>
      第二：各个组织之间的区分，各个部门之间的区分，计划每个管理员用户的编号前面加组织编号和部门编号，当对应的组织<br>
      负责人或者部门负责人在进入后台的那一刻就通过一个action,截获组织编号和部门编号，，然后再<br>
      针对于特定的编号进行信息显示。目前是这种想法，，有待探讨哈，嘿嘿<p>
      	你先运行看看，，有任何问题了第一时间来骚扰~~~
      																						<p>
    
  </body>
</html>
