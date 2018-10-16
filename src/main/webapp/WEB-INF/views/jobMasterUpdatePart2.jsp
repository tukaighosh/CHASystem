<%@page import="com.krishna.chasystem.web.dto.JobMaster"%>
<%@page import="com.krishna.chasystem.web.dto.UnitMaster"%>
<%@page import="java.util.List"%>
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
<link rel="stylesheet" href="./resources/css/jobMasterEntry.css">
<title>CHASystem Private Limited</title>
</head>
<body>




	<div class="container">

		<%
			JobMaster jobMaster = (JobMaster) request.getAttribute("jobMaster");
		%>
		<div class="panel-group">
			<div class="panel panel-success">
				<div class="panel-heading">
					<h1 align="center">JobMaster Update</h1>
				</div>
				<div class="panel-body">
					<form action="updateJobMaster" method="post">

						<table class="table">
							<tr>
								<td><label>PARTY NAME: </label></td>
								<td><select name="partyName" required="required"
									class="form-control">
										<%
											Map<Integer, String> debtorsMapFromMasterTable = (Map<Integer, String>) request
													.getAttribute("debtorsMapFromMasterTable");
										%>
										<option value=<%=jobMaster.getAccountCode()%>
											selected="selected"><%=debtorsMapFromMasterTable.get(jobMaster.getAccountCode())%></option>
										<%
											for (Entry entry : debtorsMapFromMasterTable.entrySet()) {
										%>
										<option value="<%=entry.getKey()%>">
											<%=entry.getValue()%>
										</option>
										<%
											}
										%>
								</select></td>
								<td><label>DATE: </label></td>
								<td><input type="text" name="date" readonly="readonly"
									required="required" value="<%=jobMaster.getJobCreationDate()%>"
									class="form-control"></td>
								<td><label>JOB NUMBER: </label></td>
								<td><input type="text" id="jobNumber" name="jobNumber"
									value="<%=jobMaster.getJobNumber()%>"
									readonly="readonly" class="form-control" required="required"></td>
							</tr>

							<tr>
								<td><label>IMPORT OR EXPORT: </label></td>
								<td><select id="importOrExport" name="importOrExport"
									required="required" class="form-control">
										<%
											if (jobMaster.getImportOrExport().equalsIgnoreCase("I")) {
										%>
										<option selected="selected" value="I">Import</option>
										<%
											} else {
										%>
										<option value="E" selected="selected">Export</option>
										<%
											}
										%>

								</select></td>
								<td><label>DISPATCHED FROM: </label></td>
								<td><input type="text" name="dispatchedFrom"
									class="form-control" required="required"
									value=<%=jobMaster.getDispatchFrom()%>></td>
								<td><label>DISPATCHED TO: </label></td>
								<td><input type="text" name="dispatchedTo"
									class="form-control" required="required"
									value=<%=jobMaster.getDispatchTo()%>></td>
							</tr>


							<tr>
								<td><label>PORT NAME: </label></td>
								<td><input type="text" name="portName" class="form-control"
									required="required" value=<%=jobMaster.getPort()%>></td>
								<td><label>SHIP NAME: </label></td>
								<td><input type="text" name="shipName" class="form-control"
									required="required" value=<%=jobMaster.getShipName()%>></td>
								<td><label>CITY NAME: </label></td>
								<td><input type="text" name="cityName" class="form-control"
									required="required" value=<%=jobMaster.getCity()%>></td>
							</tr>

							<tr>
								<td><label>BE NO: </label></td>
								<td><input type="text" name="beNo" class="form-control"
									required="required" value=<%=jobMaster.getBeNo()%>></td>
								<td><label>REF NO: </label></td>
								<td><input type="text" name="refNo" class="form-control"
									required="required" value=<%=jobMaster.getAccountCode()%>></td>
								<td><label>PARTY REF NO: </label></td>
								<td><input type="text" name="partyRefNo"
									class="form-control" required="required"
									value=<%=jobMaster.getPartyRefNo()%>></td>
							</tr>

							<tr>
								<td><label>CREDIT DAYS: </label></td>
								<td><input type="text" name="creditDays"
									class="form-control"></td>
								<td><label>COMMODITY: </label></td>
								<td><input type="text" name="commodity"
									class="form-control" required="required"
									value=<%=jobMaster.getCommodity()%>></td>
								<td><label>COMMODITY QUANTITY: </label></td>
								<td><input type="text" name="commodityQuantity"
									class="form-control" required="required"
									value=<%=jobMaster.getQuantity()%>></td>
							</tr>

							<tr>
								<td><label>UNIT: </label></td>
								<td><select name="unitId" required="required"
									class="form-control">
										<%
											List<UnitMaster> unitList = (List<UnitMaster>) request.getAttribute("unitList");
											for (UnitMaster unit : unitList) {
												if (unit.getUnitId() == jobMaster.getUnitId()) {
										%>
										<option value="<%=unit.getUnitId()%>" selected="selected">
											<%=unit.getUnitName()%>
										</option>
										<%
											continue;
												}
										%>
										<option value="<%=unit.getUnitId()%>">
											<%=unit.getUnitName()%>
										</option>
										<%
											}
										%>
								</select></td>
								<td><label>ADVANCE AMOUNT: </label></td>
								<td><input type="text" name="advanceAmount"
									class="form-control" required="required"
									value=<%=jobMaster.getAdvanceAmount()%>></td>
								<td><label>TURNKEY: </label></td>
								<td><input type="text" name="turnKey" class="form-control"
									required="required" value=<%=jobMaster.getTurnKey()%>></td>
							</tr>

							<tr>
								<td><label>JOB ORDER NO: </label></td>
								<td><input type="text" name="jobOrderNumber"
									class="form-control"></td>
								<td><label>PLACE OF SERVICE: </label></td>
								<td><input type="text" name="placeOfService"
									class="form-control"></td>
								<td colspan="2"><textarea name="narration"
										class="form-control" rows="5"
										placeholder="enter your narration in detail"
										required="required"><%=jobMaster.getNarration()%></textarea></td>
							</tr>
							<tr>
								<td colspan="6"><input type="submit" value="SAVE"
									class="btn btn-primary btn-block"></td>
							</tr>


						</table>

					</form>

				</div>
			</div>
		</div>


	</div>
</body>
</html>