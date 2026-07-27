package Recursion;

public class factorialn {
	public static int facti(int n) {
		if(n==0) {
			return 1;
		}
			int factnm=facti(n-1);
			int factu=n*facti(n-1);
			return factu;
			}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(facti (n));
		

	}

}
