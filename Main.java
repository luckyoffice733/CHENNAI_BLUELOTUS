package com.training.ds.sll;

class Node{
	int data;
	Node next;
}

class SingleLinkedList{
	Node head;
	
	public void insert(int val) {  //10
		Node n = new Node();
		n.data=val;
		n.next=null;
		
		if(head==null) {      
			head=n;       //   head ->10/null
		}else {
			Node n1 =head;  //get the first node
			while(n1.next!=null) {
				n1=n1.next; //
			}
			n1.next=n;
		}
	}
	
	
	public void show() {
		Node n =head;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		 System.out.println(n.data);
		
	}
	
}


public class Main {
     public static void main(String[] args) {
		
    	 SingleLinkedList sll = new SingleLinkedList();
    	 sll.insert(10);
    	 sll.insert(40);
    	 sll.insert(20);
    	 
    	 System.out.println("elements");
    	 sll.show();
	}
}
