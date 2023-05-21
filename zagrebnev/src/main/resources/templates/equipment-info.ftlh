<!DOCTYPE html>
<html>
<head>
    <title>Zagrebnev</title>
</head>
<body>
<h1>Alex</h1><hr>
<h4>Подробная информация об оборудовании</h4>
<b> Название оборудования</b>${equipment.title}<br>
<b> Описание оборудования</b>${equipment.description}<br>
<b> Автор Оборудования</b>${equipment.author}<br>
<b> Город Оборудования</b>${equipment.city}<br>
<hr>
<form action="/equipment/delete/${equipment.id}" method="post">
    <input type="submit" value="Удалить оборудование"/>
</form>
</body>
</html>