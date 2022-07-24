package com.bridgelabz.linkedlist;

public class LinkedListService<T> {
	
	private INode<T> head;
	
	public void add (T data) {
		
		INode<T> nNode = new INode<T>(data);
		nNode.data = data;
		nNode.next = head;	
		System.out.println();
		head = nNode;
	}
	public void display() {
		INode<T> tempNode = head;
		
		while (tempNode != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
	}
}
