package com.mm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	
	static DBConnector db;
	
	public DBConnector() throws ClassNotFoundException {
		super();
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
	
	public static DBConnector getInstance() throws ClassNotFoundException
	{
		if(db==null)
		db=new DBConnector();
		return db;
	}
	public static Connection getConnection()throws SQLException
	{
	return (DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone","root","Madhu!1234"));
	}
}
