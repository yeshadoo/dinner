<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>更新餐品</title>

</head>

<body>
<h1><font color="red">更新当前餐品信息</font></h1>

<s:form action="updateFood.action">
    <table>
        <tr>
            <td>
                <s:hidden name="food.id" value="%{food.id}"></s:hidden>
            </td>
        </tr>

        <tr>
            <td>
                <s:textfield name="food.name" value="%{food.name}" label="餐品名字"></s:textfield>
            </td>
        </tr>

        <tr>
            <td>
                <s:textfield name="food.price" value="%{food.price}" label="餐品价格"></s:textfield>
            </td>
        </tr>

        <tr>
            <td>
                <s:textfield name="food.category_id" value="%{food.category_id}" label="餐品类别"></s:textfield>
            </td>
        </tr>

        <tr>
            <td>
                <s:submit></s:submit>
            </td>
        </tr>
    </table>
</s:form>

</body>
</html>
