package dynammicProgramming;

public class LongestIncreasingSubsequence {

	public int longestIncreasing(int arr[],int n)
	{
		int temp[] = new int[n];
		int count;
		int i,j;
		
		for( i = 0; i < n; i++)
			temp[i] = 1;
		
		for( i = 1; i < n; i++)
		{
			for ( j = 0; j < i; j++)
			{
				if(arr[j] < arr[i])
				{
					count = temp[j] + 1;
					if(count > temp[i])
						temp[i] = count;
				}
			}
		}
		
	
		int maxindex = 0;
		for( i = 0; i < n; i++)
		{
			if(temp[i] > temp[maxindex])
				maxindex = i;
		}
		return temp[maxindex];
	}
	
	public static void main(String[] args) {
		
		 LongestIncreasingSubsequence ob1 = new LongestIncreasingSubsequence();
		 
		 int arr[] = { 3,4,-1,0,6,2,3};
	     int n = arr.length;
	     
	     System.out.println(ob1.longestIncreasing(arr, n));
	}

}
