package mypackage;
import java.util.*;

public class multidimentionalarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
		ArrayList<Integer> list= new ArrayList<>();
		list.add(1); list.add(2);
		mainList.add(list);
		
		ArrayList<Integer> list2= new ArrayList<>();
		list2.add(3); list2.add(4);
		mainList.add(list2);
		// to print this we apply nesting 
		
		for(int i=0;i<mainList.size();i++) {
			ArrayList<Integer> currList = mainList.get(i);
			for(int j=0;j<currList.size();j++) {
				System.out.print(currList.get(j)+" ");
				
			}
			System.out.println();
		}
		
		System.out.println(mainList);
		
		

	}

}
