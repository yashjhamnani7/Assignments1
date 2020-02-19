package com.reflection;
import java.lang.reflect.*;


class StringOpr {
	public String getCapital(String name) {
		return name.toUpperCase();
	}
}
class Middleware {
	public static Object invokeMethod(String className, String methodName, Class paramTypes[], Object paramValues[]) throws Exception 
	{
	
	Class a=Class.forName(className);
 Object o= a.newInstance();  
    Method m =a.getDeclaredMethod(methodName,paramTypes);  
    //m.setAccessible(true);  
  Object s= m.invoke(o,paramValues);
  //System.out.println(s);
        

	
	return s;
		
	
	}
}
class MiddlewareTest {
	public static void main(String args[]) throws Exception {
		Class paramTypes[] = new Class[1];
		paramTypes[0] = java.lang.String.class;
		
		Object paramValues[] = new Object[1];
		paramValues[0] = "iter";
		Object m=Middleware.invokeMethod("StringOpr", "getCapital", paramTypes, paramValues);
		
		
		System.out.println(m);
        
		
	}
}
