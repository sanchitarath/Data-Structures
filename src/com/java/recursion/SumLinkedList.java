package com.java.recursion;

import com.java.recursion.Stackreverse.Node;

public class SumLinkedList {
	
	static int carry=0;

	public Node sumList(Node node1, Node node2) {
//		int count1=0;
//		int count2=0;
//		while(node1!=null)
//		{
//			count1++;
//			node1=node1.next;
//			
//		}
//		
//		while(node2!=null)
//		{
//			count2++;
//			node2=node2.next;
//		}
		if (node1 == null || node2 == null)
		{
			return null;
		}

		Node n3=new Node(0);
		
		n3.next=sumList(node1.next, node2.next);
		
		n3.data=(node1.data+node2.data)%10+carry;
		
		carry=(node1.data+node2.data)/10;
		
		return n3;

	}
	
	public void printlist(Node head)
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}

	}

	public static void main(String[] args) 
	{
      Node node1=new Node(5);
      node1.next=new Node(7);
      node1.next.next=new Node(6);
      
      Node node2=new Node(6);
      node2.next=new Node(8);
      node2.next.next=new Node(9);
      
      SumLinkedList link=new SumLinkedList();
      Node node3=link.sumList(node1, node2);
      
      Node node4=new Node(carry);
      node4.next=node3;
      
      link.printlist(node4);
    
	}

}
