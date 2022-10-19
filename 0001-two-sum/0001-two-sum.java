class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
       HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0; i<nums.length;i++)
        {
            if(!hm.containsKey(target-nums[i]))
                hm.put(nums[i], i);
            else
            {
                int temp1=hm.get(target-nums[i]);
                int temp2=i;
                res[0]=temp1;
                res[1]=temp2;
                break;
            }
        }
        
        return res;
        
    }
}