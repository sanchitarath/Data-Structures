package com.java.sort;

public class MergeSort {
	
	public static void merge(int [] arr,int start,int end,int mid)
	{
		int i=start;
		int j=mid+1;;
		int k=0;
		int[] temp=new int[end-start+1];
		
		while(i<=mid && j<=end)
		{
		if(arr[i]<arr[j])
		{
			temp[k++]=arr[i++];
		}
		else
		{
			temp[k++]=arr[j++];
		}
		}
		
		while(i<=mid)
		{
			temp[k++]=arr[i++];
		}
		
		while(j<=end)
		{
			temp[k++]=arr[j++];
		}
		//System.out.println(start +"\t"+ end);
		i=start;
		for (int l = 0; l <= end-start; l++) 
		{
			arr[i++]=temp[l];
		
		}
		
		
	}
	
	public static void mergeSort(int[] arr, int start,int end)
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			mergeSort(arr,start,mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, end, mid);
		}
	}

	public static void main(String[] args) 
	{
		int[]arr={14,33,27,10,35,19,42,41};
		mergeSort(arr, 0, arr.length-1);
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}

	}

}
