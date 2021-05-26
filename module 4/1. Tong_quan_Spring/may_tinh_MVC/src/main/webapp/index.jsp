<%--
  Created by IntelliJ IDEA.
  User: hovanhuecold
  Date: 20/05/2021
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
 <form action="/calculator" method="get">
   <p>
     <input placeholder="enter number 1" name="number1" type="text">
   </p>
   <p>
     <input placeholder="enter number 2" name="number2" type="text">
   </p>
   <input type="submit" value="Addition(+)" name="total">
   <input type="submit" value="Subtraction(-)" name="total">
   <input type="submit" value="Multiplication(*)" name="total">
   <input type="submit" value="Division(/)" name="total">
 </form>
  </body>
</html>
