package kunal_dsa;

//given an array having only 1 number appearing once rest appear thrice
//find the number

public class BitwiseQ
{
	public static void main(String args[])
	{
		int arr[]= {2,2,2,3,3,3,10000,7,7,7,8,8,8};
		int x=find(arr);
		System.out.println(x);
	}
	static private int find(int arr[])
	{
		int a[]=new int[32]; //4 bytes=32 bits
		for(int n:arr) //taking numbers from array
		{
			int i=0;
			while(n!=0) //adding set bits of number to array indices
			{
				a[i]+=n&1;
				n=n>>1;
				i++;
			}
		}
		int i=0;
		for(int n:a) //the numbers appearing thrice will add up(in bits form) to 3
		{			 //and the single repition will take the sum to 4
			a[i]=n%3;
			i++;
		}
		int sum=0;
		i=0;
		for(int n:a) //converting bit form to number
		{
			if(n!=0)
			sum+=Math.pow(2,i);
			i++;
		}
		return sum;
	}
}
