package LinkedList;

import java.util.HashSet;

import LinkedList.delMid.Node;

public class Cycle {

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
	
	//Approach 1
	static boolean cycDetect1(Node head) {
	
		
			
			HashSet<Integer> set = new HashSet<Integer>();
			while(head!=null) {
				if(set.contains(head.data)) {
					return true;
				}
		
				set.add(head.data);
				head=head.next;
				
				
			}
			return false;
		}
	
	//Approach 2
	static boolean cycDetect2(Node head) {
		Node fast = head;
		Node slow = head;
		
		while(fast != null && fast.next != null ) {
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
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
		while(n.data != 8) {
			n = n.next;
		}
		n.next = head;
		
		//Approach 1
		System.out.println(cycDetect1(head));
		//Appraoch 2
		System.out.println(cycDetect2(head));
	}
	
	
}
