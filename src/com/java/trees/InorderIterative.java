package com.java.trees;

import com.java.trees.BinaryTree.Node;
import java.util.*;

public class InorderIterative {

	static Node root;
	static Stack<Node>stack=new Stack<>();
	static Stack<Node>revstack=new Stack<>();
	static ArrayList<Integer> list=new ArrayList<>();
	static int elem1=0;
	static int elem2=0;

	public static void sumInorder(Node root,Node root2,boolean inflag,boolean revinflag,int k)
	{
		if(root==null||root2==null)
		{
			return;
		}

		while(root!=null || stack.size()>0||revstack.size()>0||root2!=null)
		{
			if(inflag==true)
			{
				while(root!=null)
				{
					stack.push(root);
					root=root.left;
				}

				root=stack.pop();
				elem1=root.data;
				//list.add(root.data);
				root=root.right;

			}
			if(revinflag==true)
			{
				while(root2!=null)
				{
					revstack.push(root2);
					root2=root2.right;
				}

				root2=revstack.pop();
				elem2=root2.data;
				//list.add(root.data);
				root2=root2.left;

			}
		
			if(elem1+elem2==k)
			{
				System.out.println("Pairs are" +"\t"+ elem1+"\t"+elem2);
				return;
			}
			if(elem1+elem2<k)
			{
				inflag=true;
				revinflag=false;

			}
			if(elem1+elem2>k)
			{
				revinflag=true;
				inflag=false;

			}


		}
		

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

		sumInorder(root,root,true,true,7);

	}

}
