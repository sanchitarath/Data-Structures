package com.java.SingleLinkedLists;

public class ReverseLinkedlist {

	static Node head;
	Node prev;
	Node curr;
	Node next;

	class Node{
		int data;
		Node next;
		public  Node(int d)
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

	public Node revlist(int k)
	{
		prev=null;
		curr=head;
		next=curr.next;

		for (int i = 0; i < k; i++) {

			if(curr!=null)
			{
				curr.next=prev;
				prev=curr;
				curr=next;
			}
		}
		return head;

	}

	public Node kreverse(Node head,int k)
	{
		if(head==null)
		{
			return null;
		}
		
		Node prev=null;
		Node curr=head;
		Node next=curr.next;
		 

		for (int i = 0; i < k; i++) {

			if(curr!=null)
			{
				next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
				
			}
		}

		head.next=kreverse(next,k);
		return prev;

	}
	public void Add(int n)
	{

		Node new_node = new Node(n); 


		new_node.next = head; 


		head = new_node; 
	} 



	public static void main(String[] args) 
	{
		ReverseLinkedlist list=new ReverseLinkedlist();
		list.Add(1);
		list.Add(2);
		list.Add(3);
		list.Add(4);
		list.Add(5);
		list.Add(6);
		list.Add(7);
		list.Add(8);
		list.Add(9);

		System.out.println("The original list is :-");
		//	list.printlist();
		head=list.kreverse(head, 3);
		System.out.println("The reverse list :-");
		list.printlist();

	}

}
