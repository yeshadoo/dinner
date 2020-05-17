<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <!-- 引入样式文件和动态控制 -->
    <link href="asserts/css/bootstrap.min.css" rel="stylesheet">
    <script src="asserts/js/jquery-3.2.1.min.js"></script>
    <script src="asserts/js/bootstrap.min.js"></script>
    <title>外卖系统首页</title>
</head>
<body>

<!--顶部导航栏部分-->
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" title="logoTitle" href="#">亲爱的用户，欢迎来到外卖系统首页！请挑选自己喜欢的餐品并下单吧~早下单早派送哦~~</a>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-2">
            <a href="listFood.action" class="list-group-item"><span class="glyphicon glyphicon-home"></span>餐品选购
            </a>
            <a href="#" class="list-group-item">
                <!-- 小图标样式设置 -->
                <span class="glyphicon glyphicon-search" aria-hidden="true">
                    </span>购物车</a>
            <a href="showOrder.action" class="list-group-item">
                        <span class="glyphicon glyphicon-align-left" aria-hidden="true">
                    </span>已提交订单查询</a>

        </div>
        <!--左边菜单栏-->
        <div class="col-sm-10">

            <div class="panel panel-default">
                <div class="panel-heading">
                    搜索
                </div>
                <div class="panel-body">
                    <form role="form" class="form-inline" action="findFoodByName.action?food.name=%{food.name}">
                        <div class="form-group">
                            <s:textfield name="food.name" label="名称" placeholder="请输入名称" class="form-control"></s:textfield>
                        </div>
                        <div class="form-group">
                            <label for="food.name">类别</label>
                            <select class="form-control">
                                <option>1主食</option>
                                <option>2菜品</option>
                                <option>3饮料</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-default">点击搜索</button>
                        </div>
                    </form>
                </div>
            </div>
            <!--
                列表展示
            -->
            <div class="table-responsive">
                <table class="table table-striped ">
                    <thead>
                    <tr>
                        <th>买家</th>
                        <th>餐品</th>
                        <th>状态</th>
                        <th>价钱</th>
                    </tr>
                    </thead>
                    <tbody>
                    <s:iterator value="#request.list" var="us">
                        <tr>
                            <td>
                                <s:property value="#us.uname"/>
                            </td>
                            <td>
                                <s:property value="#us.cname"/>
                            </td>
                            <td>
                            <s:property value="#us.o_status"/>
                            </td>
                            <td>
                                <s:property value="#us.o_price"/>
                            </td>
                        </tr>
                    </s:iterator>


                    </tbody>
                </table>
            </div>

        </div>
    </div>
</div>
<!-- 底部页脚部分 -->
<div class="footer">
    <p class="text-center">
        2020 &copy; hadoo
    </p>
</div>
</body>
</html>

