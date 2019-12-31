<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sample Login Form</title>
</head>
<body>
	<form method="post" action="Login">
		<table>
			<tr>
				<td>Email Id</td>
				<td><input type="text" name="email" required = "required"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required = "required"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
	<form method="post" action="Register.jsp">
		<table>

			<tr>
				<td></td>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>