<%--
  Created by IntelliJ IDEA.
  User: hovanhuecold
  Date: 25/04/2021
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new customer</title>
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
        <a class="navbar-branch" href="/list">
            <img src="./view/img/0.png" height="50px">
        </a>
        <button class="navbar-toggler" type="button" data-toggler="collapse"
                data-target="#navbarResponsive">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="#">Home</a>
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
    <h1>CREATE NEW CUSTOMER</h1>
</center>
<form action="/createC" method="post">
    <div class="form-col">
        <div class="row-fluid">
            <label for="inputIdCustomer">ID</label>
            <input type="text" class="form-control" id="inputIdCustomer" name="idCustomer" required>
        </div>
        <div class="row-fluid">
            <label>ID Customer Type</label>
            <select name="idCustomerType" class="form-control">
                <option value=""></option>
                <option value="1">Diamond</option>
                <option value="2">Platinium</option>
                <option value="3">Gold</option>
                <option value="4">Silver</option>
                <option value="5">Member</option>
            </select>
        </div>
        <div class="row-fluid">
            <label for="inputNameCustomer">Full Name</label>
            <input type="text" class="form-control" id="inputNameCustomer" name="nameCustomer" required>
        </div>
        <div class="row-fluid">
            <label for="inputBirthDayCustomer">Birth day</label>
            <input type="text" class="form-control" id="inputBirthDayCustomer" name="birthdayCustomer" required>
        </div>
        <div class="row-fluid">
            <label>Gender</label>
            <select name="genderCustomer" class="form-control">
                <option value=""></option>
                <option value="0">Male</option>
                <option value="1">Female</option>
            </select>
        </div>
        <div class="row-fluid">
            <label for="inputIdCardCustomer">ID Card</label>
            <input type="text" class="form-control" id="inputIdCardCustomer" name="idcardCustomer" required>
        </div>
        <div class="row-fluid">
            <label for="inputPhoneCustomer">Phone Number</label>
            <input type="number" class="form-control" id="inputPhoneCustomer" name="phoneCustomer" required>
        </div>
        <div class="row-fluid">
            <label for="inputEmailCustomer">Email</label>
            <input type="email" class="form-control" id="inputEmailCustomer" name="emailCustomer" required>
        </div>
        <div class="row-fluid">
            <label for="inputAddressCustomer">Address</label>
            <input type="text" class="form-control" id="inputAddressCustomer" name="addressCustomer" required>
        </div>
    </div>

    <button class="btn btn-primary" type="submit">Submit</button>
</form>
</body>
</html>