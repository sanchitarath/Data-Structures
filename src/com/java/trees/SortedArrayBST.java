package com.java.trees;

import com.java.trees.BinaryTree.Node;

public class SortedArrayBST {
	static Node root;
	
	public static int findmidnode(int[]arr,int start,int end)
	{
		
		int index=(start+end)/2;
		return index;
	}
	public static Node constructBST(int[]arr,int start,int end)
	{
		if(start>end)
		{
			return null;
		}
		
		int index=findmidnode(arr,start,end);
		Node node=new Node(arr[index]) ;
		
		node.left=constructBST(arr, start, index-1);
		
		node.right=constructBST(arr, index+1, end);
		
		return node;
		
	}
	public static void Inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		Inorder(root.left);
		System.out.println(root.data);
		Inorder(root.right);
	}
	
	

	public static void main(String[] args)
	{
		int[]arr={4,5,6,10,11,12,15};
		Node node=constructBST(arr, 0, arr.length-1);
		Inorder(node);

	}

}
