package lecture_13;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//square matrix 
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		TRANSPOSE(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
	public static void TRANSPOSE(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;	
			}
		}
	}
}
