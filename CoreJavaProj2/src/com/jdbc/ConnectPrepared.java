package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectPrepared {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcom=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","yash");
        System.out.println("Connection established");
        System.out.println();
        
        PreparedStatement ptm=dbcom.prepareStatement(" INSERT INTO student VALUES(?,?,?)");
        PreparedStatement ptm1=dbcom.prepareStatement( "DELETE FROM student WHERE id=?");
        PreparedStatement ptm2=dbcom.prepareStatement("UPDATE student set name='son'where id=?");
        ptm1.setInt(1,444555);
        ptm2.setInt(1,34323);
        int result=ptm1.executeUpdate();System.out.println();
        
        System.out.println(result+" "+"rows deleted");
        System.out.println();
        
       int updaterec=ptm2.executeUpdate();
       System.out.println(updaterec + " "+"records updated");
        ptm.setInt(1,44452432);
        ptm.setString(2,"mottt");
        ptm.setInt(3,2432423);
        
        PreparedStatement ptm3=dbcom.prepareStatement("SELECT * from student");
       ResultSet rs=ptm3.executeQuery();
        System.out.println("the result is");
        System.out.println();
        System.out.println();
        
        while(rs.next())
        {
        	int id=rs.getInt("Id");
        	String  name=rs.getString("name");
        	int phone=rs.getInt("phone");
        	System.out.println();
            
        	System.out.println(id + "  "+ name+"  "+phone);
        }
        
      //  int updates=ptm.executeUpdate();
        //System.out.println(updates+" row added");
        ptm.close();
        dbcom.close();
      //        ResultSet rs=stmt.executeQuery("SELECT * FROM student");  
    
}
}