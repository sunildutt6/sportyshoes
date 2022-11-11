<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create products</title>
</head>
<body>

	<h1>Product Creation</h1>

	<form action="saveProduct" method="post">
		<pre>
Product Name: <input type="text" name="name" />
Product Price: <input type="text" name="price" />
Choose Your size: <input type="text" name="size" />
Category: Men <input type="radio" name="category" value="MEN" />
Women <input type="radio" name="category" value="WOMEN" />
Child <input type="radio" name="category" value="CHILD" />
<input type="submit" value="Save"> 
</pre>


	</form>

	<b>${message}</b>

	<a href="displayProducts">View All</a>

</body>
</html>