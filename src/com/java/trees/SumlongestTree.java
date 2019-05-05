package com.java.trees;

import com.java.trees.BinaryTree.Node;

public class SumlongestTree {
	static Node root;
	static int maxsum=Integer.MIN_VALUE;
	
	public static void sumTree(Node root,int sum)
	{
		if(root==null ){return ;}
		if(root.left==null && root.right==null)
		{
			sum+=root.data;
			if(maxsum<sum)
				{
				maxsum=sum;
				
				}
		}
		
		sum+=root.data;
		sumTree(root.left, sum);
		
		sumTree(root.right, sum);
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
		sumTree(root,0);
		System.out.println(maxsum);

	}

}
