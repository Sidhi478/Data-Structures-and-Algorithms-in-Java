
package mypackage;
import java.util.*;
public class define {
	public static void swap(ArrayList<Integer> list ,int idx1,int idx2) {
		int temp=list.get(idx1);
		list.set(idx1,list.get(idx2));
		list.set(idx2,temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String/Boolean/Float
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> list2=new ArrayList<>();
		ArrayList<Boolean> list3=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(1,9);//its just add elemnt in particular operation
		System.out.println(list);
		int idx1=2,idx2=4;
		System.out.println(list);
		swap(list,idx1,idx2);
		System.out.println(list);
		Collections.sort(list); // ascending order 
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
//		System.out.println(list.size()); //it will give count of arraylist
//		int element=list.get(2); //get operation
//		System.out.println(element);
//		//delete element
//		list.remove(2);
//		System.out.println(list);
//		//set element
//		list.set(2,10);
//		System.out.println(list);
//		//contains
//		System.out.println(list.contains(1));
//		System.out.println(list.contains(11));
//		// print the arraylist
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		for(int i=list.size()-1;i>=0;i--) { //reverse
//			System.out.println(list.get(i)+" ");
//			
//		}
		// maximum element in array list
		
//		int max=Integer.MIN_VALUE;//0(n)
//		for(int i=0;i<list.size();i++) {
//			if(max<list.get(i)) {
//				max=list.get(i);
//			}
//		}
//		System.out.println("max element="+max);
//		
//		int idx=1, idx2=3;
//		
				
		

	}

}
