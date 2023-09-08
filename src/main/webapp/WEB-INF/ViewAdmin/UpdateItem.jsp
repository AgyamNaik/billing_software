<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Item</title>
</head>
<body>
		<form action="UpdateItemDetailscontroller" method="post">
	
	     <table>
			<tr>
				<td></td><td></td><td><a href="EditItem.jsp" >back</a></td>
				
			</tr>
			<tr>
		
			<% 
			if(request.getAttribute("name")!=null){
				out.print(request.getAttribute("name"));
			}
			%>
			
			<%
			if(request.getAttribute("msg")!=null){
				out.print(request.getAttribute("msg"));
			}
			%>
				<td>Item_Name</td>
				<td><input type="text" name="name" ></td>
			</tr>
			<tr>
				<td>
				Item_ID
				</td>
				<td>
				<%if(request.getAttribute("id")!=null){
					out.print(request.getAttribute("id"));
				}%><input type="radio" name="id" value="<%out.print((String)request.getAttribute("id"));%>%>">
				</td>
			
			</tr>
			<tr>
				<td>price</td>
				
				<td><input type="text" name="price" ></td>
			</tr>
			<tr>
				<td><input type="submit" value="UpdateItem"></td>
			</tr>
		</table>
		
</form>
</body>
</html>