<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
 crossorigin="anonymous"></script>
 
 <style type="text/css">
 tr,th,input[type=text]{
	border: 2px solid black;
 background-color: lightblue;
 padding: 10px 20px;
  margin: 5px 0;
  border: 2px solid red;
  border-radius: 4px;
}
}

</style>
</head>
<body>
<div align="center">
<form action="/addproduct" method="get">
<h1>Add Form</h1>
<br>
Name <input type="text" name="name">
<br>
prize <input type="text" name="prize">
<br>
dep<input type="text" name="dep">
<br>
<input type="submit" value="submit">

<br>
<br>
<h3> Product </h3>
	<table border="1" class="table table-striped taable-condensed table-bordered">
			<thead>
				<tr >
					<th> id</th>
					<th>name</th>
					<th>prize</th>
					<th>dep</th>
					<th>Action</th>
				</tr>
				<c:forEach var="std" items="${Alldata}">
					<tr>
						<td><c:out value="${std.id}"></c:out></td>
						<td><c:out value="${std.name}"></c:out></td>
						<td><c:out value="${std.prize}"></c:out></td>
						<td><c:out value="${std.dep}"></c:out></td>
						<td><a href="/updateProduct?id=${std.id}">Edit</a> || 
						<a href="/deleteProduct?id=${std.id}"
						onclick="return confirm('data del?');">Delete</a></td>
					</tr>
					
				</c:forEach>
				
		</table>

</form>
</div>
</body>
</html>