package com.java.dp;

public class SplitArray {
	
	public void splitadd(int[]arr,int pos)
	{
		int[]newarr= new int[arr.length];
		int index=0;
		//int[]splitarr= new int[pos];
		
		for(int i=pos;i<arr.length;i++)
		{
			newarr[index]=arr[i];
			index++;
			//System.out.println(arr[i]);
		}
		
		for(int j=0;j<pos;j++)
		{
			newarr[index]=arr[j];
			index++;
		}
		for(int k=0;k<newarr.length;k++)
		{
			System.out.println(newarr[k]);
		}
	
	}

	public static void main(String[] args) {
		
		int[]arr={2,5,6,3,1};
		int pos=3;
		new SplitArray().splitadd(arr,pos);
		

	}

}
