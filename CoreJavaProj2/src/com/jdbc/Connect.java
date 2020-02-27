package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcom=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","yash");
        System.out.println("Connection established");
        Statement stmt=dbcom.createStatement();
        ResultSet rs=stmt.executeQuery("SELECT * FROM student");  
      
        while(rs.next())
        {
        	int id=rs.getInt("Id");
        	String  name=rs.getString("name");
        	int phone=rs.getInt("phone");
        	System.out.println(id + "  "+ name+"  "+phone);
        }
        
        //updating a record
        String sql = "update student set name='rahul' where Id=234";
        stmt.executeUpdate(sql);
        System.out.println("record updated");
        //
        
        System.out.println();
        //entering a record
        String sql1= "INSERT INTO student " +
                "VALUES (34321,'mohan',97886)";
        stmt.executeUpdate(sql1);
        System.out.println();
        System.out.println("record added");
        System.out.println();
       
        
        
        //deleting a record
       
   stmt.executeUpdate("DELETE FROM student " +
           "WHERE id = 34345");
   System.out.println();
        System.out.println("deleted the record");
        System.out.println();
        ResultSet rst=stmt.executeQuery("SELECT * FROM student");  
        System.out.println();
        while(rst.next())
        {
        	int id=rst.getInt("Id");
        	String  name=rst.getString("name");
        	int phone=rst.getInt("phone");
        	System.out.println(id + "  "+ name+"  "+phone);
        }
        rst.close();
        rs.close();
        stmt.close();
        dbcom.close();
        	
        }
	}


