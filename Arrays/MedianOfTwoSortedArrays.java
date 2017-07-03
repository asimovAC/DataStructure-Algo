package Arrays;

public class MedianOfTwoSortedArrays {

	void findMedian(int a[], int b[],int n)
	{
		int arr[] = new int[n + n];
	
		int i = 0;
		int j = 0;
		int k = 0;
		
		int count = 0;
		
		while ( count != n)
		{
			if ( a[i] <= a[j])
			{
				arr[k] = a[i];
				i++;
			}
			else
			{
				arr[k] = b[j];
				j++;
			}
			k++;
			count++;
		}
		
		for ( int z = 0; z < arr.length; z++)
		{
			System.out.println(arr[z]);
		}
	}
	
	public static void main(String[] args) {
		
		MedianOfTwoSortedArrays ob1 = new MedianOfTwoSortedArrays();
		
		int ar1[] = {1, 12, 15, 26, 38};
	    int ar2[] = {2, 13, 17, 30, 45};
	 
	    int n = ar1.length;
	    
	    ob1.findMedian(ar1, ar2, n);

	}

}
