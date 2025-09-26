package kunal_dsa;
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

public class PatternComplex
{
	public void pattern28(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			//dont need to print these spaces
			for(int f=n-2;f>i;f--)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		//can integrate these 2 using turnary
		for(int i=0;i<n-1;i++)
		{
			for(int k=0;k<i+1;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n-1;j++)
			{
				System.out.print("* ");
			}
			for(int k=0;k<i+1;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void pattern30(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i*2;j<n*2-2;j++)
			{
				System.out.print(" ");
			}
			for(int k=i+1;k>0;k--)
			{
				System.out.print(k+" ");
			}
			for(int k=2;k<=i+1;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
	//purely by me
	public void pattern31(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=n;j>0;j--)
			{
				System.out.print((i>=j?i:j) + " ");
			}
			for(int j=2;j<=n;j++)
			{
				System.out.print((i>=j?i:j) + " ");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=n;j>0;j--)
			{
				System.out.print((i>=j?i:j) + " ");
			}
			for(int j=2;j<=n;j++)
			{
				System.out.print((i>=j?i:j) + " ");
			}
			System.out.println();
		}
	}
	
	//beast kunal
	public void kunal_31(int n)
	{
		for(int i=0;i<n*2-1;i++)
		{
			for(int j=0;j<2*n-1;j++)
			{
				int N=n*2-2;
				int x=n-Math.min(Math.min(i,j),Math.min(N-i,N-j));
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}
