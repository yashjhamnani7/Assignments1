class ComplexNumber
   {
 
	 private int real,imaginary,r,i;
	  
	       public ComplexNumber(int real,int imaginary)
			   {
				     this.real=real;
					 this.imaginary=imaginary;
			   }
					public ComplexNumber complexadd(ComplexNumber c1)
                         {
                             
                              r=this.real+c1.real;
                             i=this.imaginary+c1.imaginary;
                             ComplexNumber c3=new ComplexNumber(r,i);
                              return c3;
                          }
                    public ComplexNumber complexsub(ComplexNumber c1)
                         {
                               
                               r=this.real-c1.real;
                               i=this.imaginary-c1.imaginary;
                             ComplexNumber c4=new ComplexNumber(r,i);
                               return c4;
                          }
				    public ComplexNumber complexmul(ComplexNumber c1)
                         {
                               
                               r=this.real*c1.real-this.imaginary*c1.imaginary;
                               i=this.real*c1.imaginary+this.imaginary*c1.real;
                             ComplexNumber c5=new ComplexNumber(r,i);
                               return c5;
                          }
				    public void complexswap(ComplexNumber c1)
					{
						
					 /*ComplexNumber c8=new ComplexNumber(0,0);
                      c8.real=this.real;
                      c8.imaginary=this.imaginary;
                      this.real=c1.real;
                      this.imaginary=c1.imaginary;
                       c1.real=c8.real;
                       c1.imaginary=c8.imaginary;*/
                     					   
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
          //  public static void print(ComplexNumber result)
			//{
				// System.out.println("result="result.getReal()+ "+" +result.getImg()+ "i");
			//}
			
}			




public class ComplexNumberTest
    {
	    public static void main(String args[])
		   {
		      ComplexNumber c1=new ComplexNumber(4,6);
			  ComplexNumber c2=new ComplexNumber(6,7);
			  ComplexNumber c5=c1.complexadd(c2);
			  ComplexNumber c6=c1.complexsub(c2);
			  ComplexNumber c7=c1.complexmul(c2);
			  c1.complexswap(c2);
			  System.out.println("add="+c5);
			  System.out.println("sub="+c6);
			  System.out.println("mul="+c7);
			  System.out.println("after swapping: "+c1);
			  System.out.println(c2);
			// System.out.println("the addition is "+c5.getReal()+"+"+c5.getImg()+"i");
			  //System.out.println("the addition is "+c6.getReal()+"+"+c6.getImg()+"i");
			  	  //System.out.println("the multiplication is "+c7.getReal()+"+"+c7.getImg()+"i");
			
	       }
   }		   
	
	
	