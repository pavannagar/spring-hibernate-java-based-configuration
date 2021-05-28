<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<html>
<body>
		<h2>Update-Book-Details</h2>
		<hr>
			<form action="processChange">
				<pre>
					Book-Id			<input type="text" name="id"  value="${book.id }">
					Book-Name		<input type="text" name="name" value=${book.name }>
					Book-Author		<input type="text" name="author" value="${book.author }">
									<input type="submit" value="save">
				</pre>
				
			</form>
		<br>
		<a href="index.jsp">home</a>
		<hr>
		
</body>
</html>