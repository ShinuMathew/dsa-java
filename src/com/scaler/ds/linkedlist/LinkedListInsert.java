package com.scaler.ds.linkedlist;

public class LinkedListInsert {

	public static void main(String[] args) {
		Node head = new Node(1);
		createLinkedList(head, 10);
		printLinkedList(head);
		head = insertNode(head, 13, 10);
		printLinkedList(head);
	}
	
	private static Node createLinkedList(Node head, int x) {		
		Node t = head;
		for (int i = 2; i <= x; i++) {
			head.next = new Node(i);
			head = head.next;
		}		
		return t;
	}
	
	private static void printLinkedList(Node head) {
		int i = 0;
		while(true) {			
			System.out.println(i+" : "+head.toString());
			if(head.next == null) break;
			head = head.next;
			i++;
		}
	}
	
	private static Node insertNode(Node head, int data, int position) {
		System.out.println("Insert Node with data : "+data+" at position : "+position);
		Node newNode = new Node(data);
		if(position == 0) {
			newNode.next = head;
			head = newNode;			
		} else {
			Node temp = head;	// Create a temporary node for traversal
			for(int i = 1; i < position; i++) {	// i starts from 1 since the head is already at 0. When i = p-1, temp = temp.next will bring temp to (p -1)th position
				temp = temp.next;				
			}			
			newNode.next = temp.next;
			temp.next = newNode;
			
		}
		return head;
	}
}
