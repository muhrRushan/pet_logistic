<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Главная</title>
        <link href="<c:url value="/resources/static/css/style.css"/>" rel="stylesheet"/>
    </head>
    <body>
        <div class="home-categories-box">
            <div class="general-header">
                PET<br>
                LOGISTIC
            </div>
            <div class="home-categories-box-item home-categories-box-item-selected">
                <div class="home-categories-box-item-header">
                    <div class="categories-logos-parent">
                        <img class="categories-logos" src="<c:url value="/resources/static/img/orders.png"/>"/>
                    </div>
                    <h2>Заказы</h2>
                </div>
            </div>
            <div class="home-categories-box-item">
                <div class="home-categories-box-item-header">
                    <div class="categories-logos-parent">
                        <img class="categories-logos" src="<c:url value="/resources/static/img/routes.png"/>"/>
                    </div>
                    <h2>Маршруты</h2>
                </div>
            </div>
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
            <div class="content-orders-base">
                <div class="content-orders-base-table">
                    <h2 class="orders-headers">Заказы клиентов</h2>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Статус</th>
                                <th>Номер</th>
                                <th>Дата</th>
                                <th>Дата отгрузки</th>
                                <th>Организация</th>
                                <th>Клиент</th>
                                <th>Автомобиль</th>
                                <th>Водитель</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="order" items="${orders}">
                                <tr>
                                    <td>${order.status}</td>
                                    <td>${order.number}</td>
                                    <td>${order.date}</td>
                                    <td>${order.shipment_date}</td>
                                    <td>${order.organization}</td>
                                    <td>${order.client}</td>
                                    <td>${order.route.car}</td>
                                    <td>${order.route.driver}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="content-orders-base-filters">
                <h2 class="orders-headers">Отбор</h2>
                <form:form method="post" class="orders-filter-form" modelAttribute="filter" action="/orders">
                    <div class="orders-filter-form-item">
                        <b>Дата отгрузки</b>
                        <br>
                        <br>
                        <label class="period">
                            <form:input type="date" path="shipmentDateBegin"/>
                            <span> - </span>
                            <form:input type="date" path="shipmentDateEnd"/>
                        </label>
                    </div>
                    <div class="orders-filter-form-item">
                        <b>Организация (содержит) </b>
                        <br>
                        <br>
                        <label class="orders-filter-single">
                            <form:input type="text" path="organizationViewPart"/>
                        </label>
                    </div>

                    <div class="orders-filter-form-item">
                        <b>Клиент (содержит) </b>
                        <br>
                        <br>
                        <label class="orders-filter-single">
                            <form:input type="text" path="clientViewPart"/>
                        </label>
                    </div>

                    <div class="orders-filter-form-item">
                        <b>Автомобиль (содержит) </b>
                        <br>
                        <br>
                        <label class="orders-filter-single">
                            <form:input type="text" path="carViewPart"/>
                        </label>
                    </div>

                    <input id="filter-button" type="submit" value="Применить"/>
                </form:form>
            </div>
        </div>
    </body>
</html>
