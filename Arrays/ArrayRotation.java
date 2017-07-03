package Arrays;

public class ArrayRotation {
	
	void rotation(int arr[],int d, int n)
	{
		for( int i = 0; i < d; i++)
			leftRotate(arr,n);
	}
	
	void leftRotate(int arr[],int n)
	{
		int i,temp;
		temp = arr[0];
		for ( i = 0; i < n-1; i++)
			arr[i] = arr[i+1];
		arr[i] = temp;
	}
	
	void printArray(int arr[])
	{
		for( int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		
		ArrayRotation rotate = new ArrayRotation();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.rotation(arr,2,arr.length);
        rotate.printArray(arr);

	}

}
