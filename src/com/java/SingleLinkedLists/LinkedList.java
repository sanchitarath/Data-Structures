package com.java.SingleLinkedLists;

public class LinkedList {

	 Node head;
	 Node tail;
	 public void printlist()
	 {
		 Node n=head;
		 while(n!=null)
		 {
			 System.out.println(n.data);
			 n=n.next;
		 }
		 
	 }
	 
	 public int Add(int n)
	 {
		 Node newnode=new Node(n);
		 
		 if(head==null )
		 {
			 head=newnode;
			 tail=head;
		 }
		 else{
			 tail.next=newnode;
			 tail=tail.next;
		 }
		return n;
		 
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList(); 
//		list.head= new Node(8);
//		
//		
//		Node n1= new Node(1);
//		Node n2= new Node(2);
//		 
//		list.head.next=n1;
//		n1.next=n2;
		
		
		list.Add(34);
		list.Add(8);
		for (int i = 0; i < 100; i++) {
			list.Add(i);
		}
		
		list.printlist();

	}

}

class Node{
	int data;
	Node next;
	
	public  Node(int d)
	{
		data=d;
		next=null;
	}

	public Node(Node n) {
		// TODO Auto-generated constructor stub
	}

	
	}
