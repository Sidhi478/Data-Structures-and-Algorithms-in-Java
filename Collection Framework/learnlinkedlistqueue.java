package mypackage;
import java.util.*;

public class learnlinkedlistqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(12);
		queue.offer(23);
		queue.offer(45);
		queue.offer(78);
		queue.offer(56);
		System.out.println(queue);
		System.out.println(queue.poll()); // first eleemtn remove 
		System.out.println(queue);
		System.out.println(queue.peek()); // after that the elements gets remove 
	}
// poll peek and offer 
}
