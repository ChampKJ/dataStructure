import java.util.Arrays;

public class SortingOfArray {

	
	public int searchElement(int a[],int size,int elementTOSearch)
	{
		if(size==0)
			return -1;
		else if(a[size-1]==elementTOSearch)
			return size-1;
		else
			return searchElement(a, size-1, elementTOSearch);
	}
	public void bubbleSort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println("Pass " + (i+1) + " : ");
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
				System.out.println("\tj="+j +" : " + Arrays.toString(a));
			}
			System.out.println("After pass " + (i+1) +":");
			//System.out.println("\t\t "+Arrays.toString(a));
		}
	}
	public void bubbleSortOfEmpObjects(Employee a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println("Pass " + (i+1) + " : ");
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j].sal>a[j+1].sal)
				{
					Employee temp=a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
				
			}
			//System.out.println("After pass " + (i+1) +":");
			//System.out.println("\t\t "+Arrays.toString(a));
		}
	}
	
	
	public void SelectionSort(int a[])//{6,2,6,8,-3,5,2,5,22,4}
	{
		int minEleIdx=0;
		for(int i=0;i<a.length-1;i++)
		{
			minEleIdx=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j] < a[minEleIdx])
				{
					
					minEleIdx=j;
				}
			}
			if(i!=minEleIdx)
			{
				int temp = a[i];
				a[i] = a[minEleIdx];
				a[minEleIdx]=temp;
			}
		}
	
	}
	public void quickSort(int []a,int lb,int up)
	{
		if(lb<up)
		{
			int loc = partition(a, lb, up);
			quickSort(a, lb, loc-1);
			quickSort(a, loc+1, up);
		}
	
	}
	public int partition(int a[],int lb,int up)
	{
		int pivote = a[lb];
		int start=lb;
		int end=up;
		while(start<end)
		{
			while(pivote>=a[start])
			{
				start++;
			}
			while(pivote<a[end])
			{
				end--;
			}
			
			if(start<end)
			{
				int t=a[start];
				a[start]=a[end];
				a[end] = t;
			}
		}
		int temp=a[lb];
		a[lb]=a[end];
		a[end]=temp;
		
		return end;
	}
//	public int partition(int a[],int lb,int up)
//	{
//		int pivote = a[lb];
//		int start=lb;
//		int end=up;
//		while(start<end)
//		{
//			while(pivote<=a[start])
//			{
//				start--;
//			}
//			while(pivote>a[end])
//			{
//				end++;
//			}
//			if(start>end)
//			{
//				int t=a[start];
//				a[start]=a[end];
//				a[end] = t;
//			}
//		} 
//		int temp=a[lb];
//		a[lb]=a[end];
//		a[end]=temp;
//		return end;
//	}
	public static void main(String[] args) {
		int a[] = {7,10,3,8,4,9,3,4};
		int elemetToSearch=228;
		SortingOfArray o = new SortingOfArray();
		System.out.println("Before Quick Sort ");
		System.out.println(Arrays.toString(a));
		//o.quickSort(a, 0, a.length-1);
		o.quickSort(a,  0,a.length-1);
		System.out.println("After Quick Sort ");
		System.out.println(Arrays.toString(a));
		//int result=o.searchElement(a, a.length, elemetToSearch);
		//if(result==-1)
			//System.out.println("Element not found");
		//else
			//System.out.println("Element last Found at index " + result);
//		Employee e[] = new Employee[5];
//		e[0]=new Employee(13221, "Girish", 50000.00f);
//		e[1]=new Employee(13256, "Nitin", 40000.00f);
//		e[2]=new Employee(14221, "Kavita", 55000.00f);
//		e[3]=new Employee(13561, "Nisha", 50000.00f);
//		e[4]=new Employee(13881, "Ravi", 20000.00f);
//		SortingOfArray o = new SortingOfArray();
//		System.out.println("Array befre sorting ..");
//		System.out.println(Arrays.toString(a));
//		for(Employee ob : e)
//		{
//			System.out.println(ob);
//		}
//		o.bubbleSortOfEmpObjects(e);
	//	System.out.println("Array after sorting ..");
		//for(Employee ob : e)
//		{
//			System.out.println(ob);
//		}
			//System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(e));
		//o.bubbleSort(a);
	//	o.SelectionSort(a);
	//	System.out.println("Array after sorting ..");
	//	System.out.println(Arrays.toString(a));
	}

}
