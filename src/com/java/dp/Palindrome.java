package com.java.dp;

public class Palindrome {

	public void palinrev()
	{
	String str="katak";
	char[]chararr=str.toCharArray();
	int k=0;
	int j;
	boolean flag=true;
	for(int ch=chararr.length-1;ch>=chararr.length/2;ch--)
	{
		
		if(chararr[ch]!= chararr[k]){
			flag=false;
			break;
		}
		k++;
		
	}
	
	if(flag){
		System.out.println("Palindrome");
	}
	
	else{
		System.out.println("Not a pallindrome ");
	}
		
	}
	public static void main(String[] args) 
	{
		new Palindrome().palinrev();

	}

}
