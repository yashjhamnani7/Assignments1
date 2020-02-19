package com.abstract1;
abstract class Persistence
   {
      abstract void persist();
   }
 class FilrPersistence extends Persistence
   {
     void persist()
	    {
		  System.out.println("data is being persisted on file");
		 }
    }
  class DatabasePersistence extends Persistence
     {
	   void persist()
	      {
		  System.out.println("data is being persisted in database");
		   }
		   
     }
	 
	 
	 
	 	

        class Persistance
		{
			public static Persistence getPersistance()
                 {
                  return new DatabasePersistence();
                 }
         public static void main(String args[])
		 {
       Persistence p=Persistance.getPersistance();
     p.persist();
		 }
		}		 
	 