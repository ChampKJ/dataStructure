package com.queue;

public class QimplementationUsingDoubleLinkList {

	Node1 front,rear;
	public QimplementationUsingDoubleLinkList()
	{
		front=rear=null;
		System.out.println("Queue is emty");
	}
	public void insert(int data)
	{
		Node1 newNode = new Node1(data);
		if(rear==null)
		{
			front=rear=newNode;
			front.prev=null;
			front.next=null;
			rear.next=null;
			rear.prev=null;
					
		//	rear.next=null;
		}
		else
		{
			rear.next=newNode;
			newNode.prev=rear;
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
			Node1 temp = front;
			while(temp!=null)
			{
				System.out.print(temp.data + "  ");
				temp = temp.next;
			}
		}
	}
	public void displayQR()
	{
		if(rear== null)
		{
			System.out.println("Q is Empty");
		}
		else
		{
			Node1 temp = rear;
			while(temp!=null)
			{
				System.out.print(temp.data + "  ");
				temp = temp.prev;
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
			front.prev=null;
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
