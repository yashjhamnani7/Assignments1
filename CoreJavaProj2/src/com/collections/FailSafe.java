package com.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<Integer>();
			Runnable r1=new Runnable()
					{
					public void run() {
				    while(true)
				    { 
					    list.add(20);
					   try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				}
			
					};
					Runnable r2=new Runnable()
					{
					public void run() {
				    while(true)
				    { 
				    	Iterator<Integer> itr = list.iterator();
						while(itr.hasNext()) {
							int n = itr.next();
							System.out.println(n);
						}
					   try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
			  	}
			
					};
		
	         Thread t1 =new Thread(r1);
	         Thread t2=new Thread(r2);
	         t1.start();
	         t2.start();
		}
	


	}


