class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double> hs=new HashSet<>();
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        Double avg=0.0;
        while(left<right)
        {
            hs.add((nums[left]+nums[right])/2.0);
            left++;
            right--;
            
        }
        return hs.size();
    }
}