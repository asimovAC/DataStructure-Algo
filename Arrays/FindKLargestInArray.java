package Arrays;

public class FindKLargestInArray {

	void maxHeapify(int arr[],int i)
	{
		int left = 2*i + 1;
		int right = 2*i + 2;
		
		int largest;
		
		int heap_size = arr.length -1;
		
		if ( left <= heap_size && arr[left] > arr[i])
			largest = left;
		else
			largest = i;
		
		if( right <= heap_size && arr[right] > arr[largest])
			largest= right;
		
		if ( largest != i)
		{
			int temp;
			temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			maxHeapify(arr, largest);
		}
	}
	
	void BuildMax(int arr[])
	{
		int heap_size = arr.length -1;
		
		for(int i = heap_size/2 ; i > 0; i--)
		{
			maxHeapify(arr, i);
		}
	}
	
	public static void main(String[] args) {
		
		 int arr[] = {1, 23, 12, 9, 30, 2, 50};
		 int n = arr.length;
		 int k = 4;
		 
		 FindKLargestInArray ob1 = new FindKLargestInArray();
		 ob1.BuildMax(arr);
		 
		 for ( int i = 0; i < n; i++)
		 {
			 System.out.print(arr[i] + " ");
		 }
	}

}
