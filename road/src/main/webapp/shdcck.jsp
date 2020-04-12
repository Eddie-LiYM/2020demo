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
				<table class="table table-bordered table-striped" id="mytable" name="shdcckForm">
					<thead>
					<c:forEach items="${shdcList }" var="shdc">
						<tr>
							<th>损坏面积</th>
							<th>起止位置</th>
							<th>损坏类型名称</th>
							<th>损坏类型</th>
							<th>检查面积</th>
						</tr>
						<tr>
						<td>${shdc.shmj }</td>
						<td>${shdc.qzwz }</td>
						<td>${shdc.shlxmc }</td>
						<td>${shdc.shlx }</td>
						<td>${shdc.jcmj }</td>
						</tr>
						<tr>
							<th>损坏密度</th>
							<th>单项扣分值</th>
							<th>备注</th>
							<th>调查人员</th>
							<th>调查日期</th>
						</tr>
						<tr>
						<td>${shdc.shmd }</td>
						<td>${shdc.dxkfz }</td>
						<td>${shdc.bz }</td>
						<td>${shdc.dcry }</td>
						<td>${shdc.dcrq }</td>
						</tr>
						<tr>
							<th>道路编号</th>
							<th>道路名称</th>
							<th>操作</th>
						</tr>
						<tr>
						<td>${shdck.dlbh }</td>
						<td>${shdc.dlmc }</td>
						
						<td>
							<a href="${pageContext.request.contextPath }/ShdcServelet?cmd=findby&dlbh=${shdc.dlbh}">
							<button class="btn btn-warning">修改</button>
							</a>
							<a href="${pageContext.request.contextPath }/ShdcServelet?cmd=delete&dlbh=${shdc.dlbh}">
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