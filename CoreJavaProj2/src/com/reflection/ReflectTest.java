package com.reflection;

import java.lang.reflect.*;

class ReflectTest 
{
	public static void main(String args[]) throws Exception
	{
 //import reflection package
Class c = Class.forName("java.lang.String"); //loads the class forcefully into memory
Constructor con[] = c.getDeclaredConstructors(); //returns all constructors of String class
Method m[] = c.getDeclaredMethods(); //returns all methods of String class
Field f[] = c.getDeclaredFields(); //returns all fields of String class
 for(int i=0;i<con.length;i++)
	  System.out.println(con[i]);
   for(int j=0;j<m.length;j++)
	  System.out.println(m[j]);
   for(int i=0;i<f.length;i++)
	  System.out.println(f[i]);
	}
}