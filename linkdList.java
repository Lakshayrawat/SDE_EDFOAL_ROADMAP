package LinkedList;

public class linkdList {

	Node head;
	
	
	//This function finds size of the linked list;
	
	int size() {
		Node n=head;
		int c=1;
		if(head==null) {
			return 0;
		}
		else {
			while(n.next!=null) {
				n=n.next;
				c++;
			}
			return c;
		}
	}
	
	//This function create a new node and insert it in the linked list;
	
	void insert(int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next = node;
		}
	}
	
	//This is used to print the linked list;
	
	void show() {
		Node n=head;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);	
		}
	
	//This is used to insert node in the starting or we can say that add new node as head node;
	
	void insertAtstart(int data) {
		
		Node node  = new Node();
		node.data=data;
		node.next=head;
		head=node;
	}
	
	//This is used to insert node at a particular index;
	
	void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
	
		int size = size();
		if(index<0 || size<index) {
			System.out.println("Invalid index");
			return;
		}
		
		else if(index==0) {
			node.next =head;
			head = node;
		}
		else {
			Node n =head;
			for (int i = 0; i < index-1; i++) {
				n=n.next;
			}
			node.next =n.next;
			n.next=node;
		}
		
		}
	
	
	//This is used to delete the node presented at the provided index;
	
		void deleteAt(int index) {
		
		int size = size();
		if(index<0 || size<index) 
		{
			System.out.println("Invalid index");
			return;
		}
			
			
		else if(index==0) {
			head=head.next;
		}
		else {
		Node n= head;
		for (int i = 0; i < index-1; i++) {
			n = n.next;
		}
		n.next=n.next.next;
		}
		
		}
	
		//This is delete function does not take index to delete but delete identifying data;
		
		void deletedata(int data) {
			
			if(head.data==data) {
				head=head.next;
			}
			else {
				Node n=head;
				while(n.next.data!=data) {
					n=n.next;
				}
				n.next=n.next.next;
			}
			
		}
		
		Node reverse() {
			
			Node prev = null;
			Node current = head;
			Node next = null;
			while(current!= null) {
				
				    next = current.next;
		            current.next = prev;
		            prev = current;
		            current = next;
		            
			}
			return prev;
		}
	
	
}
