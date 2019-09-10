package com.java.dynamicprog;

import java.util.Arrays;

public class LIS {

	public static int findLengthLIS(int[]arr)
	{
		int n=arr.length;
		int maxlength=0;
		//int result=1;
		int[] temp=new int[n];
		Arrays.fill(temp, 1);
		
		for (int i = 1; i < n; i++) 
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i])
						//&& (1+temp[j])>result)
				{
					temp[i]=1+temp[j];
					//result=temp[i];
				}
			}
		}
		
		for (int i = 0; i < n; i++) 
		{
			if(temp[i]>maxlength)
			{
				maxlength=temp[i];
				System.out.println(arr[i]);
			}
		}
	return maxlength;
	}
	public static void main(String[] args) 
	{
		//int[] arr={10,22,9,33,21,50,41,60,80};
		//int[]arr1={3,4,-1,0,6,2,3};
		int[]arr2={10,9,2,5,3,4};
		int length=findLengthLIS(arr2);
		System.out.println("Length of longest increasing subsequence is "+ length);

	}

}
