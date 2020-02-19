package com.buffer;
class Banner
   {
     public static void main(String args[]) throws Exception
	 {
		 StringBuilder s1=new StringBuilder("Welcome to Java");
		 int len=s1.length();
		char s;
		 for(int i=0;i<len;i++)
		 {
			   s=s1.charAt(s1.length()-1);
			   s1 = new StringBuilder(s+s1.substring(0,s1.length()-1));
			   System.out.println("\r"+s1);
			   Thread.sleep(500);
		}
     }
   }