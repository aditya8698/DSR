<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/addproduct" method="get">
<h1>Add Form</h1>
<br>
Name <input type="text" name="name" value="${Alldata.name}">
<br>
prize <input type="text" name="prize" value="${Alldata.prize}">
<br>
dep<input type="text" name="dep" value="${Alldata.dep}">
<br>
<input type="submit" value="submit">
</body>
</html>