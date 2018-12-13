package com.java.dp;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayprint {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements of an array");
		int size=4;
		int[]arr= new int[size];
		int i=0;
		while(true)
		{		
			int val=sc.nextInt();
            if(i>=size)
            {
            	size=2*size;
            	arr=Arrays.copyOf(arr, size);	
            }
            
            if(val==-1)
			{
				break;
			}
			arr[i++]=val;
		}
		
		for (int j = 0; j < i; j++) {
			
			System.out.println(arr[j]);
		}
		sc.close();
	}

}
