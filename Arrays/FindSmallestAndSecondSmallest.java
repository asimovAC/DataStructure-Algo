package Arrays;

public class FindSmallestAndSecondSmallest {

	public void OneTraversal(int arr[],int n)
	{
		int first,second,i;
		
		first = second = Integer.MAX_VALUE;
		
		for ( i = 0; i < n; i++)
		{
			if(arr[i] < first)
			{
				second = first;
				first = arr[i];
			}
			else if (arr[i] < second && arr[i]!= first)
			{
				second = arr[i];
			}
		}
	}
	
	public void twoTraversal ( int arr[],int n)
	{
		int min1 = arr[0];
		for ( int i = 1; i < n; i++)
		{
			if( arr[i] < min1)
				min1 = arr[i];
		}
		
		int first = min1;
		
		for ( int i = 1; i < n; i++)
		{
			if( arr[i] < min1)
				min1 = arr[i];
		}
		
		int second = min1;
		
		System.out.println(first + " - " + second); 
	}
	
	public static void main(String[] args) {
		
		FindSmallestAndSecondSmallest ob1 = new FindSmallestAndSecondSmallest();
		
		int arr[] = {12, 13, 1, 10, 34, 1};
		ob1.twoTraversal(arr, arr.length);
		
		
        
	}

}
