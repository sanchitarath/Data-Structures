package com.java.twodimenarr;

public class Rotationnoextratwod {
	
	static int mat_size=10;
	static int[][]arr=new int[mat_size][mat_size];
	public void Swap( int i1,int j1,int i2,int j2)
	{	
		int temp=arr[i1][j1];
		arr[i1][j1]=arr[i2][j2];
		arr[i2][j2]=temp;		
	}
	
	public void rotatearr(int[][]arr)
	{
		int last=mat_size-1;
		int level=0;
		int totNumOfLevel=mat_size/2;
		while(level<totNumOfLevel)
		{
		for(int i=level;i<last;i++)
		{
			Swap(level,i,i,last);
			Swap(level,i,last,last-i+level);
			Swap(level,i,last-i+level,level);
		}
		level++;
		last--;
		
		}
		System.out.println("The rotated array is");
		displayarr();
		
	}
	
	public void displayarr()
	{
		for(int[]row:arr)
		{
			for(int column:row)
			{
				System.out.print(column +"\t");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) 
	{
		
		int count=0;
		System.out.println("The original array is :");
		for(int i=0;i<mat_size;i++)
		{
			for(int j=0;j<mat_size;j++)
			{
				arr[i][j]=count++;
				
			}
			
		}
		new Rotationnoextratwod().displayarr();
		new Rotationnoextratwod().rotatearr(arr);
	}

}
