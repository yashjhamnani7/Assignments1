package com.inheritance;
class Employee
  {
    private int id,salary;
	private String name;
	
			public Employee(int id,int salary,String name) 
				{
					this.id=id;
					this.salary=salary;
					this.name=name;
				}
			public int getSalary()
			{
				return this.salary;
			}
		 
			public String toString()
			 {
			  return this.id+"-"+this.salary+"_"+this.name;
			  }
	}
	
	
class Manager extends Employee
	    {
		 private int incentive=0;
		  public Manager(int id,int salary,String name,int incentive)
		       {
			     super(id,salary,name);
				 this.incentive=incentive;
			    }
		  public int getSalary()
		       {
			     return (super.getSalary()+this.incentive);
			   }
			   public String toString()
			 {
			  return super.toString()+"-"+this.incentive;
			  }
			   
		}	

class Labour extends Employee
	    {
		private int overtime=0;
		  public Labour(int id,int salary,String name,int overtime)
		       {
			     super(id,salary,name);
				 this.overtime=overtime;
			    }
		  public int getSalary()
		       {
			     return (super.getSalary()+ this.overtime);
			   }
			    public String toString()
			 {
			  return super.toString()+"-"+this.overtime;
			  }
			   
			   
		}			
		
public class Emp
        {
		   public static int totalSalary(Employee e[])
		       {
			    int totalSalary=0; 
			      for(int i=0;i<e.length;i++)
				        {
						   totalSalary=totalSalary +e[i].getSalary();
						 }
						 return totalSalary;
               }
			  
					public static void main(String args[])
							{
				              Employee e[]=new Employee[4];
							  e[0]=new Manager(8786,9000,"Mohan",1000);
							  e[1]=new Manager(8789,9000,"Soohan",1000);
							  e[2]=new Labour(8780,9000,"Mohan",500);
							  e[3]=new Labour(8781,9000,"Mohan",600);
							 int totalSalary= totalSalary(e);
							 System.out.println(totalSalary);
			      
						    }
		}					 
							  
							  
				 
				 
				 
				 
							  
				 
				  
				  
				  


 

		