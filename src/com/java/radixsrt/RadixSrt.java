package com.java.radixsrt;
import java.util.*;

public class RadixSrt {
	
	public static int finddigits(int[]arr)
	{
		int max=0;
		int count=1;
		
		for (int i = 0; i < arr.length-1; i++)
		{
			if(arr[i]>arr[i+1] && arr[i]>max)
			{
				max=arr[i];
			}
		}
		while(max!=0)
		{
			max=max/10;
			count++;
			
		}
		
		return count;
	}

	public static void radixSort(int[]arr,int exp)
	{
		List<Integer>[] list=new LinkedList[10];
		for (int i = 0; i < list.length; i++) 
		{
			list[i]=new LinkedList<Integer>();
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
			list[(arr[i]/exp)%10].add(arr[i]);
		}
		
		int j=0;
		for (int i = 0; i < list.length; i++) 
		{
			for (int k = 0; k < list[i].size(); k++) 
			{
				arr[j++]=(int) list[i].get(k);
			}
		}
		
	}
	public static void main(String[] args)
	{
		int[]arr={170,45,75,90,802,24,2,66};
		int count=finddigits(arr);
		int val=(int) Math.pow(10, count);
		for (int i = 1; i < val; i=i*10)
		{
			radixSort(arr, i);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
