package com.java.trees;

import com.java.trees.BinaryTree.Node;

public class TreeFromInPre {

	static Node root;
	int precount=0;
	
	public int searchindex(int[] inorder,int start, int end,int[] preorder)
	{
		
		for(int i=start;i<=end;i++)
		{
			if(inorder[i]==preorder[precount])
			{
				return i;
			}
			     
		}
		return -1;
	}
	
	public Node computeTree(int[] inorder,int start, int end,int[] preorder)
	{
		if(start>end)
		{
			return null;
		}
		
		int index=searchindex(inorder,start,end,preorder);
		Node tnode=new Node(inorder[index]);
		
		precount++;
		
		tnode.left=computeTree(inorder,start,index-1,preorder);
		
		tnode.right=computeTree(inorder,index+1,end,preorder);
		
		
		return tnode;
		
	}
	
	public void Inorder(Node root)
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
		int[] preorder={1,2,4,9,10,5,3,6,7,8};
		int[] inorder={9,4,10,2,5,1,7,6,8,3};
		
		TreeFromInPre tree=new TreeFromInPre();
		Node tnode=tree.computeTree(inorder, 0, inorder.length-1, preorder);
		tree.Inorder(tnode);

	}

}
