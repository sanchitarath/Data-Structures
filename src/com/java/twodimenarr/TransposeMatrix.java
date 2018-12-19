package com.java.twodimenarr;

public class TransposeMatrix {
	
	public void Transpose(int[][]mat)
	{
		System.out.println("Before transpose:"+"\n");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+ "\t");
			}
			System.out.println();
		}
		
		System.out.println("After transpose:"+"\n");
		for(int i=0;i<mat[i].length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				System.out.print(mat[j][i]+ "\t");
			}
			System.out.println();
		}
				
	}

	public static void main(String[] args) 
	{
		int[][]mat={{1,2},{9,8},{1,2},{4,5}};
		new TransposeMatrix().Transpose(mat);

	}

}
