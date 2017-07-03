package trial;

public class MergeSort {

	void merge(int arr[],int l,int m,int r)
	{
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		for ( int i = 0; i < n1; i++)
		{
			left[i] = arr[l + i];
		}
		
		for ( int j = 0; j < n2; j++)
		{
			right[j] = arr[m + j + 1];
		}
		
		int i = 0;
		int j = 0;
		
		int k = l;
		
		while( i < n1 && j < n2)
		{
			if(left[i] <= right[j])
			{
				arr[k] = left[i];
				i++;
			}
			else
			{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while ( i < n1)
		{
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while ( j < n2)
		{
			arr[k] = right[j];
			j++;
			k++;
		}
		
	}
	
	void sort(int arr[],int l,int r)
	{
		if( l < r)
		{
			int m = (l+r)/2;
			
			sort(arr,l,m);
			sort(arr,m+1,r);
			
			merge(arr,l,m,r);
		}
	}
	
	void printArray(int arr[])
	{
		for( int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+ " ");
	}
	
	public static void main(String[] args) {
		
		MergeSort ob1 = new MergeSort();
		
		int arr[] = {12, 11, 13, 5, 6, 7};
		int n = arr.length;
		ob1.sort(arr, 0, n-1);
		ob1.printArray(arr);
	}

}
