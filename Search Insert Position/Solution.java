class Solution {
    int result=-1;
    int res=0;
    public void find(int nums[],int target,int start,int end)
    {
        for(int i=start;i<end;i++)
        {
            if(nums[i]==target)
            {
                result=i;
            }
            
            if(target-1==nums[i])
            {
                res=i+1;
            }
            if(target+1==nums[i])
            {
                res=i;
            }

        }

    }
    public int searchInsert(int[] nums, int target) {
        
        int len=nums.length;
        if(target>nums[len-1])
        {
            return len;
        }
        find(nums,target,0,len/2);
        find(nums,target,len/2,len); 
        return result==-1 ? res : result;
    }
}
