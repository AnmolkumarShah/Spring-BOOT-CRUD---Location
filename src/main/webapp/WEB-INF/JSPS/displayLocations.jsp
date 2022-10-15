<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>

	<tr>
		<th>sr</th>
		<th>Code</th>
		<th>Name</th>
		<th>Type</th>
		<th></th>
		<th></th>
	</tr>
	 
	<c:forEach items="${allLocation}" var="item" >
	
		<tr>
			<td>${item.getId()}</td>
			<td>${item.getCode()}</td>
			<td>${item.getName()}</td>
			<td>${item.getType()}</td>
			<td> <a href="editLocation?id=${item.getId()}" >Edit</a> </td>
			<td> <a href="deleteLocation?id=${item.getId()}" >Delete</a> </td>
		</tr>
	
	</c:forEach>
	
	

</table>

<a href="createLocation" >Add Location</a>

</body>
</html>