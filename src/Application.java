import java.util.Scanner;

public class Application {
	SingleLinkedLlist list;
	static Scanner sc=new Scanner(System.in);
	Application()
	{ 
		list=new SingleLinkedLlist();;
	}
	public void showMenu()
	{
		System.out.println("_____Operations______");
		System.out.println("1. Show All Records");
		System.out.println("2. Add Record");
		System.out.println("3. Show Record");
		System.out.println("4. Delete Record");
		System.out.println("5. Update Record");
		System.out.println("6. Exit");
		System.out.println("_______________________");
		
	}
	public void acceptRecord()
	{
		
		System.out.println("Enter Item Qty : ");
		int qty = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Item Name : ");
		String name = sc.nextLine();
			if (sc.hasNext())
				sc.next();
		list.addRecord(name, qty);
		
	}
	public void showAllItems()
	{
		list.showRecords();
	}
	public void deleteRecord()
	{
		System.out.println("Which item to be deleted : ");
		String input = sc.next();
		list.deleteNode(input);
	}
	public void insertRecord()
	{
		System.out.println("At Which position record to be inserted: ");
		int input = sc.nextInt();
		System.out.println("Enter Item Qty : ");
		int qty = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Item Name : ");
		String name = sc.nextLine();
			if (sc.hasNext())
				sc.next();
		
		list.insertNode(input,qty,name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application o = new Application();
		o.showMenu();
		int choice=0;
		
		Myloop:
		do
		{
			
		System.out.println("ENter your choice");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1 :  o.showAllItems(); 
				  break;
		case 2 :  o.acceptRecord(); 
		  		  break;
		case 4 :  o.deleteRecord(); 
		  		  break;
		case 5 :  o.insertRecord();
				   break;
		case 6 :  System.exit(0);
		          break;
		default : System.out.println("Please reenter choice ");
				  continue Myloop;
		}	
		}while(choice!=6);
	}

}
