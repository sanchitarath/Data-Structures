package com.java.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class FileWriter implements Callable<Long>{

	private CountDownLatch latch;
	
	public FileWriter(CountDownLatch latch) {
		this.latch=latch;
	}
	
	@Override
	public Long call() throws Exception {
		System.out.println("File Writen ");
		latch.countDown();
		return Thread.currentThread().getId();
	}

}
