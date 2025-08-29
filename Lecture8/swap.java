package lecture_8;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {10,4,5,67,8};
		swap(arr[0],arr[1]);
		System.out.println(arr[0]+" "+arr[1]);	
	}
	public static void swap(int a, int b) { //no change beacuse the chnages are locally not globally//
		int temp=a;
		a=b;
		b=temp;
	}
}
