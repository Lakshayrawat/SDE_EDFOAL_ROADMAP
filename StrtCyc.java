package linkedList;

import java.util.HashSet;



public class StrtCyc {


	static class Node{
		int data;
		Node next;
	}
	static Node head = null;
	static void insert(int data) {
		Node new_node = new Node();
		new_node.data=data;
		new_node.next=null;

		
		if(head ==null) { 
			head=new_node;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=new_node;
		}
	}
	static void print(Node head) {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	static Node strtPoint(Node node) {
		
		if(node == null &&  node.next == null) {
			return null;
		}
		
		Node fast = head;
		Node slow = head;
		boolean isLoop = false;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				isLoop = true;
				break;
			}
		}
		
		slow = head;
		if(isLoop) {
			
			while(slow != fast) {
				slow = slow.next;
				fast = fast.next;
			}
			return slow;
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		//Creating cycle
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		insert(6);
		insert(7);
		insert(8);
		insert(9);
		Node n = head;
		while(n.data != 7) {
			n = n.next;
		}
		n.next = head.next;
		
		//Approach 1
		System.out.println(strtPoint(head).data);
		
	}
	
}
