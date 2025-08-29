package lecture_13;

public class searchintwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int item=23;
		System.out.println(search(arr,item));
		
	}
	public static boolean search (int[][]arr,int item) {
		int row=0;
		int cloumn=arr[0].length-1;
		while(row<arr.length && cloumn>=0) {
			if(arr[row][cloumn]==item) {
				return true;
			}
			else if(arr[row][cloumn]>item) {
				cloumn--;
				
			}
			else {
				row++;
			}
		}
		return false;
		
		
	}

}
