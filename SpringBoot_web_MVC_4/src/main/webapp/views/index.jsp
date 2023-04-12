<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Product Details...</h2>
	
	<p><font color="blue">${msg}</font></p>
		<form:form action="save" modelAttribute="p" method="post">
			<table>
				<tr>
					<td>Product Id: </td>
					<td><form:input path="id"/></td>
				</tr>				
				<tr>
					<td>Product Name: </td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Product Price: </td>
					<td><form:input path="price" /></td>
				</tr>
				<tr>
					<td>Product quantity: </td>
					<td><form:input path="quantity" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="save" /></td>
				</tr>
			</table>
		</form:form>
		
		<a href="products">view Products</a>
		
	
</body>
</html>