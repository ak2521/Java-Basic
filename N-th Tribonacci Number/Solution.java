class Solution {
    public int tribonacci(int n) {
       int n1=0,n2=1,n3=1,n4=0;
       if(n==0)
       {
           return 0;
       }
       if(n>=1 && n<=2)
       {
           return 1;
       }
       for(int i=2;i<n;i++)
       {
           n4=n1+n2+n3;
           n1=n2;
           n2=n3;
           n3=n4;
       }
       return n4;
    }
}
