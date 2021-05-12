<%--
  Created by IntelliJ IDEA.
  User: hovanhuecold
  Date: 12/05/2021
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>create customer</title>
</head>
<body>
<form action="/create" method="post">
    <div>
        <label for="inputId">ID</label>
        <input type="text" id="inputId">
    </div>
    <div>
        <label for="inputName">Name</label>
        <input type="text" id="inputName">
    </div>
    <div>
        <label for="inputEmail">Email</label>
        <input type="text" id="inputEmail">
    </div>
    <div>
        <label for="inputAddress">Address</label>
        <input type="text" id="inputAddress">
    </div>
    <input type="submit" value="Create">
</form>
<p><a href="/list"><i>back to list</i></a></p>
</body>
</html>
