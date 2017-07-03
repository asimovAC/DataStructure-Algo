package Arrays;

public class IsMajorityElement {

	public int binarySearchMajority(int arr[],int low,int high,int x)
	{
		if( high >= low)
		{
			int mid = (low+high)/2;
			
			if( (mid == 0 || x > arr[mid-1]) && (arr[mid] == x))
				return mid;
			else if ( x > arr[mid])
				return binarySearchMajority(arr, mid+1, high, x);
			else
				return binarySearchMajority(arr, low, mid -1, x);
		}
		return -1;
	}
	
	public boolean isMajority(int arr[],int n,int x)
	{
		int i = binarySearchMajority(arr, 0, n -1, x);
		
		if ( i == -1)
			return false;
		
		if(((i + n/2) < n-1) && (arr[i+n/2] == x))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		IsMajorityElement ob1 = new IsMajorityElement();
		int arr[] = {1, 2, 3, 3, 3, 3, 10};
        int n = arr.length;
        int x = 9;
        
        System.out.println(ob1.isMajority(arr, n, x));
	}

}
