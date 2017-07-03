package Arrays;

public class CheckPairSum {

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
		
		boolean CheckArray(int arr[],int size,int sum)
		{
			int left = 0;
			int right = size - 1;
			
			while (left < right)
			{
				if ( arr[left] + arr[right] == sum)
				{
					return true;
				}
				else if (arr[left] + arr[right] > sum)
				{
					right = right - 1;
				}
				else
				{
					left = left + 1;
				}
			}
			
			return false;
		}
		
	public static void main(String[] args) {
		
		 int A[] = {1, 4, 45, 6, 10, -8};
	     int n = 16;
	     int arr_size = 6;
	     
	     CheckPairSum ob = new CheckPairSum();
	     ob.sort(A, 0, arr_size - 1);
	     
	     System.out.println(ob.CheckArray(A, arr_size, n));
	}

}
