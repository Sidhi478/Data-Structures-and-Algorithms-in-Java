package Lecture1;

public class else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=62;
		if(m>=75) {
			System.out.println("a");
		}
		else if(m>=65 && m<75) {
			System.out.println("b");
		}
		else if (m>=55 && m<65) {
			System.out.println("c");
		}
		else if(m>=45 && m<55) {
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}

	}

}
