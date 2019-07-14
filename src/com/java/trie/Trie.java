package com.java.trie;
import java.util.HashMap;

public class Trie {
	
	static Node root;
	
	static class Node
	{
		char key;
		HashMap<Character, Node> hashmap;
		boolean isendofword;
		
		Node(char k)
		{
			key=k;
			hashmap=new HashMap<>();
			isendofword=false;
		}
	}
	
	public static void insertTrie(String word,Node tnode,int start)
	{
		//Node node=root;
		
		
		for (int i = start; i < word.length(); i++) 
		{
			if(tnode.hashmap.containsKey(word.charAt(i)))
			{
				//Node tempnode=tnode.hashmap.get(word.charAt(i));
			    insertTrie(word, tnode,start+1);
			}
			else
			{
				
				Node newnode=new Node(word.charAt(i));
				
				tnode.hashmap.put(word.charAt(i), newnode);
				
				tnode=newnode;
				
				
			}
		}
		
		if(start==word.length())
		{
			tnode.isendofword=true;
			return;
		}
		
	}
	

	public static void main(String[] args) 
	{
		root=new Node('0');
		insertTrie("And",root,0);
		insertTrie("Arm",root,0);
		System.out.println("done");
		
	}

}
