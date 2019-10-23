package com.java.producer_consumer;

public class QueueEntity {
	public int id;
	public Integer elem;
	
	public QueueEntity(int id){
		this.id=id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getElem() {
		return elem;
	}

	public void setElem(Integer elem) {
		this.elem = elem;
	}
	
	
}
