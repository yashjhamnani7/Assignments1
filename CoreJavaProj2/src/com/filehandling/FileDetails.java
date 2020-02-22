package com.filehandling;

import java.io.File;
import java.text.SimpleDateFormat;

 class File1
{
	File f;
  public File1(String name) 
  {
	   f=new File(name);
		
	   
  }
  public String toString()
  {
	  SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");	
		
	    System.out.println(sdf.format(f.lastModified()));
	  return "File name "+f.getName()+" "+"File space "+f.getTotalSpace()+" "+"File directory "+f.getParent()+" can read "+f.canRead()+" write "+f.canWrite()+" execute "+f.canExecute();
  }
}
	
  public class FileDetails
  {
	    public static void main(String args[])
	    {
	    	
	    	File1 f[]=new File1[2];
	    	 System.out.println("file details are");
	    	f[0]=new File1("C:\\ibmfullstacktraining\\abc.txt");
	    	f[1]=new File1("C:\\ibmfullstacktraining\\cde.txt");
	    	System.out.println(f[0]);
	    	System.out.println(f[1]);
	    	
	    	
	    	
	    }
}
