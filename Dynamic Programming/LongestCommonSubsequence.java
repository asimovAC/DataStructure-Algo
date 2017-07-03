package dynammicProgramming;

public class LongestCommonSubsequence {


	public int longestSubsequence(char str1[], char str2[],int m,int n)
	{	
		int temp[][] = new int[m + 1][n + 1];
		int max = 0;
	
		
		for( int i = 0; i <= m; i++)
		{
			for(int j = 0; j <= n	; j++)
			{
				if( i == 0 || j == 0)
				{
					temp[i][j] = 0;
				}
				else if(str1[i-1] == str2[j-1])
				{
					temp[i][j] = temp[i-1][j-1] + 1;
				}
				else
				{
					temp[i][j] = Math.max(temp[i-1][j],temp[i][j-1]);
				}
			}
		}
		return temp[m][n];
	}
	
	public static void main(String[] args) {
		
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String str1 = "ABCDGHLQR";
        String str2 = "AEDPHR";
        
        int m = str1.length();
        int n = str2.length();
        
        int result = lcs.longestSubsequence(str1.toCharArray(),str2.toCharArray(),m,n);
        System.out.print(result);
	}

}
