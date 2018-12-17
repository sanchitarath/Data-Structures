package com.java.dp;

import java.util.HashMap;
import java.util.Iterator;

public class MaxString {

	public void maxOccur()
	{
		String[] arr={"i","e","i","e","i","e","e"};
		HashMap<String,Integer> hash=new HashMap<>();
		
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
		
		int max=hash.get(arr[0]);
		String key=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		int val=hash.get(arr[i]);
		if(val>max)
		{
			max=val;
			key=arr[i];
		}
		}	
	
		System.out.println(max + "\t" + key);
		
	 Iterator<String> iterator= hash.keySet().iterator();
	 max=0;
	 key=null;
		while(iterator.hasNext())
		{	
			String elem=iterator.next();
			Integer cnt=hash.get(elem);
			if(cnt>max){
				max=cnt;
				key=elem;
			}
		}
				System.out.println(key +"\t" + max);
		
	}
	public static void main(String[] args) {
		new MaxString().maxOccur();
	}

}
