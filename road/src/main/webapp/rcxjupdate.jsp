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
	<c:forEach items="${rcxjList }" var="rcxj">
		<form action="${pageContext.request.contextPath }/RcxjServelet?cmd=update&xcry2=${rcxj.xcry }" method="post">
			<div class="table-responsive">
				<table class="table table-bordered table-striped" id="rcxjupdatetable" name="rcxjupdateForm">
				<caption style="text-align:center">道路设施日常巡检情况记录表</caption>
				<thead>
					<tr>
						<th>日期</th>
						<th>巡检人员</th>
						<th>道路编号</th>
						<th>道路名称</th>
						<th>损坏位置及损害情况描述</th>
						<th>备注</th>
					</tr>
					<tr>
						<td><input name="rq" type="date" value="${rcxj.rq }"></td>
						<td><input type="text" name="xcry" value="${rcxj.xcry }"></td>
						<td><input type="text" name="dlbh" value="${rcxj.dlbh }"></td>
						<td><input type="text" name="dlmc" value="${rcxj.dlmc }"></td>
						<td><input type="text" name="shqkms" value="${rcxj.shqkms }"></td>
						<td><input type="text" name="bz" value="${rcxj.bz }"></td>
					</tr>
					<tr>
						<td colspan="1" style="text-align: center;vertical-align: middle!important;">
						<button  type="submit" class="btn btn-primary" >确认修改</button>
						</td>
						
						<td colspan="1" style="text-align: center;vertical-align: middle!important;">
						<a href="${pageContext.request.contextPath }/RcxjServelet?cmd=rcxjList">
						<button  type="button" class="btn btn-primary" >返回</button>
						</a>
						</td>
					</tr>
				
				</thead>
				</table>
					<tr>
						<td colspan="1" style="text-align: center;vertical-align: middle!important;">
						<button type="button" class="btn btn-success" onClick="location.href='rcxj.jsp'">返回</button>
						</td>
					</tr>
				<tbody>
			</div>
		</form>
	</c:forEach>
</body>
</html>
  				
				