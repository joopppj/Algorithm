public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // follow-up of unique path problem, the grid in this problem includes some obstacles represented by 1 now. 
        int m=obstacleGrid.length;
        if(m==0)return 0;
        int n=obstacleGrid[0].length;
        if(n==0)return 1;
        if(n==1||m==1){
            for(int [] ii:obstacleGrid)for(int i:ii)if(i==1)return 0;
        }
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){if(obstacleGrid[i][0]!=1)dp[i][0]=1;else break;}
        for(int i=0;i<n;i++){if(obstacleGrid[0][i]!=1)dp[0][i]=1;else break;}
        for(int j=1;j<m;j++){
            for(int k=1;k<n;k++){
                if(obstacleGrid[j][k]==1)continue;
                int tmp=0;
                if(obstacleGrid[j-1][k]!=1)tmp+=dp[j-1][k];
                if(obstacleGrid[j][k-1]!=1)tmp+=dp[j][k-1];
                dp[j][k]=tmp;
            }
        }
        return dp[m-1][n-1];
    }
    // we need to take care of the logic behind the obstacle.  but it is still not hard
}
