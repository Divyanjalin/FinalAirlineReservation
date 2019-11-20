<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Passengers</title>
</head>
<body>
	<br>
	<br>
	<br>
	
	<a href="${pageContext.request.contextPath}/home">Home</a>
	<br>
	<h3>List of all Passengers</h3>
	${message}
	<br>
	<br>
	<table border="1px" cellpadding="0" cellspacing="0">
		<thead>
			<tr>
				<th>Passenger ID</th>
				<th>Passenger Name</th>
				<th>Age</th>
				<th>Gender</th>
				
			</tr>
		</thead>

		<tbody>
			<c:forEach var="passenger" items="${passengerList}">
				<tr>
					<td>${passenger.passenger_id}</td>
					<td>${passenger.passenger_name}</td>
					<td>${passenger.age}</td>
					<td>${passenger.gender}</td>
					
					</tr>
			</c:forEach>
		</tbody>


	</table>
</body>

</html>