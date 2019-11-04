<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="style.css" rel="stylesheet" type="text/css" />
<title>搜索结果</title>
</head>
<body background="apic1045.jpg">
  <div id="topmenu">
    <ul>
      <li><a href="index.jsp">返回首页</a></li>
    </ul>
  </div>
<h2 align="center">搜索结果</h2>
<hr/>
<form action="solution_search.action" method="post" align="center">
		搜索产品：<s:textfield name="key" size="50"></s:textfield>
		<input type="submit" value="go" />
	</form>
<div align="center">	
<s:iterator value="#request.goodsList">
<h2><s:property value="exampleName"/></h2>
<img alt="<s:property value="exampleName"/>" title="<s:property value="exampleName"/>" src="img/<s:property value="goodsImg"/>" width="500"/>
<br/><br/>
<h3><s:property value="exampleDesc"/></h3>
<hr/>
</s:iterator>
</div>
</body>
</html>