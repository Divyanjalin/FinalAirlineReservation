<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Passenger Details</h1>
	
        <form:form method="POST" action="addPassenger" modelAttribute="passenger">
             <table>
             
                <tr>
                    <td><form:label path="passenger_name">Passenger Name</form:label></td>
                    <td><form:input path="passenger_name"/></td>
                </tr>
                 <tr>
                    <td><form:label path="gender">Gender</form:label></td>
                    <td><form:input path="gender"/></td>
                </tr>
                <tr>
                    <td><form:label path="age">Age</form:label></td>
                    <td><form:input path="age"/></td>
                </tr>
               
               
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>

</body>
</html>