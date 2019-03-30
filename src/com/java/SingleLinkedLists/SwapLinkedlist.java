package com.java.SingleLinkedLists;
import com.java.SingleLinkedLists.FindMiddle;;

public class SwapLinkedlist {
	
	public void Swap(Node head)
	{
		Node h1=head;
		Node h2=head;
		
		while(h1!=null&& h1.next!=null&& h1.next.next!=null)
		{
		if(h1==head && h1!=null)
		{
			h1=h1.next;
			h2.data=h2.data+h1.data;
			h1.data=h2.data-h1.data;
			h2.data=h2.data-h1.data;
			
		}
		if(h2!=null && h2.next!=null)
		{
		    h1=h1.next.next;
		    h2=h2.next.next;
			h2.data=h2.data+h1.data;
			h1.data=h2.data-h1.data;
			h2.data=h2.data-h1.data;
		}
		}
	}

	public static void main(String[] args) {
		SwapLinkedlist list=new SwapLinkedlist();
		FindMiddle list1=new FindMiddle();
		for(int i=0;i<7;i++)
		{
			list1.Add(i);
		}
		
		//list1.printlist();
		list.Swap(list1.head);
		list1.printlist();
       
	}

}
