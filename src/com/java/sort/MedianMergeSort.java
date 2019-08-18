package com.java.sort;

public class MedianMergeSort 
{

	public static int getMedian(int[]arr1,int[]arr2,int start1,int end1,int start2,int end2)
	{
		int n1=end1-start1+1;
		int n2=end2-start2+1;

		if(n1==0 && n2==0)
		{
			return -1;
		}

		if(n1==1 && n2==1)
		{
			return (arr1[start1]+arr2[start2])/2;
		}

		if(n1==2 && n2==2)
		{
			return (Math.max(arr1[start1], arr2[start2])+Math.min(arr1[end1], arr2[end2]))/2;
		}


		int m1=findMedian(arr1,start1,end1, n1);
		int m2=findMedian(arr2,start2,end2, n2);


		if(m1==m2)
		{
			return m1;
		}

		if(m1>m2)
		{
			return getMedian(arr1, arr2, 0, (end1+start1)/2, (end2+start2)/2,end2);
		}

		if(m1<m2)
		{
			return getMedian(arr1, arr2,(end1+start1)/2, end1,0,(end2+start2)/2);
		}

		return 0;
	}

	public static int findMedian(int[]arr,int start,int end,int n)
	{
		if(n%2==0)
		{
			return (arr[(end+start)/2]+arr[((end+start)/2)-1])/2;
		}
		else{
			return arr[(end+start)/2];
		}
	}
	public static void main(String[] args)
	{
		int[]arr1={1,3,8,9,15};
		int[]arr2={7,11,18,19,21};
		int n1=arr1.length-1;
		int n2=arr2.length-1;
		int median=getMedian(arr1, arr2, 0, n1, 0, n2);

		if(median>0)
		{
			System.out.println("The median of two sorted arrays is " + median);
		}else{
			System.out.println("Invalid median os sorted arrays");
		}

	}

}
