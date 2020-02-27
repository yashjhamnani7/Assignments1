package com.generics;


class Gwrapper<T>
{
	 private T t;
	public void set(T t)
	{
		this.t=t;
	}
	public T get()
	{
		return t;
	}
}


public class GenericWrapper
 {
   public static void main(String args[])
   {
	     Gwrapper<String> gs=new Gwrapper();
	     gs.set("hello");
	     String name=gs.get();
	     System.out.println("element is wrapped");
	     System.out.println(name);
   }
}
