<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>For Check in </h2>
	<form method="post" action="/checkininformation" >
		<table>
			<tr>
				<td>Enter BookingId</td>
				<td><input type="text" name="bookingId" value=""><td>
			</tr>
			<tr>
				<td><input type="submit" value="checkin"></td>
			</tr>
		</table>
	</form>
</body>
</html>