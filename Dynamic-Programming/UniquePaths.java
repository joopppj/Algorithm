public class Solution {
    // given a m x n matrix , calculate the number possible ways from top left to bottom right . 
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<n;i++)dp[0][i]=1;
        for(int i=0;i<m;i++)dp[i][0]=1;
        for(int j=1;j<m;j++){
            for(int k=1;k<n;k++)dp[j][k]=dp[j][k-1]+dp[j-1][k];
        }
        return dp[m-1][n-1];
    }
    // simple dynamic problem . just use a dp array . Every element in this array is the number of poosible ways from start point to this point . 
}
