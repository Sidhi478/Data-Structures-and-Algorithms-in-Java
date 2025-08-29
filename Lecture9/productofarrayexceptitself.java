package lecture_9;

public class productofarrayexceptitself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4};
		int[] a= product_of_array(arr);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	public static int[] product_of_array(int[]arr) {
		int[] left=new int[arr.length];
		left[0]=1;
		for( int i=1;i<left.length;i++) {
			left[i]=left[i-1]*arr[i-1];
			
		}
		int[]right=new int[arr.length];
		right[arr.length-1]=1;
		for(int i=arr.length-2; i>=0;i--) {
			right[i]=right[i+1]*arr[i+1];
		}
		for(int i=0;i<right.length;i++) {
			left[i]=left[i]*right[i];
		}
		return left;
	}
	

}
