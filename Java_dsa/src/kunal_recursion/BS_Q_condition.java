package kunal_recursion;

import java.util.ArrayList;

public class BS_Q_condition
{
	//return all indices but do not pass ArrayList in parameters
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,4,4,4,4,4,4,4,5,7,9};
		System.out.println(findAllIndex(arr,4));
	}
	private static ArrayList<Integer> findAllIndex(int[] arr, int target)
	{
		return helper(arr,target,0);
	}
	private static ArrayList<Integer> helper(int[] arr, int target, int i)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(i==arr.length)
			return list;
		if(arr[i]==target)
			list.add(i); //answer from this function call
		ArrayList<Integer> l=helper(arr,target,i+1); //answer from below function calls
		list.addAll(l);
		return list; //total answers including this and below calls
	}
}
