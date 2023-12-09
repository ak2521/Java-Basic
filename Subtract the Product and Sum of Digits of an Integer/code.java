class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1,sum=0;
        String num=Integer.toString(n);
        for(int i=0;i<num.length();i++)
        {
            mul*=Integer.parseInt(String.valueOf(num.charAt(i)));
            sum+=Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        return mul-sum;
    }
}