package com.exceptions;

public class Test {
	public static void  main(String args[])
	{
		try {
			int division = 10/5;
			
			   try {
			       int ary[] = new int[5];
			       ary[7] = 34;
			       }
			    catch(ArrayIndexOutOfBoundsException e) {
			     e.printStackTrace();
			      }
			}
			catch(ArithmeticException e) {
			e.printStackTrace();
			}
		   finally
		   {
			   System.out.println("hello");
		   }
		System.out.println("hello this is yash");
	    
		
		
	}

}
