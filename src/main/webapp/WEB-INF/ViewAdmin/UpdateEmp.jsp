<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> fatched details </title>
</head>
<body>
	<form action="UpdateEmpDetailslist" method="post">
	
	     <table>
			<tr>
				<td></td><td></td><td><a href="EditEmployee.jsp" >back</a></td>
			</tr>
			<tr>
		
			<% 
			if(request.getAttribute("name")!=null){
				out.print(request.getAttribute("name"));
			}
			%>
			<%
			if(request.getAttribute("Updateempdetails")!=null){
				out.print(request.getAttribute("Updateempdetails"));
			}
			%>
				<td>Name</td>
				<td><input type="text" name="Empname" ></td>
			</tr>
			<tr>
				<td>
				Email
				</td>
				<td>
				<%if(request.getAttribute("email")!=null){
					out.print(request.getAttribute("email"));
				}%><input type="radio" name="Empemail" value="<%out.print(request.getAttribute("email"));%>">
				</td>
			
			</tr>
			<tr>
				<td>password</td>
				<td><input type="text" name="Emppassword" ></td>
			</tr>
			<tr>
				<td>MobileNumber</td>
				<td><input type="text" name="EmpMnumber"></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>
					Male<input type="radio" name="Empgen" value="Male">
					Female<input type="radio" name="Empgen" value="Female">
					Other<input type="radio" name="Empgen" value="Other">
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
		
</form>

	

</body>
</html>