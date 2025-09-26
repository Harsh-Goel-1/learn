package kunal_recursion;

import java.util.Arrays;

public class Merge_Sort
{
	public static void main(String[] args)
	{
		int[] arr = {5,1,3,8,10,2,4};
		System.out.println(Arrays.toString(mergeSort(arr)));
	}
	
	static int[] mergeSort(int[] arr)
	{
		if(arr.length==1)
			return arr;
		int mid=arr.length/2;
		int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
		int[] right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		return merge(left,right);
	}
	
	static int[] merge(int[] arr1, int[] arr2)
	{
		int[] arr = new int[arr1.length+arr2.length];
		int i,j,k;
		i=j=k=0;
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				arr[k]=arr1[i];
				i++;
            }
			else
			{
				arr[k]=arr2[j];
				j++;
            }
            k++;
        }
		while(i<arr1.length)
		{
			arr[k]=arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length)
		{
			arr[k]=arr2[j];
			k++;
			j++;
		}
		return arr;
	}
}

// N comparisons are made at every level. there are log base 2 n levels
// so time complexity is n log n