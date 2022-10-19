class Solution {
    public int maxProfit(int[] nums) {
        
        int min=Integer.MAX_VALUE;
        int profit=0;
        int max=0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]<min)
                min=nums[i];
            profit=nums[i]-min;
            
            max=Math.max(max, profit);
        }
        
        return max;
        
    }
}