<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Admin</title>
</head>
<body>
	<%
		if(request.getAttribute("hello")!=null){
		out.print(request.getAttribute("hello"));
		}
	%>
	<form action="servletdemo" method="post">
		<table border="1">
			<tr>
				<td><h3>features<br>ADMIN</h3></td>
				<td><a href="LoginPage.jsp"  >Logout</a></td>
			</tr>
			<tr>
				<td>
					<a href="AddItem.jsp"  >Add item</a>
				</td>
				<td>
					<a href="EditItem.jsp"  >Edit item</a>
				</td>
			</tr>
			
			<tr>
				<td>
					
					<a href="EmoloyeeResistration.jsp"   >ResisterEmployee</a>
				</td>
				<td>
					<a href="EditEmployee.jsp" >EditEmployee</a>
				</td>
			</tr>
			<tr>
				<td>
					<input type="button" name="addItems5" value="Sales">
					<%
					// it will be done after Emoloyee sec completed
					%>
				</td>
			</tr>
			<tr>
				<td>
					<a href="ChangeAdminPassword.jsp" >ChangePassword</a>
				</td>
				<td>
					<a href="ViewAllCostomer.jsp" >viewAllCostomet</a>
				</td>
			</tr>
			<tr>
				<td>
					
				</td>
				<td>
					<a href="ViewAllEmployee.jsp">viewAllEmployee</a>
				</td>
			</tr>
		</table>
		
		</form>
		<%
		if(request.getAttribute("Update")!=null)
		out.print(request.getAttribute("Update"));
	%>
		
</body>
</html>