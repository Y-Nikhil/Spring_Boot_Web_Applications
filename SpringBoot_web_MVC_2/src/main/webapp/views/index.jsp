0<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="book" >
Book Id : <input type="text" name="id" />
<input type="submit" value="search" />
</form>
<hr />
Book Id 	:${book.books_id} <br>
Book Name 	:${book.books_name} <br>
Book Price	:${book.books_price} <br>
</body>
</html>