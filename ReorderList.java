package linkedList;

import linkedList.StrtCyc.Node;

public class ReorderList {
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
	
	//To print
	static void print(Node head) {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
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
		
		reorderList(head);
		print(head);
	}
public static void reorderList(Node head) {
        
        if(head == null || head.next == null)
            return;
        
        Node l1 = head;
        
        Node slow = head;
        Node fast = head;
        
        Node prev = null;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        prev.next = null;
        
        Node l2 = reverse(slow);
        add(l1,l2);
        
    }
    
    private static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        return prev;
    }
    
    private static void add(Node l1, Node l2){
        while(l1 != null){
            Node L1 = l1.next;
            Node L2 = l2.next;
            l1.next = l2;
            
            if(L1 == null)
                break;
            
            l2.next = L1;
            l1 = L1;
            l2 = L2;
        }
    }
}
