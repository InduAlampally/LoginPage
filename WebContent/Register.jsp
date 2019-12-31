<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	You have not logged in...
	Login Here
	<form method="post" action="Register">
		<table>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstName" required = "required"></td>
			</tr>
			<tr>
				<td>Middle Name</td>
				<td><input type="text" name="middleName"></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName" required = "required"></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td>Email Id</td>
				<td><input type="text" name="email" required = "required"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password" required = "required"></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="text" name="confirmPassword" required = "required"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>