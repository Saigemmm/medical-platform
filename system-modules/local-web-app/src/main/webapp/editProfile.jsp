<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="style.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<title>修改资料</title>
</head>
<body background="apic1045.jpg">
  <div id="topmenu">
    <ul>
      <li><a href="index.jsp">返回首页</a></li>
    </ul>
  </div>
<h2 style=" color:#F00;">修改资料</h2>
<hr/>
<div class="container body-content">
<div class="panel panel-default">
<form action="user_doEditProfile.action" method="post">
	<table class="table table-hover table-striped" style="font-size:27px" >
		<tr style=" color:#F00;">
			<td>账号：</td>
			<td>
			<s:property value="#session.loginedUser.username"/>
			</td>
		</tr>
		<tr style=" color:#F00;">
			<td>真实姓名：</td>
			<td><s:property value="#session.loginedUser.realName"/></td>
		</tr>
		<tr >
			<td style=" color:#F00;">电话：</td>
			<td>
				<input type="text" name="phoneNumber" value="<s:property value="#session.loginedUser.phoneNumber"/>" />
			</td>
		</tr>
		<tr >
			<td style=" color:#F00;">地址：</td>
			<td>
				<input type="text" name="address" value="<s:property value="#session.loginedUser.address"/>" />
			</td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="提交" /></td>
		</tr>
		<tr style=" color:#F00;">
			<td></td>
			<td></td>
		</tr>
		<tr style=" color:#F00;">
			<td></td>
			<td></td>
		</tr>
	</table>
</form>
</div>
</div>
</body>
</html>