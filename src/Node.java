
public class Node
{
	String data;
	int value;
	Node next;
	public Node()
	{
		
	}
	public Node(String d,int v)
	{
		data=d;
		value=v;
		next=null;
	}
	public String toString()
	{
		return "["+data + "," + value+"]";
	}
}
