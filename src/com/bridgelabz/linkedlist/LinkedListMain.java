package com.bridgelabz.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		
		LinkedListService<Integer> myObj = new LinkedListService<Integer>();
		myObj.add(56);
		myObj.add(30);
		myObj.add(70);
		myObj.display();
		
		System.out.println("Using 'Add' method :  ");
		LinkedListService<Integer> myObj1 = new LinkedListService<Integer>();
		myObj1.add(70);
		myObj1.add(30);
		myObj1.add(56);
		myObj1.display();
		
		System.out.println("Using 'Append' method :  ");
		LinkedListService<Integer> myObj2 = new LinkedListService<Integer>();
		myObj2.append(56);
		myObj2.append(30);
		myObj2.append(70);
		myObj2.display();
		
		System.out.println("Using 'InsertBetween'  method insert node 30 between 56 and 70  :  ");
		LinkedListService<Integer> myObj3 = new LinkedListService<Integer>();
		myObj3.append(56);
		myObj3.append(70);
		myObj3.insertBetween(myObj3.head ,30 );
//		myObj3.insertBetween(myObj3.head ,48 );
		myObj3.display();
		System.out.println("Using 'Pop()' method  delete First element :  ");
		myObj3.pop();
		myObj3.display();
		System.out.println("Using 'Pop()' method  delete Last element in linkedList :  ");
		myObj3.append(56);
		myObj3.popLast();
		myObj3.display();
		
	}
}
