package com.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();    
        al.add("Amit");    
        al.add("Vijay");    
        al.add("Kumar");    
        al.add("Sachin");    
        ListIterator<String> itr=al.listIterator(al.size()); 
      //  while(itr.hasNext())
        //{
        	//itr.next();
        //}
        while(itr.hasPrevious())
        {
        	String name=itr.previous();
        	System.out.println(name);
        }

	}

}
