package com.java.dynamicprog;

public class LongestPalinSubstring {
	
	public static int findlength(String str)
	{
		int maxlength=0;
		int n=str.length();
		int[][] mat=new int[n][n];
		for (int i = 0; i < n; i++) 
			{
				mat[i][i]=1;
				maxlength=1;
			}
			
		int start=0;
		for (int i = 0; i < n-1; i++) 
			{
				if(str.charAt(i)==str.charAt(i+1))
				{
					mat[i][i+1]=2;
					start=i;
					maxlength=2;
				}
			}
		
		
		for(int k=3;k<=n;k++)
		{
			for(int i=0;i<n-k+1;i++)
			{
				int j=i+k-1;
				if(mat[i+1][j-1]>=1 && str.charAt(i)==str.charAt(j))
				{
					mat[i][j]=2+mat[i+1][j-1];
					start=i;
					maxlength=k;
				}
			}
			
		}
		
		System.out.println(str.substring(start, start+maxlength));
		
		return maxlength;
	}

	public static void main(String[] args) 
	{
		String str="madam";
		int length=findlength(str);
		System.out.println("The longest palindromic substring is "+ length);
		
		String str1="babad";
		int length1=findlength(str1);
		System.out.println("The longest palindromic substring is "+ length1);
		

	}

}
