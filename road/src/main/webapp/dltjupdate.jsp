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
	<c:forEach items="${dltjList }" var="dltj">
		<form action="${pageContext.request.contextPath }/DltjServelet?cmd=update&dlbh2=${dltj.dlbh }" method="post">
			<div class="table-responsive">
				<table class="table table-bordered table-striped" id="dltjupdatetable" name="dltjupdateForm">
				<caption style="text-align:center">道路基本信息表</caption>
				<thead>
					<tr>
						<th>制表单位</th>
						<th>道路名称</th>
						<th>道路编号</th>
						<th>所属乡镇</th>
						<th>管理单位</th>
						<th>道路等级</th>
					</tr>
					<tr>
						<td><input type="text" name="zbdw" value="${dltj.zbdw }"></td>
						<td><input type="text" name="dlmc" value="${dltj.dlmc }"></td>
						<td><input type="text" name="dlbh" value="${dltj.dlbh }"></td>
						<td><input type="text" name="ssxz" value="${dltj.ssxz }"></td>
						<td><input type="text" name="gldw" value="${dltj.gldw }"></td>
						<td><input type="text" name="dldj" value="${dltj.dldj }"></td>
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
						<td><input type="text" name="dllx" value="${dltj.dllx }"></td>
						<td><input type="text" name="lmlx" value="${dltj.lmlx }"></td>
						<td><input type="text" name="dlzx" value="${dltj.dlzx }"></td>
						<td><input type="text" name="qd" value="${dltj.qd}"></td>
						<td><input type="text" name="zd" value="${dltj.zd }"></td>
						<td><input type="text" name="sjdw" value="${dltj.sjdw }"></td>
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
						<td><input type="text" name="sgdw" value="${dltj.sgdw }"></td>
						<td><input type="text" name="lmdj" value="${dltj.lmdj }"></td>
						<td><input type="text" name="sjss" value="${dltj.sjss }"></td>
						<td><input type="text" name="lfkdfw" value="${dltj.lfkdfw }"></td>
						<td><input type="text" name="dlcd" value="${dltj.dlcd }"></td>
						<td><input type="text" name="dlmj" value="${dltj.dlmj }"></td>
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
						<td><input type="text" name="aadt" value="${dltj.aadt }"></td>
						<td><input type="text" name="jtldj" value="${dltj.jtldj }"></td>
						<td><input type="text" name="glfl" value="${dltj.glfl }"></td>
						<td><input type="text" name="yhdw" value="${dltj.yhdw }"></td>
						<td><input type="text" name="jzny" value="${dltj.jzny }"></td>
						<td><input type="text" name="cxdlmhd" value="${dltj.cxdlmhd }"></td>
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
						<td><input type="text" name="cxdjclx" value="${dltj.cxdjclx }"></td>
						<td><input type="text" name="cxdjchd" value="${dltj.cxdjchd }"></td>
						<td><input type="text" name="cxdcds" value="${dltj.cxdcds }"></td>
						<td><input type="text" name="cxdtxfx" value="${dltj.cxdtxfx }"></td>
						<td><input type="text" name="cxdkdfw" value="${dltj.cxdkdfw }"></td>
						<td><input type="text" name="zfjdcdkd" value="${dltj.zfjdcdkd }"></td>
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
						<td><input type="text" name="yfjdcdkd" value="${dltj.yfjdcdkd }"></td>
						<td><input type="text" name="ywgjzycd" value="${dltj.ywgjzycd }"></td>
						<td><input type="text" name="cslx" value="${dltj.cslx }"></td>
						<td><input type="text" name="cscd" value="${dltj.cscd }"></td>
						<td><input type="text" name="pslx" value="${dltj.pslx }"></td>
						<td><input type="text" name="pscd" value="${dltj.pscd }"></td>
					</tr>
					<tr>
					  	<th>审核人</th>
					  	<th>制表人</th>
					  	<th>制表日期</th>
					  	
					  </tr>
					 <tr>
					   <td><input type="text" name="shr" value="${dltj.shr }"></td>
						<td><input type="text" name="zbr" value="${dltj.zbr }"></td>
						<td><input type="text" name="zbrq" value="${dltj.zbrq }"></td>
						
					</tr>
					<tr>
						<td colspan="1" style="text-align: center;vertical-align: middle!important;">
						<button  type="submit" class="btn btn-primary" >确认修改</button>
						</td>
						
						<td colspan="1" style="text-align: center;vertical-align: middle!important;">
						<a href="${pageContext.request.contextPath }/DltjServelet?cmd=dltjList">
						<button  type="button" class="btn btn-primary" >返回</button>
						</a>
						</td>
					</tr>
				
				</thead>
				</table>
					<tr>
						<td colspan="1" style="text-align: center;vertical-align: middle!important;">
						<button type="button" class="btn btn-success" onClick="location.href='dltj.jsp'">返回</button>
						</td>
					</tr>
				<tbody>
			</div>
		</form>
	</c:forEach>
</body>
</html>