<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html class="no-js">
<head>
  <base href="<%=basePath%>">
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>学生信息</title>
  <meta name="description" content="这是一个 user 页面">
  <meta name="keywords" content="user">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
  <link rel="stylesheet" href="assets/css/amazeui.min.css"/>
  <link rel="stylesheet" href="assets/css/admin.css">
</head>
<body>




<div class="am-cf admin-main">


 <!-- content start -->
            <div class="admin-content">
                <div class="am-cf am-padding">
                    <div class="am-fl am-cf">
                        <strong class="am-text-primary am-text-lg">
                            Student_info
                        </strong>
                        /
                        <small>
                            Student information
                        </small>
                    </div>
                </div>
                <hr/>
                <div class="am-g">
                    <div class="am-u-sm-12 am-u-md-4 am-u-md-push-8">
                        
                        
                    </div>
                    <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
                        <form class="am-form am-form-horizontal" action="login.action" method="post">
                            <div class="am-form-group">
                                <label for="user-name" class="am-u-sm-3 am-form-label">
                         	           用户名 / Username
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="text" name="username" placeholder="用户名 / Username">
                                    
                                </div>
                            </div>


							<div class="am-form-group">
                                <label for="password" class="am-u-sm-3 am-form-label">
                               	     密码/ Password
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="password" name="password" placeholder=" 密码/ Password">
                                </div>
                            </div>
                            
						<font size="6"  face="楷体"><a href="help.jsp"><Strong>先看再登录！！！</Strong></a></font>
                            <div class="am-form-group">
                                <div class="am-u-sm-9 am-u-sm-push-3">
                                    <button type="submit" class="am-btn am-btn-primary">
                                	      登录
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
          

</div>




<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]-->

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/amazeui.min.js"></script>
<!--<![endif]-->
<script src="assets/js/app.js"></script>
</body>
</html>
