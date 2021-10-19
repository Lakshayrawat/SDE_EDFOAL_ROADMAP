package linkedList;

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {

	Node head = null;
	
	

//1.Linked List Insertion 
	
	public Node insert(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		
		}
		else {
			Node p = head;
			
			while(p.next != null) {
				p = p.next;
			}
			p.next = newNode;
			
		}
		
		return head;
	}
//Displaying the LinkedList	
	public void print() {
		Node node = head;
		while(node != null) {
			System.out.print(node.data+" ");
		}
	}
	
//2. Linked List Deletion (Deleting a given key)
	public Node deleteKey(Node node) {
		if(node == head) {
			head = head.next;
		}
		else {
			Node prev = null;
			Node p = head;
			while(p != null && p != node) {
				prev = p;
				p = p.next;
			}
			prev.next = p.next;
		}
		
		return head;
	}
//3. Linked List Deletion (Deleting a key at given position)
	public void deletePos(int index) {
		if(index == 0) {
			head = head.next;
		}
		int count = 0;
		Node p = head;
		
		while(count != index-1) {
			count++;
			p = p.next;
		}
		p.next = p.next.next;
	}

//5. Find Length of a Linked List (Iterative and Recursive)
	public int len(Node node) {
		int size = 0;
		Node p = head;
		while(p!=null) {
			size++;
			p = p.next;
		}
		return size;
	}
//6. Search an element in a Linked List (Iterative and Recursive)
	//Iterative
	public void  search(Node node) {
		Node p = head;
		while(p!=null) {
			if(p == node) {
				System.out.println("Found");
				return;
			}
			p = p.next;
		}
		System.out.println("Not found");
	}
	//Recursive
	public void  searchRecurse(Node node) {
		Node p = head;
		if(p == null) {
			System.out.println("Not found");
			return;
		}
		if(p == node) {
			System.out.println("Found");
			return;
		}
		
		searchRecurse(node.next);
		
	}
	
//7. Write a function to get Nth node in a Linked List

	public Node nthNode(int n) {
		int count = 0;
		Node p = head;
		while(p != null && count != n) {
			count++;
			p = p.next;
		}
		
		return p;
	}
	
	
}
