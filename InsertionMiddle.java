package com.java.SingleLinkedLists;

public class InsertionMiddle {
	
	Node head;
	
	
	static class Node
	{
		Node next;
		int data;
		
		public Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public void printlist()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public int Addmiddle(Node temp,int n)
	{
		Node newnode=new Node(n);
		if(temp!=null)
		{
			newnode.next=temp.next;
			temp.next=newnode;
			
			
		}
		return n;
	}
	
	
	

	public static void main(String[] args) {
		InsertionMiddle list =new InsertionMiddle();
		list.head =new Node(22);
		Node n1= new Node(44);
		Node n2=new Node(56);
		Node n3=new Node(77);
		Node n4=new Node(88);
		
		list.head.next=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		
		
		
		list.Addmiddle(n2,34);
		//list.Addmiddle(list.head.next.next,44);
		//for (int i = 0; i < 100; i++) {
			//list.Addmiddle(list.head.next,i);
		//}
		
		list.printlist();
		

	}

}
