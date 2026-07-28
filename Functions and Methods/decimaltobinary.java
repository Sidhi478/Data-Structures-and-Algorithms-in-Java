package functionsandmethods;

public class decimaltobinary {
	public static void dectoBin(int n) {
		int temp=n;
		int pow=0;
		int binNum=0;
		
		while(n>0) {
			int rem=n%2;
			binNum=binNum+(rem*(int)Math.pow(10, pow));
			pow++;
			n=n/2;
		}
		System.out.println("binaary for of n"+temp+" ="+binNum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dectoBin(5);

	}

}
