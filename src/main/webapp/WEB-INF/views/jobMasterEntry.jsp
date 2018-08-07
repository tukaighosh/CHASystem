<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Map"%>
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
<link rel="stylesheet" href="./resources/css/login.css">
<script type="text/javascript" src="./resources/js/login.js"></script>
<title>Login Page</title>
</head>
<body>




	<div class="container">

		<div class="panel-group">
			<div class="panel panel-success">
				<div class="panel-heading">
					<h1 align="center">CHASystem Private Limited</h1>
				</div>
				<div class="panel-body">

					<form action="saveJobMaster" method="post">
						<div class="form-group row">
							<label class="col col-lg-3">PARTY NAME: </label> <select
								name="partyName" required="required" class="col col-lg-3">
								<option value="">Select Party Name</option>
								<%
										
										Map<Integer, String> debtorsMapFromMasterTable = (Map<Integer, String>) request
												.getAttribute("debtorsMapFromMasterTable");
										for (Entry entry : debtorsMapFromMasterTable.entrySet()) {
									%>
								<option value="<%=entry.getKey()%>">
									<%=entry.getValue()%>
								</option>
								<%
										}
									%>
							</select> <label class="col col-lg-3">DATE: </label> 
							<input type="text"
								name="date" readonly="readonly" class="col col-lg-3"
								required="required"
								value="<%= (String)request.getAttribute("serverTime")%>">
							<input type="hidden" value="<%= (String)request.getAttribute("branch")%>" name="branch">
						</div>


						<div class="form-group row">
							<label class="col col-lg-2">IMPORT OR EXPORT: </label> 
							<select name="importOrExport" required="required" class="col col-lg-2">
								<option value="">Select Import Or Export</option>
								<option>Import</option>
								<option>Export</option>
							</select> 
							<label class="col col-lg-2">DISPATCHED FROM: </label> 
							<input type="text" name="dispatchedFrom" class="col col-lg-2">
							<label class="col col-lg-2">DISPATCHED TO: </label> 
							<input type="text" name="dispatchedTo" class="col col-lg-2">
						</div>
						
						<div class="form-group row">
							<label class="col col-lg-2">PORT NAME: </label> 
							<input type="text" name="portName" class="col col-lg-2">
							<label class="col col-lg-2">SHIP NAME: </label> 
							<input type="text" name="shipName" class="col col-lg-2">
							<label class="col col-lg-2">CITY NAME: </label> 
							<input type="text" name="cityName" class="col col-lg-2">
						</div>
						
						<div class="form-group row">
							<label class="col col-lg-2">BE NO: </label> 
							<input type="text" name="beNo" class="col col-lg-2">
							<label class="col col-lg-2">REF NO: </label> 
							<input type="text" name="refNo" class="col col-lg-2">
							<label class="col col-lg-2">PARTY REF. NO: </label> 
							<input type="text" name="partyRefNo" class="col col-lg-2">
						</div>
						
						<div class="form-group row">
							<label class="col col-lg-2">CREDIT DAYS: </label> 
							<input type="text" name="creditDays" class="col col-lg-2">
							<label class="col col-lg-2">COMMODITY: </label> 
							<input type="text" name="commodity" class="col col-lg-2">
							<label class="col col-lg-2">COMMODITY COUNT: </label> 
							<input type="text" name="commodityCount" class="col col-lg-2">
						</div>
						
						<div class="form-group row">
							<label class="col col-lg-2">UNIT: </label> 
							<input type="text" name="unit" class="col col-lg-2">
							<label class="col col-lg-2">ADVANCE AMOUNT: </label> 
							<input type="text" name="advanceAmount" class="col col-lg-2">
							<label class="col col-lg-2">TURNKEY: </label> 
							<input type="text" name="turnKey" class="col col-lg-2">
						</div>
						
						<div class="form-group row">
							<label class="col col-lg-2">JOB ORDER NO: </label> 
							<input type="text" name="jobOrderNumber" class="col col-lg-2">
							<label class="col col-lg-2">PLACE OF SERVICE: </label> 
							<input type="text" name="placeOfService" class="col col-lg-2">
						</div>



						<div class="form-group row">
							<div class="col align-self-center">
								<input type="submit" value="SAVE"
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