package com.java.trees;

import com.java.trees.BinaryTree.Node;


public class DiamTree {
	static Node root;
	
	public static int finddiameter(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		
		int ldiam=finddiameter(root.left);
		int rdiam=finddiameter(root.right);
		int lh=BinaryTree.maxheight(root.left);
		int rh=BinaryTree.maxheight(root.right);
		
		return(Math.max((1+lh+rh),Math.max(ldiam, rdiam)));
		
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
		int diam=finddiameter(root);
		System.out.println(diam);

	}

}
