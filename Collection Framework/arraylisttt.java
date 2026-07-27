package mypackage;

import java.util.*;

public class arraylisttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new LinkedList<>(); // ArrayList
		list.add(23);
		list.add(25);
		list.add(67);
		list.add(56);
		list.add(70);
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		// Iterator
		for(Integer element: list) {
			System.out.println("foreach element is:"+ element);
		}	
		// it contains functionalities so that 
		Iterator<Integer> it=list.iterator();
		while (it.hasNext()) {
			System.out.println("iterator:"+it.next());
				
		}
		
		// if we use list interface for linkd list then arraylist is also possible we need to change after new word 
		
	}

}
