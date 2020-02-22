package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import com.interface1.Date;

class Account1
{
	
	String name;
	int accntid;
	double balance;
  
	public Account1(int accntid,String name,double balance) throws FileNotFoundException
	{
		this.accntid=accntid;
		this.name=name;
		this.balance=balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccntid() {
		return accntid;
	}

	public void setAccntid(int accntid) {
		this.accntid = accntid;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account1 [name=" + name + ", accntid=" + accntid + ", balance=" + balance + "]";
	}
	
	
}




public class Accountcrud {
	static RandomAccessFile raf;
	static void accountCreate(Account1 a) throws IOException
	{
		
           raf.writeInt(a.accntid);
		   raf.writeUTF(a.name);
		   raf.writeDouble(a.balance);
		  // long currentPosition= raf.getFilePointer();
		   
	}
	 static  void accountRead() throws IOException
	  {

		  long currentPosition= raf.getFilePointer();
		  raf.seek(0);
		  while(raf.getFilePointer()!=raf.length())
		      {
			   int id = raf.readInt();
			   String name = raf.readUTF();
			   double salary = raf.readDouble();
			   System.out.println(" id: "+id+" "+" name: "+" "+name+" balance "+salary);
			   }
		  raf.seek(0);
	
	  }
	 static  void accountUpdate(Account1 a,double balance) throws IOException
	  {
		  raf.seek(0);
		  //System.out.println(raf.getFilePointer());
		  int id;
		  while(raf.getFilePointer()!=raf.length())
	      {
		    id = raf.readInt();
		   // System.out.println(raf.getFilePointer());
		     if(id==a.getAccntid())
		      {
		     	 raf.seek(4+a.name.length());
		    	   raf.writeDouble(balance);
		    	// System.out.println(a.getAccntid());
		    	 //System.out.println(raf.getFilePointer());
		    	   break;
		      }
		     else
		       raf.seek(raf.getFilePointer()+3);
		  
		   }
		  
	  }
	  void accountDelete()
	  {
		  
	  }
	

	public static void main(String[] args) throws IOException
	{
		File file= new File("C:\\Users\\YASH JHAMNANI\\git\\Assignments1\\CoreJavaProj2\\src\\accountdetails.txt");
		raf= new RandomAccessFile(file, "rw");
		// TODO Auto-generated method stub
         Account1 a[]=new Account1[3];
         a[0]=new Account1(5678,"Yash",900.0);
         a[1]=new Account1(5134,"rohan",4500.0);
         a[2]=new Account1(5645,"rohit",5000.0);
          accountCreate(a[0]);
          accountCreate(a[1]);
          accountCreate(a[2]);
          accountRead();
          accountUpdate(a[0],20000.0);
          System.out.println("afterupdate");
          accountRead();
	}

}
