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
    <title>管理员后台</title>
    <script type="text/javascript">
        function del(){
            if(confirm("确定拒绝买家订单?")){
                return true;
            }
            return false;
        }
    </script>

</head>
<body>

<!--顶部导航栏部分-->
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <img src="asserts/img/a.jpg" class="img-thumbnail" style="height: 30px;" />
            <a class="navbar-brand" title="logoTitle" href="manager.jspmana">管理员后台</a>
        </div>
    </div>
</nav>


<div class="container-fluid">
    <div class="row">
        <div class="col-sm-2">
            <a href="manager_listFood.action" class="list-group-item "><span class="glyphicon glyphicon-home"></span>餐品维护
            </a>
            <a href="addFood.jsp" class="list-group-item">
                        <span class="glyphicon glyphicon-align-left" aria-hidden="true">
                    </span>餐品新增</a>
            <a href="showUserByRole.action?user.role_id=1" class="list-group-item">
                <!-- 小图标样式设置 -->
                <span class="glyphicon glyphicon-search" aria-hidden="true">
                    </span>买家查询</a>
            <a href="showUserByRole.action?user.role_id=2" class="list-group-item">
                        <span class="glyphicon glyphicon-align-left" aria-hidden="true">
                    </span>管理员查询</a>
            <a href="" class="list-group-item">
                        <span class="glyphicon glyphicon-camera" aria-hidden="true">
                    </span>订单管理</a>
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
                            <label for="name">名称</label>
                            <input type="text" class="form-control" id="name" placeholder="请输入名称">
                        </div>
                        <div class="form-group">
                            <label for="name">类别</label>
                            <select class="form-control">
                                <option>1主食</option>
                                <option>2菜品</option>
                                <option>3饮料</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-default">开始搜索</button>
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
                        <th>处理</th>
                    </tr>
                    </thead>
                    <tbody>
                    <s:iterator value="#request.list_order" var="us">
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
                            <td>
                                <div class="btn-group">
                                    <a href="updateOrder.action?order.id=<s:property value="#us.id"/>&order.o_status=接受" method="post" class="btn-info">接受</a>
                                    <a href="updateOrder.action?order.id=<s:property value="#us.id"/>&order.o_status=拒绝" method="post" class="btn-danger" onclick="return del()">拒绝</a>
                                </div>

                            </td>
                        </tr>
                    </s:iterator>


                    </tbody>
                </table>
            </div>


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

