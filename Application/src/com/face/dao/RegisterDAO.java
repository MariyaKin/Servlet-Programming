package com.face.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.face.bo.*;

public class RegisterDAO {
	public static void save(Connection connection,RegisterBO regbo)throws Exception
	{
		Statement st=connection.createStatement();
		String query="INSERT INTO registerapp VALUES('"+regbo.getName()+"','"+regbo.getEmail()+"','"+regbo.getUsername()+"','"+regbo.getPassword()+"')";
		int result=st.executeUpdate(query);
		if(result==1)
			{
			System.out.println("Data inserted Successfully"); 
				   
			}
		else
			{
			System.out.println("Please Check");
			}
 }

}
