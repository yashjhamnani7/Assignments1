package com.collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//when we implement the linkedhashset
		LinkedHashSet<String> linkedset =  
	            new LinkedHashSet<String>();   

	// Adding element to LinkedHashSet   
		
	linkedset.add("A");   
	linkedset.add("F");   
	linkedset.add("E");   
	linkedset.add("D");  
	Iterator<String> itr = linkedset.iterator();
	System.out.println("iterating a linkedset");
	
	while(itr.hasNext()) {
		String name = itr.next();
		System.out.println(name);
	 

	}
	//when we implement the hashset
	HashSet<String> hset=new HashSet<String>();
			
		     hset.add("A");
		     hset.add("F");   
		      hset.add("E");   
		 	hset.add("D");  
		 	
		 	System.out.println("iterating a hashset");
		 	
		 	Iterator<String> itr1 = hset.iterator();
		 	while(itr1.hasNext()) {
		 		String name1 = itr1.next();
		 		System.out.println(name1);
		 	 

		 	
		     
			}
		
	}

}
