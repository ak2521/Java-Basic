class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length==1)
        {
            if(nums[0]==0)
            {
                return 1;
            }
            else
            {
                return nums[0]-1;
            }
        }
        if(nums[0]==0 && nums[1]==1 && nums.length==2)
        {
            return 2;
        }
        if(nums[0]==1 && nums[1]==0 && nums.length==2)
        {
            return 2;
        }
        int temp;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
            {
                return i;
            }
        }
        return nums[nums.length-1]+1;
    }
}