package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.LinkedListService;

public class QueueServices<T extends Comparable <T>> {
	
	LinkedListService<T> linkedList = new LinkedListService<T>();
	
	public void enQueue(T data) {
		linkedList.append(data);
		
	}
	public void print() {
		linkedList.display();
	}
}
