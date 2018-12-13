package com.java.dp;

import java.util.ArrayList;
import java.util.Scanner;

public class Highestnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		System.out.println("Enter some numbers!!!");
		while(sc.hasNext())
		{
			int val=sc.nextInt();
			if(val==-1)
		{
			break;
		}
			numbers.add(val);
		}
		System.out.println("the list is :"+ numbers);
		int max=numbers.get(0);
		for(int i=0;i<numbers.size();i++)
		{
			int val1=numbers.get(i);
			if(val1>max)
			{
				max=val1;
			}
		}
		System.out.println("the highest number is : " + max);
	}

}
