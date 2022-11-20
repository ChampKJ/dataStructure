package com.queue;
class Node
{
	int data;
	Node next;
	Node(){}
	Node(int d)
	{
		data = d;
		next=null;
	}
}
public class QimplementationUsingLinkList {

	Node front,rear;
	public QimplementationUsingLinkList()
	{
		front=rear=null;
		System.out.println("Queue is emty");
	}
	public void insert(int data)
	{
		Node newNode = new Node(data);
		if(rear==null)
		{
			front=rear=newNode;
		//	rear.next=null;
		}
		else
		{
			rear.next=newNode;
			rear=newNode;
		}
		System.out.println("Node inserted sucesfully");
	}
	public void displayQ()
	{
		if(front== null)
		{
			System.out.println("Q is Empty");
		}
		else
		{
			Node temp = front;
			while(temp!=null)
			{
				System.out.print(temp.data + "  ");
				temp = temp.next;
			}
		}
	}
	public void delete()
	{
		if(front==null)
		{
			System.out.println("Q id Empty");
		}
		else
		{
			System.out.println("\n"+front.data + " is being deleted");
			front=front.next;
			System.out.println("Element from front deleted!");
		}
	}
	public static void main(String[] args) {
		QimplementationUsingLinkList q = new QimplementationUsingLinkList();
		q.insert(56);
		q.insert(34);
		q.displayQ();
		q.insert(45);
		q.insert(67);
		q.displayQ();
		q.delete();
		q.displayQ();
		
		

	}

}
