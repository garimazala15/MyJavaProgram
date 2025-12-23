<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib prefix="c" url="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>hello result</h1>
 <hr>
 <!--  Name:<%= session.getAttribute("name") %> <br>
 Age:<%= session.getAttribute("age") %>
 -->
 
    <h3>Result: <%= session.getAttribute("result") %></h3>
</body>
</html>