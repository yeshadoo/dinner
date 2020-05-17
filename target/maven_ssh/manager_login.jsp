<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>外卖交易系统登录注册页面</title>
    <!-- Bootstrap core CSS -->
    <link href="asserts/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="asserts/css/signin.css" rel="stylesheet">
</head>

<body class="text-center">
<form class="form-signin" action="manager_login.action">
    <img class="mb-4" src="asserts/img/a.jpg" alt="" width="72" height="72">
    <h5 class="h3 mb-3 font-weight-normal">管理员登录</h5>
    <label class="sr-only">Username</label>
    <input type="text" class="form-control" placeholder="用户名" required="" autofocus="" name="username">
    <label class="sr-only">Password</label>
    <input type="password" class="form-control" placeholder="密码" required="" name="password">
    <div class="checkbox mb-3">
        <label>
            <input type="checkbox" value="remember-me"> 记住密码
        </label>
    </div>
    <span class="S_txt2">想要成为管理员？</span><a target="_blank" href='manager_reg.jsp'/>立即注册!
    <button class="btn btn-sm btn-primary btn-block" type="submit">登录</button>
</form>

</body>
</html>