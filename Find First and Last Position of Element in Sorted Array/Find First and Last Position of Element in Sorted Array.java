class Solution {
    public int[] searchRange(int[] nums, int target) {
        int flag=0,a=-1,b=-1,count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target && flag==0)
                {
                    a=i;
                    flag=1;
                    count++;
                    continue;
                }
            if(nums[i]==target && flag==1)
                {
                    b=i;
                count++;
                }

        }
        int arr[] = new int[2];
        arr[0] =a;
        arr[1]=b;
        if(count == 1)
        arr[1]=a;
        return arr;
        
    }
}
