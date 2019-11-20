<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Users</title>
</head>
<body>
	<br>
	<br>
	<br>
	<a href="${pageContext.request.contextPath}/addFlight">Add Flight</a>
<a href="${pageContext.request.contextPath}/home">Home</a>
	<br>
	<h3>List of all Flights</h3>
	${message}
	<br>
	<br>
	<table border="1px" cellpadding="0" cellspacing="0">
		<thead>
			<tr>
				<th>Flight ID</th>
				<th>Flight Name</th>
				<th>From</th>
				<th>To</th>
				<th>Date</th>
				<th>Departure Time</th>
				<th>Arrival Time</th>
				<th>Duration</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="flightdetails" items="${flightList}">
				<tr>
					<td>${flightdetails.flight_id}</td>
					<td>${flightdetails.flight_name}</td>
					<td>${flightdetails.from_loc}</td>
					<td>${flightdetails.to_loc}</td>
					<td>${flightdetails.flight_date}</td>
					<td>${flightdetails.departure_time}</td>
					<td>${flightdetails.arrival_time}</td>
					<td>${flightdetails.duration}</td>
					<td><a
						href="${pageContext.request.contextPath}/editFlight/${flightdetails.flight_id}">Edit</a></td>
					<td><a
						href="${pageContext.request.contextPath}/deleteFlight/${flightdetails.flight_id}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>


	</table>
</body>
</html>