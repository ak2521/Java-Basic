class Solution {
    public int[] sortArrayByParity(int[] nums) 
{
    int e=0;
    int o=0;
    int[] result =new int[nums.length];
    if(nums.length<=0)
    {
        return nums;
    }
    List<Integer>even=new ArrayList<Integer>();
    List<Integer>odd=new ArrayList<Integer>();  
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]%2==0)
        {
            even.add(nums[i]);
            e++;
        }
        else
        {
            odd.add(nums[i]);
            o++;
        }
    }
    int pos=0;
    for(int i=0;i<e;i++)
    {
       result[i]=even.get(i); 
       pos++;
    }
    for(int i=0;i<o;i++)
    {
       result[pos]=odd.get(i); 
       pos++;
    }
        return result;
}
}
