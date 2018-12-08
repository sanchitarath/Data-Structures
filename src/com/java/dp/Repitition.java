package com.java.dp;

import java.util.HashMap;
import java.util.Iterator;

public class Repitition {
	
	public void Hashing(){
		
		int[]arr={1,4,4,3,5,4,3};
		HashMap<Integer, Integer> hash=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(hash.containsKey(arr[i]))
			{
				int val=hash.get(arr[i]);
				val++;
				hash.put(arr[i], val);
			}
			else
			{
				hash.put(arr[i], 1);
			}
		}
		
		Iterator iterator= hash.keySet().iterator();
		
		while(iterator.hasNext())
		{		
			int val=(Integer)iterator.next();
				System.out.println(val +"\t" + hash.get(val));
		}
	}
	
	/**
	 * @author Sanchita Bily
	 * @return
	 * @param 
	 * 
	 */

	public static void main(String[] args)
	{
		
         new Repitition().Hashing();
	}

}
