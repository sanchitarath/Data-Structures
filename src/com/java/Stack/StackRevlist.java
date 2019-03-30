package com.java.Stack;

import java.util.*;

public class StackRevlist {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		Stack<Node> s = new Stack<>();
		for (int i = 0; i < 10; i++) {
			Node newnode = new Node(i);
			s.push(newnode);
		}

		while (!s.isEmpty()) {
			System.out.println(s.pop().data);
		}

	}

}
