package com.wrapper;


import java.util.*;
public class Count
   {
     public static void main(String args[])
	     {
		 Scanner sc=new Scanner(System.in);
		   String s=new String();
		  
		   System.out.println("enter the string");
		   s=sc.next();
		    s=s.toLowerCase();
		   char ar[]=s.toCharArray();
		   int count=0;
		     for(int i=0;i<ar.length;i++)
			     {
				 count=1;
				   for(int j=i+1;j<ar.length;j++)
                       {
                                if((ar[i]==ar[j])&&(ar[j]!='0'))
                                    {
                                      count++;
                                      ar[j]='0';
									 }
                        }
						if(ar[i]!='0')
                         System.out.println(ar[i]+" "+count);
                 }
            }
   }			
		         