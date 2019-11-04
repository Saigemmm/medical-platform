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
      <p class="fl1 p1"><span style="color:black">健康信息录入</span></p>
	  </div>
      <p class="fr1 p2"><i class="i14 fl1"><img src="images/zxphone.png" alt=""></i><span class="fl1" style="color:red">咨询电话：4444-5555</span><i class="fl1 i15"><img src="images/shuzi.png" alt=""></i></p>
    </div>
    <div class="wantConsult_btm clear">
      <div class="wantConsult_btm_left fl1">
      </div>
      <div class="wantConsult_btm_right fr1">
        <form action="infor_submitInfor.action" class="form fl1">
          <textarea name="userInforName" id="areaCont" cols="30" rows="10" placeholder="请输入您的健康信息"></textarea>
          <p class="input_p clear"> <span class="span1 fl1" style="letter-spacing:10px;">体测</span>
            <input type="text" maxlength="5" name="inforType"  class="txt" >
            <font class="fr1">性别 <span class="radio_box">
            <input type="radio" id="radio_1" name="radio" checked="checked">
            <label for="radio_1"></label>
            <em>男</em> </span> <span class="radio_box">
            <input type="radio" id="radio_2" name="radio" >
            <label for="radio_2"></label>
            <em>女</em> </span> </font> </p>
          <p class="input_p clear"> <span class="span1 fl1" style="letter-spacing:0px;">结果</span>
            <input type="text"  name="medicalResult" id="mobile" maxlength="11"  class="txt">
          </p>
          <p class="sub_ziXun">
            <input id="tijiaoliuyan" class="btn" type="submit" value="提交" >
          </p>
        </form>
        <div class="select_yixiang fr1">
          <p class="jiao"></p>
          <p class="ninTitle">您可以根据意向选择下列 <em>[快捷录入]</em></p>
          <ul>
            <li><a href="javascript:void(0)" title="项目很好，请尽快联系我详谈。">多年患有慢性支气管炎，总是反复发热。</a></li>
            <li><a href="javascript:void(0)" title="请问我所在的地区有加盟商了吗？">感冒，最近经常恶心并且头伴随着一阵眩晕。</a></li>
            <li><a href="javascript:void(0)" title="留下邮箱，请将详细资料邮件给我。">脑供血不足，经常眩晕</a></li>
            <li><a href="javascript:void(0)" title="想了解的加盟流程，请与我联系！">自觉寒冷，同时伴有提问升高</a></li>
            <li><a href="javascript:void(0)" title="做为的代理加盟商能得到哪些支持？">日间出汗，活动尤甚</a></li>
            <li><a href="javascript:void(0)" title="请问投资所需要的费用有哪些？">一般进食后痛势加重</a></li>
            <li><a href="javascript:void(0)" title="我想加盟，请电话联系我。">不易入睡，睡后易醒或彻夜不眠</a></li>
            <li><a href="javascript:void(0)" title="加盟，有什么优惠？">食少呐呆，兼见消瘦乏力</a></li>
          </ul>
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