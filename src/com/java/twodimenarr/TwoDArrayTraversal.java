package com.java.twodimenarr;	
	public class TwoDArrayTraversal {
		
		public void rowtraversal(int[][]mat)
		{
			System.out.println("The row traversal is ");
		for(int i=0;i<mat.length;i++)
			{
				for(int j=0;j<mat[i].length;j++)
				{
					System.out.print(mat[i][j] + "\t");
				}
				System.out.println();
			}
			
		}
		
		public void columntraversal(int[][]mat)
		{
			System.out.println("The column traversal is ");
			for(int i=0;i<mat[0].length;i++)
			{
				for(int j=0;j<mat.length;j++)
				{
					System.out.print(mat[j][i] + "\t");
				}
				
				System.out.println();
			}
		}
		
		public void diagonaltraverse(int[][]mat)
		{
			System.out.println("The diagonal elements are: ");
			for(int i=0;i<mat[0].length;i++)
			{
				for(int j=0;j<mat.length;j++)
				{
					if(i==j){
					System.out.print(mat[j][i] + "\t");
					}
				}
				
				System.out.println();
			}
			
		}

		public static void main(String[] args) {
			
			int[][]mat={{1,2,3,8},{9,8,7,6},{1,2,3,4}};
			new TwoDArrayTraversal().rowtraversal(mat);
			new TwoDArrayTraversal().columntraversal(mat);
			new TwoDArrayTraversal().diagonaltraverse(mat);

		}

}
