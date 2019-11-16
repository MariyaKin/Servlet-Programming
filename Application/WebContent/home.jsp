<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html><%@ page import="java.sql.*" %>
<html>
    <head>
        <title>The tableName Database Table </title>
    </head>

    <body background="file:///C:/Welcomeproject/WebContent/image/lake.jpg">
    <%@page import="java.util.ArrayList"%>      <%--Importing all the dependent classes--%>
	<%@page import="com.face.dao.LoginDAO"%>
    <%@page import="java.util.Iterator"%> 
    <%@page import="java.util.List"%> 
    
      <font color="white"> <h1>Registration Data </H1></font> 
      <font color="white" size="5px" >
     <form action="/Application/LoginServlet" method="post">
		Welcome
		<%=request.getParameter("username") %><br>
			<table border="1" width="303">
				<tr>
					<td width="119"><b>Name</b></td>
					<td width="168"><b>Email</b></td>
					<td width="168"><b>Username</b></td>
					<td width="168"><b>Password</b></td>
				</tr>
		<%Iterator itr;%>
			<% List data= (List)request.getAttribute("data");
				for (itr=data.iterator(); itr.hasNext(); )
					{
			%>
			<tr>
				<td width="119"><%=itr.next()%></td>
				<td width="168"><%=itr.next()%></td>
				<td width="119"><%=itr.next()%></td>
				<td width="168"><%=itr.next()%></td>
			</tr>
		<%}%>
		</table>
	</form>
    </body>
</html>