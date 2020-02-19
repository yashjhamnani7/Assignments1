package com.exceptions;


 class InsusfficientBalanceException extends Exception //RuntimeException
 {
	 //checked exception
   private String message;
    public InsusfficientBalanceException()
   {
	this.message=" "; 
     }
   public InsusfficientBalanceException(String message) 
     {
	this.message = message; 
     }
    public String toString() {
	
    return "" + this.message;
     }
}




class Account 
{
	
public static double withdraw(double balance,double with) throws InsusfficientBalanceException
   {
	if(balance<with)
	{
		throw new InsusfficientBalanceException("low balance "+balance);
	}
	balance=balance-with;
	return balance;
   }
}
class Bank
{
	  public static void main(String args[])
	  {
		  double bal=500;
		try {
			bal=Account.withdraw(bal,1000);
			System.out.println("balance is "+bal);
		} catch (InsusfficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			//bal=Account.withdraw(bal,1000);
			//System.out.println("balance is "+bal);
		  
			 
	  }
	
}



