class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int[][]dp=new int[coins.length][amount+1];
        for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
                dp[i][j]=-1;
            }
        }
        if( coinRec( coins.length-1, amount, coins, dp)>= (int)Math.pow(10,9))
            return -1;
        else
            return coinRec(coins.length-1, amount, coins, dp);
        
    }
    
    public static int coinRec(int index, int target, int[] coins, int[][]dp)
    {
        if(index==0 )
        {
            if(target%coins[0]==0)
            return target/coins[0];
            else
                return  (int)Math.pow(10,9);
        }
       
        if(dp[index][target]!=-1)
        {
            return dp[index][target];
        }
        int not_take=0+coinRec(index-1, target, coins, dp);
        int take=Integer.MAX_VALUE;
        
        if(coins[index]<=target)
        {
            take=1+coinRec(index, target-coins[index], coins, dp);
        }
        
        return dp[index][target]=Math.min(not_take, take);
    }
}