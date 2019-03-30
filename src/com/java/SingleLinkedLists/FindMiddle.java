package com.java.SingleLinkedLists;

public class FindMiddle {
		
	Node head;
	
	Node tail;
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
	 
	
	public int MiddleElement(){
		Node h1=head;
		Node h2=head;
		
		if(h1!=null)
		{
		while(h1!=null && h1.next!=null)
		{
		
		    h1=h1.next.next;
			h2=h2.next;
		}
		}
		System.out.print(h2.data);
		return h2.data;
		
	}
	
	public int lastseven()
	{
		Node h1=head;
		Node h2=head;
		if(h1!=null)
		{
		for (int i = 0; i < 7; i++)
		{
			h1=h1.next;
		}
		
		while(h1!=null)
		{
			h1=h1.next;
			h2=h2.next;
			
			}
		}
		
		System.out.println(h2.data);
		return h2.data;
	
	}
	
	public void detectloop()
	{
		Node h1=head;
		Node h2=head;
		//h1=h1.next.next;
		//h2=h2.next;
		
		while(h1!=null && h1.next!=null)
			{
			if(h1.next==h2.next)
			{
				System.out.println("Loop exists");
				break;
			}
			h1=h1.next.next;
			h2=h2.next;
			
			//h1.next=null;
			//System.out.println("Loop is removed");
		    }
		
		if(h1==h2)
		{
			h2=head;
			while(h1.next!=h2.next)
			{
				h1=h1.next;
				h2=h2.next;
			}
			System.out.println("Loop removed");
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

	public static void main(String[] args) 
	{
		FindMiddle list=new FindMiddle();
		for (int i = 0; i < 7; i++)
		{
			list.Add(i);
			
		}
		//list.printlist();
		//list.MiddleElement();
		//list.lastseven();
		list.head.next.next.next.next=list.head.next;
		//list.printlist();
		list.detectloop();
		list.printlist();
		}


	
}
