<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                            <tr>
                                <td>К доставке</td>
                                <td>НЗ-89399</td>
                                <td>1.04.2023</td>
                                <td>17.04.2023</td>
                                <td>ООО "Рога и Копыта"</td>
                                <td>ООО "Пятерочка"</td>
                                <td>К892СК116 (Hyinday Solaris)</td>
                                <td>Егоров А.Ю.</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="content-orders-base-filters">
                <h2 class="orders-headers">Отбор</h2>
                <form method="post" class="orders-filter-form">
                    <div class="orders-filter-form-item">
                        <b>Дата отгрузки</b>
                        <br>
                        <br>
                        <label class="period">
                            <input type="date" name="shipmentDateStart" />
                            <span> - </span>
                            <input type="date" name="shipmentDateEnd"/>
                        </label>
                    </div>
                    <div class="orders-filter-form-item">
                        <b>Организация (содержит) </b>
                        <br>
                        <br>
                        <label class="orders-filter-single">
                            <input type="text" name="organization"/>
                        </label>
                    </div>

                    <div class="orders-filter-form-item">
                        <b>Клиент (содержит) </b>
                        <br>
                        <br>
                        <label class="orders-filter-single">
                            <input type="text" name="client"/>
                        </label>
                    </div>

                    <div class="orders-filter-form-item">
                        <b>Автомобиль (содержит) </b>
                        <br>
                        <br>
                        <label class="orders-filter-single">
                            <input type="text" name="car"/>
                        </label>
                    </div>

                    <input id="filter-button" type="submit" value="Применить"/>
                </form>
            </div>
        </div>
    </body>
</html>
