class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        for(int i=0; i<=n; i++)
        {
            dp[i]=-1;
        }
        return func(n, dp);
        
    }
    
    public static int func(int n, int[]dp)
    {
        if(n==0 || n==1)
            return 1;
        if(n<0)
            return 0;
        if(dp[n]!=-1)
            return dp[n];
        int left=func(n-1, dp);
        int right=func(n-2, dp);
        return dp[n]=left +right;
    }
}