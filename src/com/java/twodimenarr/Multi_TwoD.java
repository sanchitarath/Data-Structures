package com.java.twodimenarr;

public class Multi_TwoD {
	
	public static int[][] multiply(int[][]temp1,int[][]temp2)
	{
		int rows1 = temp1.length,columns1 = temp1[0].length,columns2=temp2[0].length;
		int[][] mulmatrix=new int[rows1][columns2];
		for(int i=0;i<rows1;i++)
		{
			for(int k=0;k<columns2;k++)
			{
				for(int j=0;j<columns1;j++)
				{
					mulmatrix[i][k]=mulmatrix[i][k]+temp1[i][j]*temp2[j][k];
				}
				
			}
			
		}
		return mulmatrix;
	}
	public void display(int[][]mulmatrix){
		System.out.println("The product of matrices is :");
		
		for(int[]row:mulmatrix)
		{
			for(int column:row)
			{
				System.out.print(column +"\t");
			}
			System.out.println();
		}
		
	
	}

	public static void main(String[] args) {
		
		int[][]temp1={{1,2,3},{3,4,8}};
		int[][]temp2={{5,7,8},{1,1,2}};
		if(temp1[0].length==temp2.length)
		{
		int[][] product =new Multi_TwoD().multiply(temp1, temp2);
		new Multi_TwoD().display(product);
		}else{
			System.out.println("Invalid array for multiplication");
		}
	}

}
