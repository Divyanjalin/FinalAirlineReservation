<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<br>
<br>
<br>
	<form action="allFlights" method="post">

		<input type="submit" value="List All Flights" />

	</form>
	<form action="allPassenger" method="post">

		<input type="submit" value="List All Passenger" />

	</form>
</body>
</html>