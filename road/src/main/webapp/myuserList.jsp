<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- 引入jquery框架 -->
<script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>

<!-- Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
<!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
<!--[if lt IE 9]>
      <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
    
	<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>


</head>
<body>

	<h1 style="text-align: center;">--- 个人中心 ---</h1>

	<hr width="80%">
	
	<div class="container">
	
		<table class="table table-bordered table-hover">
	
		
			<c:forEach items="${myuserList }" var="emp">
			<tr>
				
				<th>用户名:</th>
				<td>${emp.yhm }</td>
				
				
			</tr>
			
		
				<tr>
					<th>密码:</th>
					
					<td>${emp.mm }</td>
					
				</tr>
			</c:forEach>
		
		
		</table>
		<button class="btn btn-warning" onClick="location.href='index.jsp'">返回</button>
	
	</div>
	
	
	

</body>
</html>