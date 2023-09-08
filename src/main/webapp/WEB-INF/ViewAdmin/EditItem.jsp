<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Item</title>
</head>
<body>
<% 
Connection con=null;
Statement stmt =null;
ResultSet res=null;
int i=1;
out.print("<a href='AdminPage.jsp' >back</a>");
out.print("<form action='ViewItemdetailsForUpdate' method='post'>");
out.print("<table border='2'>");
out.print("<tr>");
out.print("<th>");
out.print("No");
out.print("</th>");
out.print("<th>");
out.print("Item_ID");
out.print("</th>");
out.print("<th>");
out.print("Item_Name");
out.print("</th>");
out.print("<th>");
out.print("Item_Price");
out.print("</th>");
out.print("<th>");
out.print("Select");
out.print("</th>");
out.print("</tr>");

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1billingsoftware","root","test");
	stmt=con.createStatement();
	res = stmt.executeQuery("select * from Register_item order by id");
	while(res.next()) {
		out.print("<tr>");
		out.print("<th>");
		out.print(i++);
		out.print("</th>");
		out.print("<td>");
		out.print(res.getString(2));
		out.print("</td>");
		out.print("<td>");
		out.print(res.getString(1));
		out.print("</td>");
		out.print("<td>");
		out.print(res.getString(3));
		out.print("</td>");
		out.print("<td>");
		out.print("<input type='radio' name='itemid' value='"+res.getString(2)+"'");
		out.print("</td>");
		out.print("</tr>");
	}
	out.print("<tr>");
	out.print("<td>");
	out.print("</td>");
	out.print("<td>");
	out.print("</td>");
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

</body>
</html>