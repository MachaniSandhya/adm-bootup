<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
	color: #191970
}

tr:nth-child(even) {
	background-color: #FFC0CB;
}
</style>
</head>
<body>
	<div style="float: right;">
		<table style="width: 20%; align-self: right">
			<tr>
				<td><a href="/logout">
						<button style="background-color: #7FFFD4">logout</button>
				</a></td>
			</tr>
		</table>
	</div>
	<div>
		<table border="2" align="center">
			<caption>
				<strong style="color: #191970">Check-in info</strong>
			</caption>
			<tr>
				<td>BookingId</td>
				<td>${id}
			<tr>
				<td>flightNumber</td>
				<td>${flightNum}
			<tr>
				<td>Origin</td>
				<td>${origin}</td>
			</tr>
			<tr>
				<td>TimeOfFlying</td>
				<td>${flightTime}</td>
			</tr>
			<tr>
				<td>Destination</td>
				<td>${dest}</td>
			</tr>
			<tr>
				<td>DateOfFliying</td>
				<td>${flightDate}</td>
			</tr>
			<tr>
				<td>SeatNumber</td>
				<td>${seatnum}</td>
			</tr>
		</table>
	</div>
</body>
</html>