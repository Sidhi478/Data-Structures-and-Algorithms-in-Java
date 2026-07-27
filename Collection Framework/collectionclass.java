package mypackage;
import java.util.*;

public class collectionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student>list=new ArrayList<>();
		list.add(new Student("Anuj",2));
		list.add(new Student("ramesh",4));
		list.add(new Student("shivam",5));
		list.add(new Student("rohit",67));
		
		Student s1=new Student("Anuj",2);
		Student s2=new Student("Rohit",3);
		//System.out.println(s1.compareTo(s2)); //2-3
		System.out.println(list);
		Collections.sort(list);
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}		
		});
		System.out.println(list);
//		List<Integer> list=new ArrayList<>();
//		list.add(34);
//		list.add(12);
//		list.add(9);
//		list.add(9);
//		list.add(76);
//		list.add(29);
//		list.add(75);
//		list.add(98);
//		//System.out.println("min element"+Collections.min(list));
//		//System.out.println("max element"+ Collections.max(list));
//		//System.out.println(Collections.frequency(list,9));
//		Collections.sort(list,Comparator.reverseOrder());
//		System.out.println(list);

	}

}
