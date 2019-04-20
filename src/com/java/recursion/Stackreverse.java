package com.java.recursion;
import java.util.*;

public class Stackreverse {
	static class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public void revestack(Stack<String> stack)
	{
		if(stack.size()==1)
		{
			return ;
		}
		String string=stack.pop();
			
	     revestack(stack);
	     
	     krevstack(stack,string);
	     
	   
}
	
	public void krevstack(Stack<String> stack,String st)
	{
		if(stack.empty())
		{
			stack.push(st);
			return;
		}
		String pop=stack.pop();
		krevstack(stack, st);
		stack.push(pop);
		
		}

	public static void main(String[] args) 
	{
		Stack<String> s=new Stack<>();
		s.push("S");
		s.push("A");
		s.push("N");
		s.push("D");
				
		
		
		Stackreverse sr =new Stackreverse();
		sr.revestack(s);
		
		  while(s.size()!=0)
		     {
		    	 String st=s.pop();
		    	 System.out.println(st);
		     }

	}

}
