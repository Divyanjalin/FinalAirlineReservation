<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<h1>${headerMessage}</h1>
	
        <form:form method="POST" action="editFlight" modelAttribute="flightdetails">
        
        	<form:hidden path="flight_id" /> 
              <table>
            
                <tr>
                    <td><form:label path="flight_name">Flight Name</form:label></td>
                    <td><form:input path="flight_name"/></td>
                </tr>
                 <tr>
                    <td><form:label path="from_loc">From</form:label></td>
                    <td><form:input path="from_loc"/></td>
                </tr>
                <tr>
                    <td><form:label path="to_loc">To</form:label></td>
                    <td><form:input path="to_loc"/></td>
                </tr>
               
                <tr>
                    <td><form:label path="flight_date">Date</form:label></td>
                    <td><form:input path="flight_date"/></td>
                </tr>
                
                 <tr>
                    <td><form:label path="departure_time">Departure Time</form:label></td>
                    <td><form:input path="departure_time"/></td>
                </tr>
                
                 <tr>
                    <td><form:label path="arrival_time">Arrival Time</form:label></td>
                    <td><form:input path="arrival_time"/></td>
                </tr>
                
                 <tr>
                    <td><form:label path="duration">Duration</form:label></td>
                    <td><form:input path="duration"/></td>
                </tr>
                
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>

</body>
</html>