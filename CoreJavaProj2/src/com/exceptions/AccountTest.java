package com.exceptions;




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
		   try(Account1 a=new Account1(10000))
		   {
			  System.out.println("welcome to account");
			  int x=1000/0;
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
		   }
		  
	   }
 }


