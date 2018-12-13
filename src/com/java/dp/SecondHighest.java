package com.java.dp;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		System.out.println("Enter some numbers!!!");
		while(sc.hasNextInt())
		{
			int i=sc.nextInt();
			if(i==-1)
			{
				break;
			}
			numbers.add(i);
		}
		System.out.println("the list is "+numbers);
		int max=numbers.get(0);
		int max2 =numbers.get(0) ;
		for(int j=0;j<numbers.size();j++)
		{			
			int val1=numbers.get(j);			
		if(val1>max)
		{
			max2=max;
			max=val1;
			
		}
		else if(val1!=max && val1>max2)
		{
			max2=val1;
		}
		}
		
		System.out.println("The second highest number is :"+max2);
	}

}
