package com.filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class Accountadd
{
	int accno=0;
	double balance=0.0;
	String name="";
	public Accountadd(int accno,double balance,String name)
	{
		this.accno=accno;
		this.balance=balance;
		this.name=name;
	}
	void addfile() throws Exception
	{
		File f=new File("C:\\ibmfullstacktraining\\account1.txt");
		FileOutputStream fos=new FileOutputStream(f,true);
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(accno);
		dos.writeDouble(balance);
		dos.writeUTF(name);
		dos.flush();
		fos.flush();
		dos.close();
		fos.close();
	}
	
}





public class AccountHandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	   Accountadd ad[]=new Accountadd[3];
	   
	   ad[0]=new Accountadd(54632,15000,"yash");
	   ad[0].addfile();
	   ad[1]=new Accountadd(54633,16000,"mohan");
	   ad[1].addfile();
	   ad[2]=new Accountadd(54635,15300,"rohit");
	   ad[2].addfile();
	   System.out.println("file added");
	   
	   
	   //reading the file
	   File file = new File("C:\\ibmfullstacktraining\\account1.txt");
	   FileInputStream fis = new FileInputStream(file);
	   DataInputStream dis = new DataInputStream(fis);
	  for(int i=0;i<3;i++)
	  {
	   int id = dis.readInt();
	   double balance = dis.readDouble();
	   String name = dis.readUTF();
	   System.out.println("account id "+id+" balance "+balance+" name "+name);
	   }
	  
	   dis.close();
	   fis.close();
	   
	   
	
	   
	}
	

}
