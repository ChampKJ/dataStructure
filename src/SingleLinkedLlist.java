
public class SingleLinkedLlist
{
	Node firstNode,lastNode;
	public SingleLinkedLlist()
	{
		firstNode=lastNode=null;
		
	}
	public void addRecord(String data,int value)
	{
		if(firstNode==null)
		{
			firstNode=new Node(data, value);
			lastNode=firstNode;
			System.out.println("Node created successfully!");
		}
		else
		{
			Node newRecord = new Node(data, value);
			lastNode.next=newRecord;
			lastNode=newRecord;
			System.out.println("Node Appended Successfully");
		}
	}
	public void showRecords()
	{
		if(firstNode==null)
			System.out.println("No Records available");
		else
		{
			for(Node temp=firstNode;temp!=null;temp=temp.next)
			{
				System.out.println(temp);
			}
		}
	}
	public void insertNode(int position,int value,String data)
	{
		int cnt;
		Node temp;
		Node newNode= new Node(data, value);;
		
		if(firstNode!=null)
		{
			if(position==1)
			{
				newNode.next=firstNode;
				firstNode=newNode;
			}
			else
			{
			cnt=1;
			temp=firstNode;
			
			while(temp.next!=null && cnt< position-1)
			{
				temp=temp.next;
				cnt++;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			}
		}
		else
		{
			if(position==1)
			{
				firstNode = newNode;
			}
				
		}
		
		
	}
	public void deleteNode(String itemName)
	{
		if(firstNode==null)
			System.out.println("No Records available");
		else
		{
			Node temp = firstNode;
			while(temp!=null )
			{
				if( temp.next!=null)
				{
				if(temp.next.data.equals(itemName))
				{
					temp.next = temp.next.next;
					break;
				}
				}
				else
				{
					if(temp.data.equalsIgnoreCase(itemName))
					{
						temp=null;
						firstNode=null;
					}
				}		
			}
			System.out.println("Record deleted!");
		}
		
	}
}
