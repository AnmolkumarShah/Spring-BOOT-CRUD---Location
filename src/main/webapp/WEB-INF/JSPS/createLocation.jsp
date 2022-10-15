<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="saveLocation" method="get" modelAttribute="newLocation" >

	<table>
		<tr>
			<td>Id</td>
			<td> <form:input type="text" path="id" /> </td>
		</tr>
		
		<tr>
			<td>Code</td>
			<td> <form:input type="text" path="code" /> </td>
		</tr>
		
		<tr>
			<td>Name</td>
			<td> <form:input type="text" path="name" /> </td>
		</tr>
		
		<tr>
			<td>Type</td>
			<td> <form:radiobutton path="type" value="Urban" />Urban  </td>
			<td> <form:radiobutton path="type" value="Rural" />Rural </td>
		</tr>
		
		<tr>
			<td> <input type="submit" name="Submit" /> </td>
		</tr>
		
	</table>
		${msg}

</form:form>
<a href="displayAll" >Display All</a>

</body>
</html>