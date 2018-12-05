package com.java.dp;

public class LongestSeq {
	
	public int findLIS(int[]arr){
		
		int[] LIS= new int[arr.length];
		 int max=0;
		for(int i=0;i<LIS.length;i++)
		{
			LIS[i]	=1;		
		}
		
		   for(int i=1;i<arr.length;i++)
		   {
			   for(int j=0;j<i;j++)
			   {
				   if(arr[i]>arr[j] && LIS[i]<=LIS[j])
				   {
					 LIS[i] = 1+LIS[j];
					 
				   }
			   }
						  
		   }
		   
		   for (int i = 0; i < LIS.length; i++) {
			System.out.print(LIS[i]+"\t");
		}
		   System.out.println();
		   
		  for(int i=0;i<LIS.length;i++)
		  {
			  
			if(max < LIS[i])
			{
				max=LIS[i];
			}
			  			 
		  }
		  return max;		   
	}

	public static void main(String[] args) {
		
   int[] arr= new int[]{50,3,10,7,40};
   LongestSeq l= new LongestSeq();
   int m=l.findLIS(arr);
   
   System.out.println("The longest sequence is : " + m);
   
	}

}
