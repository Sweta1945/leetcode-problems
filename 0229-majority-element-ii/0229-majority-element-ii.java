class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
            
        ArrayList<Integer> res=new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> set: hm.entrySet())
        {
            if(set.getValue()>nums.length/3)
            {
                
                res.add(set.getKey());
            }
        }
        
        return res;
    }
}