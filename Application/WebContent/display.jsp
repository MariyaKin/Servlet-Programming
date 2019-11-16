<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html><%@ page import="java.sql.*" %>

<% Class.forName("com.mysql.jdbc.Driver"); %>

<html>
    <head>
        <title>The tableName Database Table </title>
    </head>

    <body background="file:///C:/Welcomeproject/WebContent/image/lake.jpg">
      <font color="white"> <h1>Registration Data </H1></font> 
        <% 
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/Applicationregister", "root", "");
            Statement statement = connection.createStatement() ;
            ResultSet resultset = 
            		
            		statement.executeQuery("select * from registerapp") ; 
        %>
<font color="black" size="5px" >
        <table BORDER="3"bgcolor="white">
            <TR>
                <TH>Name</TH>
                <TH>Email</TH>
                <TH>Username</TH>
                <TH>Password</TH>
               
            </TR>
            <% while(resultset.next()){ %>
            <TR>
                <TD> <%= resultset.getString(1) %></td>
                <TD> <%= resultset.getString(2) %></TD>
                <TD> <%= resultset.getString(3) %></TD>
                <TD> <%= resultset.getString(4) %></TD>
               
            </TR>
            <% } %>
        </table></font>
    </body>
</html>