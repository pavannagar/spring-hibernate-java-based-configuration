<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<html>
<body>
		<h2>Spring-Form-Update-Book-Details</h2>
		<hr>
			<frm:form action="saveBook" modelAttribute="book">
				<pre>
					Book-Id			<frm:input type="text"  path="id"  /> 	<i style="color: red"> <frm:errors path="id" /> </i>
					Book-Name		<frm:input type="text" path="name"/>	<i style="color: red"> <frm:errors path="name"/> </i>
					Book-Author		<frm:input type="text" path="author"/>	<i style="color: red"> <frm:errors path="author"/> </i>
									<input type="submit" value="save" />
				</pre>
				 
			</frm:form>
		<br>
		<a href="index.jsp">home</a>
		<hr>
		
</body>
</html>