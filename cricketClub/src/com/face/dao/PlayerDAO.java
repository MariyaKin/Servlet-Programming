 package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.PlayerBO;
import com.face.utility.ConnectionManager;

public class PlayerDAO {
	public static void createPlayer(Connection connection, PlayerBO pbo, int skillId, int teamId) {
		// TODO Auto-generated method stub
		try {
			Statement stmnt=connection.createStatement();
			String query="insert into player(name,country,skill_id,team_id)values('"+pbo.getPlayer()+"','"+pbo.getCountry()+"',"+skillId+","+teamId+")";
			int res=stmnt.executeUpdate(query);
			if(res==1) {
				System.out.println("Player has been added successfully");
			}
			else {
				System.out.println("Player has'nt been added");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void getAllPlayerDetails(Connection connection) {	
		Statement stmnt;
		try {
			stmnt = connection.createStatement();
		
			String query="select * from player p,team t,skill s where p.team_id=t.id and p.skill_id=s.id";
		//	System.out.println(query);
			ResultSet res=stmnt.executeQuery(query);
			System.out.println("Details");
			System.out.println("Player name \t Country \t Skill \t Team");
			while(res.next()) {
				System.out.println(res.getString("p.name")+"\t"+res.getString("country")+"\t"+res.getString("s.name")+"\t"+res.getString("t.name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void searchByTeam(Connection connection, String skillName) {
		// TODO Auto-generated method stub
		Statement stmnt;
		try {
			stmnt = connection.createStatement();
		
			String query="select * from player p,team t,skill s where p.team_id=t.id and p.skill_id=s.id and s.name='"+skillName+"'";
		//	System.out.println(query);
			ResultSet res=stmnt.executeQuery(query);
			System.out.println("Details");
			System.out.println("Player name \t Country \t Skill \t Team");
			while(res.next()) {
				System.out.println(res.getString("p.name")+"\t"+res.getString("country")+"\t"+res.getString("s.name")+"\t"+res.getString("t.name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
