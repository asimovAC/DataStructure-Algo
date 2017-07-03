package trial;

public class PivotBinarySearch {

	int findPivot(int arr[],int low,int high)
	{
		int mid = (low+high)/2;
		
		if(mid < high && arr[mid] > arr[mid+1])
		{
			return mid;
		}
		if(mid > low && arr[mid] < arr[mid-1])
		{
			return mid -1;
		}
		if(arr[low] >= arr[mid])
			return findPivot(arr,low,mid-1);
		return findPivot(arr,mid+1,high);
	}
	
	int binarySearch(int arr[],int low,int high,int key)
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
	
	int PivotedBinarySearch(int arr[],int n,int key)
	{
		int index = findPivot(arr,0,n-1);
		
		if(arr[index] == key)
			return index;
		if(arr[0] <=key)
			return binarySearch(arr,0,index - 1,key);
		else
			return binarySearch(arr, index+1, n-1, key);
	}
	
	
	
	public static void main(String[] args) {
		
		PivotBinarySearch ob1 = new PivotBinarySearch();
		int arr[] = {5,6,7,8,9,10,1,2,3};
		int size = arr.length;
		int element = 3;
		
		System.out.println(ob1.PivotedBinarySearch(arr, size, element));

	}

}
