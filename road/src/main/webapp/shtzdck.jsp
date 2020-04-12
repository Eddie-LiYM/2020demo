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
				<table class="table table-bordered table-striped" id="mytable" name="shtzdckForm">
					<thead>
					<c:forEach items="${shtzdList }" var="shtzd">
						<tr>
							<th>通知号</th>
							<th>巡查人员</th>
							<th>设施名称</th>
							<th>损坏部位</th>
							<th>损害原因</th>
							<th>处理意见</th>
						</tr>
						<tr>
						<td>${shtzd.tzh }</td>
						<td>${shtzd.xcry }</td>
						<td>${shtzd.ssmc }</td>
						<td>${shtzd.shbw }</td>
						<td>${shtzd.shyy }</td>
						<td>${shtzd.clyj }</td>
						</tr>
						<tr>
							<th>技术员</th>
							<th>日期</th>
							<th>班级</th>
							<th>整修时间</th>
							<th>备注</th>
							<th>操作</th>
						</tr>
						<tr>
						<td>${shtzd.jsy }</td>
						<td>${shtzd.rq }</td>
						<td>${shtzd.bj }</td>
						<td>${shtzd.zxsj }</td>
						<td>${shtzd.bz }</td>
						<td>
							<a href="${pageContext.request.contextPath }/ShtzdServelet?cmd=delete&tzh=${shtzd.tzh}">
							<button class="btn btn-danger">删除</button>
							</a>
						</td>
					</tr>
					<th></th>
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