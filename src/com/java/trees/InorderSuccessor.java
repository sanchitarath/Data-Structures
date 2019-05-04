package com.java.trees;
import com.java.trees.BinaryTree.Node;

public class InorderSuccessor {
	
	static Node root;
	
	public static Node inordersucc(Node parent,Node root,int elem)
	{
		if(root==null|| root.left==null||root.right==null)
		{
			return null;
		}
		if(root.data==elem)
		{
			return root.right;		
			}
		
		if(root.left.data==elem)
		{
			if(root.left.right==null)
			{
				return root;
			}else 
			{
				Node left=findleftnode(root.left.right);
				System.out.println(left);
				return left;
			}
		}
		
		if(root.right.data==elem )
		{
			if(root.right.right==null)
			{
				return parent;
			}else
			{
				Node right=findleftnode(root.right.right);
				return right;
			}
		}
		
		Node left=inordersucc(root, root.left, elem);
		Node right=inordersucc(root, root.right, elem);
		
		if(left==null && right==null)
		{
			return null;
		}
		else if(left==null && right!=null)
		{
			return right;
		}
		else if(right==null&& left !=null)
		{
			return left;
		}
		
	return root;
	}

	private static Node findleftnode(Node node) {
		
		while(node.left!=null)
		{
			node=node.left;
		}
		return node;
	}
public static Node inorderpred(Node parent,Node root,int elem)
{
	if(root==null|| root.left==null||root.right==null)
	{
		return null;
	}
	if(root.data==elem)
	{
		return findRightNode(root.left);		
	}
	
	if(root.left.data==elem)
	{
		if(root.left.left==null)
		{
			return parent;
		}else 
		{
			Node right=findRightNode(root.left.left);
			System.out.println(right);
			return right;
		}
	}
	
	if(root.right.data==elem )
	{
		if(root.right.left==null)
		{
			return root;
		}else
		{
			Node right=findRightNode(root.right.left);
			return right;
		}
	}
	
	Node left1=inorderpred(root, root.left, elem);
	Node right1=inorderpred(root, root.right, elem);
	
	if( left1==null && right1==null)
	{
		return null;
	}
	
	else if(left1==null && right1!=null)
	{
		return right1;
	}else if(left1!=null && right1==null)
	{
		return left1;
	}
	
return root;
}

	
	
	public static void main(String[] args)
	{
		
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		//root.left.left.right=new Node(10);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		//root.right.left.left=new Node(8);
		//root.right.right.left=new Node(9);
		
		
		Node temp=findRightNode(root);
		if(temp.data==7)
		{
			System.out.println("No inorder sc");
		}
		else{
		Node node=inordersucc(null, root, 7);
		System.out.println(node.data);
		}
		Node temp1=findleftnode(root);
		
		if(temp1.data==6)
		{
			System.out.println("No inorder pc");
		}
		else{
		Node node=inorderpred(null, root, 6);
		System.out.println(node.data);
		}
		
		
	}

	private static Node findRightNode(Node root) 
	{
		while(root.right!=null)
		{
			root=root.right;
		}
		
		return root;
	}

}
