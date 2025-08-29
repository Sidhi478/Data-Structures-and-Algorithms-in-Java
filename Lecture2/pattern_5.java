package lecture_2;

public class pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=5;
		int space=n-1;
		while (row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
				
			}
			int j=1;
			while (j<=star) {
				System.out.print(" *");
				j++;
				
			}
			System.out.println();
			row++;
			space++;
			star--;
		}

	}

}
