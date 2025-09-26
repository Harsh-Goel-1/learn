package kunal_dsa;

public class Binary_Search
{
	//given a sorted array
	public int BS(int[] nums,int target)
	{
		int s=0,e=nums.length-1;
		while(s<=e)
		{
			//not s+e/2 since it may exceed the integer range
			int m=s+(e-s)/2;
			if(nums[m]>target)
				e=m-1;
			else if(nums[m]<target)
				s=m+1;
			else
				return m;
		}
		return -1;
	}	
}
//can do this in sorted 2-D array too, no biggie