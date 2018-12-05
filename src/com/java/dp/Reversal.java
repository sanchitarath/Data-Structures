package com.java.dp;

public class Reversal {
	
	public void reverse()
	{
		//char[] strarray={'a','b','c','d'};
		int[] arr = {1,2,3,4,5,6};
		int j=0;
		int k;
		//int[] revarr= new int[arr.length];
		
		for(int end=arr.length-1;end>=arr.length/2;end--)
			{
			k=arr[j];
			arr[j]=arr[end];
			arr[end]=k;
			//arr[j]=arr[end];
			//arr[end]=arr[j];
			j++;
				//System.out.println(arr[end]);
		        
			}
						
		for(int j1=0;j1<arr.length;j1++)
		{
			System.out.println(arr[j1]);
		}
		
	}
	

	public static void main(String[] args) {
		/*char[] strarray={'a','b','c','d'};	
		
		for(int i=0;i<strarray.length;i++){
        System.out.print(strarray.toString().charAt(i));*/
		
		new Reversal().reverse();
		}
	}


