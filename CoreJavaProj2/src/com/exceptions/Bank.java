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
	//if we use throws here in this line, then it//will only telll the complier that might be an exception but does not handle it,
	  //if exception truly occurs the program will not execute;
	   
	  {
		  double bal=10000;
		try {
			bal=Account.withdraw(bal,1000);
			System.out.println("balance is "+bal);
		} catch (InsusfficientBalanceException e) {
			 
			e.printStackTrace();
		}
	  
		//	bal=Account.withdraw(bal,1000);
			//System.out.println("balance is "+bal);
		  
			 
	  }
	
}



