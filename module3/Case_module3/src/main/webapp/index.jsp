<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
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
        <a class="navbar-branch" href="./index.jsp">
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

<div id="slides" class="carousel slide" data-ride="carousel">
    <ul class="carousel-indicators">
        <li data-target="#slides" data-slide-to="0" class="active"></li>
        <li data-target="#slides" data-slide-to="1"></li>
        <li data-target="#slides" data-slide-to="2"></li>
        <li data-target="#slides" data-slide-to="3"></li>
    </ul>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img src="./view/img/1.jpg" width="100%">
        </div>
        <div class="carousel-item">
            <img src="./view/img/2.jpg">
        </div>
        <div class="carousel-item">
            <img src="./view/img/3.jpg">
        </div>
        <div class="carousel-item">
            <img src="./view/img/4.jpg">
        </div>
    </div>
</div>
<hr class="my-4">
<div class="container-fluid padding">
    <div class="row text-center padding">
        <div class="col-12">
            <h2>Contact us</h2>
        </div>
        <div class="col-12 social padding">
            <a href="#" style="font-size: 48px; padding: 24px;"><i class="fab fa-facebook" style="color: #3b5998"></i></a>
            <a href="#" style="font-size: 48px; padding: 24px;"><i class="fab fa-twitter" style="color: #00aced"></i></a>
            <a href="#" style="font-size: 48px; padding: 24px;"><i class="fab fa-google-plus-g" style="color:#dd4b39;"></i></a>
            <a href="#" style="font-size: 48px; padding: 24px;"><i class="fab fa-instagram" style="color: #517fa4"></i></a>
            <a href="#" style="font-size: 48px; padding: 24px;"><i class="fab fa-youtube" style="color: #bb0000"></i></a>
        </div>
    </div>
</div>

</body>
</html>