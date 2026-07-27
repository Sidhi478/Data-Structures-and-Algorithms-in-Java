package Recursion;

public class sumofn {
	public static int sum(int n) {
		if (n==1) {
			return 1;
		}
		int some=sum(n-1);
		int somen=n+sum(n-1);
		return somen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(sum(n));

	}

}
