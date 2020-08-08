<html>
<head>
<meta charset="ISO-8859-1">
<title>FlightSearch</title>
</head>
<body>

	<h2>Enter Search Details</h2>
	<form method="post" action="/view/flightlist" >
		<table>
			<tr>
				<td>Enter Origin</td>
				<td><input type="text" name="origin" value="DELHI" />
				<td>
			</tr>
			<tr>
				<td>Enter Destination</td>
				<td><input type="text" name="dest" value="HYDERABAD" /></td>
			</tr>
			<tr>
				<td>Enter Date</td>
				<td><input type="text" name="date" value="2020-08-21" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Search"></td>
			</tr>
		</table>
	</form>

</body>
</html>