<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 26/03/2021
  Time: 6:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <h1>Simple Calculator</h1>
  <form action="/culcalator" method="get">
      <label>calculator</label>
    <label id="input1">Fisrt operand</label>
    <input for="input1" type="number" name="First">
    <select id="tinh" name="chon">
      <option value="+" selected>+</option>
      <option value="-">-</option>
      <option value="*">*</option>
      <option value="/">/</option>
    </select>
    <label id="input2">Second operand</label>
    <input for="input2" type="number" name="second">
    <input type="submit" value="calculator">
  </form>
  </body>
</html>
