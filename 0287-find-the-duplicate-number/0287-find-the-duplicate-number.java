class Solution {
    public int findDuplicate(int[] nums) {
        
        int[]count=new int[nums.length+1];
        int temp=0;
        for(int i=0; i<nums.length; i++)
        {
            count[nums[i]]++;
            if(count[nums[i]]>1)
            {
                temp=nums[i];
            }
        }
        return temp;
    }
}