<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hovanhuecold
  Date: 25/04/2021
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Employe</title>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.24/css/jquery.dataTables.css">
    <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.js"></script>
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
    <h1>List Employee</h1>
</center>
<table class="display" id="employee">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Full Name</th>
        <th scope="col">Birthday</th>
        <th scope="col">Id Card</th>
        <th scope="col">Salary</th>
        <th scope="col">Phone number</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
        <th scope="col">Position</th>
        <th scope="col">Education Degree</th>
        <th scope="col">Division</th>
        <th scope="col">Username</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach var="employee" items="${listEmployee}">
            <tr>
                <c:out value=""></c:out>
                <td><c:out value="${employee.employeeId}"></c:out></td>
                <td><c:out value="${employee.employeeName}"></c:out></td>
                <td><c:out value="${employee.employeeBirthday}"></c:out></td>
                <td><c:out value="${employee.employeeIDCard}"></c:out></td>
                <td><c:out value="${employee.employeeSalary}"></c:out></td>
                <td><c:out value="${employee.employeePhone}"></c:out></td>
                <td><c:out value="${employee.employeeEmail}"></c:out></td>
                <td><c:out value="${employee.employeeAddress}"></c:out></td>
                <td><c:out value="${employee.employeeEducationDegree}"></c:out></td>
                <td><c:out value="${employee.employeePosition}"></c:out></td>
                <td><c:out value="${employee.employeeDivision}"></c:out></td>
                <td><c:out value="${employee.userName}"></c:out></td>
                <td><a class="btn btn-outline-secondary" href="/editE">Edit</a></td>
                <td><a class="btn btn-danger" href="deleteE?id=${employee.employeeId}" >Delete</a></td>
<%--                <td><a class="btn btn-danger" href="#" onclick="employeeSetId('${employee.employeeId}','${employee.employeeName}')"--%>
<%--                data-toggle="modal" data-target="#deleteModal">Delete</a></td>--%>
            </tr>
        </c:forEach>
    </tbody>
</table>
<script>
    $(document).ready( function () {
        $('#employee').DataTable();
    } );
</script>
<!--
<form action="/deleteE" method="get" id="deleteEmployee">
    <input type="hidden" name="id" value="delete">
    <input type="hidden" name="idEmployee" id="idEmployee">
</form>

<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <input type="text" id="modelId" size="50" disabled style="border: none;background: white">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" onclick="submitDelete()">Delete</button>
            </div>
        </div>
    </div>
</div>

<script>
    function employeeSetId(id, name) {
        document.getElementById("idEmployee").value = id;
        document.getElementById("modelId").value = "Do you want delete customer name: " + name;
    }

    function submitDelete() {

        document.getElementById("deleteEmployee").submit();
    }
</script>
<script>
    $(document).ready(function () {
        $('#customer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        })
    })
</script>
-->
</body>
</html>
