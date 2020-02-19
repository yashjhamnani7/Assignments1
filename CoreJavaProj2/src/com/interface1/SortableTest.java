package com.interface1;
interface Sortable
   {
	  boolean compare(Sortable s);
    }
  class Employee implements Sortable
  {
	  String name="";
	  int salary=0;
	  public Employee(String name,int salary)
	  {
		this.name=name; 
        this.salary=salary;		
			
	  }
	 
	   public boolean compare(Sortable s)
	   {
		   if(this.salary<((Employee)s).salary)
			   return true;
		   else
			   return false;
	   } 
	     public String toString()
	   {
		     return this.name+" "+this.salary;
			 
	   }
  }
  class Circle implements Sortable
  {
	   int rad=0;
	    public Circle(int rad)
		{
        this.rad=rad;
 
        } 
	   public boolean compare(Sortable s)
	   {
		   if(this.rad<((Circle)s).rad)
			   return true;
		   else
			   return false;
	   } 
	   public String toString()
	   {
		     return this.rad+" ";
			 
	   }
  }
  
  
  public class SortableTest
  {
	 static void sortAll(Sortable p[])
	   {
		   Sortable temp;
		   
			for(int i=0;i<p.length;i++)
			{
				  for(int j=i+1;j<p.length;j++)
					  
					  {
						   if(p[i].compare(p[j]))
					   {
                              temp=p[i];
                        p[i]=p[j];
                        p[j]=temp;						
					    }
						  
			          }
		   }
		   for(int i=0;i<p.length;i++)
		   {
			    System.out.println(p[i]);
		   }
		   
	   }
	     public static void main(String args[])
		 {
			   Sortable p[]=new Sortable[2];
			  p[0]=new Employee("Mohan",1000);
			   p[1]=new Employee("Sohan",2000);
			   sortAll(p);
			    Sortable s[]=new Sortable[4];
				  s[0]=new Circle(10);
				  s[1]=new Circle(11);
				   s[2]=new Circle(6);
				    s[3]=new Circle(5);
		       sortAll(s);
	     }
  }
	