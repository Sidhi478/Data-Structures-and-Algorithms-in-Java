package lecture_8;

public class swapmethod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,5,6,7,8};
		int[]other= {23,45,65,56,78};
		System.out.println(arr[0]+ " "+other[0]);
		swap(arr,other);
		System.out.println(arr[0] +" "+ other[0]);
	}
	public static void swap(int[] arr,int[] other) {
		int[] temp=arr;
		arr=other;
		other=temp;
	//we have to change value by going to index//	
//call by value//
		//index swapping//
	}

}
