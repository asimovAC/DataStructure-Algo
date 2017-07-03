package dynammicProgramming;

public class MinCostPath {

	public int findPath(int cost[][],int m, int n)
	{
		int temp[][] = new int[m+1][n+1];
		temp[0][0] = cost[0][0];
		
		int i,j;
		
		for( i = 1; i <= m ; i++)
			temp[i][0] = temp[i-1][0] + cost[i][0];
		
		for( i = 1; i<= n; i++)
			temp[0][i] = temp[0][i-1] + cost[0][i];
		
		for( i = 1; i <= m; i++)
		{
			for ( j = 1; j<= n; j++)
			{
				temp[i][j] = Math.min(temp[i-1][j], Math.min(temp[i-1][j-1], temp[i][j-1])) + cost[i][j];
			}
		}
		return temp[m][n];
		
	}
	public static void main(String[] args) {
		
	        int cost[][]= {{1, 2, 3},
	                       {4, 8, 2},
	                       {1, 5, 3}};
	        
	        MinCostPath ob1 = new MinCostPath();
	        System.out.println(ob1.findPath(cost, 2, 2));
	}

}
