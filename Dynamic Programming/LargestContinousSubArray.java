package dynammicProgramming;

public class LargestContinousSubArray {

	public int largestcontinousSum(int arr[],int n)
	{
		int current = arr[0];
		int max = arr[0];
		
		for ( int i = 1; i < n; i++)
		{
			current = Math.max(arr[i], arr[i] + current);
			max = Math.max(current, max);
		}
		return max;
	}
	public static void main(String[] args) 
	{
		 LargestContinousSubArray ob1 = new LargestContinousSubArray();
		 int a[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
		 int n = a.length;
		 
		 System.out.println(ob1.largestcontinousSum(a, n));

	}

}
