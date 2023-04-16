<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title>Главная</title>
        <link href="<c:url value="/resources/static/css/style.css"/>" rel="stylesheet"/>
        <script src="<c:url value="/resources/static/js/orders.js"/>"></script>
    </head>
    <body>
        <div class="home-categories-box">
            <div class="general-header">
                PET<br>
                LOGISTIC
            </div>
            <a class="home-categories-box-item" href="/orders">
                <div class="home-categories-box-item-header">
                    <div class="categories-logos-parent">
                        <img class="categories-logos" src="<c:url value="/resources/static/img/orders.png"/>"/>
                    </div>
                    <h2>Заказы</h2>
                </div>
            </a>
            <a href="/orders" class="home-categories-box-item home-categories-box-item-selected">
                <div class="home-categories-box-item-header">
                    <div class="categories-logos-parent">
                        <img class="categories-logos" src="<c:url value="/resources/static/img/routes.png"/>"/>
                    </div>
                    <h2>Маршруты</h2>
                </div>
            </a>
            <div class="home-categories-box-item">
                <div class="home-categories-box-item-header">
                    <div class="categories-logos-parent">
                        <img class="categories-logos" src="<c:url value="/resources/static/img/searching.png"/>"/>
                    </div>
                    <h3>Отслеживание</h3>
                </div>
            </div>
            <div class="home-categories-box-item">
                <div class="home-categories-box-item-header">
                    <div class="categories-logos-parent">
                        <img class="categories-logos" src="<c:url value="/resources/static/img/settings.png"/>"/>
                    </div>
                    <h2>Настройки</h2>
                </div>
            </div>
            <div class="content-login-logout">
                <h4>Logist</h4>
                <div class="content-header-item">
                    Выйти             
                </div>
                <!-- <img class="content-header-logout" src="img/logout.png" alt="Выйти"/> -->
            </div>
            
        </div>
        <div class="content-base">

        </div>
    </body>
</html>
