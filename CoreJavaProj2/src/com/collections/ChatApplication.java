package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ChatApplication {

	
	static HashMap<String,String> msports= new HashMap<String,String>();
	     static  ArrayList<String> al=new ArrayList<String>();
	public static void addRoom(String name)
	{
	   
				
		   if(al.contains(name))
		   {
			   System.out.println("already present");
		   }
		   else
			   al.add(name);
	
	}
	public static void addUser(String room,String name)
	{
		  
		  msports.put(room,name);
		 
	}
	public static void main(String args[])
	{
		
		
		
		
	}
}
		
		class User
		
		{
		String name;
		String room;
        Scanner sc=new Scanner(System.in);
        
		while(true)
		{
	    System.out.println("weclome to the java chatroom");
	    System.out.println("A) Create a chatroom\r\n" + 
	    		"B) Add the user\r\n" + 
	    		"C) User login\r\n" + 
	    		"D) Send a message\r\n" + 
	    		"E) Display the messages from a specific chatroom\r\n" + 
	    		"F) List down all users belonging to the specified chat room.\r\n" + 
	    		"G) Logout\r\n" + 
	    		"H) Delete an user\r\n" + 
	    		"I) Delete the chat room.\r\n" + 
	    		"");
	    System.out.println("Please choose an option");
	    char ch=sc.next().charAt(0);
	    switch(ch)
	    {
	    case 'A':   System.out.println("please enter the room");
                      room=sc.next();
                      addRoom(room);
                      break;
	    	
	    	
	    case 'B':    System.out.println("please enter the name ");
                     name=sc.next();
                     System.out.println("please enter the room");
                     room=sc.next();
                     addUser(name,room);
                     break;
                     
	    case 'C':     System.out.println("please enter the room");
	                 room=sc.next();
	                 System.out.println("please enter the name");
	                 name=sc.next();
	                
	                 
	    }
		}
		  
		}
