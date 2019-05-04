package com.java.trees;

import com.java.trees.BinaryTree.Node;

public class LeafNode {
	
	static Node root;
	
	public static void findleafNode(Node root)
	{
		if(root==null)
		{
		return ;
		}
		if(root.left==null && root.right==null)
		{
		
		System.out.println(root.data);
		}
		
		findleafNode(root.left);
		findleafNode(root.right);
		
	}


	public static void main(String[] args) 
	{
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.left.left.right=new Node(10);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
		findleafNode(root);

	}

}
