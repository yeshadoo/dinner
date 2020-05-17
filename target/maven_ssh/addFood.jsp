<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>新增餐品</title>

</head>

<body>
<h1><font color="red">请输入要新增餐品的信息：</font></h1>

<s:form action="saveFood.action">
    <s:textfield name="food.name" label="餐品名称"></s:textfield>
    <s:textfield name="food.price" label="餐品价钱"></s:textfield>
    <s:textfield name="food.category_id" label="餐品类别"></s:textfield>
    <s:submit></s:submit>
</s:form>

</body>
</html>