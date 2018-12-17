package com.java.dp;

public class SplitArrayOne {
	
	public void splitarr(int[]arr,int pos)
	{
		for(int j=0;j<pos;j++)
		{	
			int k=arr[0];
		for(int i=0;i<arr.length-1;i++)
				{
			arr[i]=arr[i+1];			
				}
		arr[arr.length-1]=k;
		}	
		
		for(int  i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}			
		}	

	public static void main(String[] args) {
		int[]arr={2,5,6,3,1};
		int pos=3;
		new SplitArrayOne().splitarr(arr,pos);

	}

}
