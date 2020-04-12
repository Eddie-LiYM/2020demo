<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>轻量级城镇道路信息养护系统</title>

<link href="css/style.css" rel="stylesheet" type="text/css">

<script type="text/javascript" src="js/jquery.min.js"></script>
 <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>index</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  <style type="text/css">
  	#login{
  		   position:fixed;    
           top:180px;
  	}
  		
  </style>
    <body style="background:url(images/b1.png);background-size:100% 100% ; background-attachment: fixed">
</head>
<body>
<c:if test="${emp != null }">
<div class="lvc-wrap" id="lvc-nav">
  <ul class="lvc-nav">
  	<li class="nav-pic6 next-layer" title="用户管理">
  		<a href="#用户管理" class="smooth">用户管理</a>
  		<ol>
  			<li>
  			<a href="${pageContext.request.contextPath }/EmpServlet?cmd=logout">
  			用户登录
  			</a>
  			
  			</li>
  			<li>
  			<a href="${pageContext.request.contextPath }/register.jsp">用户注册</a>
  			</li>
  		</ol>
  	</li>
    <li class="nav-pic1 next-layer" title="道路基本资料卡">
      <a class="smooth">道路基本资料卡</a>
      <ol>
        <li><a href="dltj.jsp" class="smooth">添加道路信息</a></li>
        <li><a href="${pageContext.request.contextPath }/DltjServelet?cmd=dltjList" class="smooth">查看道路信息</a></li>
      </ol>
    </li>
    <li class="nav-pic2 next-layer" title="日常巡查情况记录表">
    	<a class="smooth">日常巡查记录表</a>
    	<ol>
    	<li><a href="rcxj.jsp" class="smooth">添加日常巡检记录表</a></li>
    	<li><a href="${pageContext.request.contextPath }/RcxjServelet?cmd=rcxjList">查看日常巡检记录表</a></li>
    	</ol>
    </li>
    <li class="nav-pic4 next-layer" title="分类年报表">
    	<a href="flnb.jsp" class="smooth">分类年报表</a>
    </li>
    <li class="nav-pic5 next-layer" title="设施损害通知单">
    	<a class="smooth">设施损害通知单</a>
    	<ol>
    	<li><a href="shtzd.jsp"  class="smooth">添加设施损害通知单</a></li>
    	<li><a href="${pageContext.request.contextPath }/ShtzdServelet?cmd=shtzdList">查看设施损害通知单</a></li>
    	</ol>
    </li>
    <li class="nav-pic3 next-layer" title="道路路面平整度检测记录">
    	<a class="smooth">道路路面平整度检测记录</a>
    	<ol>
    	<li><a href="lmpzd.jsp" class="smooth">添加检测记录表</a></li>
    	<li><a href="${pageContext.request.contextPath }/RecordServlet?cmd=check">查看检测记录表</a></li>
    	</ol>
    </li>
    <li class="nav-pic8 next-layer" title="道路设施路面损害情况记录">
    	<a class="smooth">道路设施路面损害情况记录</a>
    	<ol>
    	<li><a href="lmshjl.jsp" class="smooth">添加损害情况记录表</a></li>
    	<li><a href="${pageContext.request.contextPath }/LmpzdServelet?cmd=lmpzdList">查看损害情况记录表</a></li>
    	<li><a href="${pageContext.request.contextPath }/ShtzdServelet?cmd=shtzdList">查看路面损害调查表</a></li>
    	</ol>
    </li>
    <li class="nav-pic9" title="地图"><a>地图</a></li>
    <li class="nav-pic10" title="订单管理"><a>订单管理</a></li>
    <li class="nav-pic11" title="个人中心"><a href="${pageContext.request.contextPath }/EmpServlet?cmd=findby&yhm=${emp.yhm}">个人中心</a></li>
    <li class="nav-pic12" title="用户列表"><a href="${pageContext.request.contextPath }/EmpServlet?cmd=empList">用户列表</a></li>
    <li class="nav-pic13" title="安全退出"><a href="${pageContext.request.contextPath }/EmpServlet?cmd=logout">安全退出</a></li>
  </ul>
  <button type="button" class="btn-nav"></button>
</div>
</c:if>

<c:if test="${emp == null }">
	<div class="box2"  id="login">
	 <form class="form-signin" action="${pageContext.request.contextPath }/EmpServlet?cmd=login" method="post">
        <h2 class="form-signin-heading" Style="width:300px;margin-left:300px;">Please sign in</h2>
        <label for="inputEmail" class="sr-only">nickname</label>
        
        <input name="yhm" type="text" id="inputEmail" class="form-control" placeholder="nickname" required autofocus Style="width:300px;margin-left:300px;">
        
        <label for="inputPassword" class="sr-only">Password</label><br>
        
        <input name="mm" type="password" id="inputPassword" class="form-control" placeholder="Password" required Style="width:300px;margin-left:300px;">
        
        <div class="checkbox">
          <label Style="width:300px;margin-left:300px;">
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit" Style="width:300px;margin-left:300px;">Sign in</button>
        <br>
        <a href="${pageContext.request.contextPath }/register.jsp">
        <button class="btn btn-lg btn-primary btn-block" type="button" Style="width:300px;margin-left:300px;">Register</button>
        </a>
      </form>

    </div> <!-- /container -->
    </c:if>
    
<script type="text/javascript">
$(document).ready(function(){
    //展开收起
    $(".btn-nav").click(function () {
      $(".lvc-wrap").toggleClass("lvc-close")
      $("ol").toggleClass("small-ol")
      $(".next-layer ol").hide()

      if($("#lvc-nav").hasClass('lvc-close')){
        $(".next-layer ").removeClass("arrow")
      }
    })

    //选中状态
    $(".lvc-nav li").click(function () {
      $(this).siblings().find('ol').hide()
      $(this).addClass("active").siblings().removeClass("active")
    })

    //选中子集清除父级active
    $("ol>li").click(function (e) {
      console.log('ol>li clicked')
      e.stopPropagation()
     $(this).parent().parent().removeClass("active")
    })

    //二级导航展开收起
    $(".next-layer").click(function () {
      $(this).children("ol").toggle();
      $(this).toggleClass("arrow").siblings().removeClass("arrow")
    })


     $("ol li").click(function () {
       if($("ol").hasClass('small-ol')) {
         $(".small-ol").hide();
         $(this).parent().parent().addClass("active")
       }
     })
})
        $(function(){            
        	$(".lvc-wrap li").on("click",function(){                
        		var address =$(this).attr("data-src");                
        		$("iframe").attr("src",address);            
        		});        
        	})

</script>
</body>
</html>