package com.java.producer_consumer;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

public class Producer<T> implements Callable<Integer>{
	private LinkedBlockingQueue<T> customBlockingQueue;
	private CountDownLatch latch;
	private QueueEntity queueEntity;
	public Producer(LinkedBlockingQueue<T> customBlockingQueue, CountDownLatch latch, QueueEntity queueEntity) {
		this.customBlockingQueue=customBlockingQueue;
		this.latch=latch;
		this.queueEntity=queueEntity;
	}

	@Override
	public Integer call() throws InterruptedException {
		Integer i=0;
		while(true) {
			Thread.sleep(5000);
			queueEntity.setElem(i++);
			customBlockingQueue.put((T)queueEntity);
		}		
	}

}
