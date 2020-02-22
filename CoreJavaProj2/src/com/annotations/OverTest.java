package com.annotations;
class Over
{ 
     @Deprecated
     public void display() 
     { 
         System.out.println("Base display()"); 
     } 
} 
class OverTest extends Over 
{  
      @Override
     @SuppressWarnings({"deprecation"})
     public void display() 
     { 
         System.out.println("Derived display(int )"); 
     } 
    @SuppressWarnings({"deprecation"})
     public static void main(String args[]) 
     { 
         Over obj = new OverTest(); 
         obj.display(); 
     } 
}