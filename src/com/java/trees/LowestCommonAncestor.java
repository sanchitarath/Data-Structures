package com.java.trees;
import com.java.trees.BinaryTree.Node;
public class LowestCommonAncestor {
	
	static Node root;
	static int value=-1;
	
	public static int findlca(Node root,int value1,int value2) 
	{
		if(root==null)
		{
			return -1;
		}
		
		if(root.data==value1 || root.data==value2){
			return 0;
		}
		
		int flag1=findlca(root.left,value1,value2);
		int flag2=findlca(root.right,value1,value2);
		
		if(flag1>0){
			return flag1;
		}
		
		if(flag2>0){
			return flag2;
		}
		
		if(flag1 == 0 && flag2 == 0)
		{
//  		value=root.data;
//			System.out.println(value);
			return root.data;
		}
		
		if(flag1==0 || flag2 == 0){
			return 0;
		}
		return -1;
		
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
		root.right.left.left=new Node(8);
		root.right.right.left=new Node(9);
		
		int flag=findlca(root, 5, 4);
			System.out.println(flag);
		

	}

}
