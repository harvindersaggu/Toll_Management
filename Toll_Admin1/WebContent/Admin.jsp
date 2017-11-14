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
select {
    padding: 16px 20px;
    border: 2px solid grey;
    border-radius: 4px;
    background-color: #f1f1f1;
}
input[type=text],input[type=email] {
    padding: 12px 20px;
    margin: 8px 0;
    border: 2px solid grey;
    border-radius: 4px;
    box-sizing: border-box;
    width: 40%;
    height: 3%;
}
input[type=submit],input[type=reset] {
    padding: 12px 20px;
    margin: 8px 0;
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
	<h1>Admin Page</h1>
	<h4>${user}</h4>
	<h6><a href="logout.toll">Logout</a></h6>
	<hr>
		<form action="addAdmin.toll" method="post">
		${msg} 
			<br> Name:<input type="text" name="username"><br>
			<br> Email:<input type="email" name="email"><br>
			<br> Choose Toll:<select name="choosetoll">
				<option value="MGroad">MGroad</option>
				<option value="Rajajinagar">Rajajinagar</option>
				<option value="Yehalanka">Yehalanka</option>
				<option value="Hebbal">Hebbal</option>
			</select><br>
			<br> Expiry Date:<input type="date" name="expiryDate"><br>
			<br> Status:<input type="radio" name="status" value="1">Active
			<input type="radio" name="status" value="0" checked="checked">Inactive<br>
			<input type="submit" value="Add">&nbsp;<input type="reset" value="Clear"><br>
			<br>
		</form>
		<hr>
	<h5> Toll Managemeny System</h5>
	</div>
</body>
</html> 