class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                dp[i][j]=-1;
            }
        }
return func(m-1,n-1, obstacleGrid, dp); 
    }
    
    public static int func(int m, int n , int[][]grid, int[][]dp)
    {
        if(m>=0 && n>=0 && grid[m][n]==1) return 0;
        if(m==0 && n==0 && grid[m][n]!=1)
            return 1;
        if(m<0 || n<0)
            return 0;
        
        if(dp[m][n]!=-1)
            return dp[m][n];
        
        int up=func(m-1, n, grid, dp);
        int left=func(m, n-1, grid, dp);
        
        return dp[m][n]=up+left;
    }
}