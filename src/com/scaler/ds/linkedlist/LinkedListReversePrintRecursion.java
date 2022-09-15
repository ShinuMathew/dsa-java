package com.scaler.ds.linkedlist;

public class LinkedListReversePrintRecursion {

	public static void main(String[] args) {
		Node head = new Node(1);
		createLinkedList(head, 10);
		printLinkedList(head);		
		printReverse(head);
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
	
	private static void printReverse(Node head) {
		if(head.next == null) {
			System.out.println(head.toString());
			return;
		}
		printReverse(head.next);
		System.out.println(head.toString());
	}
}
