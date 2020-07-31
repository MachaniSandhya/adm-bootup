<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1" align="center">

		<tr>

			<th>Destination</th>
			<th>flightNumber</th>
		
		</tr>

		<c:forEach items="${fltlist}" var="fltlis">

			<tr>

				<td>${fltlis.destination}</td>
				<td>${fltlis.flightNumber}</td>
			</tr>

		</c:forEach>


	</table>



</body>
</html>