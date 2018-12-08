package com.java.dp;

import java.util.HashSet;

public class UniqueElement {

	public void function(int n)
	{
		int[] arr={1,4,4,3,5,1};
		HashSet<Integer> hash= new HashSet<>();
		boolean flag=false;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				if(hash.contains(arr[i]))
				{
					flag=true;
					break;				
				}
				else
				{
					hash.add(arr[i]);				
				}
			}			
		}
		if(flag)
		{
			System.out.println("duplicate");
		}
		else{
			System.out.println("unique");
		}
	}
	public static void main(String[] args)
	{
		new UniqueElement().function(4);
	}

}
