<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>道路设施路面损害情况记录表</title>
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
 		
 		label{
 			margin-left:-80px;
 		}
		
	</style> 
</head>
<body>
<div>
<form action="${pageContext.request.contextPath }/RecordServlet?cmd=PCIcal" method="post">
	<table class="table table-bordered">
  		
  		<caption style="text-align:center"><h1>道路设施路面损害情况记录表</h1></caption>
 
  			<tr>
  				<th><span>日期</span><input name="rq" type="date"/></th>
  				<th><span>起止位置</span><input type="text" name="qzwz"></th>
  			</tr>
  
  		<tbody>
  			<tr>
  				<td><span>道路编号</span><input type="text" name="dlbh"></td>
  			  	<td><span>道路名称</span><input type="text" name="dlmc"></td>
  				
  			</tr>
  			
  			<tr>
  				<td><span>道路类型</span><input type="text" name="dllx"></td>
  				<td><span>检查总长</span><input type="text" name="jczc"></td>
  			</tr>
  			
  			<tr>
  			  	<td><span>检查总宽</span><input type="text" name="jczk"></td>
  				<td><span>损坏长</span><input type="text" name="shc"></td>

  			</tr>
  			
  			 <tr>
  			   	<td><span>损坏宽</span><input type="text" name="shk"></td>
  				<td><span>损坏高</span><input type="text" name="shg"></td>

  			</tr>
  			
  			 <tr>
  				<td><span>损坏面积</span><input type="text" name="shmj"></td>
  				<td><span>损坏位置及损害情况描述</span><input type="text" name="shqkms"></td>
  			</tr>
  			
  			 <tr>
  				<td><span>备注</span><input type="text" name="bz"></td>
  			</tr>
  			
  			<tr>
  				 <th colspan="2"><span style="margin-left:600px ">损坏类型选择</span></th>
  			</tr>  		
			<tr>
			<td>
				
        		<input id="subBoxSup1" name="subBoxSup1" type="checkbox" value="接缝破坏类" /><label>
     				  接缝破坏类
     			</label>
     			
     			<div >
	       			<input name="subBox1" type="checkbox" value="接缝料损坏" id="subBox1_1" disabled="disabled"/>
	       			<label>
	      				  接缝料损坏
	      			</label>
	       			<input name="subBox1" type="checkbox"  value="边角剥落" id="subBox1_2" disabled="disabled"/>
	       			<label>
	      				 边角剥落
	      			</label>
				</div>
				
        		<br>
				<input id="subBoxSup2" name="subBoxSup2" type="checkbox" value="表面破坏类" /><label>
     				 表面破坏类
     			</label>
				<br>
       			<input name="subBox2" type="checkbox"  value="坑洞" id="subBox2_1" disabled="disabled"/>
       			<label>
      				  坑洞
      			</label>
       			<input name="subBox2" type="checkbox"  value="层状剥落" id="subBox2_2" disabled="disabled"/>
       			<label>
      				  层状剥落
      			</label>
       			<input name="subBox2" type="checkbox" value="表面裂纹" id="subBox2_3" disabled="disabled"/>
       			<label>
      				表面裂纹
      			</label>
        		<br>
       			 </td>	
       			 
       			 <td>
        		<input id="subBoxSup3" name="subBoxSup3" type="checkbox"  value="水泥裂缝类"/><label>
     				  裂缝类
     			</label>
				<br>
       			<input name="subBox3" type="checkbox"  value="线裂" id="subBox3_1" disabled="disabled"/>
       			<label>
      				 线裂
      			</label>
       			<input name="subBox3" type="checkbox" value="板角断裂" id="subBox3_2" disabled="disabled" />
       			<label>
      				板角断裂
      			</label>
       			<input name="subBox3" type="checkbox"  value="边角裂缝" id="subBox3_3" disabled="disabled"/>
       			<label>
      				  边角裂缝
      			</label>
       			<input name="subBox3" type="checkbox" value="交叉裂缝和玻碎板"  id="subBox3_4" disabled="disabled"/>
       			<label>
      				 交叉裂缝和玻碎板
      			</label>
        		<br>
				<input id="subBoxSup4" name="subBoxSup4" type="checkbox" value="水泥其它类" /><label>
     				  其它类
     			</label>
				<br>
       			<input name="subBox4" type="checkbox"  id="subBox4_1" disabled="disabled"/>
       			<label>
      				  错台
      			</label>
       			<input name="subBox4" type="checkbox"  value="拱胀" id="subBox4_2" disabled="disabled"/>
       			<label>
      				拱胀
      			</label>
       			<input name="subBox4" type="checkbox" value="唧浆" id="subBox4_3" disabled="disabled"/>
       			<label>
      				  唧浆
      			</label>
       			<input name="subBox4" type="checkbox" value="路框差" id="subBox4_4" disabled="disabled"/>
       			<label>
      				  路框差
      			</label>
      		
       			<input name="subBox4" type="checkbox" value="沉陷 " id="subBox4_5" disabled="disabled"/>
       			<label>
      				  沉陷
      			</label>
        		<br>
       			 </td>	
			</tr>
			<tr>
				<td colspan="1" style="text-align: center;vertical-align: middle!important;"><button type="submit" class="btn btn-primary">添加</button></td>
				<td colspan="1" style="text-align: center;vertical-align: middle!important;"><button type="button" class="btn btn-success" onClick="location.href='index.jsp'">返回</button></td>
			</tr>
  		</tbody>
	</table>
</form>
</div>	


 <script>
	$("#subBoxSup1").click(function(){
		 /*  var checkbox =$('input:checkbox');
		 checkbox.attr("disabled","disabled"); */
		 var flag=$(this).is(":checked")
		 if(flag){
		 $('#subBox1_1').removeAttr("disabled");
		 $('#subBox1_2').removeAttr("disabled");
		 }
		 else{
			 $('#subBox1_1').attr("disabled","disabled");
			 $('#subBox1_2').attr("disabled","disabled");
		 }
		})
		
		
	$("#subBoxSup2").click(function(){
		 var flag=$(this).is(":checked")
		 if(flag){
		 $('#subBox2_1').removeAttr("disabled");
		 $('#subBox2_2').removeAttr("disabled");
		 $('#subBox2_3').removeAttr("disabled");
		 }
		 else{
			 $('#subBox2_1').attr("disabled","disabled");
			 $('#subBox2_2').attr("disabled","disabled");
			 $('#subBox2_3').attr("disabled","disabled");
		 }
		 
		})
		
	$("#subBoxSup3").click(function(){
		 var flag=$(this).is(":checked")
		 if(flag){
		 $('#subBox3_1').removeAttr("disabled");
		 $('#subBox3_2').removeAttr("disabled");
		 $('#subBox3_3').removeAttr("disabled");
		 $('#subBox3_4').removeAttr("disabled");
		 }
		 else{
			 $('#subBox3_1').attr("disabled","disabled");
			 $('#subBox3_2').attr("disabled","disabled");
			 $('#subBox3_3').attr("disabled","disabled");
			 $('#subBox3_4').attr("disabled","disabled");
		 }
		})
	
	$("#subBoxSup4").click(function(){
		 var flag=$(this).is(":checked")
		 if(flag){
		 $('#subBox4_1').removeAttr("disabled");
		 $('#subBox4_2').removeAttr("disabled");
		 $('#subBox4_3').removeAttr("disabled");
		 $('#subBox4_4').removeAttr("disabled");
		 $('#subBox4_5').removeAttr("disabled");
		 }
		 else{
			 
			 $('#subBox4_1').attr("disabled","disabled");
			 $('#subBox4_2').attr("disabled","disabled");
			 $('#subBox4_3').attr("disabled","disabled");
			 $('#subBox4_4').attr("disabled","disabled");
			 $('#subBox4_5').attr("disabled","disabled");
		 }
		})
</script>

</body>
</html>