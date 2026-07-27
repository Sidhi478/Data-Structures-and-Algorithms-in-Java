package mypackage;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<Integer> set=new LinkedHashSet<>(); // FOR LINKEDHASHSET properties of linked list are required
		Set<Student> StudentSet=new HashSet<>();
		StudentSet.add(new Student("anuj",2));
		StudentSet.add(new Student("research",5));
		StudentSet.add(new Student("shivam",23));
		StudentSet.add(new Student("rohit",2));
		System.out.println(StudentSet);
		
		
//		Set<Integer> set=new TreeSet<>();  // it enters the elements into array in sorted form baaki saari properties are same 
//		set.add(34);
//		set.add(45);
//		set.add(78);
//		set.add(4);
//		set.add(56);
//		System.out.println(set);//order is random
//        set.remove(34);
//        System.out.println(set);
//        System.out.println(set.contains(78));
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());
//        set.clear();
//        System.out.println(set);
//        
//		

	}

}
