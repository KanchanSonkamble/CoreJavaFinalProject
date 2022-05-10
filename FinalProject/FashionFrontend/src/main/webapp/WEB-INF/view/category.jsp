<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category</title>
</head>
<body>
	<form action="AddCategory" method="post">
		<table align="center" class="table">

			<tr>
				<td colspan="2">
					<center>
						<h3>Category</h3>
					</center>
				</td>
			</tr>

			<tr>
				<td>Category Name</td>
				<td><input type="text" name="catName"></td>
			</tr>


			<tr>
				<td>Category Description</td>
				<td><input type="text" name="catDesc"></td>
			</tr>

			<tr>
				<td colspan="2">
					<center>
						<input type="submit" value="Submit">
					</center>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>