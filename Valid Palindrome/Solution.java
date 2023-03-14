class Solution {
    String out="";
    String str="";
    String rev="";
    public void removePunctuations()
    {
        str = str.replaceAll("\\p{Punct}","");
        str = str.replaceAll(" ","");
    }
    public void toLowerCase()
    {
        for(int i=0;i<str.length();i++)
        {
            int x=str.charAt(i);
            if(x>=65 &&x<=90)
            {
                x=x+32;
                out=out+(char)x;
            }
            else
            {
               out=out+(char)x; 
            }
        }
    }
    public void reverseString()
    {
         for(int i=out.length()-1;i>=0;i--)
        {
            rev=rev+out.charAt(i);
        }
    }
    public boolean generateResult(String x,String y)
    {
        boolean result=x.equals(y);
        return result;
    }
    public boolean isPalindrome(String s) 
    {
        str=s;
        removePunctuations();
        toLowerCase();
        reverseString();
        return generateResult(out,rev);
    }
}
