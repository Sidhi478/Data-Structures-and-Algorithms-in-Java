package Recursion;

public class lastoccurance {
	public static int lastoccurance(int arr[],int key,int i) {
		if (i==arr.length) {
			return -1;
		}
		int isFound= lastoccurance(arr, key, i+1) ;
		if (isFound==-1 && arr[i]==key) {
			return i;
			}
		return isFound;		
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,5,6,7,5,8,9};
		System.out.println(lastoccurance(arr,5,0));

	}

}
