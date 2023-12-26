class Solution {
    public boolean isSameAfterReversals(int num) {
        StringBuilder in=new StringBuilder(Integer.toString(num));
        int rev1=Integer.parseInt(in.reverse().toString());
        in=new StringBuilder(Integer.toString(rev1));
        int rev2=Integer.parseInt(in.reverse().toString());
        if(rev2==num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}