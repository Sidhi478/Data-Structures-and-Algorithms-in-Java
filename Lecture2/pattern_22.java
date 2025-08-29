package lecture_2;

public class pattern_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int star=n;
		int row=1;
		int space=-1;
		while(row<=n) {
			int i=1;
			if(row==n) {
				i=2;
			}
			while(i<=star) {
				System.out.print(" *");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k<=star) {
				System.out.print(" *");
				k++;
			}
			System.out.println();
			row++;
			space+=2;
			star--;
		}
		

	}

}
