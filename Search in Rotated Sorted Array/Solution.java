class Solution {
    public int search(int[] nums, int target) {
        int result=-1;
        int len=nums.length;
        for(int i=0;i<len/2;i++)
        {
            if(nums[i]==target)
            {
                result=i;
            }
        }
        for(int i=len/2;i<len;i++)
        {
            if(nums[i]==target)
            {
                result=i;
            }
        }
        return result;
    }
}
