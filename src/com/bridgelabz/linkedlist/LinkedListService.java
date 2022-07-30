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

	public T pop() {
		if (head == null) {
			return null;
		}
		INode<T> tempNode = head;
		head = head.next;
		return tempNode.data;
	}

	public T popLast() {
		INode<T> tempNode = head;
		while (tempNode.next.next != null) {
			tempNode = tempNode.next;
		}
		tempNode.next = null;
		return tempNode.data;
	}

	public void search(T key) {
		boolean keyFound = false;
		INode<T> tempNode = head;
		while (tempNode != null) {
			if (tempNode.data == key) {
				System.out.println("Key Found");
				keyFound = true;
			}
			tempNode = tempNode.next;
		}
		if (keyFound == false) {
			System.out.println("Key is not Found please enter valid Key");
		}
	}

	public void InsertAfter(T key, T data) {
		INode<T> newNode = new INode<T>(data);
		newNode.data = data;
		INode<T> tempNode = head;
		while (tempNode.data != key) {
			tempNode = tempNode.next;
		}
		tempNode.next = tempNode.next;
		tempNode.next = newNode;
	}

	public void deleteNode(T key) {
		INode<T> tempNode = head;
		INode<T> prevNode = head;
		while (tempNode.data != key) {
			prevNode = tempNode;
			tempNode = tempNode.next;
		}
		prevNode.next = tempNode.next;

	}
}
