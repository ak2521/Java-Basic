class Solution 
{
    public boolean isHappy(int n) 
    {
        HashSet<Integer> set=new HashSet();
        while(n!=0 && !set.contains(n))
        {
            set.add(n);
            n=reduceFurther(n);
        }
        return n==1;
    }
    public int reduceFurther(int n)
    {
       int sum=0;
       while(n>0)
       {
           int remainder=n%10;
           sum=sum+(remainder*remainder);
           n=n/10;
       }
       return sum;
    }
}
