<!DOCTYPE html>
<html>
<head>
    <title>Zagrebnev</title>
</head>
<body>
<h1>Alex</h1><hr>
<h4>Подробная информация о запчасти</h4>
<b> Название запчасти</b>${repair.name}<br>
<b> Описание запчасти</b>${repair.description}<br>
<hr>
<form action="/equipment/delete/${repair.id}" method="post">
    <input type="submit" value="Удалить запчасть"/>
</form>
</body>
</html>