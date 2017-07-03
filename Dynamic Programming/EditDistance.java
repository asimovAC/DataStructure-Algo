package dynammicProgramming;

public class EditDistance {
	
	public int edit(char[] str1, char[] str2,int m,int n)
	{
		int temp[][] = new int[m+1][n+1];
		
		int i,j;
		
		for( i = 0; i <= m; i++ )
		{
			for ( j = 0; j <= n; j++)
			{
				if( i == 0)
				{
					temp[i][j] = j;
				}
				else if ( j== 0)
				{
					temp[i][j] = i;
				}
				else if( str1[i-1] == str2[j-1])
				{
					temp[i][j] = temp[i-1][j-1];
				}
				else
				{
					temp[i][j] = 1 + Math.min(temp[i-1][j-1], Math.min(temp[i-1][j], temp[i][j-1]));
				}
			}
		}
		return temp[m][n];
	}

	public static void main(String[] args) 
	{
		
		String str1 = "sunday";
        String str2 = "saturday";
        
        int len1 = str1.length();
        int len2 = str2.length();
        
        EditDistance ob1 = new EditDistance();
        System.out.println(ob1.edit(str1.toCharArray(), str2.toCharArray(), len1, len2));

	}

}
