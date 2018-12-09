package com.java.dp;

public class MultipleRotation {
	
	public void multirotate(int[]arr,int n,int k)
	{
		for(int i=k;i<n+k;i++)
		{
			System.out.print(arr[i%n] +" ");
		}
	}

	public static void main(String[] args) 
	{
		int[]arr={19,21,34,48,59,60,71,88,93};
		int n=arr.length;
		int k=2;
		MultipleRotation r1=new MultipleRotation();
		r1.multirotate(arr, n, k);
		System.out.println();
		k=3;
		r1.multirotate(arr, n, k);
		System.out.println();
		

	}

}
