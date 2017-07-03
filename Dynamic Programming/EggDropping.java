package dynammicProgramming;

public class EggDropping {
	
	public int calculate( int eggs,int floor)
	{
		int temp[][] = new int[eggs+1][floor + 1];
		
		int i,k,j,c;
		
		for( i = 1; i <= floor; i++)
			temp[1][i] = i;
		
		for ( i = 2; i <= eggs; i++)
		{
			for (j = 1; j <= floor; j++)
			{
				temp[i][j] = Integer.MAX_VALUE;
				
				for ( k = 1; k <= j; k++)
				{
					c = 1 + Math.max(temp[i-1][k-1],temp[i][j-k]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
