<%@page import="java.util.List"%>
<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Map"%>
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
<title>CHASystem Private Limited</title>
</head>
<body>
	<div class="container">
		<div class="panel-group">
			<div class="panel panel-success">
				<div class="panel-heading">
					<h1 align="center">Single Sign On</h1>
				</div>
				<div class="panel-body">
					<%
					if(request.getAttribute("errorMessage") != null)
					{
					%>
					<div class="alert alert-danger">
						<strong><%= (String)request.getAttribute("errorMessage") %></strong>
					</div>
					<%
					}
					%>
					<form action="authenticate" method="post">
						<div class="form-group row">
							<div class="col align-self-center">
								<input type="text" name="userName" placeholder="enter your username"
									class="form-control" required="required">

							</div>
						</div>
						<div class="row">
							<div class="col align-self-center">
								<div class="form-group pass_show">
									<input name="password" type="password" class="form-control"
										placeholder="enter your password" required="required">
								</div>
							</div>
						</div>
						<div class="form-group row">
							<div class="col  align-self-center">
								<select name="accountingYearCode" class="form-control"
									required="required">
									<option value="">Select Accounting Year</option>
									<%
										Map<Integer, String> accountingYearMap = (Map<Integer, String>) request
												.getAttribute("accountingYearMap");
										for (Entry entry : accountingYearMap.entrySet()) {
									%>
									<option value="<%=entry.getKey()%>">
										<%=entry.getValue()%>
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
										Map<Integer, String> branchMap = (Map<Integer, String>) request
												.getAttribute("branchMap");
										for (Entry entry : branchMap.entrySet()) {
									%>
									<option value="<%=entry.getKey()%>">
										<%=entry.getValue()%>
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
	</div>
</body>
</html>