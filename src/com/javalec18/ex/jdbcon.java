package com.javalec18.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcon {


public static void main(String[] args)  {
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String uid = "jsp_practice1";
	String upw = "1111";
	String query = "select id,pw,name from member";
	System.out.println("����");
	
	try{
		
		Class.forName(driver);	//oracle.jdbc.driver.OracleDriver
		connection = DriverManager.getConnection(url, uid, upw);	//jdbc:oracle:thin:@localhost:1521:xe
		statement = connection.createStatement();
		resultSet = statement.executeQuery(query);	//select * from member

		while(resultSet.next()){
			String id = resultSet.getString("id");
			String pw = resultSet.getString("pw");
			String name = resultSet.getString("name");

			System.out.println("���̵�: "+id);
			System.out.println("��й�ȣ: "+pw);
			System.out.println("�̸�: "+name);
			
		}
		
	} catch(Exception e) {
	} finally {
		try{
			if(resultSet != null) resultSet.close();
			if(statement != null) statement.close();
			if(connection != null) connection.close();
		} catch(Exception e){}
	}
}
}
