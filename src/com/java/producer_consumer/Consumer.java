package com.java.producer_consumer;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

public class Consumer<E> implements Callable<Integer>{

	private LinkedBlockingQueue<E> customBlockingQueue;
	private CountDownLatch latch;
	private int consumerId;
	public Consumer(LinkedBlockingQueue<E> customBlockingQueue, CountDownLatch latch, Integer consumerId) {
		this.customBlockingQueue=customBlockingQueue;
		this.consumerId=consumerId;
	}

	
	@Override
	public Integer call() throws InterruptedException {
		
		while(true){
			Thread.sleep(5000);
			QueueEntity queueEntity= (QueueEntity) customBlockingQueue.poll();
			System.out.println("Consumed from Producer " + queueEntity.getId() + "\t value is "+ queueEntity.getElem());
		}
	}

}
