package kunal_dsa;

// not a stable sorting algorithm
// performs well on small lists/arrays

public class SelectionSort
{
	SelectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int max=0;
			int j;
			for(j=0;j<arr.length-i;j++)
			{
				if(arr[max]<arr[j])
				{
					max=j;
				}
			}
			int temp=arr[j-1];
			arr[j-1]=arr[max];
			arr[max]=temp;
		}
	}
}