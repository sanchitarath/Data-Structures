package com.java.Stack;

import java.util.Stack;

import com.java.Stack.StackRevlist.Node;

public class StacktoQueue {
	Stack<Node> s1 = new Stack<>();
	Stack<Node> s2 = new Stack<>();
	
	
	public void enQueue(Node node)
	{
		
		while(!s1.isEmpty())
	{
		s2.push(s1.pop());
	}
	
	s1.push(node);
	
			
	while(!s2.isEmpty())
	{
		s1.push(s2.pop());
		
	}
		
	}
	public Node deQueue()
	{
		if(s1.isEmpty())
		{
			System.out.println("Empty");
		}
		Node node=s1.pop();
		
		return node;
		
	}
		
	public static void main(String[] args) {
		
		StacktoQueue s=new StacktoQueue();
		for (int i = 0; i < 5; i++) 
		{
			Node newnode = new Node(i);
			s.enQueue(newnode);
			
		}
		s.deQueue();
		s.deQueue();
		
		Node newnode = new Node(5);
		s.enQueue(newnode);
		s.deQueue();
		for(Node node:s.s1){
			System.out.println(node.data);
		}
	
		
		
	
		
}
}


