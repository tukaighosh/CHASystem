<%@page import="org.springframework.ui.Model"%>
<%@page import="com.krishna.chasystem.web.service.MasterService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Login To CHASystem</h1>

	<form action="jobMasterEntrySuccess" method="post">
	
	<table>
	<tr>
	<td>
	<select name="PartyName">
	<%
	
	//for(String item: MasterService.getListOfMaster())
	//{
	%>
	<option>
	<%-- <%= item %> --%>
	</option>
	<%
	//}
	%>
	</select></td>
	</tr>
	
	</table>
	
	
	</form>
</body>
</html>