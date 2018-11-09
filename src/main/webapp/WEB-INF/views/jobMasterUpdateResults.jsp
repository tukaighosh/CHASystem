<%@page import="com.krishna.chasystem.web.dto.ExpenseMaster"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<%
			boolean recordsUpdated = (Boolean) request
					.getAttribute("recordsUpdated");
			if (recordsUpdated) {
		%>
		<div class="alert alert-success">
			<strong>Success!</strong> Job Master Entry has be saved into the
			database.
		</div>
		<%
			} 
			else 
			{
		%>
		<div class="alert alert-danger">
			<strong>Sorry!</strong> Couldn't add job Master Entry. Please connect
			with Admin
		</div>
		<%
			}
		%>
		
		<table class="table table-hover">
		<thead>
		<tr>
		<th>Expense Code</th>
		<th>Expense Name</th>
		<th>Account Code</th>
		<th>CGST</th>
		<th>SGST</th>
		<th>IGST</th>
		<th>Receipt/Details</th>
		</tr>
		</thead>
		
		
		<%
		List<ExpenseMaster> expenseMasterList = (List<ExpenseMaster>)request.getAttribute("expenseMasterList");
		for(ExpenseMaster expenseMaster : expenseMasterList)
		{
		%>
		<tr>
		<td><%= expenseMaster.getExpenseCode()%></td>
		<td><%= expenseMaster.getExpenseName()%></td>
		<td><%= expenseMaster.getAccountCode()%></td>
		<td><%= expenseMaster.getCgst()%></td>
		<td><%= expenseMaster.getSgst()%></td>
		<td><%= expenseMaster.getIgst()%></td>
		<td><%= expenseMaster.getReceiptOrDetailAction()%></td>
		</tr>
		<%
		}
		%>
		</table>
	</div>
</body>
</html>