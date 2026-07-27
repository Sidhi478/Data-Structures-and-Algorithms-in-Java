package mypackage;

import java.util.Arrays;

public class learnArraysclass {
	public static void main(String[] args) {
		//int[] numbers= {1,2,3,4,5,6,7,8,9,10};
		//int index = Arrays.binarySearch(numbers,4);
		//System.out.println(index);
		
		Integer[] numbers= {10,2,32,12,15,76,17,79,90};
		Arrays.sort(numbers);
		
		//Arrays.fill(numbers, 12); // it will fill 12 value in all
		
		for(int i : numbers) {
			System.out.println(i+" ");
		}
		
	}

}
