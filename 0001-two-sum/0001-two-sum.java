class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]res=new int[2];
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            arr.add(nums[i]);
        }
        
        for(int i=0; i<arr.size(); i++)
        {
            int temp=target-arr.get(i);
            if(arr.contains(temp) && arr.indexOf(temp)!=i)
            {
                res[0]=i;
                res[1]=arr.indexOf(temp);
            }
        }
        return res;
    }
}