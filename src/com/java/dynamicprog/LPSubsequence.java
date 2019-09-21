package com.java.dynamicprog;

public class LPSubsequence {

	public static int findlength(String str)
	{
		int maxlength=0;
		int n=str.length();
		int[][] arr=new int[n][n];
		
			for (int i = 0; i < arr.length; i++) 
			{
				arr[i][i]=1;
				maxlength=1;
			}
	
		for(int k=2;k<=n;k++)
		{
			for(int i=0;i<n-k+1;i++)
			{
				int j=i+k-1;
				if(str.charAt(i)==str.charAt(j))
				{
					arr[i][j]=2+arr[i+1][j-1];
					maxlength=arr[i][j];
				}
				else
				{
					arr[i][j]=Math.max(arr[i][j-1], arr[i+1][j]);
					maxlength=arr[i][j];
				}
			}
		}
		return maxlength;
	}
	public static void main(String[] args) 
	{
		String str="BBABCBCAB";
		int l=findlength(str);
		System.out.println("The longest palindromic subsequence is "+l );

	}

}
