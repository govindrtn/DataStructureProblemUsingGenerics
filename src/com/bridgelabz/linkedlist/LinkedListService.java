package com.bridgelabz.linkedlist;

public class LinkedListService<T> {

	 INode<T> head;

	public void add(T data) {

		INode<T> nNode = new INode<T>(data);
		nNode.data = data;
		nNode.next = head;
		head = nNode;
	}

	public void display() {
		INode<T> tempNode = head;

		while (tempNode != null) {
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.next;
		}
	}

	public void append(T data) {
		INode<T> nNode = new INode<T>(data);

		if (head == null) {
			head = nNode;
		} else {
			INode<T> tempNode = head;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = nNode;
		}
	}

	public void insertBetween(INode<T> prevNode, T data) {
		INode<T> nNode = new INode<T>(data);
		nNode.data = data;
		nNode.next = prevNode.next;
		prevNode.next = nNode;
	}
}
