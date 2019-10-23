package com.java.producer_consumer;

public interface ICustomBlockingQueue<E> {
	
	public void put(E elem) throws InterruptedException;
	public E get() throws InterruptedException;
}
