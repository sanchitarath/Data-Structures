package com.java.SingleLinkedLists;

public class SortLinkedlist {
	Node head;
	
	public void printList()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void pushNode(int d)
	{
		Node newnode=new Node(d);
		newnode.next=head;
		head=newnode;
	}
	
	public void sortList()
	{
		Node temp=head;
		int count0 = 0,count1=0;
		while(temp!=null)
		{
			if(temp.data==0)
			{
				count0++;
			}
			count1++;
		}
		
		for (int i = 0; i < count0; i++) 
		{
			Node newnode=new Node(0);
			newnode.next=head;
			head=newnode;					
		}
	}

	public static void main(String[] args) 
	{
		SortLinkedlist s=new SortLinkedlist();
		//for(int i=0;i<10;i++)
		//{
			//s.pushNode(i);
			
		//}
		s.pushNode(0);
		s.pushNode(0);
		s.pushNode(1);
		s.pushNode(0);
		s.pushNode(0);
		s.pushNode(1);
		s.printList();
		System.out.println("the sorted list is :");
		s.sortList();
		s.printList();
	}

}
