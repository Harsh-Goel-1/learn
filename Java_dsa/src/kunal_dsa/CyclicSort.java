package kunal_dsa;

//USE CYCLIC SORT WHENEVER GIVEN RANGE IS IN 1 TO N
//O(N) complexity:- 2N-1 is worst case, N is best case

public class CyclicSort
{
	CyclicSort(int[] arr)
	{
		sort(arr);
	}

	private void sort(int[] arr)
	{
		int i=0;
		while(i<arr.length)
		{
			int index=arr[i]-1;
			if(arr[i]!=arr[index])
			{
				swap(arr,i,index);
			}
			else
				i++;
		}
	}
	
	private void swap(int arr[],int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}