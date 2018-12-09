package com.java.dp;

import java.util.HashSet;


public class Intersection {
	
	public static void interarr(int[]arr1,int[]arr2)
	{
		HashSet<Integer> hs1= new HashSet<>();
		HashSet<Integer> hs2=new HashSet<>();
		
		for(int i=0;i<arr1.length;i++)
		{
			hs1.add(arr1[i]);
		}
		
		for(int j=0;j<arr2.length;j++)
		{
			if(hs1.contains(arr2[j]))
			{
			System.out.print(arr2[j] + "\t" );
			}	
			else
			{
				hs2.add(arr2[j]);
			}
			
		}
	}
	
	public static void unionarr(int[]arr1,int[]arr2)
	{
		HashSet<Integer> hs= new HashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			hs.add(arr1[i]);
		}

		for(int j=0;j<arr2.length;j++)
		{		
			hs.add(arr2[j]);
		}
		System.out.println(hs);
		}

	public static void main(String[] args) {
		
		int[]arr1={1,3,4,2,5};
		int[]arr2={9,8,3,4,11};
		
		 System.out.println("The union of two arrays:");
	     unionarr(arr1, arr2);
	        
		System.out.println("The intersected points of two arrays are :");
		interarr(arr1, arr2);
		
       
	}

}

