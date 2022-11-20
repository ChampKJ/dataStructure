
public class Employee 
{
	int empId;
	float sal;
	String eName;
	public Employee() {}
	public Employee(int id,String n,float s)
	{
		empId = id;
		sal=s;
		eName=n;
	}
	public void showEMpRecord()
	{
		System.out.println("Emp Id : " + empId);
		System.out.println("EMp Name  " + eName);
		System.out.println("Emp Salary Rs."+sal);
	}
	public String toString()
	{
		return "["+empId+","+"Rs."+sal+",Mr./Ms."+eName+"]";
	}

}
