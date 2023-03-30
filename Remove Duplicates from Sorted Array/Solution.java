class Solution {
    public int removeDuplicates(int[] nums) {
     int c=0;
     for(int i=0;i<nums.length;i++)
     {
         if(nums[c]!=nums[i])
         {
            c++;
            nums[c]=nums[i];
         }
     }
     return c+1;
}
}
