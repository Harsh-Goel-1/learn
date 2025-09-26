package kunal_dsa;

public class Sqrt {
	public static void main(String[] args) {
		int n=40;  //number
		int p=2;   //precision
		System.out.println(sqrt_harsh(n,p)); //m goes out of range for more than 2 precision
		System.out.println(sqrt_kunal(n,p)); 
		System.out.println(Math.sqrt(40));
		System.out.println(NRM(n));
	}
	
	private static double sqrt_harsh(int n,int p) //hot garbage since low precision range
	{
		double n2=n*Math.pow(10, p*2+2);
		long s=0,e=(long)n2;
		while(s<=e)
		{
			long m=s+(e-s/2);
			if(m*m==n2)
				return m/Math.pow(10, p+1);
			else if(m*m<n2)
				s=m+1;
			else
				e=m-1;
		}
		n2=Math.round(s/10);
		return n2/Math.pow(10,p);
	}
	private static double sqrt_kunal(int n,int p) //fine ig?
	{
		int s=0,e=n;
		double root=0;
		while(s<=e)
		{
			int m=s+(e-s)/2;
			if(m*m==n)
				return m;
			else if(m*m<n)
				s=m+1;
			else
				e=m-1;
		}
		double inc=0.1;
		root=e;
		for(int i=0;i<p;i++)
		{
			while(root*root<=n)
			{
				root+=inc;
			}
			root-=inc;
			inc/=10;
		}
		return root;
	}
	private static double NRM(double n) //Newton Raphson method op? theory in footnotes
	{
		double root;
		double x=n;
		for(;;)
		{
			root=(x+n/x)/2;
			if(Math.abs(root-x)<=0.001)
			{
				break;
			}
			x=root;
		}
		return root;
	}
}

/* root=(x+(n/x))/2 is the formula, put x=sqrt(n) for proof
 * how this works?
 * imagne your guessed root i.e. x is the real root then |root-x|<precision
 * try debugging if confused
 * complexity? fast af
 * fast fourier transform(FFT)
 * 
 */