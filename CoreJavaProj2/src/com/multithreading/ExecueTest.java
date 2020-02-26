package com.multithreading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecueTest extends Thread {

	public static void main(String[] args) {
		
		ExecutorService executor=Executors.newFixedThreadPool(3);
		Runnable r1 = new Runnable() {
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("PING");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Runnable r2 = new Runnable() {
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("\tPONG");
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		executor.execute(r1);
		executor.execute(r2);
	}
}