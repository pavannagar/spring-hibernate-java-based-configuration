<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<html>
<body>
		<h2>Spring-Form-Update-Book-Details</h2>
		<hr>
			<frm:form action="updateChange?id=${book.id }" modelAttribute="book">
				<pre>
					Book-Id			<frm:input type="text" disabled="true"  path="id"  />
					Book-Name		<frm:input type="text" path="name"/>
					Book-Author		<frm:input type="text" path="author"/>
									<input type="submit" value="save" />
				</pre>
				 
			</frm:form>
		<br>
		<a href="index.jsp">home</a>
		<hr>
		
</body>
</html>