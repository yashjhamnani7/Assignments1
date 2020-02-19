package com.interface1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


class PersonHeightCompare implements Comparator<Person>
   {
     public int compare(Person p1,Person p2)
	 {
	   if(p1.height>p2.height)
	      return -1;
		else if(p1.height<p2.height)
		 return 1;
		 else
		 return 0;
	 }
}
class PersonWeightCompare implements Comparator<Person>
   {
     public int compare(Person p1,Person p2)
	 {
	   if(p1.weight>p2.weight)
	      return -1;
		else if(p1.weight<p2.weight)
		 return 1;
		 else
		 return 0;
	 }
}






class Person implements Comparable<Order>
   {
      String name;
	  double height=0;
	  int weight=0;
	  
     public Person(double height,int weight,String name)
	      {
		    this.height=height;
			this.weight=weight;
			this.name=name;
		  }
     
		 public int compareTo(Person p1,Person p2)
		  {
			  if(p1.height>p2.height)
	      return -1;
		  else if(p1.height<p2.height)
		    return 1;
		   else
		    return 0;
		}

		@Override
		public int compareTo(Order arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
   }
   class PersonTest 
   {
	     public static void main(String args[])
		 {
		Person p1 = new Person(5.2,60,"rohan");
		Person p2= new Person(6,50,"mohan");
		Person p3 = new Person(5.9,62,"sohan");
		
			List<Person> l=new ArrayList<Person>();
			Collections.sort(l,new PersonHeightCompare());
			
		 }
   }
		 
		 
	