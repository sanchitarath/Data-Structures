package com.java.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.*;


public class MultiThreadExecutor {
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		ExecutorService threadPool=Executors.newFixedThreadPool(1);

		
		CountDownLatch latch =new CountDownLatch(2);
		
		CountDownLatch childLatch = new CountDownLatch(2);
		
		Future<Long> dbFuture =threadPool.submit(new DbCall(latch));
		Future<Long> cacheFuture =threadPool.submit(new CacheCall(latch));

		
		latch.await();
		Future<Long> mergeFuture =threadPool.submit(new MergeLogic(childLatch));
		
		Future<Long> fileFuture =threadPool.submit(new FileWriter(childLatch));
		
		childLatch.await();
		System.out.println("Termincated " + mergeFuture.get() + "\t" + fileFuture.get());
		

	}
}
