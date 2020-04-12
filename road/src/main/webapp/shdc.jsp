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
<title>路面损坏调查表</title>
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
<form action="${pageContext.request.contextPath }/ShdcServelet?cmd=insert" method="post">
	<table class="table table-bordered">
  		
  		<caption style="text-align:center">路面损坏调查表</caption>
 
  			<tr>
  				<th><span>损坏面积</span><input type="text" name="shmj"></th>
  				<th><span>起止位置</span><input type="text" name="qzwz"></th>
  			</tr>
  
  		<tbody>
  			<tr>
  				<td><span>损坏类型名称</span><input type="text" name="shlxmc"></td>
  			  	<td><span>损坏类型</span><input type="text" name="shlx"></td>
  				
  			</tr>
  			<tr>
  				<td><span>道路编号</span><input type="text" name="dlbh"></td>
  				<td><span>道路名称</span><input name="dlmc" type="text"/></td>
  			</tr>
  			<tr>
  				<td><span>检查面积</span><input type="text" name="jcmj"></td>
  				<td><span>损坏密度</span><input type="text" name="shmd"></td>
  			</tr>
  			
  			<tr>
  				<td><span>单项扣分值</span><input type="text" name="dxkfz"></td>
  				<td><span>备注</span><input type="text" name="bz"></td>
  			</tr>
  			
  			 <tr>
  				<td><span>调查人员</span><input type="text" name="dcry"></td>
  				<td><span>调查日期</span><input name="dcrq" type="date"/></td>
  			</tr>
  					
  			
  			<tr>
				<td colspan="1" style="text-align: center;vertical-align: middle!important;"><button type="submit" class="btn btn-primary">添加</button></td>
				<td colspan="1" style="text-align: center;vertical-align: middle!important;"><button type="button" class="btn btn-success" onClick="location.href='index.jsp'">返回</button></td>
				<td colspan="1" style="text-align: center;vertical-align: middle!important;">
				<a href="${pageContext.request.contextPath }/ShdcServelet?cmd=shdcList">
				<button type="button" class="btn btn-success">查看</button></td>
				</a>
			</tr>

  		</tbody>
	</table>
</form>
</div>	
</body>
</html>