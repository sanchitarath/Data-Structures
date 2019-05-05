package com.java.trees;

import com.java.trees.BinaryTree.Node;

public class BinarySearchTree {
	
	static Node root;
	
	public static boolean findKey(Node root,int elem)
	{
		boolean left = false,right=false;
		if(root==null)
		{
			return false;
		}
		
		if(root.data==elem)
		{
			return true;
		}
		
		if(elem<root.data)
		{
			left=findKey(root.left, elem);
		}
		if(root.data<elem)
		{
			right=findKey(root.right, elem);
		}
		
		if(left==true||right==true)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void insertkey(Node root, int key,Node parent)
	{
		if(root==null)
		{
			if(key<parent.data)
			{
				Node node=new Node(key);
				parent.left=node;
				return;
			}else
			{
				Node node=new Node(key);
				parent.right=node;
				return;
			}
		}
		
		if(key<=root.data)
		{
			insertkey(root.left, key, root);
		}
		if(root.data<key)
		{
			insertkey(root.right, key, root);
		}
		
	}
	
	public static Node insertNode(Node root,int elem)
	{
		if(root==null)
		{
			root=new Node(elem);
			return root;
		}
		if(elem<=root.data)
		{
			root.left=insertNode(root.left, elem);
		}
		if(root.data<elem)
		{
			root.right=insertNode(root.right, elem);
		}
		
		return root;
	}
	
	public static Node inorder(Node root)
	{
		if(root==null)
		{
			return null;
		}
		
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		
		return root;
		
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
		
//		boolean key=findKey(root, -13);
//		if(key==true)
//			{
//			System.out.println("key found");
//			}
//		else{
//			System.out.println("key not found");
//		}; 
		
		insertkey(root, 0, null);
		//insertNode(root, 15);
		inorder(root);

	}

}
