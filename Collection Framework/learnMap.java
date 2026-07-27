package mypackage;
import java.util.*;

public class learnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> numbers=new TreeMap<>();
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		numbers.put("four", 4);
		System.out.println(numbers);
		for(Map.Entry<String,Integer>e:numbers.entrySet()) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		for(String key: numbers.keySet()) {
			System.out.println(key);
		}
		for(Integer value: numbers.values()) {
			System.out.println(value);
		}
		System.out.println(numbers.containsValue(3));
		System.out.println(numbers.isEmpty());
		

	}

}
