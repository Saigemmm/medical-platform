<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
<meta charset="utf-8">
<title>information</title>
<link href="style.css" rel="stylesheet" type="text/css" />
<link href="css/reset.css" rel="stylesheet" type="text/css">
<link href="css/style.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />

<script src="js/jquery-1.8.2.min.js" type="text/javascript"></script>
</head>
<body background="apic1045.jpg">
  <div id="topmenu">
    <ul>
      <li><a href="index.jsp">返回首页</a></li>
    </ul>
  </div>
<!-- 我要咨询 -->
<div class="wantConsult" style="text-align:center;">
  <div class="wrap_mar" style="text-align:center;">
    <div class="zxTitle clear" style="text-align:center;">
      <div align="center">	
      <p class="fl1 p1"><span style="color:black">健康信息</span></p>
	  </div>
      <p class="fr1 p2"><i class="i14 fl1"><img src="images/zxphone.png" alt=""></i><span class="fl1" style="color:red">咨询电话：4444-5555</span><i class="fl1 i15"><img src="images/shuzi.png" alt=""></i></p>
    </div>
    <div class="wantConsult_btm clear">
      <div class="wantConsult_btm_left fl1">
      </div>
      <div class="wantConsult_btm_right fr1">
      <div class="container body-content">
      <div class="panel panel-default">
        <form action="" class="form fl1">
        <table class="table table-hover table-striped" style="font-size:30px">
        <tr>
			<td style=" color:#F00;">症状描述：</td>
		</tr>
		<tr>
			<td style=" color:#F00;">${userInfor.userInforName }</td>
		</tr>
		<tr>
			<td style=" color:#F00;">体测结果：</td>
		</tr>
		    <td style=" color:#F00;">${userInfor.inforType }</td>
		<tr>
		    <td style=" color:#F00;">医疗结果：</td>
		</tr>
		<tr>
		    <td style=" color:#F00;">${userInfor.medicalResult }</td>
		</tr>
		<tr>
		</tr>
        </table>
        </form>
        </div>
        </div>
      </div>
    </div>
  </div>
</div>

<script type="text/javascript"> 
		 $(".select_yixiang ul li a").each(function(){
		 	$(this).click(function(){
		 		var text=$(this).text();
		 		$("#areaCont").val(text)
		 	})
		 })
</script> 
<!-- 我要咨询 E--> 
<div style="text-align:center;">
</div>
</body>
</html>