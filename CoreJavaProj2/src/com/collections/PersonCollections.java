package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>
{
	   int weight,height;
	   String name;
	 Person(int weight,int height,String name)
	 {
		 this.height=height;
		 this.weight=weight;
		 this.name=name;
	 }
	 
	 
	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height=" + height + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		if(this.weight>p.weight)
			return 1;
		else if(this.weight<p.weight)
			return -1;
		else
		{
			if(this.height>p.height)
				return 1;
			else if(this.height<p.height)
				return -1;
			else
			{
				if(this.name.equals(p.name))
					return 0;
				else
					return 1;
			}
		}
	}
	 
  }
    public class PersonCollections 
     {
      public static void main(String args[])
      {
  		TreeSet<Person> treeSet = new TreeSet<Person>();
  		treeSet.add(new Person(50,6,"rohit"));
  		treeSet.add(new Person(60,5,"rahul"));
  		treeSet.add(new Person(80,7,"mohan"));
  		treeSet.add(new Person(80,6,"yash"));
  		
  		Iterator<Person> itr = treeSet.iterator();
  		while(itr.hasNext()) {
  			Person a = itr.next();
  			System.out.println(a);
      }
      }
    	
    	
     }
