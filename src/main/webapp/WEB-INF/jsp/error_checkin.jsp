<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="float: right;">
		<a href="/registerform">
			<button style="background-color: #7FFFD4">Register</button>
		</a> <a href="/login">
			<button style="background-color: #7FFFD4">Login</button>
		</a>
	</div>
	<div style="float: left;">
		<h2 style="align-self: center; color: red">Unable to get the
			booking details</h2>
		<h4 style="align-self: center; color: blue">invalid user to get
			the info</h4>
		<p style="align-self: center; color: blue">
			user_name :<Strong>${username}</Strong>
		</p>
	</div>
</body>
</html>