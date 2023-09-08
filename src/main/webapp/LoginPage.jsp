<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1>login here...</h1>
	<form action="verifyloginid" method="post">
		<table>
			<tr>
				<td>UserId</td>
				<td>
					<input type="text" name="UserId"/>
				</td>
			</tr>
			<tr>
				<td>Password</td>
				<td>
					<input type="password" name="password"/>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="login"/>
				</td>
			</tr>
		</table>
	</form>
	<%
		if(request.getAttribute("Error")!=null){
		out.print(request.getAttribute("Error"));
		}
	%>
</body>
</html>