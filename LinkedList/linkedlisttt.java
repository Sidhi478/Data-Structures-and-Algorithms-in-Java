package linkedlistt;

import java.util.LinkedList;

public class linkedlisttt {
	public static class Node{
		int data;
		Node next;
		public Node(int data) { // constructor
			this.data=data;
			this.next=null;
			}
		}
	public static Node head;
	public static Node tail;
	public static int size=0;
	// methods 
	public void addFirst(int data) {
		Node newNode=new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
		}
		//step 1 create newnode
		// step 2 link create 
		newNode.next=head;
		// step 3 head=newnode
		head=newNode;	
	}
	public void addLast(int data) {
		Node newNode= new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
		
	}
	public void print() {
		if(head==null) {
			System.out.println("ll is empty");
			return;
		}
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
}
	public void add(int idx,int data) {
		if(idx==0) {
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		size++;
		Node temp=head;
		int i =0;
		while(i<idx-1) {
			temp=temp.next;
			i++;
		}
		newNode. next=temp.next;
		temp.next=newNode;
		
	}
	public int removeFirst() {
		if(size==0) {
			System.out.println("ll is emplty");
			return Integer.MIN_VALUE;
		} else if(size==1) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		int val= head.data;
	    head=head.next;
	    size--;
		return val;
	}
	public int removelast() {
		if(size==0) {
			System.out.println("ll is emplty");
			return Integer.MIN_VALUE;
		}
		else if(size==1) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		Node prev=head;
		for(int i=0;i<size-2;i++) {
			prev=prev.next;
		}
		int val=prev.next.data;//tail.data
		prev.next=null;
		tail=prev;
		size--;
		return val;			
	}
	//linear search------------------------------------------
	
	public int itrSearch(int key) {
		Node temp=head;
		int i=0;
		
		while(temp!=null) {
			if(temp.data==key) {
				return i;
			}
			temp=temp.next;
			i++;
		}
		return -1;
	}
	// recursive search----------------------------------------
	public int helper(Node head,int key) {
		if(head==null) {
			return -1;
		}
		if(head.data==key) {
			return 0;
		}
		int idx=helper(head.next,key);
		if(idx==-1) {
			return -1;
		}
		return idx+1; //during backtracking current head add 1 to existing head reutrn value 
	}
	public int recSearch(int key) {
		return helper(head,key);
	}
	///reverse linked list 0(n)
	public void reverse() {
		Node prev=null;
		Node curr=tail=head;
		Node next;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	public void deleteNthfromEnd(int n) {
		//calcukate size
		int sz=0;
		Node temp=head;
		while(temp!=null) {
			temp=temp.next;
			sz++;
		}
		if(n==sz) {
			head=head.next;//remove fisrt 
			return;
		}
		int i=1;
		int iToEnd=sz-n;
		Node prev=head;
		while(i<iToEnd) {
			prev=prev.next;
			i++;
		}
		prev.next=prev.next.next;
		return;
	}
	//---------------------------------------------------------------
	
	// check palindrome
	public Node findMid(Node head) { //helper
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast=fast.next.next;
		}
		return slow;//slow is mid
	}
	
	public boolean checkPalindrome() {
		if(head==null || head.next==null) {
			return true;
		}
		// step1 find mid
		Node midNode=findMid(head);
		//step reverse 2nd half
		Node prev=null;
		Node curr=midNode;
		Node next;
	    while(curr!=null) {
	    	next=curr.next;
	    	curr.next=prev;
	    	prev=curr;
	    	curr=next;
	    }
	    Node right=prev;// right half head
	    Node left=head;
	    //step right and left head are they equal\
	    while(right!=null) {
	    	if(left.data!=right.data) {
	    		return false; 
	    	}
	    	left=left.next;
	    	right=right.next;
	    }
	    return true;
		
	}
	// detcting cycle
	public static boolean iscycle() { // floyds cycle finding 
		Node slow=head;
		Node fast=head;
		
		while(fast!=null&& fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;//cycle exists
			}
		}
		return false; // cycel doesnt exist
		
	}
	//___________---------------------------------------
	public static void removecycle() {
		Node slow=head;
		Node fast=head;
		boolean cycle=false;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow) {
				cycle=true;
				break;
			}
		}
		if(cycle==false) {
			return;
		}
		slow=head;
		Node prev=null;
		while(slow!=fast) {
			prev=fast;
			slow=slow.next;
			fast=fast.next;
		}
		
		prev.next=null;
		 
	}
	
	
	//-----------------------------merge sort
	private Node getmid(Node head) {
		Node slow=head;
		Node fast=head.next;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
		}
		return slow;
	}
	private Node merge(Node head1,Node head2) {
		Node mergedLL=new Node(-1);
		Node temp=mergedLL;
		while(head1!=null&& head2!=null) {
			if(head1.data<=head2.data) {
				temp.next=head1;
				head1=head1.next;
				temp=temp.next;
			}else {
				temp.next=head2;
				head2=head2.next;
				temp=temp.next;
			}
		}
		//remaining code for remaining elements
		while (head1!=null) {
			temp.next=head1;
			head1=head1.next;
			temp=temp.next;
		}
		while(head2!=null) {
			temp.next=head2;
			head2=head2.next;
			temp=temp.next;
		}
		return mergedLL.next;
		
	}
	public Node mergeSort(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		//step1 mid
		Node mid=getmid(head);
		// left and right ms
		
		Node righthead=mid.next;
		mid.next=null;
		Node newLeft=mergeSort(head);
		Node newRight=mergeSort(righthead);
		
		//merge
		return merge(newLeft,newRight);
		
	}
	//------------------------------------------
	public void zigzag() {
		//mid
		Node slow= head;
		Node fast=head.next;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
		}
		Node mid=slow;
		//reverse 2nd half
		Node curr=mid.next;
		mid.next=null;
		Node prev=null;
		Node next;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		Node left=head;
		Node right=prev;
		Node nextL,nextR;
		//alt merge
		while(left!=null&&right!=null) {
			nextL=left.next;
			left.next=right;
			nextR=right.next;
			right.next=nextL;
			
			left=nextL;
			right=nextR;	
		}
		//////
		
		// alternate merge zig zag 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		head=new Node(1);
//		Node temp=new Node(2);
//		head.next=temp;
//		head.next.next=new Node(3);
//		head.next.next.next=temp;
//		System.out.println(iscycle());
//		removecycle();
//		System.out.println(iscycle());
//		linkedlisttt l1=new linkedlisttt();
//		l1.addFirst(2);
//		l1.print();
//		l1.addFirst(1);
//		l1.print();
//		l1.addLast(3);
//		l1.print();
//		l1.addLast(4);
//		l1.print();
//		l1.add(2, 9);
//		l1.print();
//		l1.deleteNthfromEnd(3);
//		l1.print(); 
//		System.out.println(l1.size);
//		l1.removeFirst();
//		l1.print();
//		l1.removelast();
//		l1.print();
//		System.out.println(l1.size);
//		System.out.println(l1.recSearch(3));
//		System.out.println(l1.recSearch(10));
		
//		l1.addLast(1);
//		l1.addLast(2);
//		l1.addLast(2);
//		l1.addLast(1);
//		l1.print();
//		System.out.println(l1.checkPalindrome());
		
		linkedlisttt ll=new linkedlisttt();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.print();
		ll.zigzag();
		ll.print();
		
		
//		
//		

	}

}
