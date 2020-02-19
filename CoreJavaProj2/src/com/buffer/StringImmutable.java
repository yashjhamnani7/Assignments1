package com.buffer;
class StringImmutable
    {
	 
	   public static void main(String args[])
	   {
		      String s="hello";
			  String s2=s;
			  s2=s+"world";
			  StringBuilder s1=new StringBuilder("hello");
			  s1.append("world");
			  if(s.equals("helloworld"))
				  System.out.println("Strings are mutable");
			  else if(s1.equals("helloworld"))
			     System.out.println("StringBuilder are mutable");
			 
	   }
	}
			  