package com.java.trees;

import java.util.*;
import java.util.Map.Entry;

import com.java.trees.BinaryTree.Node;

public class HashingBinarytree {
	static Node root;
	static Map<Integer, List<Integer>> hm=new HashMap<>();
	private static int height;
	
	public static void levelorder(Node root,int level)
	{
		if(root==null)
		{
			return;
		}
		
		if(hm.containsKey(height-level))
		{
			List<Integer> list=hm.get(height-level);
			list.add(root.data);
			hm.put(height-level, list);
		}else
		{
			List<Integer> list=new ArrayList<>();
			list.add(root.data);
			hm.put(height-level, list);
		}
		
		
		levelorder(root.left, level-1);
		levelorder(root.right, level-1);
	}
    
	public static void main(String[] args) 
	{
		BinaryTree tree=new BinaryTree();
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(6);
		root.left.left.right=new Node(5);
		height=tree.maxheight(root);
		System.out.println(height);
		
		
		levelorder(root,height);
		
		
		for(Map.Entry<Integer,List<Integer>> mapelement:hm.entrySet())
		{
			if(mapelement.getKey()%2==0)
			{
				
				Collections.reverse(mapelement.getValue());
				
				System.out.println(mapelement.getValue());
			}else{
				System.out.println(mapelement.getValue());
			}
		}
	    
	    // hm.forEach((k,v)->System.out.println(k + "\t"+v));
	}

}
