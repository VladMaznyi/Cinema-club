<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 28.11.2017
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>

<html>
<head>
    <title>Welcome page</title>
    <link rel="stylesheet" href="../Styles/header.css">
    <link rel="stylesheet" href="../Styles/registration.css">

</head>
<body>
<header>
    <img src="../images/Emblem.png" width="223" height="140" class="emblem">
    <h1>Онлайн-диск</h1>
    <nav>
        <ul>
            <li><a href="registration.jsp">Регистрация</a></li>
            <li><a href="login.jsp">Авторизация</a></li>
        </ul>
    </nav>
</header>
<aside id="col1"></aside>
<div id="form">
    <h1>Авторизация пользователя</h1>
    <form class="registration" method="post" action="/loginServlet">
        <h2><c:out value="${requestScope.error}"/></h2>
        <h2><c:out value="${requestScope.event}"/></h2>
        <p>
            <label class="label" name="login">Введите логин</label>
            <input class="none" type="text" name="login" id="login">
        </p>
        <p>
            <label class="label" name="password">Введите пароль</label>
            <input class="none" type="password" name="password" id="password">
        </p>
        <P>
            <input type="submit" value="Отправить">
        </P>
    </form>
</div>
<aside id="col2"></aside>
<script src="../scripts/no_send_val.js"></script>
</body>
</html>