package dynammicProgramming;

public class CuttingARod {

	public int cutRod(int arr[],int len)
	{
		int temp[][] = new int[arr.length + 1][len+1];
		
		int i,j;
		for( i = 0; i <= arr.length; i++)
			temp[i][0] = 0;
		
		for( i = 0; i <= len; i++)
			temp[0][i] = 0;
		
		for( i = 1; i <=arr.length; i++)
		{
			for ( j = 1; j <= len; j++)
			{
				if(j >= i)
				{
					temp[i][j] = Math.max(temp[i-1][j], temp[i][j-i] + arr[i-1] );
				}
				else
				{
					temp[i][j] = temp[i-1][j];
				}
			}
		}
		return temp[arr.length][len];
	}
	public static void main(String[] args) {
		
		int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int len = arr.length;
        
        CuttingARod ob1 = new CuttingARod();
        System.out.println(ob1.cutRod(arr, len));
	}

}
