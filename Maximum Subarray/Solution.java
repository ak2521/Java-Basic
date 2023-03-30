class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0 , maxi = Integer.MIN_VALUE;
        int i = 0 , j = 0;
        while(j<nums.length){
           
            if(sum < 0 && nums[j] >= sum){
                sum = 0;
            }
            sum += nums[j];
            maxi = Math.max(maxi , sum);
            j++;
        }
        return maxi;
    }
}
