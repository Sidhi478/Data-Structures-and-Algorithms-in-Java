package functionsandmethods;

public class prime {
	public static boolean primes(int n) {
		//corner case only for greater than 2 and equal to 2
		if(n==2) {
			return true;
		}
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
	public static void primesinrange(int n) {
		for(int i=2;i<=n;i++) {
			if(primes(i)) {
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  primesinrange(20);

	}

}
