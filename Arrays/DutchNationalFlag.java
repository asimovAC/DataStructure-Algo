package Arrays;

public class DutchNationalFlag {
	
	public static void sort012(int arr[],int end)
	{
		int start,mid,pivot;
		start = 0;
		mid = 0;
		pivot = 1;
		
		while( mid <= end)
		{
			if (arr[mid] < pivot)
			{
				int temp = arr[mid];
				arr[mid] = arr[start];
				arr[start] = temp;
				start++;
				mid++;
				
			}
			else if (arr[mid] > pivot)
			{
				int temp = arr[mid];
				arr[mid] = arr[end];
				arr[end] = temp;
				end--;
			}
			else
			{
				mid++;
			}
		}
	}

	public static void main(String[] args) {
		 
		int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
	        int arr_size = arr.length;
	        sort012(arr, arr_size - 1);
	        
	        for( int i = 0; i < arr_size; i++)
	        	System.out.print(arr[i] + " ");

	}

}
