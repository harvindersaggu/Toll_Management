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
	border-radius: 10px;
	padding: 10px;
}

input[type=email] {
    padding: 12px 20px;
    margin: 8px 0;
    border: 2px solid grey;
    border-radius: 4px;
    box-sizing: border-box;
    width: 40%;
    height: 3%;
}
input[type=submit]
{
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
<body>
<div align="center">
<h1>Find Your Account<hr></h1>
	<form action="forgotPassword.toll" method="post">
	Please enter your email address search for your account.</br>
		<input type="email" name="email">
		<br>
		<input type="submit" value="Submit">
	</form>
	<hr>
	<h5>Toll Managemeny System</h5>
	</div>
</body>
</html> 