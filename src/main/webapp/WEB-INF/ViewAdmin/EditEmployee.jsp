<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Details</title>
</head>
<body>

<% 
Connection con=null;
Statement stmt =null;
ResultSet res=null;
int i=0;

out.print("<a href='AdminPage.jsp' >back</a>");

out.print("<form action='ViewEmpdetailsforupdate1' method='post'>");
out.print("<table border='2'>");
out.print("<tr>");
out.print("<th>");
out.print("Name");
out.print("</th>");
out.print("<th>");
out.print("Email");
out.print("</th>");
out.print("<th>");
out.print("Select");
out.print("</th>");
out.print("<th>");
out.print("Delete");
out.print("</th>");
out.print("</tr>");

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1billingsoftware","root","test");
	stmt=con.createStatement();
	res = stmt.executeQuery("select name,email from Register where module='Employee'");
	while(res.next()) {
		out.print("<tr>");
		out.print("<td>");
		out.print(res.getString(1));
		out.print("</td>");
		out.print("<td>");
		out.print(res.getString(2));
		out.print("</td>");
		out.print("<td>");
		out.print("<input type='radio' name='emailres' value='"+res.getString(2)+"'");
		out.print("</td>");
		out.print("<td>");
		out.print("<a href='delete?email='"+res.getString(2)+"''>delete</a>");
		out.print("</td>");
		out.print("</tr>");
	}
	out.print("<tr>");
	out.print("<td>");
	out.print("</td>");
	out.print("<td>");
	out.print("</td>");
	out.print("<td>");
	out.print("<input type='submit' value='Update'");
	out.print("</td>");
	out.print("</tr>");
	out.print("</table>");
	out.print("</form>");
} catch (Exception e) {
	e.printStackTrace();
}


%>
<%
		if(request.getAttribute("Updateempdetails")!=null){
		out.print(request.getAttribute("Updateempdetails"));
		}
%>
	
</body>
</html>