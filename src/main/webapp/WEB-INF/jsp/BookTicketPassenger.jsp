<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add  Passenger</title>
</head>
<body>
	<form:form
		action="/bookpassenger?id=${id}"  method="post" modelAttribute="user">
			<form:errors path="*" />
		<h4>Add Passenger Details</h4>
		<table style="border-style: double;">
			<tr>
				<td>FirstName</td>
				<td><input type="text" name="firstname"/>
				<td>
			</tr>
			<tr>
				<td>LastName</td>
				<td><input type="text" name="lastname" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="text" name="gender" /></td>
			</tr>
			<tr>
				<td>MobileNumber</td>
				<td><input type="text" name="mobile"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Book"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>