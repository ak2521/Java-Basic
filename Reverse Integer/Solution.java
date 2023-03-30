class Solution {
    public String Rev(String s)
    {
        String op="";
        for(int i=s.length()-1;i>=0;i--)
        {
            op=op+s.charAt(i);
        }
        return op;
    }
    public int reverse(int x) {
        String str=String.valueOf(x);
        String out="";
        int result=0;
        try
        {
        if(str.charAt(0)=='-')
        {
            out=Rev(str.substring(1,str.length()));
            result=-1*(Integer.parseInt(out));
        }
        else
        {
            out=Rev((String)str);
            result=1*(Integer.parseInt(out));
        }
        }
        catch(Exception e)
        {
            return 0;
        }
    return result;
    }
} 
