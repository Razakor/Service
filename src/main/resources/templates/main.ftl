<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
    <body>
    <form method="post">
        <input type="text" name="text" placeholder="Введите сообщение" />
        <input type="text" name="tag" placeholder="Тэг">
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button type="submit">Добавить</button>
    </form>
        ${msg}
    </body>
</html>