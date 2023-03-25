class Solution {
    public boolean isPerfectSquare(int n) {
        long num=n;
        if(n==1)
        {
            return true;
        }
        else if(n==0)
        {
            return false;
        }
        for(long i=num/2;i>0;i--)
        {
            if(i*i==num)
            {
                return true;
            }
        }
        return false;
    }
}
