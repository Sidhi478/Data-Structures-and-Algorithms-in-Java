package lecture_2;

public class pattern_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star=1;
		int n=5;
		int space=2*n-3;
		int row=1;
		while (row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print(" *");
				i++;
			}
			int j=1;
			while(j <=space) {
				System.out.print("  ");
				j++;
			} 
			int k=1;
			if(row==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print(" *");
				k++;
			}
			System.out.println();
			row++;
			star++;
			space-=2;
		}
	}

}
