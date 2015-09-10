<%@ page language="java" import="java.util.*,entity.*" pageEncoding="UTF-8"isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>组织简介</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/JianJie.css">
  

  </head>

  <body>
    <!-- 我做的修改
         1.头文件加了一个 isELIgnored=faulse
         2.加了个CSS 名字为 JianJie.css
         3.用了个EL语句输出了数据字典里组织信息表里的一些信息
          -->
          
  
      <h1>高校社团组织招新系统</h1>
      <hr width="900">
      <h2>组织名称:</h2><div> ${org_name }</div><br>
      <h2>组织负责人:</h2><div>${org_admin }</div><br>
      <h2>官方QQ群:</h2><div>${org_qq }</div><br>
      <h2>组织邮箱:</h2><div>${org_email }</div><br>
       <h2>组织简介:</h2><div>${org_intro }</div><br>
  </body>
  <!-- 第一个按键ID属性为 3_TiJiao 第二个按键ID属性为3_FanHui -->
   <a href="UpdateOrg.jsp"><input type="button"  value="修改"  ></a>
  <a href="behind index.jsp"> <input type="button" value="返回"></a>
</html>
