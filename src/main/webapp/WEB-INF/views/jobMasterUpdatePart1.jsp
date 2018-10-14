<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="./resources/css/jobMasterEntry.css">
<title>CHASystem Private Limited</title>
</head>
<body>
<form action="showJobMasterUpdatePageWithData" method="POST">
<table class="table">
<tr>
<td>Job Number:</td>
<td><input type="text" name="jobNumber" required="required"></td>
</tr>
<tr>
<td colspan="2">
<input type="Submit" name="Fetch Details">
</td>
</tr>
</table>
</form>
</body>
</html>