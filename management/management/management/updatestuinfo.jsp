<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
                        <form class="am-form am-form-horizontal" action="updateStuInfo.action" method="post">
                            <div class="am-form-group">
                                <label for="user-name" class="am-u-sm-3 am-form-label">
                         	           姓名 / Name
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="text" name="student_name" value="<%=session.getAttribute("student_name") %>">
                                    <small>
                           	             输入你的名字，让我们记住你。
                                    </small>
                                </div>
                            </div>


							<div class="am-form-group">
                                <label for="user-weibo" class="am-u-sm-3 am-form-label">
                               	     学号 / Student sno
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="text" name="student_number" value="<%=session.getAttribute("student_number") %>" readonly>
                                </div>
                            </div>
                            <div class="am-form-group">
                                <label for="user-email" class="am-u-sm-3 am-form-label">
                       		             电子邮件 / Email
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="email" name="student_email" value="<%=session.getAttribute("student_email") %>">
                                    <small>
                               	         邮箱你懂得...
                                    </small>
                                </div>
                            </div>

                            <div class="am-form-group">
                                <label for="user-phone" class="am-u-sm-3 am-form-label">
                     		               电话 / Telephone
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="text" name="student_phone" value="<%=session.getAttribute("student_phone") %>">
                                </div>
                            </div>

                            <div class="am-form-group">
                                <label for="user-QQ" class="am-u-sm-3 am-form-label">
                                    QQ
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="text" name="student_qq" value="<%=session.getAttribute("student_qq") %>">
                                </div>
                            </div>


                            

                            <div class="am-form-group">
                                <label for="user-weibo" class="am-u-sm-3 am-form-label">
                              	      专业 / Student Major
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="text" name="smajor" value="<%=session.getAttribute("smajor") %>">
                                </div>
                            </div>

                            <div class="am-form-group">
                                <label for="user-weibo" class="am-u-sm-3 am-form-label">
                            	        学院 / College
                                </label>
                                <div class="am-u-sm-9">
                                    <select name="sdept">
         					  <option  value="信息院">信息院</option>
         					  <option value="经管院">经管院</option>
         					  <option value="动资院">动资院</option>
        					  <option  value="林学院">林学院</option>
          					  <option value="园林学院">园林学院</option>
         					  <option value="机电学院">机电学院</option>
       					          <option value="土木学院">土木学院</option>
         					  <option value="交通学院">交通学院</option>
           					  <option value="材料院">材料院</option>
           					  <option value="工程学院">河北</option>
           					  <option value="外国语学院">外国语学院</option>
          					  <option value="文法学院">文法学院</option>
           					  <option value="马克思学院">马克思学院</option>
          					  <option value="研究生院">研究生院</option>
         					  </select>
                                </div>
                            </div>


                            <div class="am-form-group">
                                <label for="user-weibo" class="am-u-sm-3 am-form-label">
                               	     照片 / Student Photo
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="file" name="photo_path"/ >
                                </div>
                            </div>


                            <div class="am-form-group">
                                <label for="user-sex" class="am-u-sm-3 am-form-label">
                               	     性别 / sex
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="radio" name="student_sex" value="男">男
                                    </input>
                                    <input type="radio" name="student_sex" value="女">女
                                    </input>
                                </div>
                            </div>

                            <div class="am-form-group">
                                <div class="am-u-sm-9 am-u-sm-push-3">
                                    <button type="submit" class="am-btn am-btn-primary">
                                	        保存修改
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
