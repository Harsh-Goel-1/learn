package kunal_dsa;

public class Prime_slick_af {
	public static void main(String[] args) {
		boolean[] primes=new boolean[38];  //Array to store prime or not
		sieve(37,primes);
	}
	private static void sieve(int n,boolean[] primes)  //sieve of Eratosthenes
	{											//we takin false for prime and true for not prime
		
		for(int i=2;i*i<=n;i++)  //i*i<=n = i<=Maths.sqrt(n);
		{
			if(!primes[i])
			{
				for(int j=i*2;j<=n;j+=i)
					primes[j]=true;		  //setting multiples of prime numbers with 2 as not prime
			}
		}
		for(int i=2;i<=n;i++)  //printing all prime numbers
		{
			if(!primes[i])
				System.out.print(i+" ");
		}
	}
}
//space complexity is O(N)
//time complexity is O(N log(log N))
// n/2+n/3+n/4.... = N(harmonic progression for primes= log(log N))