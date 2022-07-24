package com.bridgelabz.linkedlist;

public class INode<T>
{
	public T data;
	public INode<T> next;
	
	
	public INode(T data ) 
	{	
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}
