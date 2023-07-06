class Solution {
    public int sqa(int n)
    {
        int rem,sum=0;
        while(n!=0)
        {
            rem=n%10;
            sum+=rem*rem;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int a=n;
        int b=n;
        while(true)
        {
            a=sqa(a);
            b=sqa(sqa(b));
            if(a==1 || b==1)
            {
                return true;
            }
            if(a==b)
            {
                return false;
            }
        }
    }
}