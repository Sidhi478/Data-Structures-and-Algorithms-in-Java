package functionsandmethods;

import java.util.Scanner;

public class functions {
	public static void PrintHello() {
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
	}
	public static int calculatesum(int a,int b) {
		int sum=a+b;
		return sum;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int sum=calculatesum(a,b);
		System.out.println("sum of numbers:"+sum);
		PrintHello();
		

	}

}
