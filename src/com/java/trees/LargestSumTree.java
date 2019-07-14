package com.java.trees;

import com.java.trees.BinaryTree.Node;

public class LargestSumTree {
	
	static Node root;
	static int gsum=0;
	
	public static Node findsumtree(Node root,int sum)
	{
		if(root==null)
		{
			return null;
		}
		
		Node rnode=findsumtree(root.right,gsum);
		Node lnode=findsumtree(root.left,gsum+root.data);
		
		if(lnode==null&&rnode==null)
		{
		    gsum=gsum+root.data;
		}
		else if(lnode==null && rnode!=null)
		{
			gsum=gsum+rnode.data;
		}
		else 
		{
			gsum=gsum+lnode.data;
		}
		
		return root;
		
	}

	public static void main(String[] args) 
	{
		root=new Node(5);
		root.right=new Node(6);
		root.right.right=new Node(7);
		root.left=new Node(2);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		Node node=findsumtree(root, 0);
		System.out.println(node.data);

	}

}
