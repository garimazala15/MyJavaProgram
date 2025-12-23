<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="calculate">

<label>Enter First No:</label>
<input type="text" name="firstNo" required><br><br>

<label>Enter Second No:</label>
 <input type="text" name="secondNo" required>  <br><br>
 
 <label>Operation:</label>
 <select name="operation">
 
 <option value="add">Add </option>
  <option value="sub">Subtract </option>
  <option value="mul">Multiply </option>
  <option value="div">Division </option>
  <option value="mod">Modulus </option>
 </select>
 
 <button type="submit">Calculate</button>

 


</form>
</body>
</html>