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
<title>设备损坏通知单</title>
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
<form action="${pageContext.request.contextPath }/ShtzdServelet?cmd=insert" method="post">
	<table class="table table-bordered">
  		
  		<caption style="text-align:center"><h1>设备损坏通知单</h1></caption>
 
  			<tr>
  				<th><span>通知号</span><input type="text" name="tzh"></th>
  				<th><span>巡查人员</span><input type="text" name="xcry"></th>
  			</tr>
  
  		<tbody>
  			<tr>
  				<td><span>设施名称</span><input type="text" name="ssmc"></td>
  			  	<td><span>损坏部位</span><input type="text" name="shbw"></td>
  				
  			</tr>
  			
  			<tr>
  				<td><span>损害原因</span><input type="text" name="shyy"></td>
  				<td><span>处理意见</span><input type="text" name="clyj"></td>
  			</tr>
  			
  			<tr>
  				<td><span>技术员</span><input type="text" name="jsy"></td>
  				<td><span>日期</span><input name="rq" type="date"/></td>
  			</tr>
  			
  			 <tr>
  				<td><span>班级</span><input type="text" name="bj"></td>
  				<td><span>整修时间</span><input name="zxsj" type="date"/></td>
  			</tr>

  			 <tr>
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