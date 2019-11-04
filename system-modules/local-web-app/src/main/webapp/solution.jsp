<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="style.css" rel="stylesheet" type="text/css" />
<title>产品大全</title>
</head>
<body background="apic1045.jpg">
  <div id="topmenu">
    <ul>
      <li><a href="index.jsp">返回首页</a></li>
    </ul>
  </div>
<h1 align="center">示例大全</h1>
<hr/>
	<form action="solution_search.action" method="post" align="center">
		搜索产品：<s:textfield name="key" size="50"></s:textfield>
		<input type="submit" value="go" />
	</form>
<div align="center">	
<s:iterator value="#request.goodsList">
<h2><s:property value="exampleName"/></h2>
<img alt="<s:property value="exampleName"/>" title="<s:property value="exampleName"/>" src="img/<s:property value="goodsImg"/>" width="700"/>
<br/><br/>
<h3><s:property value="exampleDesc"/></h3>
<hr/>
<h2>
</s:iterator>
<s:if test="pageNum>1">
	<a href="?pageNum=<s:property value="pageNum-1"/>&pageSize=<s:property value="pageSize"/>">上一页</a>&nbsp;
</s:if>
<s:if test="pageNum<#request.pageCount">
	<a href="?pageNum=<s:property value="pageNum+1"/>&pageSize=<s:property value="pageSize"/>">下一页</a>&nbsp;
</s:if>
</h2>
<h2>
<s:iterator begin="1" end="#request.pageCount" var="i">
	[<s:if test="#i==pageNum">
		<span style="color:red;"><s:property/></span>
	</s:if>
	<s:else>
		<a href="?pageNum=<s:property/>&pageSize=<s:property value="pageSize"/>"><s:property/></a>
	</s:else>]
</s:iterator>
</h2>
<hr/>
</div>
</body>
</html>