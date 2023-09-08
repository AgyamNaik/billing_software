<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
Connection con=null;
Statement stmt =null;
ResultSet res=null;
int i=1;

out.print("<a href='AdminPage.jsp' >back</a>");

out.print("<form action='ViewAllCostomer' method='post'>");
out.print("<table border='2'>");
out.print("<tr>");
out.print("<th>");
out.print("No");
out.print("</th>");
out.print("<th>");
out.print("Name");
out.print("</th>");
out.print("<th>");
out.print("Email");
out.print("</th>");
out.print("<th>");
out.print("MobileNumber");
out.print("</th>");
out.print("<th>");
out.print("Password");
out.print("</th>");
out.print("<th>");
out.print("Gender");
out.print("</th>");
out.print("</tr>");

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1billingsoftware","root","test");
	stmt=con.createStatement();
	res = stmt.executeQuery("select name,email,phone,password,gender from Register where module=''");
	while(res.next()) {
		out.print("<tr>");
		out.print("<td>");
		out.print(i++);
		out.print("</td>");
		out.print("<td>");
		out.print(res.getString(1));
		out.print("</td>");
		out.print("<td>");
		out.print(res.getString(2));
		out.print("</td>");
		out.print("<td>");
		out.print(res.getString(3));
		out.print("</td>");
		out.print("<td>");
		out.print(res.getString(4));
		out.print("</td>");
		out.print("<td>");
		out.print(res.getString(5));
		out.print("</td>");
		out.print("</tr>");
	}
	out.print("</table>");
	out.print("</form>");
} catch (Exception e) {
	e.printStackTrace();
}
%>

</body>
</html>