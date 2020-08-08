<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
	background-color: #FFE4E1;
}
</style>
</head>
<body>

	<table border="2px" align="center" style="border-color: #191970">

		<tr>
			<th>Origin</th>
			<th>Destination</th>
			<th>DateOfFliying</th>
			<th>flightNumber</th>
			<th>Fare</th>
			<th>BookTicket</th>
		</tr>
		<c:forEach items="${fltlist}" var="fltlis">
			<tr>
				<td>${fltlis.origin}</td>
				<td>${fltlis.destination}</td>
				<td>${fltlis.flightDate}</td>
				<td>${fltlis.flightNumber}</td>
				<td>${fltlis.fare.fare}</td>
				<td><a href="/bookticket?id=${fltlis.id}">
						<button style="background-color: #FFC0CB">BOOK</button>
				</a></td>
			</tr>

		</c:forEach>


	</table>



</body>
</html>