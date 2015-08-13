<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'JianJie.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/JianJie.css">


  </head>
  
  <body>
    <!-- 我做的修改
         1.头文件加了一个 isELIgnored=false
         2.加了个CSS 名字为 JianJie.css
         3.用了个EL语句输出了数据字典里组织信息表里的一些信息
          -->
          
          <%!
          String o_name="12345";
          String o_admin="sbsbsb";
          int o_qq=12345;
          String o_intro="qwertyuik";
          
           %>
      <h1>高校社团组织招新系统</h1>
      <hr width="900">
      <h2>组织名称:</h2><div><%=o_name %> </div><br>
      <h2>组织负责人:</h2><div><%=o_admin %></div><br>
      <h2>官方QQ群:</h2><div><%=o_qq %></div><br>
      <h2>组织简介:</h2><div><%=o_intro%></div><br>
  </body>
  <!-- 第一个按键ID属性为 3_TiJiao 第二个按键ID属性为3_FanHui -->
   <input type="button" id="3_TiJiao" value="我要报名">
   <input type="button" id="3_FanHui" value="返回">
</html>
