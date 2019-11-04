<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link href="style.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<title>Persional detail</title>
</head>
<body background="apic1045.jpg">
  <div id="topmenu">
    <ul>
      <li><a href="index.jsp">返回首页</a></li>
    </ul>
  </div>
<h2 style=" color:#F00;">个人中心</h2>
	<hr/>  
<div class="container body-content">
<div class="panel panel-default">
	
	<table class="table table-hover table-striped" style="font-size:27px">
		<tr>
			<td style=" color:#F00;">账号：</td>
			<td style=" color:#F00;">${loginedUser.userName }</td>
		</tr>
		<tr>
			<td style=" color:#F00;">真实姓名：</td>
			<td style=" color:#F00;">${loginedUser.realName }</td>
		</tr>
		<tr>
			<td style=" color:#F00;">电话：</td>
			<td style=" color:#F00;">${loginedUser.phoneNumber }</td>
		</tr>
		<tr>
			<td style=" color:#F00;">Email：</td>
			<td style=" color:#F00;">${loginedUser.email }</td>
		</tr>
		<tr>
			<td style=" color:#F00;">地址：</td>
			<td style=" color:#F00;">${loginedUser.address }</td>
		</tr>
		<tr>
		    <td style=" color:#F00;">已购产品名称:</td>
		    <td style=" color:#F00;"><%=session.getAttribute("productName")%></td>
		</tr>
		<tr style=" color:#F00;">
		    <td>已购产品价格:</td>
		    <td><%=session.getAttribute("price")%></td>
		</tr>
		<tr style=" color:#F00;">
		   <td>账户号码:</td>
		   <td><%=session.getAttribute("accountId")%></td>
		</tr>
		<tr style=" color:#F00;">
		   <td>银行卡类型:</td>
		   <td><%=session.getAttribute("bankType")%></td>
		</tr>
		<tr style=" color:#F00;">
		   <td>身体健康情况:</td>
		   <td><%=session.getAttribute("inforName")%></td>
		</tr>
		<tr style=" color:#F00;">
		   <td>体检结果:</td>
		   <td><%=session.getAttribute("medicalResult")%></td>
		</tr>
		<tr style=" color:#F00;">
			<td colspan="2">
				<a href="user_toEditProfile.action">修改资料</a>
			</td>
		</tr>
	</table>  
</div>
</div>	
</body>
</html>