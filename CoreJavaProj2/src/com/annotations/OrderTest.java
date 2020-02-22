import java.lang.reflect.*;
import java.lang.annotations.*;
class Order
{
 int price;
  
 @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.FIELD)
  public @Getter MyAnnotation
    {
     int getPrice();
	 void foo();
     }
  
  
    @Getter
  public int getPrice()
      {
	  }
	 @Getter
  public void foo()
   {
     }
  }
  class OrderTest
      {
     public static void main(String args[])
          {
              Class a=Class.forName("Order");
              //Object o=a.getInstance();
          //Field f[]=a.getDeclaredFields();	
              Method m[]=a.getDeclaredMethods();
			  
			  for(int i=0;i<m.length;i++)
			  {
				     Method myMethod=m[i];
				      Annotation annotations[i]=myMethod.getAnnotations();
					  for(int i=0;i<annotations.length;i++)
					  {
						  Annotation myannotation=annotations[i];
                      String name=myannotation.getName();
			           String s=name.toLowerCase();
					       //s.replace("get");
					  }
			  }
		  }
	  }
                    		  