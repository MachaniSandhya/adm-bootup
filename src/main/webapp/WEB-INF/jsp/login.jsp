<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	border-spacing: 4px;
	border-style: double;
}

td, th {
	border: 2px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #7FFFD4;
}
</style>
</head>
<body>
	<form:form action="/adduser" method="post" modelAttribute="userlogin">
		<table align="center" style="border-style: double;">
			<caption>
				<Strong style="color: blue">User Registration-Form</Strong>
			</caption>
			<tr>
				<td>FirstName</td>
				<td><input type="text" name="firstname"></td>
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
				<td><input type="text" name="mobile" /></td>
			</tr>
			<tr>
				<td>Email Address</td>
				<td><input type="email" name="email" /></td>
			</tr>
			<tr>
				<td>Role</td>
				<td><select name="roles" id="cars">
						<option value="user">USER</option>
						<option value="admin">ADMIN</option>
				</select></td>
			</tr>

			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>Register</td>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>