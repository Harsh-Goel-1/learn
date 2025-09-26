package kunal_recursion;

import java.util.ArrayList;

public class BS_Q
{
	public static void main(String args[])
	{
		int[] arr= {1,2,3,4,4,4,5,7,9};
		System.out.println(findAllIndex(arr,4));
	}
	public static ArrayList<Integer> findAllIndex(int arr[],int target)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		int s=0,e=arr.length-1;
		return helper(arr,target,list,s,e);
	}
	private static ArrayList<Integer> helper(int[] arr,int target, ArrayList<Integer> list,int s,int e)
	{
		if(s>e)
			return list;
		int m=e-(e-s)/2;
		if(arr[m]==target)
		{
			helper(arr,target,list,s,m-1);
			list.add(m);
			helper(arr,target,list,m+1,e);
		}
		else if(arr[m]<target)
			helper(arr,target,list,m+1,e);
		else
			helper(arr,target,list,s,m-1);
		return list;
	}
}
