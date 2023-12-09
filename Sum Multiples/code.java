class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%3==0)
            {
                sum+=i;
                continue;
            }
            if(i%5==0)
            {
                sum+=i;
                continue;
            }
            if(i%7==0)
            {
                sum+=i;
                continue;
            }
        }
        return sum;
    }
}