package com.scaler.ds.linkedlist;

public class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return " [ hashCode : " + this.hashCode() + " , data : " + this.data + " , next : "
				+ (this.next == null ? null : this.next.hashCode()) + " ]";
	}

}
