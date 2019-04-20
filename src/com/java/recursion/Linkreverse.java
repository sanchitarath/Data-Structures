package com.java.recursion;

import com.java.recursion.Stackreverse.Node;

public class Linkreverse {
	static Node head;
	
public void printlist(){
		
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data + "\t");
			n=n.next;
		}
		System.out.println();
	}
	
	public int Addfirst(int n)
	{
		Node node= new Node(n);
		
		    node.next=head;
			head=node;
			
			
		
		return n;
	}
	
	
	public Node reverselnklist(Node head)
	{
		if(head==null)
		{
			return head ;
			
		}
		
		Node first=head;
		Node rest=head.next;
		
		Node newhead=reverselnklist(rest);
		
		if(newhead!=null)
		{
		newhead.next=first;
		}
		//first.next=null;
		
		return newhead;
		
		
	}
	public static void main(String[] args)
	{
		Linkreverse link=new Linkreverse();
		for(int i=0;i<5;i++)
		{
			link.Addfirst(i);
		}
		link.printlist();
		link.reverselnklist(head);
		link.printlist();

	}

}
