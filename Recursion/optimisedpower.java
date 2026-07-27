package Recursion;

public class optimisedpower {
	
	public static  int optipow(int a ,int n) {
		//base case
		if(n==0) {
			return 1;
		}
		
		int halfpower=optipow(a,n/2)*optipow(a,n/2);
		
		if(n%2!=0) {
			halfpower=a*halfpower;
			
		}
		return halfpower;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2;
		int n=5;
		System.out.println(optipow( a , n));
	}

}
