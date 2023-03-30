class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<len;i++)
        {
            if(nums[i]!=i)
            {
                break;
            }
            
        }
        return i;
    }
}
