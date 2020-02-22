package com.multithreading;



public class ThreadTestextends extends Thread{

	
	public ThreadTestextends(String threadname)
	{
		super.setName(threadname);
		super.start(); //now thread itself its an object
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new ThreadTestextends("PING");
         new ThreadTestextends("PONG");
	}
	public void run()
	{
	
	Thread currentThread=Thread.currentThread();
	
		if(currentThread.getName().equals("PING"))
		{
	     for(int i=0;i<20;i++)
	     {
	    	  System.out.println("PING");
	    	  try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
		}
	     else if(currentThread.getName().equals("PONG"))
	    		 {
	    	 for(int i=0;i<20;i++)
		     {
		    	  System.out.println("\t PONG");
		    	  try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		     }
	    		 }
	     
		}
	}


