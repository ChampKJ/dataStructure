import java.util.Arrays;

public class BinarySearch {

	 int binarySearch(int arr[], int low, int high, int x)
	    {
		 System.out.println("Low= "+low+" High="+high+ " Element "+x);
 	        if (high >= low) {
	            int mid = low + (high - low) / 2;
	        System.out.println("Mid is " + mid + " \narr[mid : " + arr[mid]);

	        System.out.println("_______________________________");
	            if (arr[mid] == x)
	                return mid;
	 
	           
	            if (arr[mid] > x)
	                return binarySearch(arr, low, mid - 1, x);
	 
	          
	            	// Else the element can only be present
	            // in right subarray
	            return binarySearch(arr, mid + 1, high, x);
	        }
	 
	        // We reach here when element is not present
	        // in array
	        return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,3,7,8,8,12,7,7,1,5};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int elementToSearch = 8;
		BinarySearch o = new BinarySearch();
		
		int idx=o.binarySearch(arr, 0, arr.length-1, elementToSearch);
		if(idx==-1)
			System.out.println("'Element not found");
		else
			System.out.println("Element Found at location " + idx);
	}

}
