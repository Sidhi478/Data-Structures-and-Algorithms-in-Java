package lecture_9;

public class rotation {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int k=3;
		int temp[]=rotate(arr,k);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(temp[i]);
		}
	}

	private static int[] rotate(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n=arr.length;
	    k=k%n;
	    
	    reverse(arr,0,n-k-1);
	    reverse(arr,n-k,n-1);
	    reverse(arr,0,n-1);
	    
	    return arr;
	}

	private static void reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i++;
			j--;
		}
	}
}
