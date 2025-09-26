package kunal_recursion;

import java.util.Arrays;

public class Merge_Sort_in_place
{
	public static void main(String[] args)
	{
		int[] arr = {5,1,100,54,71,901,7,3,9,11,500,2,4};
		merge_sort_in_place(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	static void merge_sort_in_place(int[] arr, int s, int e)
	{
		if(e-s==0)
			return;
		int mid=(s+e)/2;
		merge_sort_in_place(arr,0,mid);
		merge_sort_in_place(arr,mid+1,e);
		merge(arr,s,mid,e);
	}

	static void merge(int[] arr,int s,int m,int e)
	{
		++m;
		while(s<=m&&m<=e)
		{
			if(arr[s]>arr[m])
			{
				int temp=arr[m];
				for(int k=m-1;k>=s;k--)
				{
					arr[k+1]=arr[k];
				}
				arr[s]=temp;
				//or use System.arraycopy() method to copy consecutive elements
				//of an array into another/same array, this will be more efficient
				//System.arraycopy(arr,i,arr,i+1,j-i);
				m++;
			}
			s++;
		}
	}
}
//complexities- O(N log n log n) O(1)