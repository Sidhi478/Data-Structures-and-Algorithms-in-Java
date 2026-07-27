package mypackage;
import java.util.*;

public class stacklearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> animals=new Stack<>();
		animals.push("dog");
		animals.push("lion");
		animals.push("cat");
		animals.push("tiger");
		animals.push("horse");
		System.out.println("stack:"+animals);
		System.out.println(animals.peek());
		animals.pop();
		System.out.println("stack:"+animals);
		System.out.println(animals.peek());
	}

}
// 3 methods are there push peek and pop 

