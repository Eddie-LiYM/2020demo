<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
</head>
<body>
<div class="table-responsive">
				<table class="table table-bordered table-striped" id="mytable" name="rcxjckForm">
					<thead>
						<tr>
							<th>日期</th>
							<th>巡检人员</th>
							<th>道路编号</th>
							<th>道路名称</th>
							<th>损坏位置及损害情况描述</th>
							<th>备注</th>
							<th>操作</th>
						</tr>
					<c:forEach items="${rcxjList }" var="rcxj">
					<tr>
						<td>${rcxj.rq }</td>
						<td>${rcxj.xcry }</td>
						<td>${rcxj.dlbh }</td>
						<td>${rcxj.dlmc }</td>
						<td>${rcxj.shqkms }</td>
						<td>${rcxj.bz }</td>
						<td>
							<a href="${pageContext.request.contextPath }/RcxjServelet?cmd=findby&xcry=${rcxj.xcry}">
							<button class="btn btn-warning">修改</button>
							</a>
							<a href="${pageContext.request.contextPath }/RcxjServelet?cmd=delete&xcry=${rcxj.xcry}">
							<button class="btn btn-danger">删除</button>
							</a>
						</td>
					</tr>
				</c:forEach>
				
					</thead>
				</table>
				<tr>
							<td colspan="1" style="text-align: center;vertical-align: middle!important;"><button type="button" class="btn btn-success" onClick="location.href='index.jsp'">返回</button></td>
						</tr>
						<tbody>
</div>
</body>
</html>