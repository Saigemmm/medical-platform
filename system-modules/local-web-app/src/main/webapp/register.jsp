<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<title>用户注册</title>
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
<div class="mb2"><a class="act-but submit" href="index.jsp" style="color: #FFFFFF">返回主页</a></div>					
						<h1><span style="color:red">注册</span></h1>
	<s:form action="user_doRegister">
		<s:textfield name="userName" label="用户名"></s:textfield>
		<s:password name="password" label="密码"></s:password>
		<s:password name="rePass" label="确认密码"></s:password>
		<s:radio list="{'男','女'}" name="gender" label="性别" value="'男'"></s:radio>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:textfield name="address" label="地址"></s:textfield>
		<s:textfield name="birthday" label="出生日期"></s:textfield>
		<s:textfield name="realName" label="真实姓名"></s:textfield>
		<s:textfield name="phoneNumber" label="手机号码"></s:textfield>
		<s:submit value="提交"></s:submit>
	</s:form>
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