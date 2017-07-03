package Arrays;

public class ArraySumCloseToZero {

	public int find_min(int arr[],int left,int right)
	{
		int min = arr[left] + arr[right];
		min = Math.abs(min);
		int  p = left;
		int  q = right;
		
		while(p < q )
		{
			p++;
			int diff1 = arr[p] + arr[q];
			diff1 = Math.abs(diff1);
			if( diff1 < min )
			{
				min = diff1;
			}
		}
		
		while(p < q )
		{
			q--;
			int diff2 = arr[p] + arr[q];
			diff2 = Math.abs(diff2);
			if( diff2 < min )
			{
				min = diff2;
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		
		 int arr[] = {1, 60, -10, 70, -80, 85};
	     int n = arr.length;
	     ArraySumCloseToZero ob1 = new ArraySumCloseToZero();
		 
	     System.out.println(ob1.find_min(arr, 0, n-1));
	}

}
