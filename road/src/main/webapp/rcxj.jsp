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
<title>道路设施日常巡检情况记录表</title>
<style type="text/css">
	/* 控制输入框长度一致 */
 		input{
 			width:200px;
 		}
 	/* 	上下对齐 */
 		span{
 			display:inline-block;
 			width:200px;
 			text-align:right;
 		}
 		button{
 			width:100px;
 		}
 			
		
	</style> 
</head>
<body>

<div>
<form action="${pageContext.request.contextPath }/RcxjServelet?cmd=insert" method="post">
	<table class="table table-bordered">
	<caption style="text-align:center"><h1>道路设施路面损害情况记录表</h1></caption>
	  		
  			<tr>
  				<td><span>日期</span><input name="rq" type="date"/></td>
  				<td><span>巡查人员</span><input type="text" name="xcry"></td>
  			</tr>
  
  		<tbody>
  			<tr>
  			  	<td><span>道路编号</span><input type="text" name="dlbh"></td>
  				<td><span>道路名称</span><input type="text" name="dlmc"></td>
  			</tr>
  			
  			<tr>
  				<td><span>损坏位置及损害情况描述</span><input type="text" name="shqkms"></td>
  				<td><span>备注</span><input type="text" name="bz"></td>
  			</tr>
  				
  			<tr>
				<td colspan="1" style="text-align: center;vertical-align: middle!important;"><button type="submit" class="btn btn-primary">添加</button></td>
				<td colspan="1" style="text-align: center;vertical-align: middle!important;"><button type="button" class="btn btn-success" onClick="location.href='index.jsp'">返回</button></td>
				
			</tr>
				
  		</tbody>
	</table>
</form>
</div>	
</body>
</html>