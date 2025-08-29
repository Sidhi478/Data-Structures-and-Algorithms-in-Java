package lecture_13;

public class Spiral_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		Print(arr);
	}
		
	
	public static void Print(int[][]arr) {
		int minr=0,minc=0,maxr=arr.length-1,maxc=arr[0].length-1;
		int total=arr.length*arr[0].length;
		int c=0;
		while(c<total) {
			for(int i=minc;i<=maxc&& c<total;i++) {
				System.out.print(arr[minr][i]+" ");	
			}
			for(int i=minr;i<maxr && c<total;i++) {
				System.out.print(arr[i][maxc]+"");
				
			}
			maxc--;
			for(int i=maxc;i>=minc && c<total;i--) {
				System.out.print(arr[maxr][i]+" ");	
			}
			maxr--;
			for(int i=maxr;i>=minr&& c<total;i--) {
				System.out.print(arr[maxr][i]+" ");	
			}
			minc++;
			
		}	
     }		
  }



