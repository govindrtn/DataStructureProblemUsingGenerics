package com.bridgelabz.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		
		LinkedListService<Integer> myObj = new LinkedListService<Integer>();
		
		myObj.add(56);
		myObj.add(30);
		myObj.add(70);
		myObj.display();
	}

}
