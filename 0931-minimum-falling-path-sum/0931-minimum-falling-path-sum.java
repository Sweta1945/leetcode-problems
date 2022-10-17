class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[][] dp = new int[m][n];
        for(int i = 0 ; i < m ; i++)
            for(int j = 0 ; j < n ; j++)
                dp[i][j] = -1;
        
        int min = Integer.MAX_VALUE;
        for(int j = 0 ; j < n ; j++)
            min = Math.min(min , minPath(matrix , m , n , 0 , j , dp));
        return min;
    }
    
    public int minPath(int[][] matrix , int m , int n , int r , int c , int[][] dp){
        if(r>=m || c<0 || c>=n)
            return Integer.MAX_VALUE-10000;
        
        if(dp[r][c] != -1)
            return dp[r][c];
        
        if(r == m-1){
            return matrix[r][c];
        }
        
        int dLeft = matrix[r][c] + minPath(matrix , m , n , r+1 , c-1 , dp);
        int d = matrix[r][c] + minPath(matrix , m , n , r+1 , c , dp);
        int dRight = matrix[r][c] + minPath(matrix , m , n , r+1 , c+1 , dp);
        
        return dp[r][c] = Math.min(dLeft , Math.min(d , dRight));
    }
}