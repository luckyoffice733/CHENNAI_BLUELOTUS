package com.training.leetcode;

class ListNode{
	
	int val;
	ListNode next;
	
	ListNode(){
		
	}
	
    ListNode(int val){
		this.val=val;
	} 
    
    ListNode(int val,ListNode next){
		this.val=val;
		this.next=next;
	} 
	
	
}

public class MergingTwoSingleList {

	public static ListNode mergeTwoList(ListNode l1,ListNode l2) {
		
		ListNode l3 = new ListNode(0);
		ListNode l4= l3;
		
		while(l1!=null && l2!=null) {
			System.out.println("loop is running");
			if(l1.val<l2.val) {
				l4.next=l1;
				l1=l1.next;
			}else {
				l4.next=l2;
				l2=l2.next;
			}
			l4=l4.next;
		}
		
		while(l1!=null) {
			l4.next=l1;
			l1=l1.next;
		}
		
		while(l2!=null) {
			l4.next=l2;
			l2=l2.next;
		}
		
		return l3.next;
		
	}
	
	public static void main(String[] args) {
		System.out.println("List is ");
		ListNode l1=new ListNode(1,new ListNode(2,new ListNode(4)));
		ListNode l2=new ListNode(1,new ListNode(3,new ListNode(4)));
		// 1 1 2 3 4 4
	ListNode ml=	mergeTwoList(l1, l2);
	     while(ml!=null) {
	    	 System.out.print(ml.val+" ");
	    	 ml=ml.next;
	     }	
	    
	
	
	}
	
}
