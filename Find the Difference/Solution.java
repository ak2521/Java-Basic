class Solution {
    public char findTheDifference(String s, String t) {
        if(t.length()>s.length())
        {
            s=s+" ";
        }
        char result='r';
        char[] x=s.toCharArray();
        char[] y=t.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        for(int i=0;i<t.length();i++)
        {
            if(x[i]==y[i])
            {
                continue;
            }
            else
            {
                result=y[i];
            }
        }
    return result;
    }
}
