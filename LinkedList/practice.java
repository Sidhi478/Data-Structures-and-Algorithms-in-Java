package linkedlistt;

public class practice {
	
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	public int size=0;
	
	//add first
	public static void addfirst(int data) {
		Node newNode= new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
			
		}else {
			newNode.next=head;
			head=newNode;
		}
	}
		public static void addLast(int data) {
			Node newNode=new Node(data);
			size++;
			if(head==null) {
				head=tail=newNode;
				return;
				
			}
			newNode.next=tail;
			tail=newNode;	
		}
		public void print() {
			if(head==null) {
				System.out.println("ll is empty");
			}
			else {
				Node temp=head;
				while(temp!=null) {
					System.out.println(temp.data+" ");
				}
				System.out.println("null");
			}
		}
		public void addinthemiddle(int idx,int data) {
			if(idx==0) {
				addfirst(data);
				return;
			}
			Node temp=head;
			Node newNode=new Node(data);
			size++;
			int i=0;
			while(i<idx-1) {
				temp=temp.next;
				i++;
			}
			temp=newNode.next;
			newNode.next=temp;
			
		}
		//remove concept
		public int removefirst() {
			if(size==0) {
				System.out.println("ll is empty");
				return Integer.MIN_VALUE;
			}
			else if(size==1) {
				int val=head.data;
				head=tail=null;
				size=0;
				return val;
			}
			int val=head.data;
			head=head.next;
			size--;
			return val;
		}
		
		public int removelast() {
			if(size==0) {
				System.out.println("ll is empty");
			}
			if(size==1) {
				
			}
		}
			
			
		
	
	
	
	public static void main(String args[]) {
		
	}

}
