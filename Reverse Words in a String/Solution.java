class Solution {
    public String reverseWords(String s) {
        s=s.replace("  "," ");
        String out="";
        String temp="";
        if(s.charAt(s.length()-1)!=' ')
        {
            s=s+" ";
        }
        s=s.replace("   "," ");
        s=s.replace("    "," ");
        s=s.replace("     "," ");
        s=s.replace("      "," ");
        s=s.replace("       "," ");
        for(int i=0;i<s.length();i++)
        {
            out=out+s.charAt(i);
            if(s.charAt(i)==' ')
            {
                temp=out+temp;
                out="";
            }
            else
            {
                continue;
            }
        }
        out=temp;
        temp="";
        for(int i=0;i<out.length()-1;i++)
        {
            temp=temp+out.charAt(i);
            if(out.charAt(0)==' ')
            {
                temp=temp+"";
            }
            
           
        }
        System.out.println(temp);
        if(temp.charAt(0)==' ')
        {
            temp=temp.substring(1,temp.length());
        }
        if(temp.charAt(temp.length()-1)==' ')
        {
        temp=temp.substring(0,temp.length()-1);
        if(temp.charAt(temp.length()-1)==' ')
        {
        temp=temp.substring(0,temp.length()-1);
        }
        }

        return temp.replace("  "," ");
    }
}
