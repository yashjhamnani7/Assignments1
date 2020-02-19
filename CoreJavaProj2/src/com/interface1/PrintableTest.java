package com.interface1;
interface Printable
   {
       void print();
    }
  class Employee1 implements Printable
  {
	 public void print()
	  {
		    System.out.println("the objects is an employee");
	  }
  }
  class Circle1 implements Printable
  {
	   public void print()
	   {
		    System.out.println("the object is an circle");
	   }
  }
  
  
  public class PrintableTest
  {
	 static void printAll(Printable p[])
	   {
		   p[0].print();
		   p[1].print();
	   }
	     public static void main(String args[])
		 {
			   Printable p[]=new Printable[2];
			   p[0]=new Employee1();
			   p[1]=new Circle1();
		     printAll(p);
	     }
  }
		  
			   