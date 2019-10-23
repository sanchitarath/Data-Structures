package com.java.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class MergeLogic implements Callable<Long>{

private CountDownLatch latch;
	
	public MergeLogic(CountDownLatch latch) {
		this.latch=latch;
	}
	
	@Override
	public Long call() throws Exception {
		System.out.println("Merged ");
		latch.countDown();
		return Thread.currentThread().getId();
	}
	
	

}
