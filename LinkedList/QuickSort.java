package trial;

public class QuickSort {


	int partition(int arr[],int low,int high)
	{
		int pivot = arr[high];
		int i = (low - 1);
		
		for (int j = low; j < high  ; j++)
		{
			if (arr[j] <= pivot)
			{
				i = i + 1;
	
				int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
		return i+1;
	}
	
	void sort( int arr[],int low,int high)
	{
		if(low < high)
		{
			int pi = partition(arr,low,high);
			
			sort(arr,low,pi - 1);
			sort(arr,pi+1,high);
		}
	}
	
	void print(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i]+ " ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		QuickSort ob1 = new QuickSort();
		int arr[] = { 2,6,4,5,0,2,5,8,9,2};
		int n = arr.length;
		ob1.sort(arr, 0, n - 1);
		
		ob1.print(arr);

	}

}
