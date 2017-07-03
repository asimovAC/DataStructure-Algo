package Arrays;

public class CeilAndFloor 
{
	public void find(int arr[], int x)
	{
		
	}
	
	static int binarySearch(int arr[],int low,int high,int key)
	{
		int pivot = (low+high)/2;
		
		if(key == arr[pivot])
		{
			return pivot;
		}
		else if( key < arr[pivot])
		{
			return binarySearch(arr, low, pivot -1, key);
		}
		else
		{
			return binarySearch(arr, pivot+1, high, key);
		}
	
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 8, 10, 10, 12, 19};
	       int n = arr.length;
	       int x = 2;
	       int index = binarySearch(arr, 0, n-1, x);
	       System.out.println(index);
	}

}
