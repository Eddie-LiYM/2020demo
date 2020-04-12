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
				<table class="table table-bordered table-striped" id="mytable" name="lmshjlckForm">
					<thead>
					<c:forEach items="${lmshjlList }" var="lmshjl">
						<tr>
							<th>日期</th>
							<th>起止位置</th>
							<th>道路编号</th>
							<th>道路名称</th>
							<th>检查总长</th>
							<th>检查总宽</th>
							<th>损坏长</th>
						</tr>
						<tr>
						<td>${lmshjl.rq }</td>
						<td>${lmshjl.qzwz }</td>
						<td>${lmshjl.dlbh }</td>
						<td>${lmshjl.dlmc }</td>
						<td>${lmshjl.jczc }</td>
						<td>${lmshjl.jczk }</td>
						<td>${lmshjl.shc }</td>
						</tr>
						<tr>
							<th>损坏宽</th>
							<th>损坏高</th>
							<th>损坏位置及损害情况描述</th>
							<th>损坏面积</th>
							<th>损坏类型名称</th>
							<th>道路类型</th>
							<th>备注</th>
							<th>操作</th>
						</tr>
						<tr>
						<td>${lmshjl.shk }</td>
						<td>${lmshjl.shg }</td>
						<td>${lmshjl.shqkms }</td>
						<td>${lmshjl.shmj }</td>
						<td>${lmshjl.shlxmc }</td>
						<td>${lmshjl.dllx }</td>
						<td>${lmshjl.bz }</td>
						
						
						<td>
							<a href="${pageContext.request.contextPath }/LmshjlServelet?cmd=findby&dlbh=${lmshjl.dlbh}">
							<button class="btn btn-warning">修改</button>
							</a>
							<a href="${pageContext.request.contextPath }/LmshjlServelet?cmd=delete&dlbh=${lmshjl.dlbh}">
							<button class="btn btn-danger">删除</button>
							</a>
						</td>
					</tr>
				</c:forEach>
					</thead>
					<tbody>
				</table>
				<tr>
							<td colspan="1" style="text-align: center;vertical-align: middle!important;"><button type="button" class="btn btn-success" onClick="location.href='index.jsp'">返回</button></td>
						</tr>
</div>
</body>
</html>