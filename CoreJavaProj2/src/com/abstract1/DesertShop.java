package com.abstract1;
import java.util.*;

abstract class DessertItem
   {
      int tax,price,quantities;
      abstract int getCost(int n);
	  abstract int getQuantity();
	  abstract int addQuantity(int n);
   }
   
 class Candy extends DessertItem
    {
		Scanner sc=new Scanner(System.in);
	   int price,quantities=10;
	   int getCost(int n)
	      {
			  if((quantities>0)&&(quantities<=n))
			  {
		     price=n*3*60;
			 quantities=quantities-n;
		     return price;
			  }
			  return 0;
		   }
		  int getQuantity()
		 {
			return this.quantities;
		 }
		  int addQuantity(int n)
		 {
			 quantities=quantities+n;
			 return quantities;
		 }
		 
    }
  class Cookie extends DessertItem
    {
	   int price,quantities=10;
	   int getCost(int n)
	      {
			   if((quantities>0)&&(quantities<=n))
			  {
		     price=n*5*60;
			  quantities=quantities-n;
		     return price;
			  }
			  return 0;
		   }
		     int getQuantity()
		 {
			return this.quantities;
		 }
		  int addQuantity(int n)
		 {
			 quantities=quantities+n;
			 return quantities;
		 }
    }
  class IceCream extends DessertItem
    {
	   int price,quantities=10;
	   int getCost(int n)
	      {
			   if((quantities>0)&&(quantities<=n))
			  {
		     price=n*6*60;
			 quantities=quantities-n;
		     return price;
			  }
			  return 0;
		   }
		    int getQuantity()
		 {
			return this.quantities;
		 }
		  int addQuantity(int n)
		 {
			 quantities=quantities+n;
			 return quantities;
		 }
		 
    }
	
	class DesertShop
	   {
	     public static void main(String args[])
		     {
				 int totalcost=0,total=0;
			   Scanner sc=new Scanner(System.in);
			   
			   DessertItem d[]=new DessertItem[3];
			   d[0]=new Candy();
			   d[1]=new Cookie();
			   d[2]=new IceCream();
			   int n,number;
			  
			   
			   System.out.println("whether owner or customer");
			   char c=sc.next().charAt(0);
			  
				   
			   switch(c)
			   {
				     case 'c':  System.out.println("enter what do u want");
					          System.out.println("enter 1. for candy \n"+ "enter 2:for icecream\n"+"enter 3 for cookie\n");
							  n=sc.nextInt();
							  
							  if(n==1)
							  {
								  System.out.println("enter the quantities\n");
								  int q=sc.nextInt();
								  totalcost=totalcost+d[0].getCost(q);
								  System.out.println("you have to pay\n"+totalcost);
							  }
							  if(n==2)
							  {
								  System.out.println("enter the quantities\n");
								   int q=sc.nextInt();
								  totalcost=totalcost+d[1].getCost(q);
								  System.out.println("you have to pay\n"+totalcost);
							  }
							  if(n==3)
							  {
								  System.out.println("enter the quantities\n");
								   int q=sc.nextInt();
								  totalcost=totalcost+d[2].getCost(q);
								  System.out.println("you have to pay\n"+totalcost);
							  }
							  
							  break;
					case 'o':	 System.out.println("enter what do u want to look for");
					          System.out.println("enter 1. for candy \n"+ "enter 2:for icecream\n"+"enter 3 for cookie\n");  
								n=sc.nextInt();
							  
							  if(n==1)
							  {
								  System.out.println("enter the quantities to add\n");
								  number=sc.nextInt();
								  total=d[0].addQuantity(number);
								  System.out.println("your quantities\n"+total);
							  }
							  if(n==2)
							  {
								  System.out.println("enter the quantities to add\n");
								   number=sc.nextInt();
								  total=d[1].addQuantity(number);
								  System.out.println("your quantities\n"+total);
							  }
							  if(n==3)
							  {
								  System.out.println("enter the quantities to add\n");
								   number=sc.nextInt();
								  total=d[2].addQuantity(number);
								  System.out.println("your quantities\n"+total);
							  }
							  
							  break;
			   }
			   sc.close();
			   }
			   
			 
	   }			 
	
  
		    
		    
    
       