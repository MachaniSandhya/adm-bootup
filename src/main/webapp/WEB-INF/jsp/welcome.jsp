<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	border-spacing: 4px;
}
td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #7FFFD4;
}
</style>
</head>
<body>

	<div style="float: right;">
		<table  style="width: 20%;align-self: right">
			<tr>
				<td><a href="/registerform">
						<button style="background-color: #7FFFD4">Register</button>
				</a></td>
				<td><a href="/login">
						<button style="background-color:#7FFFD4">Login</button>
				</a></td>
			</tr>
		</table>
	</div>
	<div>
		<table style="width: 100%">
			<tr>
			</tr>
		</table>
	</div>
	<div style="float: center;">
		<table border="2px" align="center"  style="width: 50%">
			<caption>
				<strong style="color: #FF6347">FLIGHT HOME PAGE</strong>
			</caption>
			<tr">
				<td><a href="/searchFlight">FlightsByOriginDestinationDateTime</a></td>
			</tr>
			<tr>
				<td><a href="/flightList">FlightsByOriginDestinationDate</a></td>
			</tr>
			<tr>
				<td><a href="/flightListorder">FlightsByOriginDestinationDateOrderByPrice</a></td>
			</tr>
			<tr>
				<td><a href="/checkin">Checkin</a></td>
			</tr>
		</table>
	</div>

</body>
</html>