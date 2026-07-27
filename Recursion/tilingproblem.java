package Recursion;

public class tilingproblem {
	public static int problemtiling(int n) { //same goes for 4*1
		if(n==0||n==1) {
			return 1;
		}
		//kaam
		int fnm1=problemtiling(n-1);
		int fnm2=problemtiling(n-2);
		
		int totalways=fnm1+fnm2;
		return totalways;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(problemtiling(3));
		
		

	}

}
