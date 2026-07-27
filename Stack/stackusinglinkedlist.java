package stackk.java;
import java.util.*;

public class stackusinglinkedlist {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	static class Stackk{
		static Node head=null;
		
		public static boolean isEmpty() {
			return head==null;
		}
		//push
		public static void push(int data) {
			Node newNode=new Node(data);
			if(isEmpty()) {
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;	
		}
		//pop 
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=head.data;
			head=head.next;
			return top;
		}
		//peek
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stackk sl=new Stackk();
		Stack<Integer> sl=new Stack<>(); //using java scollection framework
		sl.push(1);
		sl.push(2);
		sl.push(3);
		
		while(!sl.isEmpty()) {
			System.out.println(sl.peek());
			sl.pop();
		}
		
		

	}

}
