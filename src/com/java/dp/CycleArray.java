package com.java.dp;

public class CycleArray {
     public void cycarr(int pos)
     {
    	 int[]arr={1,2,3,4,5};
    	 
    	 for(int i=0;i<pos;i++)
    	 {
    		 int x=arr[arr.length-1];
    		 for(int j=arr.length-1;j>0;j--)
    		 {
    			 arr[j]=arr[j-1];
    		 }
    		 arr[0]=x;
    	 }
    	 for(int  i=0;i<arr.length;i++)
 		{
 			System.out.println(arr[i]);
 		}
    	 
     }
	public static void main(String[] args) {
		int pos=2;
		new CycleArray().cycarr(pos);

	}

}
