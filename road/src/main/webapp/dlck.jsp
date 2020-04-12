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
<div class="table table-striped">
				<table class="table table-bordered table-striped" id="mytable" name="dlckForm">
					<thead>
					<c:forEach items="${dltjList }" var="dltj">
					  <tr>
						<th>制表单位</th>
						<th>道路名称</th>
						<th>道路编号</th>
						<th>所属乡镇</th>
						<th>管理单位</th>
						<th>道路等级</th>
					</tr>
					<tr>
						<td>${dltj.zbdw }</td>
						<td>${dltj.dlmc }</td>
						<td>${dltj.dlbh }</td>
						<td>${dltj.ssxz }</td>
						<td>${dltj.gldw }</td>						
						<td>${dltj.dldj }</td>
					</tr>
					<tr>
						<th>道路类型</th>
						<th>路面类型</th>
						<th>道路走向</th>
						<th>起点</th>
						<th>终点</th>
						<th>设计单位</th>
					</tr>
					<tr>
						<td>${dltj.dllx }</td>
						<td>${dltj.lmlx }</td>
						<td>${dltj.dlzx }</td>
						<td>${dltj.qd }</td>						
						<td>${dltj.zd }</td>
						<td>${dltj.sjdw }</td>
					</tr>
					<tr>
					  	<th>施工单位</th>
					  	<th>路面等级</th>
					  	<th>设计时速</th>
					  	<th>路幅宽度范围</th>
					  	<th>道路长度</th>
					  	<th>道路面积</th>
					  	
					</tr>
					<tr>	
						<td>${dltj.sgdw }</td>
						<td>${dltj.lmdj }</td>
						<td>${dltj.sjss }</td>
						<td>${dltj.lfkdfw }</td>						
						<td>${dltj.dlcd }</td>
						<td>${dltj.dlmj }</td>
					</tr>
					<tr>
					  	<th>AADT</th>
					  	<th>交通量等级</th>
					  	<th>管理单位</th>
					  	<th>养护单位</th>
					  	<th>建造年月</th>
					  	<th>路面厚度</th>
					  </tr>
					  <tr>
						<td>${dltj.aadt }</td>
						<td>${dltj.jtldj }</td>
						<td>${dltj.glfl }</td>
						<td>${dltj.yhdw }</td>						
						<td>${dltj.jzny }</td>
						<td>${dltj.cxdlmhd }</td>
					</tr>
					  <tr>
					  	<th>基层类型</th>
					  	<th>基层厚度</th>
					  	<th>车道数</th>
					  	<th>通行方向</th>
					  	<th>机动车道范围</th>
					  	<th>右侧非机动范围</th>
					  	</tr>
					  <tr>	
						<td>${dltj.cxdjclx }</td>
						<td>${dltj.cxdjchd }</td>
						<td>${dltj.cxdcds }</td>						
						<td>${dltj.cxdtxfx }</td>
						<td>${dltj.cxdkdfw }</td>
						<td>${dltj.zfjdcdkd }</td>
					</tr>	
					  <tr>
					  	<th>左侧非机动范围</th>
					  	<th>公交车专用道</th>
					  	<th>侧石类型</th>
					  	<th>侧石长度</th>
					  	<th>平石类型</th>
					  	<th>平石长度</th>
					  </tr>
					  
					<tr>	
						<td>${dltj.yfjdcdkd }</td>
						<td>${dltj.ywgjzycd }</td>
						<td>${dltj.cslx }</td>						
						<td>${dltj.cscd }</td>
						<td>${dltj.pslx }</td>
						<td>${dltj.pscd }</td>
					</tr>
					  <tr>
					  	<th>审核人</th>
					  	<th>制表人</th>
					  	<th>制表日期</th>
					  	<th>操作</th>
					  </tr>
					  <tr>	
						<td>${dltj.shr }</td>
						<td>${dltj.zbr }</td>
						<td>${dltj.zbrq }</td>
						<td>
							<a href="${pageContext.request.contextPath }/DltjServelet?cmd=findby&dlbh=${dltj.dlbh}">
							<button class="btn btn-warning">修改</button>
							</a>
							<a href="${pageContext.request.contextPath }/DltjServelet?cmd=delete&dlbh=${dltj.dlbh}">
							<button class="btn btn-danger">删除</button>
							</a>
						</td>
					</tr>
				</c:forEach>
					  
					  
					  
					  
					  <tr>
					  	<td colspan="2" style="text-align: center;vertical-align: middle!important;"><button type="button" class="btn btn-success" onClick="location.href='index.jsp'">返回</button></td>
					  </tr>
					</thead>
					<tbody>
				</table>
</div>
</body>
</html>