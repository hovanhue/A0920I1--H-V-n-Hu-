<%--
  Created by IntelliJ IDEA.
  User: hovanhuecold
  Date: 25/04/2021
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customer</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js">
    </script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

</head>
<body>
<nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
    <div class="container-fluid">
        <a class="navbar-branch" href="/index.jsp">
            <img src="./view/img/0.png" height="50px">
        </a>
        <button class="navbar-toggler" type="button" data-toggler="collapse"
                data-target="#navbarResponsive">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="/index.jsp">Home</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggler" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Employee
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="/createE">Add new employee</a>
                            <a class="dropdown-item" href="/listE">List Employee</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                    </a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggler" href="#" id="navbarDropdown1" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Customer
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown1">
                            <a class="dropdown-item" href="/createC">Add new Customer</a>
                            <a class="dropdown-item" href="/listC">List Customer</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                    </a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggler" href="#" id="navbarDropdown2" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Service
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown2">
                            <a class="dropdown-item" href="/createS">Add new Service</a>
                            <a class="dropdown-item" href="/listS">List Service</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                    </a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggler" href="#" id="navbarDropdown3" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Contract
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown3">
                            <a class="dropdown-item" href="/createCt">Add new contract</a>
                            <a class="dropdown-item" href="/listCt">List Contract</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                    </a>
                </li>
                <li>
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
                </li>
            </ul>
        </div>
    </div>
</nav>

<center>
    <h1>LIST EMPLOYEE</h1>
</center>
<table id="customer" class="table table-striped">
    <thead>
    <tr>
        <th scope="col">ID Customer</th>
        <th scope="col">Customer Type ID</th>
        <th scope="col">Full Name</th>
        <th scope="col">Birthday</th>
        <th scope="col">Gender</th>
        <th scope="col">IdCard</th>
        <th scope="col">Phone Number</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach var="customer" items="${listCustomer}">
            <tr>
                <td><c:out value="${customer.customerId}"></c:out></td>
                <td><c:out value="${customer.customerTypeId}"></c:out></td>
                <td><c:out value="${customer.customerName}"></c:out></td>
                <td><c:out value="${customer.customerBirthday}"></c:out></td>
                <td><c:out value="${customer.customerGender}"></c:out></td>
                <td><c:out value="${customer.customerIDCard}"></c:out></td>
                <td><c:out value="${customer.customerPhone}"></c:out></td>
                <td><c:out value="${customer.customerEmail}"></c:out></td>
                <td><c:out value="${customer.customerAddress}"></c:out></td>
                <td><a c class="btn btn-outline-secondary" href="/editC">Edit</a></td>
                <td><a class="btn btn-danger" href="/deleteC?id=${customer.customerId}">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<script>
    $(document).ready( function () {
        $('#contract').DataTable();
    } );
</script>
</body>
</html>
