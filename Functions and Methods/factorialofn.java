package functionsandmethods;

public class factorialofn {
	public static int factorialn(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;		
			}
		return f;
	}
	public static int binCoefficient(int n , int r) {
		int fact_n=factorialn(n);
		int fact_r=factorialn(r);
		int fact_nmr=factorialn(n-r);
		
		
		int binCoefficient=fact_n/(fact_r*fact_nmr);
		return binCoefficient;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(binCoefficient(5,2));


	}

}
