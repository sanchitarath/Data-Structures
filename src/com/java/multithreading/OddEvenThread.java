package com.java.multithreading;
import java.lang.Thread;

public class OddEvenThread extends Thread 
{

	public void even() throws InterruptedException
	{
		synchronized (this) 
		{
			for (int i = 0; i < 100; i++) 
			{
				if(i%2==0)
				{
					Thread.sleep(500);
					System.out.println("Thread" +"\t" + i +"\t"+"running");
				}
				
				wait();
				notify();
		}
//		
//			Thread.sleep(10);
			
		}
	}
	
	public void odd() throws InterruptedException
	{

		synchronized (this) 
		{
			for (int i = 0; i < 100; i++) 
			{
				Thread.sleep(2500);
				if(i%2!=0)
				{
					System.out.println("Thread" +"\t" + i +"\t"+"running");
					
				}
				
				notify();
				wait();
		}
		
			
			
		}
	}


	public static void main(String[] args) throws InterruptedException 
	{
			OddEvenThread object=new OddEvenThread();
		    //OddEvenThread object2=new OddEvenThread();
		    
			Thread t1=new Thread(new Runnable() {
				public void run() 
				{
					try {
						object.even();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			
			  
			Thread t2=new Thread(new Runnable() {
				public void run() 
				{
					try {
						object.odd();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		
			
		    t1.start();
		    t2.start();

//		    t1.join();
//		    t2.join();
		    
	}
}
