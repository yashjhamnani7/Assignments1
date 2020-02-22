package com.filehandling;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;



public class sequencestream  {

	public static void main(String[] args) throws Exception {
	      
		
		FileInputStream fin1=new FileInputStream("C:\\ibmfullstacktraining\\abc.txt");
		FileInputStream fin2=new FileInputStream("C:\\ibmfullstacktraining\\cde.txt");
		FileInputStream fin3=new FileInputStream("C:\\ibmfullstacktraining\\efg.txt");
	
		
		 Vector v = new Vector(); 
         
	        v.add(fin1); 
	        v.add(fin2); 
	        v.add(fin3); 
	          
	        //creating enumeration object by calling the elements method 
	        Enumeration enumeration = v.elements(); 
	  
		
		
		
		SequenceInputStream sis=new SequenceInputStream(enumeration);
		int i;
		StringBuilder sb=new StringBuilder();
		while((i=sis.read())!=-1){
			sb.append((char)i);
		//System.out.println((char)i);
		}
		System.out.println(sb);
		sis.close();
		fin1.close();
		fin2.close();

	}

}
