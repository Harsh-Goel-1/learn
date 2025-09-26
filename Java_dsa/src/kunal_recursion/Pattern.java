package kunal_recursion;
import java.io.*;
public class Pattern
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter number of rows to print");
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(read);
		int n=Integer.parseInt(br.readLine());
		pattern(n);
	}
	private static void pattern(int n)
	{
		helper1(n,0);
		helper2(n-1,0);
	}
	private static void helper1(int r, int c)
	{
		if(r<c)
		{
			System.out.println(" ");
			helper1(r,c+1);
		}
		
	}
	private static void helper2(int r, int c)
	{
		
	}
}
