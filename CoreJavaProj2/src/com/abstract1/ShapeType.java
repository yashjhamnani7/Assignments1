package com.abstract1;
abstract class Shape
  {
    abstract void draw();
   }
   
   class Rectangle extends Shape
      {
	    void draw()
		  {
		    System.out.println("the shape is rectangel");
		  }
	  }
	  class Line extends Shape
      {
	    void draw()
		  {
		    System.out.println("the shape is line");
		  }
	  }
   
   class Cube extends Shape
      {
	    void draw()
		  {
		    System.out.println("the shape is cube");
		  }
	  }
	  
	  class ShapeType
	     {
		   public static void main(String args[])
		     {
			   Shape s[]=new Shape[3];
			     s[0]=new Rectangle();
				 s[1]=new Line();
				 s[2]=new Cube();
				 s[0].draw();
				s[1].draw();
				 s[2].draw();
			 }
	    }
   
   