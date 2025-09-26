package kunal_dsa;

// It is stable sorting algorithm
// stable alogorithm is when the order is same when value is same
// time stamp is 32:10

public class Bubble
{
	Bubble(int[] arr)
	{
		for(int i=1;i<=arr.length;i++)
		{
			boolean swap=false;
			//best is O(n) worst is O(n^2)
			for(int j=0;j<arr.length-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					arr[j]+=arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
					swap=true;
				}
			}
			if(!swap)
				break;
		}
	}
}
