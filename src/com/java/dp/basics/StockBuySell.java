package com.java.dp.basics;
import java.util.*;

public class StockBuySell {
	
	public static class Interval
	{
		int buy;
		int sell;
	}
	
	
	public static void maxProfit(int[] prices)
	{
		int count=0;
		int n=prices.length;
		int i=0;
		
		ArrayList<Interval> list=new ArrayList<>();
		
		while(i<n-1)
		{
			while(i<n-1 && prices[i+1]<=prices[i])
			{
				i++;
			}
			if(i==n-1)
			{
				break;
			}
			Interval e=new Interval();
			e.buy=i++;
			
			while(i<n && prices[i]>=prices[i-1])
			{
				i++;
			}
			
			e.sell=i-1;
			list.add(e);
			
			count++;
		}
		
		if(count==0)
		{
			System.out.println("No Profit");
		}
		else{
			for (int j = 0; j < count; j++) 
			{
				System.out.println("Buy on "+ list.get(j).buy +"\t"+ "Sell on"+ list.get(j).sell);
				
			}
		}
		return ;
	}

	public static void main(String[] args) 
	{
		int[]arr={100, 180, 260, 310, 40, 535, 695 };
		maxProfit(arr);
	
	}

}
