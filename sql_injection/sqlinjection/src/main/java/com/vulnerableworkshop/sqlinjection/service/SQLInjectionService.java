package com.vulnerableworkshop.sqlinjection.service;

import org.springframework.stereotype.Service;

import com.vulnerableworkshop.sqlinjection.model.VulnUser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Service
public class SQLInjectionService 
{
	

	
	public String injection(String query)
	{
		String vulnQuery = "Select * from users where username = '"+query+"';";
		Connection con = null;
		StringBuilder result = new StringBuilder();
		
		try
		{
			
			
			con = DriverManager.getConnection("jdbc:sqlite::memory:");
			
			Statement insertStatement = con.createStatement();
			con.setAutoCommit(false);
			insertStatement.executeUpdate("create table users ( username varchar(50),password varchar(50) ); insert into users values ('john','doe'); insert into users values ('mark','snow');  ");
			con.commit();	
			
			Statement statementVuln = con.createStatement();
			ResultSet rs = statementVuln.executeQuery(vulnQuery);
			
			
			while(rs.next())
			{
				VulnUser user = new VulnUser();
				user.setUsername(rs.getString(1));
				result.append(user.getUsername()+" - ");
			}
			
			con.close();
			return result.toString();
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
			
		}
		
	}

}
