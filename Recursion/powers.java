package Recursion;

public class powers {
	public static int pow(int x , int n) {
		if(n==0) {
			return 1;
		}
		int xm1=pow(x, n-1);
		int xn=x*xm1;
		return xn;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2,10));

	}

}
