class Solution {
    public void sortColors(int[] nums) {
        
        int low=0;
        int mid=0;
        int high=nums.length-1;
        
        int temp=0;
        while(mid<=high)
        {
            switch(nums[mid])
            {
                case 0:{
    //low k sath swap krne time mid aur low dono ko aage badhanaa hai
                    temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                    
                case 2:
                    {
        //high k sath swap krne time sirf high  ko aage badhanaa hai
                        temp=nums[high];
                        nums[high]=nums[mid];
                        nums[mid]=temp;
                        high--;
                        
                        break;
                    }
            }
        }
        
    }
}