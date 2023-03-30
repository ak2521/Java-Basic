class Solution {
    public int singleNumber(int[] nums) {
        List<Integer>ys=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!ys.contains(nums[i]))
            {
                ys.add(nums[i]);
            }
            else
            {
                ys.remove(Integer.valueOf(nums[i]));
            }
        }
    return ys.get(0);
    }
}
