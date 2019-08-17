package com.java.sort;

public class Median {

	public static int partition(int[]arr,int start,int end)
	{
		int j=-1;
		int pi=end;
		if(start<=end)
		{
			for (int i = 0; i <= end-1; i++) 
			{
				if(arr[i]<arr[pi])
				{
					j++;
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}

			int temp=arr[j+1];
			arr[j+1]=arr[pi];
			arr[pi]=temp;
		}

		return j+1;

	}

	public static int findMedian(int[]arr,int start,int end,int k)
	{
		int pos=partition(arr, start, end);

		if(pos==k)
		{
			return arr[pos];
		}
		if(pos>k)
		{
			return findMedian(arr, start, pos-1, k);
		}
		else
		{
			return findMedian(arr, pos+1, end, k);
		}

	}

	public static void main(String[] args) 
	{
		int[]arr={12,3,1,7,6,4,9};
		int n=arr.length;
		int median=findMedian(arr,0,n-1,n/2);
		System.out.println(median);

	}

}
