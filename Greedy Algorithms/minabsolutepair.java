package greedyalgorithms;

import java.util.Arrays;

public class minabsolutepair {
	public static void main(String args[]) {//0(n)
		int A[]= {1,2,3};
		int B[]= {2,1,3};
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		int minDiff=0;
		for(int i=0;i<A.length;i++) {
			minDiff+=Math.abs(A[i]-B[i]); //absoulte value
		}
		System.out.println("min absolute difference of pairs= "+minDiff);
		
	}

}
