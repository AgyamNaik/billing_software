<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register New Employee</title>
</head>
<body>
	<form action="RegisterNewEmployeeCreate" method="post">
		<table>
			<tr>
				<td></td><td></td><td><a href="AdminPage.jsp" >back</a></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="Empname"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="Empemail"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="text" name="Emppassword"></td>
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
				<td><input type="submit" value="Resister"></td>
			</tr>
		</table>
	</form>
</body>
</html>