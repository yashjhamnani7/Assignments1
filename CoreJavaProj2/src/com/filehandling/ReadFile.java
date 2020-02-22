package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadFile 
{

	public static void main(String[] args)throws Exception {
		File f=new File("C:\\ibmfullstacktraining\\abc.txt");	
		File f1=new File("C:\\ibmfullstacktraining\\cde.txt");	
		FileInputStream fin=new FileInputStream(f);
		FileOutputStream fos=new FileOutputStream(f1);
		int i=0;
		do
		{
			i=fin.read();
			if(i!=-1)
			fos.write((char)i);
		}while(i!=-1);
		System.out.println("file is written");

	}

}
