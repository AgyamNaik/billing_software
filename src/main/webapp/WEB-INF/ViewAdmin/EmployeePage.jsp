<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		if(request.getAttribute("hello")!=null){
		out.print(request.getAttribute("hello"));
		}
	%>
	<%
		if(request.getAttribute("email")!=null){
		// out.print(request.getAttribute("email"));
		String email=(String)request.getAttribute("email");
		//out.print(email);
		
		}
	%>
	<form action="servletdemo" method="post">
		<table border="1">
			<tr>
				<td><h3>features<br>Employee</h3></td>
				<td><a href="LoginPage.jsp"  >Logout</a></td>
			</tr>
			<tr>
				<td>
					<a href=""  >Start Billing</a>
				</td>
				
				<td>
					<a href="" >Edit My Profile</a>
				</td>
			</tr>
			
			<tr>
				<td>
					<a href="ChangeEmployeePassword.jsp " >ChangePassword</a>
					
				</td>
				<td>
					<a href="ViewAllCostomer1.jsp" >viewAllCostomet(DONE)</a>
				</td>
			</tr>
			<tr>
				<td>
					
				</td>
				<td>
					<a href="ViewAllEmployee1.jsp">viewAllEmployee(DONE)</a>
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