<%--
  Created by IntelliJ IDEA.
  User: hovanhuecold
  Date: 23/04/2021
  Time: 23:59
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

</head>
<body>
    <h1 style="align-content: center">CREATE NEW EMPLOYEE</h1>
    <form action="/save" method="post">
        <div class="form-col">
            <div class="row-fluid">
                <label for="inputId">ID</label>
                <input type="text" class="form-control" id="inputId" name="id" required>
            </div>
            <div class="row-fluid">
                <label for="inputName">Full Name</label>
                <input type="text" class="form-control" id="inputName" name="name" required>
            </div>
            <div class="row-fluid">
                <label for="inputBirthDay">Birth day</label>
                <input type="text" class="form-control" id="inputBirthDay" name="birthday" required>
            </div>
            <div class="row-fluid">
                <label for="inputIdCard">ID Card</label>
                <input type="text" class="form-control" id="inputIdCard" name="idcard" required>
            </div>
            <div class="row-fluid">
                <label for="inputSalary">Salary</label>
                <input type="number" class="form-control" id="inputSalary" name="salary" required>
            </div>
            <div class="row-fluid">
                <label for="inputPhone">Phone Number</label>
                <input type="number" class="form-control" id="inputPhone" name="phone" required>
            </div>
            <div class="row-fluid">
                <label for="inputEmail">Email</label>
                <input type="email" class="form-control" id="inputEmail" name="email" required>
            </div>
            <div class="row-fluid">
                <label for="inputAddress">Address</label>
                <input type="text" class="form-control" id="inputAddress" name="address" required>
            </div>
            <div class="row-fluid">
                <label for="inputEducationDegree">Education Degree</label>
                <input type="text" class="form-control" id="inputEducationDegree" name="educationDegree" required>
            </div>
            <div class="row-fluid">
                <label for="inputPosition">Position</label>
                <input type="text" class="form-control" id="inputPosition" name="position" required>
            </div>
            <div class="row-fluid">
                <label for="inputDivision">Division</label>
                <input type="text" class="form-control" id="inputDivision" name="division" required>
            </div>
            <div class="row-fluid">
                <label for="inputUsername">User Name</label>
                <input type="text" class="form-control" id="inputUsername" name="username" required>
            </div>
        </div>

        <button class="btn btn-primary" type="submit">Submit form</button>
    </form>
</body>
</html>
