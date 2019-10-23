package com.java.producer_consumer;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerMain {
	
	public static void main(String[] args) {
		ExecutorService threadPool=Executors.newFixedThreadPool(15);
		
		CountDownLatch latch = new CountDownLatch(2);
//		ICustomBlockingQueue<Integer> customBlockingQueue=new CustomBlockingQueueLinkedListImpl<>(100);
//		ICustomBlockingQueue<Integer> customBlockingQueue=new CustomBlockingQueueArrayListImpl<>(100);
		
		LinkedBlockingQueue<QueueEntity> linkedBlockingQueue= new LinkedBlockingQueue<>();
		
		for(int i=0;i<10;i++){
			
			QueueEntity queueEntity=new QueueEntity(i);
			Producer producer=new Producer<>(linkedBlockingQueue, latch, queueEntity);
			threadPool.submit(producer);
			
		}
		
		for(int i=0;i<5;i++){
			Consumer consumer=new Consumer<>(linkedBlockingQueue, latch, i);
			threadPool.submit(consumer);
		}
		
		try {
			latch.await();
			threadPool.shutdownNow();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	

}
