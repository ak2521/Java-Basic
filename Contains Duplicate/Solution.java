import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len=0;
        Arrays.sort(nums);
        for(int i:nums)
        {
            len++;
        }
        int b=nums[0];
        for(int i=1;i<len;i++)
        {
            if(nums[i]==b)
            {
                return true;
            }
            else
            {
                b=nums[i];
            }
        }
        return false;
    }
} 
