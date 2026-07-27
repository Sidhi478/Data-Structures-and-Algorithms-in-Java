package mypackage;
import java.util.*;

public class learnpriorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(34);
		pq.offer(35);
		pq.offer(67);
		pq.offer(90);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		System.out.println(pq.peek());
		

	}

}
