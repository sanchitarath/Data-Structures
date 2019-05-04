package com.java.trees;

public class BinaryTree {
	
	static Node root;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int d)
		{
			data=d;
			left=right=null;
		}
	}
	public BinaryTree() {
		root=null;
	}
	
	public static int maxheight(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		
		
		return 1+Math.max(maxheight(root.left), maxheight(root.right));
	}
	
	public static void levelorder(Node root,int level)
	{
		if(root==null)
		{
			return;
		}
		
		if(level==0)
		{
			System.out.println(root.data);
		}
		levelorder(root.left,level-1);
		levelorder(root.right, level-1);
		
		
		
	}
	
	

	public static void main(String[] args)
	{
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.left.right=new Node(5);
		int h=maxheight(root);
		System.out.println(h);
		for(int i=0;i<h;i++)
		{
			levelorder(root,i);
			
		}
		

	}

}
