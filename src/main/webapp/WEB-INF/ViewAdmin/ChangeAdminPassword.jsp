<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>
	<form action ="changeAdminPassword" method="post">
		<table>
			<tr>
				<td>
					
				</td>
				<td>
					
				</td>
				<td>
					<a href="AdminPage.jsp" border="2" action="onclick">back</a>
				</td>
			</tr>
			<tr>
				<td>CurrentPassword</td>
				<td><input type="text" name="password0"/></td>
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
				<td><input type="button" value="Change" action="onclick"></td>
			</tr>
		</table>
	</form>
</body>
</html>