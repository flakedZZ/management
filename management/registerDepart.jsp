<%@ page language="java" import="java.util.*,service.*,entity.*" pageEncoding="UTF-8"%>
<%

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>
<% 
	
	List<Org_info> list =(List<Org_info>)request.getAttribute("list");	
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html class="no-js">
<head>
  <base href="<%=basePath%>">
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>部门注册</title>
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
                            注册部门
                        </strong>
                        /
                        <small>
                            register  Department
                        </small>
                    </div>
                </div>
                <hr/>
                <div class="am-g">
                    <div class="am-u-sm-12 am-u-md-4 am-u-md-push-8">
                        
                        
                    </div>
                     <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
                        <form class="am-form am-form-horizontal" action="registerDepart" method="post">
                            <div class="am-form-group">
                                <label for="user-name" class="am-u-sm-3 am-form-label">
                         	     	部门名称 / Department_name
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="text" name="department_name" placeholder="部门名 / Department_name ">
                                   
                                </div>
                            </div>
                           
                        
                        <div class="am-form-group">
                                <label for="user-name" class="am-u-sm-3 am-form-label">
                         	     	所属组织名称 / Org_name
                                </label>
                                <div class="am-u-sm-9">
                                   <select  name="org_id"    >
                                   <option  value="" selected>---------------------请选择---------------</option>
                                   <%
                                   if(list!=null)
                                   {
                                   		for(Org_info org:list)
                                 	  	{ %>
                                   	<option  value=<%=org.getOrg_id() %>><%=org.getOrg_name() %></option>
                                  	 <%}
                                  	 }
                                    %>                                   
                                   </select>
                                   
                                </div>
                            </div>
                            <div class="am-form-group">
                                <label for="user-name" class="am-u-sm-3 am-form-label">
                         	       负责人 /Department_admin
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="text" name="department_admin" placeholder="负责人 /Department_admin">
                                   
                                </div>
                            </div>
                            <div class="am-form-group">
                                <label for="user-name" class="am-u-sm-3 am-form-label">
                         	           部门官方QQ群 / Department_qqgroup
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="text" name="department_qqgroup" placeholder="部门官方QQ群 / department_qqgroup">
                                    <small>
                           	             输入部门QQ，让偶们快快地熟悉起来。
                                    </small>
                                </div>
                            </div>


							
                            <div class="am-form-group">
                                <label for="user-email" class="am-u-sm-3 am-form-label">
                       		             部门信息介绍 /Department_intro
                                </label>
                                <div class="am-u-sm-9">
                                    <textarea  name="department_intro" rows="20"  cols="80"></textarea>
                                    
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
