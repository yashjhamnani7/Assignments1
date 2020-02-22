package com.classandobjects;

class ComplexNumber1
   {
 
	 private int real,imaginary,r,i;
	  
	       public ComplexNumber1(int real,int imaginary)
			   {
				     this.real=real;
					 this.imaginary=imaginary;
			   }
					public ComplexNumber1 complexadd(ComplexNumber1 c1)
                         {
                             
                              r=this.real+c1.real;
                             i=this.imaginary+c1.imaginary;
                             ComplexNumber1 c3=new ComplexNumber1(r,i);
                              return c3;
                          }
                    public ComplexNumber1 complexsub(ComplexNumber1 c1)
                         {
                               
                               r=this.real-c1.real;
                               i=this.imaginary-c1.imaginary;
                             ComplexNumber1 c4=new ComplexNumber1(r,i);
                               return c4;
                          }
				    public ComplexNumber1 complexmul(ComplexNumber1 c1)
                         {
                               
                               r=this.real*c1.real-this.imaginary*c1.imaginary;
                               i=this.real*c1.imaginary+this.imaginary*c1.real;
                             ComplexNumber1 c5=new ComplexNumber1(r,i);
                               return c5;
                          }
				    public static void complexswap(ComplexNumber1 cn[])
					
				{
						
					/* ComplexNumber1 c8=new ComplexNumber1(0,0);
                      c8.real=this.real;
                      c8.imaginary=this.imaginary;
                      this.real=c1.real;
                      this.imaginary=c1.imaginary;
                       c1.real=c8.real;
                       c1.imaginary=c8.imaginary;*/
                       ComplexNumber1 temp;
                        temp=cn[0];
                        cn[0]=cn[1];
                         cn[1]=temp;						
					}	
				    public int getReal()
					{
						return this.real;
					}
				    public int getImg()
					{
                        return this.imaginary;
                    }	

           public String toString()
		      {
           		    return this.getReal()+ "+" +this.getImg()+ "i";
			  }		
          //  public static void print(ComplexNumber1 result)
			//{
				// System.out.println("result="result.getReal()+ "+" +result.getImg()+ "i");
			//}
			
}			




public class ComplexNumber1Test
    {
	    public static void main(String args[])
		   {
		      ComplexNumber1 c1=new ComplexNumber1(4,6);
			  ComplexNumber1 c2=new ComplexNumber1(6,7);
			  ComplexNumber1 c5=c1.complexadd(c2);
			  ComplexNumber1 c6=c1.complexsub(c2);
			  ComplexNumber1 c7=c1.complexmul(c2);
			  ComplexNumber1 c[]=new ComplexNumber1[2];
			  System.out.println("before swapping "+c[0]+" "+c[1]);
			   c[0]=new ComplexNumber1(6,7);
			   c[1]=new ComplexNumber1(8,9);
			   ComplexNumber1.complexswap(c);
			   
			   
			  System.out.println("add="+c5);
			  System.out.println("sub="+c6);
			  System.out.println("mul="+c7);
			  System.out.println("after swapping" +c[0]+"  "+c[1]);
			  
			
			// System.out.println("the addition is "+c5.getReal()+"+"+c5.getImg()+"i");
			  //System.out.println("the addition is "+c6.getReal()+"+"+c6.getImg()+"i");
			  	  //System.out.println("the multiplication is "+c7.getReal()+"+"+c7.getImg()+"i");
			
	       }
   }		   
	
	
	