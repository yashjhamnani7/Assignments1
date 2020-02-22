class QueuedArray
    {
			 
		    private int arr[];
			public QueuedArray(int arr[])
			  {
			    this.arr=arr;
				
			  }	
			  
			
			private int getEnd()
			    {
				  for(int i=0;i<arr.length;i++)
				      {
					   if(arr[i]==0)
					     return i;

			          }
					  return 0;
			    }
						
				public void push(int n)
				   { 
				      arr[getEnd()]=n;
				   }
				 public int pop()
				   {
					  int ele=0;
				  
						ele=arr[0];
				         
						 for(int i=0;i<arr.length-1;i++)
						 {
							 arr[i]=arr[i+1];
						 }
				         
						 return ele;
						
				   }
				   
				   public String toString()
				   {
					    StringBuilder sb=new StringBuilder();
						for(int j=0;j<arr.length;j++)
						{
							 sb.append(arr[j]+" ");
						}
						return sb.toString();
						
				   }	
			
     }
   public class QueueArrayTest
        {
		 public static void main(String args[])
		    {
			    QueuedArray s1=new QueuedArray(new int[10]);
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
				
				
				
				      