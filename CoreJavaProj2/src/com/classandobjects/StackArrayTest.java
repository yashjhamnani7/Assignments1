class StackedArray
    {
			 
		    private int arr[];
			public StackedArray(int arr[])
			  {
			    this.arr=arr;
			  }	
			  
			
			private int getTop()
			    {
				  for(int i=0;i<arr.length;i++)
				      {
					   if(arr[i]==0)
					     return i;

			          }
					  return 0;
			    }
			public int isPush()
			   {
			    if(getTop()==arr.length-1)
                   return 0;
                else
                    return 1;				
				} 
		    public int isPop()
			   {
			    if(getTop()==0)
                   return 0;
                else
                    return 1;				
				} 		
				public void push(int n)
				   { 
				     
				      if(isPush()>0)
					  {
				        arr[getTop()]=n;
						
					  }
				   }
				 public int pop()
				   {
					   int ele=0;
				      if(isPop()>0)
				        {
						ele=arr[getTop()];
				         arr[getTop()]=0;
				         }
						 return ele;
				   }
				   
				   public String toString()
				   {
					    StringBuilder sb=new StringBuilder();
						for(int j=0;j<arr.length;j++)
						{
							 sb.append(arr[j]);
						}
						return sb.toString();
						
				   }	
			
     }
   public class StackArrayTest
        {
		 public static void main(String args[])
		    {
			   StackedArray s1=new StackedArray(new int[10]);
         		s1.push(10);
			    s1.push(20);
				 s1.push(40);
				 s1.push(30);
				 s1.push(50);
				 int ele=s1.pop();
				 ele=s1.pop();
				 System.out.println(s1);
				 
			}	 
		}		      
				
				
				
				      