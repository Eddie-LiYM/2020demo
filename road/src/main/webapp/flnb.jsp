<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet">
<link href="css/bootsnav.css" type="text/css" rel="stylesheet">
<link href="css/normalize.css" type="text/css" rel="stylesheet">
<link href="css/css.css" rel="stylesheet" type="text/css">
<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/bootsnav.js" type="text/javascript"></script>
<script src="js/jquery.js" type="text/javascript"></script>
<title>分类年报表</title>
<style type="text/css">
	/* 控制输入框长度一致 */

 	/* 	上下对齐 */

 		button{
 			width:80px;
 		}
		
		.btn1{
		position:absolute;
		top:620px;
}
	</style> 
</head>
<body>	
<div class="table table-striped  table-bordered table-hover table-condensed">
	<table class="table table-bordered table-striped" id="mytable" name="lmpzdckForm">
		<thead>
		<tr>
			<th>日期</th>
			<th>道路名称</th>
			<th>PQI</th>
			<th>RQI/IRI</th>
			<th>PCI</th>
		</tr>
		<c:forEach items="${scorelist}" var="score">
			<tr>
				<td>${score.date}</td>
				<td>${score.roadname }</td>
				<td>${score.pqi }</td>
				<td>${score.riq }</td>
				<td>${score.pci }</td>
			</tr>
		</c:forEach>
		</thead>
		<tbody>
	</table>
	<tr>
		<td colspan="1" style="text-align: center;vertical-align: middle!important;"><button type="button" class="btn btn-success" onClick="location.href='index.jsp'">返回</button></td>
	</tr>


</body>
</html>