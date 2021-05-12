<%--
  Created by IntelliJ IDEA.
  User: hovanhuecold
  Date: 24/04/2021
  Time: 04:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new employee</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js">
    </script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="./view/css/style.css">
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
    <h1>CREATE NEW EMPLOYEE</h1>
</center>
<form action="/createE" method="post">
    <div class="form-col">
        <div class="row-fluid">
            <label for="inputIdEmployee">ID</label>
            <input type="text" class="form-control" id="inputIdEmployee" name="idEmployee" required>
        </div>
        <div class="row-fluid">
            <label for="inputNameEmployee">Full Name</label>
            <input type="text" class="form-control" id="inputNameEmployee" name="nameEmployee" required>
        </div>
        <div class="row-fluid">
            <label for="inputBirthDayEmployee">Birth day</label>
            <input type="text" class="form-control" id="inputBirthDayEmployee" name="birthdayEmployee" required>
        </div>
        <div class="row-fluid">
            <label for="inputIdCardEmployee">ID Card</label>
            <input type="text" class="form-control" id="inputIdCardEmployee" name="idcardEmployee" required>
        </div>
        <div class="row-fluid">
            <label for="inputSalaryEmployee">Salary</label>
            <input type="number" class="form-control" id="inputSalaryEmployee" name="salaryEmployee" required>
        </div>
        <div class="row-fluid">
            <label for="inputPhoneEmployee">Phone Number</label>
            <input type="number" class="form-control" id="inputPhoneEmployee" name="phoneEmployee" required>
        </div>
        <div class="row-fluid">
            <label for="inputEmailEmployee">Email</label>
            <input type="email" class="form-control" id="inputEmailEmployee" name="emailEmployee" required>
        </div>
        <div class="row-fluid">
            <label for="inputAddressEmployee">Address</label>
            <input type="text" class="form-control" id="inputAddressEmployee" name="addressEmployee" required>
        </div>
        <div class="row-fluid">
            <label>Education Degree</label>
            <select name="educationDegreeEmployee" class="form-control">
                <option value=""></option>
                <option value="1">Trung Cấp</option>
                <option value="2">Cao Đẳng</option>
                <option value="3">Đại Học</option>
                <option value="4">Sau Đại Học</option>
            </select>
        </div>
        <div class="row-fluid">
            <label>Position</label>
            <select name="positionEmployee" class="form-control">
                <option value=""></option>
                <option value="1">Lễ Tân</option>
                <option value="2">Phục Vụ</option>
                <option value="3">Chuyên Viên</option>
                <option value="4">Giám Sát</option>
                <option value="5">Quản Lý</option>
                <option value="6">Giám Đốc</option>
            </select>
        </div>
        <div class="row-fluid">
            <label>Division</label>
            <select name="divisionEmployee" class="form-control">
                <option value=""></option>
                <option value="1" >Sale - Marketing</option>
                <option value="2" >Hành Chính</option>
                <option value="3" >Phục Vụ</option>
                <option value="4" >Quản Lý</option>
            </select>
        </div>
        <div class="row-fluid">
            <label for="inputUsernameEmployee">User Name</label>
            <input type="text" class="form-control" id="inputUsernameEmployee" name="usernameEmployee" required>
        </div>
    </div>

    <button class="btn btn-primary" type="submit">Submit</button>
</form>
</body>
</html>