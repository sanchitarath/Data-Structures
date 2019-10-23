package com.java.producer_consumer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CustomBlockingQueueLinkedListImpl<E> implements ICustomBlockingQueue<E>{

	private int maxSize;
	private Queue<E> queue;
	
	public CustomBlockingQueueLinkedListImpl(int maxSize){
		this.maxSize=maxSize;
		queue=new LinkedList<>();
	}

	@Override
	public synchronized void put(E elem) throws InterruptedException {
		if(queue.size() == maxSize){
			System.out.println(" Producer is Full.. Waiting .... Hurry Up Lazy Consumers...");
			wait();
		}
		
		System.out.println("Writing elem " + elem);
		queue.add(elem);
		notifyAll();
	}

	@Override
	public synchronized E get() throws InterruptedException{
		if(queue.size() == 0){
			System.out.println(" Consumer is Empty.. Waiting .... Hurry Up Lazy Producers...");
			wait();
		}
		
		E elem= queue.remove();
		
		notifyAll();
		return elem;
	}
	
	
	
}
