package com.java.multithreading;

public class ThreadDemo {
public static void main(String[] args) {
	Thread thread1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Thread started ....");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread ended ....");
			
		}
	});
	
	thread1.start();
    System.out.println("Termincated ");
	
}
}
