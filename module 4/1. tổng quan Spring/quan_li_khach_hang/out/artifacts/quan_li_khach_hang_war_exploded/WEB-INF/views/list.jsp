<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Title</title>
</head>
<body>
    <center>
        <h1>List All Customer</h1>
        <h3>
            <a href="/create"><i>add new customer</i></a>
        </h3>
    </center>
    <table>
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="customer" items="listCus">
            <tr>
                <td><c:out value="${customer.id}"></c:out></td>
                <td><c:out value="${customer.name}"></c:out></td>
                <td><c:out value="${customer.email}"></c:out></td>
                <td><c:out value="${customer.address}"></c:out></td>
                <td>
                    <a href="/delete/<c:out value='${customer.id}'></c:out>" class="btn btn-danger">Delete</a>|
                    <a href="/edit" class="btn btn-second">Edit</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
