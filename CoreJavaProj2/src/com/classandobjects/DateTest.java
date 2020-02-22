class Date
   {
      private int day,month,year;
	  
	     public Date()
	       {
		     day=10;
		     month=7;
		     year=2001;
		   }
		  public Date(int day,int month,int year)
            {
            this.day=day;
            this.month=month;
            this.year=year;
            }			
			    public void setDay(int day)
			    {
			    this.day=day;
			    }
				public void setMonth(int month)
				{
				this.month=month;
				}
				public void setYear(int year)
				{
				this.year=year;
				}
				
				      public int getDay()
					     {
						    return this.day;
						 }
					  public int getMonth()
						 {
						   return this.month;
						  }
					  public int getYear()
					     {
						 return this.year;
						 }
						 
						 
									 public String toString()
		                                        {
           		                               return this.getDay()+ "-" +this.getMonth()+ "-"+this.getYear();
			                                   }	
                         					  
	                                           public void swap()
                                                    {



                                                      }
         }

   public class DateTest
    {
     public static void main(String args[])
        {
         Date d1=new Date(18,8,1997);
          System.out.println("Date="+d1);
        }
    }		


	
			  			  
			  
		 
		   