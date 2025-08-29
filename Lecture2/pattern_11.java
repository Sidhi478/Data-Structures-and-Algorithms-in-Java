package lecture_2;

public class pattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star=1;
		int n=5;
		int row=1;
		int space=n-1;
		while (row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				if(j%2!=0) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
				
				j++;
			}
			System.out.println();
			row++;
			space--;
			star+=2;
			

	}

  }
}
