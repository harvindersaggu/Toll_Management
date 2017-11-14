<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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

select {
	padding: 16px 20px;
	border: 2px solid grey;
	border-radius: 4px;
	background-color: #f1f1f1;
}

input[type=text], input[type=password] {
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
	margin-left:30px;
	margin: 10px 0;
	border: 2px solid grey;
	border-radius: 4px;
	box-sizing: border-box;
	width: 10%;
	height: 3%;
}

h1 {
	text-align: center;
}
</style>
</head>
	
<body >
	<div align="center">
	<h1>Login Page</h1>
	<hr>
	<form action="register.toll" method="post">
		Username : <input type="text" name="username"><br>
		<br>
		Password : <input type="password" name="password"><br>
		<b>${msg}</b><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Login">&nbsp;&nbsp;<input type="reset" value="Clear">
		<a href="Forgot.jsp"> Forgot Password?</a>
	</form>
	<hr>
	<h3>Toll Managemeny System</h3>
	</div>
	
</body>
</html>