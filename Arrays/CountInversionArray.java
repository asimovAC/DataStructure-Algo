package Arrays;

public class CountInversionArray {

	int merge( int arr[],int l,int m,int r)
	{
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int left[]= new int[m - l + 1];
		int right[] = new int[r - m];
		
		for ( int i = 0; i < n1; i++ )
		{
			left[i] = arr[l + i];
		}
		
		for ( int j = 0; j < n2; j++)
		{
			right[j] = arr[ m + j +1];
		}
		
		int i = 0;
		int j = 0;
		
		int k = 0;
		
		int count = 0;
		
		while( i < n1 && j < n2)
		{
			if( left[i] <= right[j])
			{
				arr[k] = left[i];
				i++;
			}
			else
			{
				arr[k] = right[j];
				j++;
				count = count + m - i;
			}
			k++;
		}
		
		return count;
	}
	
	int mergeSort( int arr[],int l,int r)
	{
		int inv_count = 0;
		if( l < r)
		{
			int m = (l+r)/2;
			inv_count = mergeSort(arr,l,m);
			inv_count += mergeSort(arr,m+1,r);
			
			inv_count += merge(arr,l,m+1,r);
		}
		return inv_count;
	}
	
	void printArray(int arr[])
	{
		for ( int i = 0; i < arr.length;i++)
			System.out.println(arr[i] + " ");
	}
	
	public static void main(String[] args) {
		
		CountInversionArray ob1 = new CountInversionArray();
		int arr[] = new int[]{1, 20, 6, 4, 5};
        int r = arr.length;
		System.out.println(ob1.mergeSort(arr, 0, r-1));
		
		//ob1.printArray(arr);
	}

}
