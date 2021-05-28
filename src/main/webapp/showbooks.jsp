<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<html>
<body>
		<h2>Book-List</h2>
		
		<table border="2">
			
			<tr><th>BookId</th><th>BookName</th><th>BookAuthor</th><th>Remove</th><th>Update-Book</th> </tr>
			
			<jstl:forEach items="${books }" var="book">
			<tr>
				<td>${book.id }</td>
				<td>${book.name }</td>
				<td>${book.author }</td>
				<td><a href="deleteBook?id=${book.id }" >[X]</a></td>
				<td><a href="changeBook?id=${book.id }" >Change</a></td>
			</tr>
			</jstl:forEach>
		</table>
		<h5><a href="searchBook"> Search single Book</a></h5><br>
		<a href="index.jsp">home</a>
		
</body>
</html>