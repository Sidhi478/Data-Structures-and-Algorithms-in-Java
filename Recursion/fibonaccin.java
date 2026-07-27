package Recursion;

public class fibonaccin {
	public static int fib(int n) {
		if (n==1) {
			return 1;
		}
		if(n==0) {
			return 0;
		}
		int n1=fib(n-1);
		int n2=fib(n-2);
		int fibbn= n1+n2;
		return fibbn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		System.out.println(fib(n));
		

	}

}
