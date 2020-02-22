package com.exceptions;

import java.io.*; 


 class Account1 implements AutoCloseable {

     public void close() throws Exception
     {
     System.out.println("The account class is closed!");
      }
     public Account1(int balance)
     {
    	 System.out.println("balance is "+balance);
    	 }
}
 
 public class AccountTest
 {
	   public static void main(String args[])
	  
	   
	   
	   {
		   try(Account1 a=new Account1(10000);FileInputStream input = new FileInputStream("file.txt"))
		   {
			  System.out.println("welcome to account");
			  int x=1000/1;
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
		   }
		  
	   }
 }


