package com.stack;

import com.queue.Node1;


public class StackImplementation {
	Node1 top;
	public StackImplementation()
	{
		top=null;
		System.out.println("Stack is empty");
	}
	public void push(int data)
	{
		Node1 newNode= new Node1(data);
		if(top==null)
		{
			top = newNode; 
		}
		else
		{
			top.next=newNode;
			newNode.prev = top;
			top=newNode;
		}
		System.out.println("Node " + top.data+ " pushed successfully");
	}
	public void pop()
	{
		int oldeNodedata;
		if(top==null)
			System.out.println("stack is Empty!");
		else
		{
			oldeNodedata = top.data;
			top=top.prev;

			System.out.println("Node " + oldeNodedata + "popped successfully!"  );
		}
		
	}
	public Node1 peek()
	{
		if(top==null)
		{
		return null;
		}
		else return top;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StackImplementation s = new StackImplementation();
			s.push(34);
			s.push(45);
			System.out.println("Element peeked " + s.peek().data);
			s.pop();
			s.pop();
			s.pop();
	}

}
