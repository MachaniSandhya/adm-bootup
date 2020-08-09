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
	<form method="post" action="/checkininformation">
		<table align="center">
			<caption>
				<Strong style="color: blue">Enter Checkin details</Strong>
			</caption>
			<tr>
				<td>Enter BookingId</td>
				<td><input type="text" name="bookingId" value=""></td>
			</tr>
			<tr>
				<td>CheckIn</td>
				<td><input type="submit" value="checkin"></td>
			</tr>
		</table>
	</form>
</body>
</html>