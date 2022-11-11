<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displaying Users</title>
<style>
table, th, td {
	border: 1px solid black;
	padding: 10px;
	margin: 5px;
}
</style>
</head>
<body>

	<h3>Users</h3>
	<table>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Category</th>

		</tr>

		<c:forEach items="${allUsers}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.firstname}</td>
				<td>${user.lastname}</td>
				<td>${user.email}</td>
				<td>${user.category}</td>
			</tr>
		</c:forEach>
	</table>

	<form action="showUser" method="post">

		<h2>Find User</h2>
		<pre>
		First name:<input type="text" name="firstname" /> 
		<input type="submit" value="Search" />
		</pre>


	</form>


</body>
</html>