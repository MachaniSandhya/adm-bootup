<html>
<head>
<meta charset="ISO-8859-1">
<title>FlightSearch</title>
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
	background-color:  #7FFFD4;
}
</style>
</head>
<body>


	<form method="post" action="/view/order/flightlist">
		<table align="center" style="border-style: double;">
			<caption>
				<Strong style="color: blue">Enter Search Details</Strong>
			</caption>
			<tr>
				<td>Enter Origin</td>
				<td><input type="text" name="origin" value="DELHI"></td>

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
				<td>Search</td>
				<td><input type="submit" value="Search"></td>
			</tr>
		</table>
	</form>

</body>
</html>