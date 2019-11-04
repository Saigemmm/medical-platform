<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<title>用户登录</title>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="css/component.css" />
<!--[if IE]>
<script src="js/html5.js"></script>
<![endif]-->
</head>
<body>
		<div class="container demo-1">
			<div class="content">
				<div id="large-header" class="large-header">
					<canvas id="demo-canvas"></canvas>
					<div class="logo_box">
						<h1><span style="color:red">欢迎</span></h1>
<form action="user_doLogin.action" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td>
					<input type="text" name="userName" />
				</td>
			</tr>
			<tr>
				<td>密码：</td>
				<td>
					
					<input type="password" name="password" />
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="登录" />
				</td>
			</tr>
		</table>
		<div class="mb2"><a class="act-but submit" href="user_toRegister.action" style="color: #FFFFFF">注册</a></div>					
	</form>
					</div>
				</div>
			</div>
		</div><!-- /container -->
		<script src="js/TweenLite.min.js"></script>
		<script src="js/EasePack.min.js"></script>
		<script src="js/rAF.js"></script>
		<script src="js/demo-1.js"></script>
		<div style="text-align:center;"></div>
	</body>
</html>