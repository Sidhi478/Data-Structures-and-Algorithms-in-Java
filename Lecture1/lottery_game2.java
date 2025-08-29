package Lecture1;

public class lottery_game2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=252;
		if(n>=15 && n<=20) {
			System.out.println("Bike");	
			if(n>15 && n<18) {
				System.out.println("hero bike");
			}
			else {
				System.out.println("ktm");
			}
		}
		
		else if(n>=50 && n<=80) {
			System.out.println("cycle");
			if(n>50 && n<70) {
				System.out.println("automatic");
			}
			else {
				System.out.println("mannual");
			}
		}
		else if (n>=100 && n<=200) {
			System.out.println("car");
			if(n>=100 && n<=151) {
				System.out.println("thar");
				
			}
			else {
				System.out.println("creta");
			}
		}
		else if(n>=250 && n<=300) {
			System.out.println("mac");
		
		if(n>=250 && n<=261) {
			System.out.println("m1");
		}
		else {
			System.out.println("m2");
		}
		}
		else if(n>=1200 && n<=1400) {
			System.out.println("kurkure");
		}
		else {
			System.out.println("Happy birthday");
		}


	}

}
