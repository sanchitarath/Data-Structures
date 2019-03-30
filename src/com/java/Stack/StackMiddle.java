package com.java.Stack;
import java.util.*;

public class StackMiddle {

	static Node head;
	static Node middle;
	static class Node
	{

		Node next;
		Node prev;
		int data;
		Node(int d)
		{
			data=d;
			next=null;
			prev=null;
		}
	}

	
	public Node findMiddle(Stack<Node> s,int d )
	{
		Node newnode=new Node(d);
	
		if(s.size()==1)
		{
			newnode=middle;	
			return middle;
		}
		if(!s.isEmpty()&& s.size()%2!=0)
		{
			middle=middle.next;
			head=middle.prev;
			
		}
		return middle;
	}
	public static void main(String[] args) 
	{
		StackMiddle mid=new StackMiddle();
		Stack<Node> s=new Stack<>();
		for (int i = 0; i < 9; i++) 
		{
			Node newnode=new Node(i);
			s.push(newnode);
			//head=s.peek();
			Node n=mid.findMiddle(s,newnode.data);
			//System.out.println(s.push(newnode).data);
			System.out.println(n.data);
			
		}
		
		
		
      
	}

}
