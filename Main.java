package com.training.ds.sll;

class Node {
	int data;
	Node next;
}

class SingleLinkedList {
	Node head;

	public void insert(int val) { // 10
		Node n = new Node();
		n.data = val;
		n.next = null;

		if (head == null) {
			head = n; // head ->10/null
		} else {
			Node n1 = head; // get the first node
			while (n1.next != null) {
				n1 = n1.next; //
			}
			n1.next = n;
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			// System.out.println("n1 " + n1.data);
			n1 = null;
		}
	}

	public void show() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);

	}

}

public class Main {
	public static void main(String[] args) {

		SingleLinkedList list = new SingleLinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(12);
		list.show();//18 45 12
		System.out.println("at Start -> head");
		list.insertAtStart(25);
		list.show();//25 18 45 12
		System.out.println("Insert at index Posititon 1");
		list.insertAt(1, 55);
		list.show(); //25 55 18 45 12
		System.out.println("After Deleted at index Position.....!");
		list.deleteAt(2);
		list.show(); //25 55 45 12
	}
}
