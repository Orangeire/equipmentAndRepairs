<!DOCTYPE html>
<html>
<head>
    <title>Zagrebnev</title>
</head>
<body>
<h1>Alex!  | <a href="/login">Войти</a></h1>
<hr>
<h4>Оборудование</h4>
<form action="/" method="get">
    поиск по названию: <input type="text" name="title"><br>
    <input type="submit" name="поиск"/>
</form>
<#list equipmentList as equipment>
    <div>
        <p><b>${equipment.title}</b> ${equipment.city} | <a href="/equipment/${equipment.id}">Подробнее...</a></p>
    </div>
</#list>
<hr>
<h3>Создать новое оборудование</h3>
<form action="/equipment/create" method="post">
    Название оборудования: <input type="text" name="title"/><br><br>
    Город оборудования: <input type="text" name="city"/><br><br>
    Автор оборудования: <input type="text" name="author"/><br><br>
    Описание оборудования: <input type="text" name="description"/><br><br>
    Запчасть 1: <input type="text" name="repair1.name"/><br><br>
    Запчасть 2: <input type="text" name="repair2.name"/><br><br>
    Запчасть 3: <input type="text" name="repair3.name"/><br><br>
    <input type="submit" value="Добавить оборудование"/>
</form>
</body>
</html>