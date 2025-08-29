package lecture_11;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5,6,7,8,11,13,16,17,18};
		int item=13;
		System.out.println(search(arr,item));

	}
	public static int search(int[]arr,int item) {
		int l=0;
		int r=arr.length-1;
		while(l<=r) {
			int mid=(l+r)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]<item) {
				l=mid-1;	
			}
			else {
				l=mid+1;
			}
			
		}
		return -1;
		
		
		
	}

}
