package com.exceptions;

public class MultipleCatch1 {
	public static void main(String[] args) {  
          
           try{    
                int a[]=new int[5];
                a[6]=20;
                a[5]=30/0;    
               }    
         
               catch(ArithmeticException|ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
          
           //start from the most specific to the most general
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
}  


