package com.multithreading;

public class ThreadGroup implements Runnable {

	public ThreadGroup(String name)
	{
		
	}
	public static void main(String args[])
	{
          ThreadGroup tg1 = new ThreadGroup("My threads");  
            
          Thread t1 = new Thread(tg1,"one");  
          t1.start();  
          Thread t2 = new Thread(tg1,"two");  
          t2.start();  
          Thread t3 = new Thread(tg1,"three");  
          t3.start();  
               
	}
	public void run()
	{
		Thread currentthread=Thread.currentThread();
		System.out.println(currentthread.getName());
	}
	
	
	
}
