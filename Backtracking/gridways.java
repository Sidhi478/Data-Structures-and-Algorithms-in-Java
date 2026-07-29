package Backtracking;

public class gridways {
	public static int gridW(int i,int j,int n,int m) {
		//base case
		if(i==n-1 && j==m-1) {
			return 1;
		}else if(i==n||j==m){
			return 0;
			
		}
		int w1=gridW(i,j+1,n,m);
		int w2=gridW(i+1,j,n,m);
		return w1+w2;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3 , m=3;
		System.out.println(gridW(0,0,n,m));

	}

}
