package functionsandmethods;

public class binarytodecimal {
	public static void bintodec(int binNum) {
		int temp=binNum;
		int pow=0;
		int decNum=0;
		while(binNum>0) {
			int lastDigit=binNum %10;
			decNum=decNum+(lastDigit*(int)Math.pow(2, pow));
			pow++;
			binNum=binNum/10;
		}
		System.out.println("decimal of "+temp+"=  "+decNum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bintodec(101);

	}

}
