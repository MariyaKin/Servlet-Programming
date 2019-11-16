package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;

import com.face.bo.LoginBO;
import com.face.bo.RegisterBO;
import com.mysql.jdbc.PreparedStatement;

public class LoginDAO {
	public static boolean save(Connection connection,LoginBO logbo)throws Exception
	{
		boolean status = false;
		Statement stmt=connection.createStatement();
		String query="select * from registerapp where username ='"+logbo.getUsername()+"' and password='"+logbo.getPassword()+"';";
		        ResultSet result = stmt.executeQuery(query);
		        if(result.next())
		        {
		            System.out.println("LoginSuccessful");
		            logbo.setName( result.getString("name"));
		            logbo.setEmail( result.getString("email"));
		            logbo.setUsername(result.getString("username"));
		            result.getString("password");
		            
		              status=true;
		           
		        }else{
		        System.out.println("username and password are incorrect");
		       
		        }return status;	   
        
 }
	

	
	
}

