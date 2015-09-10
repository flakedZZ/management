<%@ page language="java" import="java.util.*,entity.*" pageEncoding="UTF-8"%>
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
  <title>组织注册</title>
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
                            注册组织信息
                        </strong>
                        /
                        <small>
                            update organization
                        </small>
                    </div>
                </div>
                <hr/>
                <div class="am-g">
                    <div class="am-u-sm-12 am-u-md-4 am-u-md-push-8">
                        
                        
                    </div>
                    <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
                        <form class="am-form am-form-horizontal" action="registerOrg" method="post">
                        
                        <div class="am-form-group">
                                <label for="user-name" class="am-u-sm-3 am-form-label">
                         	     	组织名称 / Org_name
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="text" name="org_name"   placeholder="组织名称/Org_name">
                                   
                                </div>
                            </div>
                            <div class="am-form-group">
                                <label for="user-name" class="am-u-sm-3 am-form-label">
                         	       负责人 /Org_admin
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="text" name="org_admin"  placeholder="负责人/Org_admin">
                                   
                                </div>
                            </div>
                            <div class="am-form-group">
                                <label for="user-name" class="am-u-sm-3 am-form-label">
                         	           组织官方QQ群 / Org_qq
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="text" name="org_qq"  placeholder="组织官方QQ群/Org_qq">
                                    <small>
                           	             输入组织QQ，让偶们快快地熟悉起来。
                                    </small>
                                </div>
                            </div>


							<div class="am-form-group">
                                <label for="user-weibo" class="am-u-sm-3 am-form-label">
                               	     组织公共邮箱 /Org_email
                                </label>
                                <div class="am-u-sm-9">
                                    <input type="email" name="org_email"  placeholder="组织公共邮箱/Org_email">
                              		 <small>
                           	             输入组织邮箱,便于管理员消息的推送。
                                    </small>
                                </div>
                            </div>
                            <div class="am-form-group">
                                <label for="user-email" class="am-u-sm-3 am-form-label">
                       		             组织信息介绍 / Org_intro
                                </label>
                                <div class="am-u-sm-9">
                                    <textarea  name="org_intro" rows="20"  cols="80"  ></textarea>
                                    
                                </div>
                            </div>

                           

                            <div class="am-form-group">
                                <div class="am-u-sm-9 am-u-sm-push-3">
                                    <button type="submit" class="am-btn am-btn-primary">
                                	        提交
                                    </button>
                                     <button type="reset" class="am-btn am-btn-primary">
                                	        取消
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
