package com.java.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
	
	public void Sort()
	{
		Integer[]arr={1,3,5,11,10,6,7,2,8,18};
		
		
		List<Integer> list= Arrays.asList(arr);
		list.stream().forEach(e->System.out.print(e+"\t"));
		System.out.print("\n"+ "After Sorting"+"\n");
		Collections.sort(list);
		
		list.stream().forEach(e->System.out.print(e+"\t"));
	}

	public static void main(String[] args) {
		new Sorting().Sort();

	}

}
