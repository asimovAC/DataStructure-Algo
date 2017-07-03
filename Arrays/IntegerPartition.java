package Arrays;
public class IntegerPartition {
        public static void main(String[] args) {
            int n = 4; //set integer here!!
            int[][] a = new int[n + 1][n + 1];
            int i, j, k;
            for (i = 0; i < a.length; i++) {
                a[i][0] = 0;
                a[0][i] = 1;
            }
            for (i = 1; i < a.length; i++) {
                a[i][1] = 1;
                for (j = 2; j < a[0].length; j++) {
                    k = i - j;
                    if (k < 0)
                        a[i][j] = a[i][j - 1];
                    else
                        a[i][j] = a[i][j - 1] + a[k][j];
                }
            }
            i--;
            int answer = a[i][i - 1];
            System.out.println(answer + 1);
        }
    }