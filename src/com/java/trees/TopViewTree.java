package com.java.trees;

import java.util.*;

import com.java.trees.BinaryTree.Node;

public class TopViewTree {
	static Node root;
	static int i;
	static HashSet<Integer> hashset=new HashSet<>();
	
	public static void findtopview(Node root,int i)
	{
		
		if(root==null)
		{
			return;
		}
		
		if(hashset.contains(i))
		{
			return;
			
		}else
		{
			hashset.add(i);
			
			System.out.println(root.data);
		}
		
		findtopview(root.left, i-1);
		findtopview(root.right, i+1);
		
		
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
		
		findtopview(root, 0); 

	}

}
