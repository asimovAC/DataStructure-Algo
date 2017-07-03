package dynammicProgramming;

public class CoinChangeProblemTotalWays
{
	
	public int numberOfSolutions(int total, int coins[]){
        int temp[][] = new int[coins.length+1][total+1];
        
        for(int i=0; i <= coins.length; i++){
            temp[i][0] = 1;
        }
        
       
        for(int i=1; i <= coins.length; i++){
            for(int j=1; j <= total ; j++){
                if(coins[i-1] > j){
                    temp[i][j] = temp[i-1][j];
                }
                else{
                    temp[i][j] = temp[i][j-coins[i-1]] + temp[i-1][j];
                }
            }
        }
        return temp[coins.length][total];
    }
	
	
	public static void main(String[] args) {
		
		CoinChangeProblemTotalWays cc = new CoinChangeProblemTotalWays();
        int total = 15;
        int coins[] = {3,4,6,7,9};
        System.out.println(cc.numberOfSolutions(total, coins));
        
	}

}
