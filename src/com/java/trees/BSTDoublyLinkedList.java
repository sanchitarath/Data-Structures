package com.java.trees;

import com.java.trees.BinaryTree.Node;

public class BSTDoublyLinkedList {
	static Node root;
	static Node prev;
	static Node Head;
	
	public static void convertToDLL(Node root)
	{
		if(root==null)
		{
			return ;
		}
		
		convertToDLL(root.left);
		if(prev==null)
		{
			prev=root;
			Head=root;
		}
		else{
		prev.right=root;
		root.left=prev;
		prev=root;
		}
		convertToDLL(root.right);
		
		//return prev;
	}
	
	public static void main(String[] args) 
	{
		root=new Node(8);
		root.left=new Node(3);
		root.right=new Node(10);
		root.left.left=new Node(1);
		root.left.right=new Node(6);
		root.left.right.right=new Node(7);
		root.left.right.left=new Node(4);
		root.right.right=new Node(14);
		root.right.right.left=new Node(13);
		
		convertToDLL(root);
		
		while(Head.right!=null)
		{
			System.out.println(Head.data);
			Head=Head.right;
		}

	}

}
