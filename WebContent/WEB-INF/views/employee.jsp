<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="employee" action="/employee" method="get">
<table>
<tr><td>EmployeeName:</td>
<td><input type=text name=empname></td></tr>
<tr><td>Employeeid:</td>
<td><input type=text name=id></td></tr>
<tr><td>Password:</td>
<td><input type=text name=password></td></tr>
<tr><td>Address:</td>
<td><input type=text name=address></td></tr>
<tr><td>Email:</td>
<td><input type=text name=email></td></tr>
<tr><td>Phoneno:</td>
<td><input type=text name=phno></td></tr>
<tr><input type=submit></tr>
</table>
</form>
</body>
</html>