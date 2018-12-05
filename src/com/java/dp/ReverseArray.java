package com.java.dp;

public class ReverseArray {
	
	public void reverse()
	{
		int[]arr={6,4,11,9,1,7,8};
		
		
		int j;
		for(int i=0;i<arr.length-1;i=i+2)
		{
			
			j=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=j;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ "\t");
		}
	}

	public static void main(String[] args) {
		new ReverseArray().reverse();

	}

}
