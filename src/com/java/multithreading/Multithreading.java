package com.java.multithreading;
import java.lang.Thread;

public class Multithreading extends Thread
{
	static int value=0;
	public void run()
	{
		try {
			System.out.println("Thread" +"\t" + value +"\t"+"running");
		} catch (Exception e) {
			System.out.println("Not running");
		}
		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		int n=100000;
		
		for (int i = 0; i < n; i++) {
			Multithreading object=new Multithreading();
			value++;
			object.start();
			object.sleep(1);
		}
		

	}

}
