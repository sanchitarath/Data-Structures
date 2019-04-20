package com.java.recursion;

import com.java.recursion.Stackreverse.Node;

public class IntersectLink {
		
	public Node intersect(Node node1,Node node2)
	{
		if(node1==null||node2==null)
		{
			return null;
		}
		intersect(node1.next,node2.next);
		
		int count1=0;
		int count2=0;
		
		while(node1!=null)
		{
			count1++;
			node1=node1.next;
		}
		while(node2!=null)
		{
			count2++;
			node2=node2.next;
		}
		
		int count=count1-count2;
	
		while(count!=0)
		{
			Node ptr1=node1;
			Node ptr2=node2;
			if(count1>count2)
			{
			 ptr1=node1.next;
			count--;
			}else{
				ptr2=node2.next;
				count--;
				
				
			}
		}
		
		
		return node2;
		
	}
	
	public static void main(String[] args) {
		

	}

}
