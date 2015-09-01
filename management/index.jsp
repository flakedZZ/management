<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--  
    <link rel="stylesheet" href="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css">
    <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
    <script src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
    -->
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<meta name="author" content="Virtuti-Design" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0" />
<!-- defines the width of the page as no wider than the width of the viewport -->

<!-- Shared on # -->

<link href='http://fonts.useso.com/css?family=Glegoo' rel='stylesheet'/>
<link href='http://fonts.useso.com/css?family=Oswald' rel='stylesheet'>
<link href="css/styles.css" rel="stylesheet" />

  </head>
  
<body>
    <div id="wrapper">
        
    <div id="left">
    <div id="top">
    <figure><img src="images/badge.png" alt="presskit"/></figure>
    </div><!--top-->
  	<%//if(session.getAttribute("orgList")==null){
  		//	response.sendRedirect("showlist.action");} %>
  	<%if(session.getAttribute("username")!=null)
  	{ %>
  	<aside>
  	<ul>
  	<li><div class="left-side">
           <%=session.getAttribute("username") %>
            </div><!--left-side-->
            <div class="right-side">
            <span class="green"><a href="<%=basePath%>updatestuinfo.jsp">查看/修改信息</a></span>
            </div><!--right-side-->
            <div class="dark-line"></div>
            <div class="light-line"></div>
        </li>
  	<li><div class="left-side">
       	   	<a href="showSignListByStuIdAction?student_id=<%=session.getAttribute("student_number")  %>"> 查看报名信息</a>
            </div><!--left-side-->
            <div class="right-side">
            <span class="green"><a href="<%=basePath%>">修改报名信息</a></span>
            </div><!--right-side-->
            <div class="dark-line"></div>
            <div class="light-line"></div>
        </li>
        <li><div class="left-side">
          <a href="behind index.jsp"> 进入管理面板</a>
            </div><!--left-side-->
            <div class="right-side">
            <span class="green"><a href="<%=basePath%>logout.jsp">注销</a></span>
            </div><!--right-side-->
            <div class="dark-line"></div>
            <div class="light-line"></div>
        </li>
  	</ul>
  	</aside>
<%}
	else{
 %>
<aside>
<ul>
<li><div class="left-side">
        请<a href="<%=basePath%>login.jsp">登录</a>或<a href="<%=basePath%>register.jsp">注册</a>
            </div><!--left-side-->
            <div class="right-side">
            <span class="green"></span>
            </div><!--right-side-->
            <div class="dark-line"></div>
            <div class="light-line"></div>
        </li>
</ul>
</aside>
 <%} %>
</div><!--left-->
 <div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title="网站模板">网站模板</a></div> 
    
    <div id="right">
        
        <!--MAIN PHOTO-->
        
        <div class="main-box">
        <figure id="main-photo"><h1>&middot;报名管理系统&middot;</h1></figure>
        <section class="info">
            
        <!--BIOGRAPHY SECTION-->

        <article>
        
        <div class="portfolio">
        <ul>
            <li onClick="TINY.box.show({image:'images/校学生会.jpg',boxid:'frameless',animate:true,openjs:function(){openJS()}})">
                <a href="showOrgMore!ShowOrgById.action?org_id=<%=11%>"><img src="images/校学生会.jpg" alt="poster"/></a>
                <div class="caption">
                    <p class="caption-inside">校学生会</p>
                </div>
            </li>
            
            <li  onclick="TINY.box.show({image:'images/校团委.jpg',boxid:'frameless',animate:true,openjs:function(){openJS()}})">
                <a href="#"><img src="images/校团委.jpg" alt="poster"/></a>
                <div class="caption">
                    <p class="caption-inside">校团委</p>
                </div>
            </li>
            
            <li  onclick="TINY.box.show({image:'images/校广播站.JPG',boxid:'frameless',animate:true,openjs:function(){openJS()}})">
                <a href="#"><img src="images/校广播站.JPG" alt="poster"/></a>
                <div class="caption">
                    <p class="caption-inside">校广播站</p>
                </div>
            </li>
            
            <li  onclick="TINY.box.show({image:'images/校学工部.JPG',boxid:'frameless',animate:true,openjs:function(){openJS()}})">
                <a href="#"><img src="images/校学工部.JPG" alt="poster"/></a>
                <div class="caption">
                    <p class="caption-inside">校学工部</p>
                </div>
            </li>
            
            <li  onclick="TINY.box.show({image:'images/武协.jpg',boxid:'frameless',animate:true,openjs:function(){openJS()}})">
                <a href="showOrgMore!ShowOrgById.action?org_id=<%=3 %>"><img src="images/武协.jpg" alt="poster" /></a>
                <div class="caption">
                    <p class="caption-inside">武协</p>
                </div>
            </li>
            
            <li  onclick="TINY.box.show({image:'images/太极.JPG',boxid:'frameless',animate:true,openjs:function(){openJS()}})">
                <a href="#"><img src="images/太极.JPG" alt="poster"/></a>
                <div class="caption">
                    <p class="caption-inside">太极<a href="http://www.cssmoban.com/" target="_blank" title="111">111</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
                </div>
            </li>
        </ul>  
       <div class='clear'></div><!-- clears the float -->
      </div><!-- portfolio -->   
        </article>
        <div class="grey-line"></div>
        </section><!--info-->
        </div><!--main-box-->
        
        
        
          <!--TIMELINE-->
          <div class="main-box">  
          <section class="info">

          <article>
          <h1>组织机构介绍</h1>
        <div id="timeline">
        <ul id="dates">
            <li><a href="#item1">校学生会</a></li>
            <li><a href="#item2">校团委</a></li>
            <li><a href="#item3">校广播站</a></li>
            <li><a href="#item4">校学工部</a></li>
            <li><a href="#item5">武协 太极</a></li>
        </ul>
        <ul id="issues">
            <li id="item1">
                <section>
                <p>人才辈出.</p>
                </section>
            </li>
            
            <li id="item2">
                <section>
                <p>学习成绩好.</p>
                </section>
            </li>
            
            <li id="item3">
                 <section>
                <p>同学上进.</p>
                </section>
            </li>
            
            <li id="item4">
                <section>
                <p>aaaaaaaaaaaaaaaaafdafewafasa</br>
                   wfwafwaffwafwfwfwffwafwafawf</br>
                   fwafafasdfdsadsfafasdafsdafs
                   <a href="https://www.baidu.com/">点击此处进入</a></p>
                </section>
            </li>
            
            <li id="item5">
                <section>
                <p>认真向上.</p>
                </section>
            </li>
        </ul>
        </div><!--timeline ends here-->
          </article>
          <div class="grey-line"></div>
          </section><!--info-->
          </div><!--main-box-->
        
        
        
      
        
        
       
        
        
         <!--POSTERS-->
        
          <div class="main-box end"> 
           
               
          <section class="info">
          <article class="last">
          <h1>学生组织机构名单</h1>
          <p class="last">
          校学生会&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp校团委&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp校广播站</br>
          校学工部&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp武协&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp太极</br>
          </p>
          </article>
          <div class="grey-line"></div>
          </section><!--info-->
          </div><!--main-box-->
        
        
    </div><!--right-->  
    </div><!--wrapper-->

<!--start of scripts-->
<script src="js/jquery.min.js"></script>

<!--rotate badge-->
<script src="js/jQueryRotate.2.1.js"></script>
<script>
var angle = 0;
setInterval(function(){
angle+=1;
$("#top").rotate(angle);
},60);
</script>
        
<!--slider-->
<script src="js/jquery.blueberry.js"></script>
<script>
$(window).load(function() {
$('.blueberry').blueberry();
});
</script>

<!--timeline-->
<script src="js/jquery.timelinr-0.9.4.js"></script>
<script> 
$(function(){
$().timelinr()
});
</script>

<!--portfolio-captions-->
<script src="js/portfolio-captions.js"></script>


<!--modal page-->
<script src="js/tinybox.js"></script>

<!--music player-->
<!--  
<script src="music-player/plugin/jquery.jplayer/jquery.jplayer.js"></script>
<script src="music-player/plugin/ttw-music-player.js"></script>
<script src="music-player/myplaylist.js"></script>

<script type="text/javascript">
$(document).ready(function(){
var description = 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce id tortor nisi. ';
$('#player').ttwMusicPlayer(myPlaylist, {
autoPlay:false, 
description:description
});
});
</script>

-->

</body>
</html>