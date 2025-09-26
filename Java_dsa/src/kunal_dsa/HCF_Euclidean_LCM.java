package kunal_dsa;

public class HCF_Euclidean_LCM //check out extended euclidean algo for cp maybe
						   	   //theory in register
{
	public static void main(String[] args)
	{
		System.out.println(gcd(4,12)); //greatest common divisor/ highest common factor
		System.out.println(lcm(4,12));
	}
	private static int gcd(int a,int b)
	{
		if(a>b)
			return helper(b,a);
		else
			return helper(a,b);
	}
	private static int helper(int a, int b)
	{
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	private static int lcm(int a,int b)
	{
		return a*b/gcd(a,b); //lcm=a*b/hcf(a,b)
	}
}
