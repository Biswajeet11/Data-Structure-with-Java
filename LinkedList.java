package com.myjavapractce;

public class LinkedList {
	Node head;
	
	public void insert(int data) {
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=null;
		if(head==null) {
			head=newnode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
		
	}
	public void print() {
		Node newnode= head;
		while(newnode.next!=null) {
			System.out.println(newnode.data);
			newnode=newnode.next;
		}
		System.out.println(newnode.data);
	}
}