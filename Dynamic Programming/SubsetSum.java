package dynammicProgramming;

public class SubsetSum {

	public boolean checkSum(int arr[], int sum)
	{
		boolean temp[][] = new boolean [arr.length + 1][sum + 1];
		
		int j = 0;
		int i;
		for(  i =0 ; i < arr.length; i++)
			temp[i][0] = true;
		
		for(  i = 1; i <= arr.length; i++)
		{
			for(  j = 1; j <= sum; j++)
			{
				if( j - arr[i-1] >= 0)
				{
					temp[i][j] = temp[i-1][j-arr[i-1]] || temp[i-1][j];
				}
				else
				{
					temp[i][j] = temp[i-1][j];
				}
			}
		}
		return temp[arr.length][sum];
		
	}
	public static void main(String[] args) {
		
		SubsetSum ob1 = new SubsetSum();
		
		 int set[] = {3, 34, 4, 12, 5, 2};
		  int sum = 9;
		  
		  System.out.println(ob1.checkSum(set, sum));
	}

}
