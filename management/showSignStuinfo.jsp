<%@ page language="java" import="java.util.*,entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html class="no-js">
<head>
  <base href="<%=basePath%>">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>学生信息</title>
  <meta name="description" content="这是一个 user 页面">
  <meta name="keywords" content="user">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="stylesheet" href="assets/css/amazeui.min.css"/>
  <link rel="stylesheet" href="assets/css/admin.css">
</head>
<body>

<%
		Student_info student_info=(Student_info)request.getAttribute("student_info");
		Sign_info sign=(Sign_info)request.getAttribute("sign");
 %>
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
                        <form class="am-form am-form-horizontal" action="showSignListByStuIdAction!updateSignInfo?signment_id=<%=sign.getSignment_id()%> " method="post">
                            <div class="am-form-group">
                                <label for="user-name" class="am-u-sm-3 am-form-label">
                         	           姓名 / Name
                                </label>
                                <div class="am-u-sm-9">
                                		<%=student_info.getStudent_name()   %>
                                </div>
                            </div>


							<div class="am-form-group">
                                <label for="user-weibo" class="am-u-sm-3 am-form-label">
                               	     学号 / Student sno
                                </label>
                                <div class="am-u-sm-9">
                                   <%=student_info.getStudent_number() %>
                                </div>
                            </div>
                            <div class="am-form-group">
                                <label for="user-email" class="am-u-sm-3 am-form-label">
                       		             电子邮件 / Email
                                </label>
                                <div class="am-u-sm-9">
                                   <%=student_info.getStudent_email() %>
                                </div>
                            </div>

                            <div class="am-form-group">
                                <label for="user-phone" class="am-u-sm-3 am-form-label">
                     		               电话 / Telephone
                                </label>
                                <div class="am-u-sm-9">
                                  		<%=student_info.getStudent_phone()  %>
                                </div>
                            </div>

                            <div class="am-form-group">
                                <label for="user-QQ" class="am-u-sm-3 am-form-label">
                                    QQ
                                </label>
                                <div class="am-u-sm-9">
                                    <%=student_info.getStudent_qq() %>
                                </div>
                            </div>


                            

                            <div class="am-form-group">
                                <label for="user-weibo" class="am-u-sm-3 am-form-label">
                              	      专业 / Student Major
                                </label>
                                <div class="am-u-sm-9">
                                   <%=student_info.getSmajor() %>
                                </div>
                            </div>

                            <div class="am-form-group">
                                <label for="user-weibo" class="am-u-sm-3 am-form-label">
                            	        学院 / College
                                </label>
                                <div class="am-u-sm-9">
                                    <%=student_info.getSdept() %>
                                </div>
                            </div>


                            

                            <div class="am-form-group">
                                <label for="user-sex" class="am-u-sm-3 am-form-label">
                               	     性别 / sex
                                </label>
                                <div class="am-u-sm-9">
                                  <%=student_info.getStudent_sex() %>
                                    
                                </div>
                            </div>
                            <div class="am-form-group">
                                <label for="user-sex" class="am-u-sm-3 am-form-label">
                               	     个人简介 /Personal_intro
                                </label>
                                <div class="am-u-sm-9">
                                  <%=sign.getPersonal_intro() %>
                                    
                                </div>
                            </div>

                            <div class="am-form-group">
                                <div class="am-u-sm-9 am-u-sm-push-3">
                                    <button type="submit" class="am-btn am-btn-primary">
                                	       审核
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
