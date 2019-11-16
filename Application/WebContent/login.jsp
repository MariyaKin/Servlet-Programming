<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.f1
{
background-color:white;
color:black;
width:40%;
height:80%;
margin-left:30%;
padding-left:10%;
margin-top:20%;
border:5px solid black;
padding-bottom:10%;
}
</style>
</head>
<body background="file:///C:/Welcomeproject/WebContent/image/lake.jpg">
<form action="/Application/LoginServlet" method="post" class="f1">
<h1>LOGIN</h1>
    Enter user name :<input type="text" name="username"> <br><br>
<br>
    Enter password :<input type="password" name="password"><br><br>
<br>
    <input type="submit" value="Login">
  
</form>

</body>
</html>