class SampleSingletone{
		private static SampleSingletone ref = null;
			private SampleSingletone()
			{


			}
				public static void SampleSingletonegetInstance() 
				  {
					if(ref == null)
					{
						ref = new SampleSingletone();
						System.out.println("object 1 created");
					}
						
				   }
		}
  
  
  public class SampleSingletoneTest
       {
	   public static void main(String args[])
	       {
		    SampleSingletone.SampleSingletonegetInstance();
			 SampleSingletone.SampleSingletonegetInstance();			
			}
	   }
			  