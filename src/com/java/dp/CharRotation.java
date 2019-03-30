package com.java.dp;

public class CharRotation {

	public void Palindrome(char[]arr)
	{
		boolean flag=true;
		int i=0;
		for(int j=arr.length-1;j>=arr.length/2;j--)
			{
				if(arr[i]!=arr[j])
				{
					flag=false;
					break;		
				}
				
				i++;
			}
		
		
		if(flag)
		{
			System.out.println("Is Palindrome");
		}else{
			System.out.println("Not A palindrome");
		}
		
	}
	public static void main(String[] args) {
		CharRotation rot=new CharRotation();
		char [] arr={'m','a','d','a','m'};
		rot.Palindrome(arr);

	}

}
