package queue.java;
import java.util.*;

public class queueusingJCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>q=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
		

	}

}
