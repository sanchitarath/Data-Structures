package com.java.dp;

public class RotationOne {
	int[]arr={1,2,3,4,5,6,7};
	public void rotate(int d)
	{
		int n= arr.length;
		for(int k=0;k<d;k++)
		{
			int j=arr[0]; 
			for(int i=0;i<n-1;i++)
			{			
				arr[i]=arr[i+1];

			}
			arr[n-1]=j;
			
			for (int i = 0; i < arr.length; i++) 
			{
				System.out.print(arr[i]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//int rotateIndex=2;
		RotationOne r1=new RotationOne();
		//for(int i=0;i<1;i++){
			r1.rotate(2);
		//}

	}

}
