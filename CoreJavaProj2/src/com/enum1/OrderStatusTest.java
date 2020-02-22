package com.enum1;
enum Status {
	   New(1), Rejected(2),Accepted(3),Completed(4);
	  int status;
	   Status(int status)
	    {
        this.status = status;
		}
		public void setStatus(int status)
		{
			this.status=status;
		}
	   public int getStatus()
	   {
		return this.status;
	   }
	   
	};
	class OrderStatus
	{
		String orderid="";
		String name="";
		int quantity;
		int price;
		int status;
		
		 OrderStatus(String orderid,String name,int quantity,int price)
		 {
			 
		       //Status s=Status.status1;	 
			  this.orderid=orderid;
			  this.name=name;
			  this.quantity=quantity;
			  this.price=price;
			 
			  
		 }
		 public String toString()
		 {
			return this.orderid+" "+this.name+" "+this.quantity+" "+this.price;
	     }
		 
		 
	}
	
	class OrderStatusTest
	{
		   public static void main(String args[])
		   {
			   Status s1=Status.New;
			    Status s2=Status.Completed;
			   Status s3=Status.Rejected;
			   Status s4=Status.Accepted;
			   int s11=s1.getStatus();
			   int s22=s2.getStatus();
			   int s33=s3.getStatus();
			   int s44=s4.getStatus();
			     OrderStatus o[]=new OrderStatus[5];
				    o[0]=new OrderStatus("b32","trim",2,1900);
					o[0].status=s11;
					 o[1]=new OrderStatus("b3332","phone",2,19100);
					 o[1].status=s22;
					  o[2]=new OrderStatus("b3211","tv",2,19900);
					  o[2].status=s33;
					   o[3]=new OrderStatus("b3222","fridge",2,1900);
					   o[3].status=s44;
					   o[4]=new OrderStatus("b342","comp",2,19010);
					   o[4].status=s11;
					   for(int i=0;i<o.length;i++)
					   {
						     int status=o[i].status;
							 switch(status)
							 {
								 case 1:  System.out.println("order is new");
								            System.out.println(o[i]);
											System.out.println();
											break;
								 
								 case 2:  System.out.println("order is rejected");
								            System.out.println(o[i]);
											System.out.println();
											break;
								 
								 case 3:  System.out.println("order is accepted");
								            System.out.println(o[i]);
											System.out.println();
											break;
								 
								 case 4:  System.out.println("order is completed");
								            System.out.println(o[i]);
											System.out.println();
											break;
								 
								
					          }
					   
					   } 
					   
		   }
		   
	}
				      