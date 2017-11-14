<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change ur password</title>
<style>
div {
	background-color: #e6f2ef;
	margin: auto;
	width: 60%;
	border: 3px solid grey;
	border-top-left-radius:10px;
	border-top-right-radius:10px;
	padding: 10px;
}

.footer {
	width: 60%;
	border: 3px solid grey;
	border-bottom-left-radius:10px;
	border-bottom-right-radius:10px;
	padding: 10px;
}

 input[type=password],input[type=email] {
	padding: 12px 20px;
	margin: 8px 0;
	border: 2px solid grey;
	border-radius: 4px;
	box-sizing: border-box;
	width: 40%;
	height: 3%;
}

input[type=submit], input[type=reset] {
	padding: 12px 20px;
	margin-left:26px;
	margin: 10px 0;
	border: 2px solid grey;
	border-radius: 4px;
	box-sizing: border-box;
	width: 20%;
	height: 3%;
}

h1 {
	text-align: center;
}
</style>
</head>
<body>

${msg}

	<div align="center">
	<h1>Change your password</h1>
	<hr>
	<form action="changepwd.toll" method="post">
		Enter ur Email     :  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <input type="email" name="email"><br>
		<br>
		Enter new password :&nbsp;&nbsp; <input type="password" name="password"><br>
		<br>
		Confirm new Password : <input type="password" name="confirmpassword"><br><br>
		<input type="submit" value="Change Password">
	</form>
	<hr>
	<h3>Toll Managemeny System</h3>
</body>
</html>