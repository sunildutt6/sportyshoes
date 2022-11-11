<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displaying Products</title>
<style>
table, th, td {
	border: 1px solid black;
	padding: 10px;
	margin: 5px;
}
</style>
</head>
<body>

	<h3>Products</h3>
	<table>
		<tr>
			<th>ID</th>
			<th>Product Name</th>
			<th>Product Price</th>
			<th>Size Available</th>
			<th>Category</th>
		</tr>

		<c:forEach items="${allProducts}" var="product">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td>${product.size}</td>
				<td>${product.category}</td>
			</tr>
		</c:forEach>
	</table>




</body>
</html>