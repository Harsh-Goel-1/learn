package kunal_dsa;

//worst case complexity is 1+2+...+(n-1) = O(n2)
//best case = O(n) is where it truly shines

//stable, takes less steps than bubble, used for smaller values of N
//works good when array is partially sorted, takes part in hybrid sorting algorithms

public class InsertionSort
{
	InsertionSort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			for(int j=i-1;j>0;j--)
			{
				if(arr[j]>arr[i])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				else 
					break;
			}
		}
	}
}
