package com.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintList 

{
  static void printList(ArrayList<? extends Number> list)
    {
	    Iterator<? extends Number> i=list.iterator();
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    	
	    }
    }
  public static void main(String args[])
  {
	  ArrayList<Double> a=new ArrayList();
	  a.add(10.0);
	  a.add(20.0);
	  a.add(30.0);
	  printList(a);
  }
}
