package kunal_dsa;

public class Test {
	public static void main(String[] args) {
		System.out.println(isPrime(6));
	}
	private static boolean isPrime(int n)
	{
		if(n<=2)
			return true;
		int c=2;
		while(c*c<=n) 
		{
			if(n%c==0)
				return false;
		}
		return true;
	}
}
