package com.java.SingleLinkedLists;

import java.util.List;
import java.util.Stack;

public class ReverseList {
	Node head;

	public void push(int n) {
		Node newnode = new Node(n);
		newnode.next = head;
		head = newnode;
	}

	public void revlist() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}

	}

	public void pop() {
		head = head.next;
	}

	public static void main(String[] args) {
		ReverseList list = new ReverseList();
		list.push(23);
		list.push(12);
		list.push(66);
		// list.revlist(list1.head.data);
		list.revlist();
		list.pop();
		list.revlist();
		list.push(66);
		list.revlist();

	}

}
