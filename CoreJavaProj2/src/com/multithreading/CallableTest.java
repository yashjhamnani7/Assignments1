package com.multithreading;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest extends Thread {

	public static void main(String[] args) throws Exception {
		
		ExecutorService executor=Executors.newFixedThreadPool(3);
		Callable<Integer> c1=new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				/*for(int i=0;i<20;i++) {
					System.out.println("PING");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}*/
				return 2;
			}
		};
		Callable<Integer> c2=new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				/*for(int i=0;i<20;i++) {
					System.out.println("\tPONG");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}*/
				return 1;
			}
		};
		
		Future<Integer> future=executor.submit(c1);
		Future<Integer> future1=executor.submit(c2);
		int result=future.get();
		int result1=future1.get();
		System.out.println(result+" "+result1);
	}
}