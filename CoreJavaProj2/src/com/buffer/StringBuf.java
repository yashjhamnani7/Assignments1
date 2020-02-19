package com.buffer;
class StringBuf
    {
	  public static void main(String args[])
	  {
		   String s="ABC";
		   String s1=new String("ABC");
		   if(s==s1)
			      System.out.println("== operator works");
			  else if(s.equals(s1))
				    System.out.println("equals operator works");
	  }
	}
   