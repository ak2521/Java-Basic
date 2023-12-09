class Solution {
    public int differenceOfSum(int[] nums) {
        String []strarr=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            strarr[i]=Integer.toString(nums[i]);
        }
        String res="";
        for(int i=0;i<nums.length;i++)
        {
            res+=strarr[i];
        }
        int sum1=0,sum2=0;
        for(int i=0;i<nums.length;i++)
        {
            sum1+=nums[i];
        }
        for(int i=0;i<res.length();i++)
        {
            sum2+=Integer.parseInt(String.valueOf(res.charAt(i)));
        }
        int dif=((sum1-sum2)>0)?sum1-sum2:((sum1-sum2)*-1);
        return dif;
    }
}