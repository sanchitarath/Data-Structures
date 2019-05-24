package com.java.trees;

import com.java.trees.BinaryTree.Node;
import java.util.*;

public class InorderIterative {
	
	static Node root;
	static Stack<Node>stack=new Stack<>();
	static ArrayList<Integer> list=new ArrayList<>();
	
	public static ArrayList<Integer> findInorder(Node root)
	{
		if(root==null)
		{
			return null;
		}
		
		
		//findInorder(root.left);
		while(root!=null)
		{
			stack.push(root);
			root=root.left;
		}
		
		while(!stack.isEmpty())
		{
			Node node=stack.pop();
			list.add(node.data);
			node=node.right;
			
			while(node!=null)
				{
				stack.push(node);
				node=node.left;
				}
		}
		return list;
		
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
		
		ArrayList<Integer> list=findInorder(root);
		
		for (Integer e : list) 
		{
			System.out.println(e);
		}

	}

}
