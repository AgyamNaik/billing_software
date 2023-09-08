<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new Item</title>
</head>
<body>
	<form action="Addnewitem" method ="post">
		<table>
			<tr>
				<td>
					ID
				</td>
				<td>
					<input type="text" name="Item_Id" />
				</td>
			</tr>
			<tr>
				<td>
					Name
				</td>
				<td>
					<input type="text" name="Item_Name" />
				</td>
			</tr>
			<tr>
				<td>
					Price
				</td>
				<td>
					<input type="text" name="Item_price" />
				</td>
			</tr>
			<tr>
				<td>
					
				</td>
				<td>
					<input type="submit" value="Add" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>