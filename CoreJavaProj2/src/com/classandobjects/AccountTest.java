class Account
     {
	   private int accountid;
	   private double amount;
	   private String name="";
	   
	    public Account(int accountid,double amount,String name) 
		     {
             this.accountid=accountid;
			 this.amount=amount;
			 this.name=name;
             }
			 
			 
		        public double getBalance()	
                 {
                 return this.amount;
				 
			     }
				   public int getAccountid()	
                 {
                 return this.accountid;
				 
			     }
				  
				 public String getName()	
                 {
                 return this.name;
				 
			     }
				  
				       public double deposit(double amount)
						{
							this.amount=this.amount+amount;
							return this.getBalance();
						}
						public double withdraw(double amount)
							{
              
								if((this.amount-amount)<0)
									{
									System.out.println("not sufficient balance");
									return -1;
									}
							this.amount=this.amount-amount;
							return this.getBalance();
                            }
                           

						 public String toString()
		                     {
           		               return "balance= "+this.getBalance()+ "  Name: " +this.getName()+ "  Accountno: "+this.getAccountid();
			                  }	
                         					  			
       }
  public class AccountTest
    {
	    public static void main(String args[])
		{
		  Account a1=new Account(9832321,10000,"Yash");
	        System.out.println(a1);	
             a1.deposit(5000);
             a1.withdraw(3000);
			         System.out.println(a1);	
           			 
		 }
    }		 

	   