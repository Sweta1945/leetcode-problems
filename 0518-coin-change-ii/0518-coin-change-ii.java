class Solution {
    public int change(int amount, int[] coins) {
        
   int[][]dp=new int[coins.length][amount+1];
        for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
                dp[i][j]=-1;
            }
        }
        return  coinRec( coins.length-1, amount, coins, dp);
        
    }
    
    public static int coinRec(int index, int target, int[] coins, int[][]dp)
    {
        if(index==0 )
        {
            if(target%coins[0]==0)
            return 1;
            else
                return 0;
        }
       
        if(dp[index][target]!=-1)
        {
            return dp[index][target];
        }
        int not_take=0+coinRec(index-1, target, coins, dp);
        int take=0;
        
        if(coins[index]<=target)
        {
            take=coinRec(index, target-coins[index], coins, dp);
        }
        
        return dp[index][target]=not_take+ take;
    }
}