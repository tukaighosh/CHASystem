<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
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
<link rel="stylesheet" href="./resources/css/login.css">
<script type="text/javascript" src="./resources/js/login.js"></script>
<style type="text/css">
body {
	background-image: url("./resources/images/shipping_company-photo.jpg");
}
</style>
<title>Login Page</title>
</head>
<body>
	<div class="container">
		<div class="panel-group">
			<div class="panel panel-success">
				<div class="panel-heading">
					<h1 align="center">Login To CHASystem</h1>
				</div>
				<div class="panel-body">

					<form action="user" method="post">
						<div class="form-group row">
							<div class="col align-self-center">
								<input type="text" name="userId" placeholder="Enter your userId"
									class="form-control" required="required">

							</div>
						</div>

						<div class="form-group row">
							<div class="col align-self-center">

								<!-- <div class="form-group"> -->
								<input name="password" type="password"
									placeholder="Enter Your Password" class="form-control"
									required="required"><span id="#password-field"
									class="fa fa-fw fa-eye field-icon toggle-password"></span>
							</div>
						</div>
						<div class="form-group row">
							<div class="col  align-self-center">
								<select name="accountingYear" class="form-control"
									required="required">
									<option value="">Select Accounting Year</option>
									<%
										List<String> accountingYearList = (List<String>) request
												.getAttribute("accountingYearList");
										for (String str : accountingYearList) {
									%>
									<option>
										<%=str%>
									</option>
									<%
										}
									%>
								</select>
							</div>
						</div>

						<div class="form-group row">
							<div class="col align-self-center">
								<select name="branch" class="form-control" required="required">
									<option value="">Select Branch</option>
									<%
										List<String> branchList = (List<String>) request
												.getAttribute("branchList");
										for (String str : branchList) {
									%>
									<option>
										<%=str%>
									</option>
									<%
										}
									%>
								</select>
							</div>
						</div>
						<div class="form-group row">
							<div class="col align-self-center">
								<input type="submit" value="Login"
									class="form-control btn btn-primary">
							</div>
						</div>
					</form>

				</div>
			</div>
		</div>



		<!-- <form action="user" method="post">
			<div class="form-group">

				<input type="text" name="userId" placeholder="Enter your userId"
					class="form-control">
			</div>
			<div class="form-group">
				<input name="password" type="password"
					placeholder="Enter Your Password" class="form-control">
			</div>
			<div class="form-group">
				<select name="accountingYear" class="form-control">
					<option value="">Select Accounting Year</option>
					<option value="2015-2016">2015-2016</option>
					<option value="2016-2017">2016-2017</option>
					<option value="2017-2018">2017-2018</option>
					<option value="2018-2019">2018-2019</option>
				</select>
			</div>
			<div class="form-group">
				<select name="branch" class="form-control">
					<option value="">Select Branch</option>

					<option value="001-Kolkata">001-Kolkata</option>
					<option value="002-Mumbai">002-Mumbai</option>
					<option value="003-Bangaluru">003-Bangaluru</option>
					<option value="004-Chennai">004-Chennai</option>
				</select>
			</div>
			<div class="form-group">
				<input type="submit" value="Login"
					class="form-control btn btn-primary">
			</div>
		</form>
 -->
	</div>
</body>
</html>