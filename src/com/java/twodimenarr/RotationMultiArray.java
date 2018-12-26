package com.java.twodimenarr;

public class RotationMultiArray {

	public int[][] rotatearr(int[][]arr)
	{
		int row=arr.length;
		int column=arr[0].length;
		int[][]arr2=new int[row][column];
		int rotateindex=column-1;
	
		for(int i=0;i<row;i++)
		{
				for(int k=0;k<column;k++)
				{
					arr2[k][rotateindex]=arr[i][k];				
				}
				rotateindex--;			
		}
		return arr2;
		
	}
	public void displayarr(int[][]arr2)
	{
		System.out.println("The rotated array is :");
		for(int[]row:arr2)
		{
			for(int column:row)
			{
				System.out.print(column +"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][]arr={{1,2,3,9},{4,5,6,7},{7,8,2,1},{4,6,7,8}};
		int[][]arr2=new RotationMultiArray().rotatearr(arr);
		new RotationMultiArray().displayarr(arr2);

	}

}
