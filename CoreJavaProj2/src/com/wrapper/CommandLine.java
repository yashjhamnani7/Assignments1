package com.wrapper;

import java.util.*;
class CommandLine
   {
    public static void main(String args[])
       {
           int len=args.length;
		   int temp;
          int arr[]=new int[len];
         for(int i=0;i<len;i++)
            {
		    
            arr[i]=Integer.parseInt(args[i]);
            }
			for(int i=0;i<arr.length;i++)
			{
				  for(int j=i+1;j<arr.length;j++)
					  
					  {
						   if(arr[i]>arr[j])
					   {
                              temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;						
					    }
						  
			          }
		   }
         
                 System.out.println("the array is");
           for(int i=0;i<len;i++)
              {
                 System.out.println(arr[i]);
               }
        }
  }