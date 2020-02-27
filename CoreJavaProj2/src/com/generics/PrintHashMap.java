package com.generics;

import java.util.HashMap;
import java.util.Iterator;

public class PrintHashMap
{
	  static void printHashMap(HashMap<? extends Number,?> hmap)
	    {
		    Iterator<?> i=hmap.keySet().iterator();
		    while(i.hasNext())
		    {
		    	System.out.println(hmap.get(i.next()));
		           //System.out.println(i.next());
		    	
		    }
	    }
	  public static void main(String args[])
	  {
		  
		  HashMap<Integer,Double> hmap=new HashMap();
		  hmap.put(20,30.0);
		  hmap.put(50, 40.0);
		  printHashMap(hmap);
	  }
	}

