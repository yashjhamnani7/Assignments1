package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.interface1.Date;

class Account implements Serializable
{
	Date dob;
	transient int acid;
	//private static final long serialVersionUID= 5462223600l;
	String name;

	public Account(int acid,String name,Date dob)
	{
	this.acid=acid;
	this.name=name;
	this.dob=dob;
	}
	
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getAcid() {
		return acid;
	}

	public void setAcid(int acid) {
		this.acid = acid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [dob=" + dob + ", acid=" + acid + ", name=" + name + "]";
	}
	
}


public class Serialization
{
	 public static void main(String args[]) throws Exception
	   {
      Account a=new Account(7865,"Yash",new Date(14,12,2020));
        // writeObjects(a);
       Account a1=readObjects();
        System.out.println(a1);
      
    	}
	 public static void writeObjects(Account a) throws Exception
	  {
       File f=new File("C:\\Users\\YASH JHAMNANI\\git\\Assignments1\\CoreJavaProj2\\src\\write.txt");
       FileOutputStream fos=new FileOutputStream(f);
       
       ObjectOutputStream out = new ObjectOutputStream(fos);
       out.writeObject(a);
       System.out.println("object is written");
       out.flush();
       out.close();
       fos.close();
       }
	 public static Account readObjects() throws Exception
	 {
		 File f=new File("C:\\Users\\YASH JHAMNANI\\git\\Assignments1\\CoreJavaProj2\\src\\write.txt");
		 FileInputStream fis=new FileInputStream(f);
		 ObjectInputStream ois=new ObjectInputStream(fis);
		 Account a=(Account)ois.readObject();
		 ois.close();
		 fis.close();
         return a;
		 
	 }
	
}
