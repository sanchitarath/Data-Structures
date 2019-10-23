package com.java.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class DbCall implements Callable<Long> {

	private CountDownLatch latch;
	public DbCall(CountDownLatch latch){
		this.latch=latch;
		
	}

	public Long call() throws InterruptedException
	{

		Thread.sleep(2000);
		System.out.println("Database connected" + Thread.currentThread().getId());
		latch.countDown();
		return Thread.currentThread().getId();	
	}

}
