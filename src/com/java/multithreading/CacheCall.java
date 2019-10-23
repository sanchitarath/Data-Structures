package com.java.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class CacheCall implements Callable<Long> {

	private CountDownLatch latch;
	public CacheCall(CountDownLatch latch){
		this.latch=latch;
	}

	@Override
	public Long call() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Cache connected" + Thread.currentThread().getId());		
		latch.countDown();
		return Thread.currentThread().getId();
		
	}


}
