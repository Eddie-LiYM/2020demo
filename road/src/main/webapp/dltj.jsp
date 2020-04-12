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
<title>道路基本资料添加</title>
<style type="text/css">
	/* 控制输入框长度一致 */
 		input{
 			width:200px;
 		}
 	/* 	上下对齐 */
 		span{
 			display:inline-block;
 			width:100px;
 			text-align:right;
 		}
 		button{
 			width:100px;
 		}
 		
 		select{
 			width:200px;
 		}
	</style> 
</head>
<body>
<div>
<form action="${pageContext.request.contextPath }/RecordServlet?cmd=basicadd" method="post">
	<table class="table table-bordered">
  		
  		<caption style="text-align:center"><h1>道路基本资料卡</h1></caption>
 
  			<tr>
  				<td><span>制表单位</span><input type="text" name="zbdw"></td>
  				<td><span>道路名称</span><input type="text" name="dlmc"></td>
  				<td><span>道路编号</span><input type="text" name="dlbh"></td>
  				<td><span>所属乡镇</span>
  				
  				<select name="ssxz" class="select">
	  					<option value="重庆市南岸区" >重庆市南岸区</option>
	  					<option value="重庆市沙坪坝区" >重庆市沙坪坝区</option>
  				   </select> 
  				</td>
  			</tr>
  
  		
  		<tbody>
  			<tr>
  				<td><span>管理单位</span>
  				<select name="gldw" class="select">
	  					<option value="重庆市交通局" >重庆市交通局</option>
	  					<option value="重庆市交通局xx附属xx" >重庆市交通局xx附属xx</option>
  				   </select> 
  				</td>
  				<td><span>道路等级</span>
  				<select name="dldj" class="select">
	  					<option value="1" >1</option>
	  					<option value="2" >2</option>
	  					<option value="2" >3</option>
  				   </select> 
  				</td>
  				
  				<td><span>道路类型</span>
  					<select name="dllx" class="select">
	  					<option value="水泥混凝土路面" >水泥混凝土路面路</option>
	  					<option value="沥青路面" >沥青路面</option>
  				   </select> 
  				</td>
  				<td><span>路面类型</span>
  					<select name="lmlx" class="select">
	  					<option value="主干路" >主干路</option>
	  					<option value="次干路" >次干路</option>
	  					<option value="快速路" >快速路</option>
	  					<option value="支路" >支路</option>
  				   </select> 
  				</td>	
  			</tr>
  	
  			<tr>
  				<td><span>道路走向</span><input type="text" name="dlzx"></td>
  				<td><span>起点</span><input type="text" name="qd"></td>
  				<td><span>终点</span><input type="text" name="zd"></td>
  				<td><span>设计单位</span><input type="text" name="sjdw"></td>	
  			</tr>
  			
  			<tr>
  				<td><span>施工单位</span><input type="text" name="sgdw"></td>
  				<td><span>路面等级</span><input type="text" name="lmdj"></td>
  				<td><span>设计时速</span><input type="text" name="sjss"></td>
  				<td><span>路幅宽度范围</span><input type="text" name="lfkdfw"></td>	
  			</tr>
  						
  			<tr>
  				<td><span>道路长度</span><input type="text" name="dlcd"></td>
  				<td><span>道路面积</span><input type="text" name="dlmj"></td>
  				<td><span>AADT</span><input type="text" name="aadt"></td>
  				<td><span>交通量等级</span><input type="text" name="jtldj"></td>	
  			</tr>
  						
  			<tr >
  				<td ><span>管理分类</span><input type="text" name="glfl"></td>
  				<td ><span>养护单位</span><input type="text" name="yhdw"></td>
  				<td ><span>建造年月</span><input name="jzny"type="date"/></td>
  			</tr>
  			
  			<tr>  		
  				<th  colspan="4" style="text-align: center;vertical-align: middle!important;">车行道</th>  <!-- 独占一行 -->
  			</tr>
  			
  			<tr>
  				<td><span>路面厚度</span><input type="text" name="cxdlmhd"></td>
  				<td><span>基层类型</span><input type="text" name="cxdjclx"></td>
  				<td><span>基层厚度</span><input type="text" name="cxdjchd"></td>
  				<td><span>车道数</span><input type="text" name="cxdcds"></td>	
  			</tr>
  			
  			<tr>
  				<td><span>通行方向</span><input type="text" name="cxdtxfx"></td>
  				<td><span>机动车道范围</span><input type="text" name="cxdkdfw"></td>
  				<td><span>右侧非机动范围</span><input type="text" name="zfjdcdkd"></td>
  				<td><span>左侧非机动范围</span><input type="text" name="yfjdcdkd"></td>	
  			</tr>
  			
  			<tr>
  				<td><span>公交专用车道</span><input type="text" name="ywgjzycd"></td>
  				<td><span>侧石类型</span><input type="text" name="cslx"></td>
  				<td><span>侧石长度</span><input type="text" name="cscd"></td>
  				<td><span>平石类型</span><input type="text" name="pslx"></td>	
  			</tr>
  			
  			<tr>
  				<td><span>平石长度</span><input type="text" name="pscd"></td>
  				<td><span>审核人</span><input type="text" name="shr"></td>			
  				<td><span>制表人</span><input type="text" name="zbr"></td>
  				<td><span>制表日期</span><input name="zbrq" type="date"/></td>
  			</tr>
  		

			<tr>
				<td colspan="2" style="text-align: center;vertical-align: middle!important;"><button type="submit" class="btn btn-primary">添加</button></td>
				<td colspan="2" style="text-align: center;vertical-align: middle!important;"><button type="button" class="btn btn-success" onClick="location.href='index.jsp'">返回</button></td>
			</tr>

  		</tbody>
	</table>
</form>
</div>	
</body>
<script>

	form.project.value = '${user.project}';

</script>
</html>