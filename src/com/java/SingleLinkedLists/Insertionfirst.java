package com.java.SingleLinkedLists;

public class Insertionfirst {
	
	Node head;
	
	
	public void printlist(){
		
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public int Addfirst(int n)
	{
		Node node= new Node(n);
		
		    node.next=head;
			head=node;
			
			
		
		return n;
	}
	
	public void PopOut()
	{
		
		
		head=head.next;
		
		
	}

	public static void main(String[] args) 
	{
		
		Insertionfirst list=new Insertionfirst();
		list.Addfirst(34);
		list.Addfirst(44);
		for (int i = 0; i < 100; i++) {
			list.Addfirst(i);
		}
		
		//list.printlist();
		list.PopOut();
		list.printlist();

	}

	
	class Node{
		int data;
		Node next;
		
		public Node(int d)
		{
			data=d;
			next=null;
		}
	}
}
