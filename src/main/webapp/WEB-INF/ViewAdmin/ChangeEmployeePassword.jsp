<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>
	<form action ="changeEmployeeselfPassword" method="post">
		<table>
			<tr>
				<td>
	<%
		if(request.getAttribute("email")!=null){
		// out.print(request.getAttribute("email"));
		String email=(String)request.getAttribute("email");
		//out.print(email);
		
		}
	%>
				</td>
				<td>
					
				</td>
				<td>
					<a href="EmployeePage.jsp">back</a>
				</td>
			</tr>
			<tr>
				<td>Email ID</td>
				
		 <td>
		  <%if(request.getAttribute("email")!=null){
					out.print(request.getAttribute("email"));
				}%>
		<input type="radio" name="Empemail" value="<%out.print(request.getAttribute("email"));%>">
		
				
		 </td>
			</tr>
			<tr>
				<td>NewPassword</td>
				<td><input type="text" name="password1"/></td>
			</tr>
			<tr>
				<td>ConformPassword</td>
				<td><input type="text" name="password2"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="button" value="Change" ></td>
			</tr>
			</table>
	</form>
</body>
</html>