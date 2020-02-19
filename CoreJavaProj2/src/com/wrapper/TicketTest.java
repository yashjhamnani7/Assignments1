package com.wrapper;
import java.util.*;
  

   class FlightTicket
   {
	   String from="";
	   String to="";
	   String seatNo="";
	   
	   int price=0,weight;
	   
	   double totalprice=0.0;
	   double insurance=0.0;
	   
	     public FlightTicket(String from,String to,String seatNo,int price)
	     {
		  this.from=from;
		  this.to=to;
		  this.seatNo=seatNo;
		  this.price=price;
		 }
		 void calculate(int weight)
		 {
			   this.weight=weight;
			   insurance=0.1*price;
			   if(weight>15)
			   totalprice=price +0.3*price+insurance;
		       else
			   totalprice=price+insurance;
		 
		      
		 }
		 public String toString()
		 {
			   return from+" "+to+" "+seatNo+" "+totalprice+" "+weight+"kg";
	     }	
   }	
      class TrainTicket
   {
	   String from="";
	   String to="";
	   String seatNo="";
	  
	   int price=0,weight;
	   String type="";
	   double totalprice=0.0;
	   double insurance=0.0;
	   
	     public TrainTicket(String from,String to,String seatNo,int price)
	     {
		  this.from=from;
		  this.to=to;
		  this.seatNo=seatNo;
		  this.price=price;
		 }
		 void calculate(String type)
		 {
			   this.type=type;
			  
			   
		 }
		 public String toString()
		 {
			   return from+" "+to+" "+seatNo+" "+price+" "+type;
			   
	     }		   
   }	
   class BusTicket
   {
	   String from="";
	   String to="";
	   
	   int price=0,weight;
	
	   double totalprice=0.0;
	   double insurance=0.0;
	   String seatNo="";
	   
	     public BusTicket(String from,String to,String seatNo,int price)
	     {
		  this.from=from;
		  this.to=to;
		  this.seatNo=seatNo;
		  this.price=price;
		  
		 }
		public String toString()
		 {
			   return from+" "+to+" "+seatNo+" "+price;
	     }	
   }		 
   
  public class TicketTest
   {
	      public static void main(String args[])
		  {
			  FlightTicket f[]=new FlightTicket[5];
			  TrainTicket t[]=new TrainTicket[3];
			    BusTicket b[]=new BusTicket[2];
				f[0]=new FlightTicket("delhi","goa","2b",1000);
			     f[1]=new FlightTicket("delhi","manali","7b",1000);
				 f[2]=new FlightTicket("delhi","jaipur","5b",1000);
				 f[3]=new FlightTicket("delhi","goa","3b",1000);
				 f[4]=new FlightTicket("delhi","mumbai","2a",1000);
				 
				 f[0].calculate(10);
				  f[1].calculate(7);
		        f[2].calculate(15);
				 f[3].calculate(15);
		          f[4].calculate(12);
				   System.out.println("flight ticekt");
				  for(int i=0;i<f.length;i++)
				 System.out.println(f[i]);
			    
				  t[0]=new TrainTicket("delhi","goa","b45",1000);
				  t[1]=new TrainTicket("delhi","goa","d88",1000);
				  t[2]=new TrainTicket("delhi","goa","d23",1000);
				  t[0].calculate("3rd ac");
				  t[1].calculate("2ndac");
				  t[2].calculate("2ndac");
				   System.out.println("train ticekt");
				  for(int i=0;i<t.length;i++)
				 System.out.println(t[i]);
			 
				   b[0]=new BusTicket("delhi","goa","d23",1000);
				   b[1]=new BusTicket("hyderabad","delhi","b56",1000);
				    System.out.println("bus ticekt");
				   for(int i=0;i<b.length;i++)
				 System.out.println(b[i]);
		  }
   }		  
		   
		   
		   
		   
		   
		

   
		  
		  
		  
		  