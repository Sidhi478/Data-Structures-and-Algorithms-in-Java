package lecture_13;

public class arr_mooray_voating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,2,1,1,1,2,2};
		System.out.println(MORAY(arr));
				
		}
		public static int MORAY(int []arr) {
			int vote=1;
			int element=arr[0];
			for(int i=0;i<arr.length;i++) {
				if (arr[i]==element) {
					vote++;
				}
				else {
					vote--;
					if(vote==0) {
						element=arr[i];
						vote=1;
					}
				}
			}
			return element;
			
		}

	}


