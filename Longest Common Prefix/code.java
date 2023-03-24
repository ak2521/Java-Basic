class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str="";
        int max=201;
        for(int i=0;i<strs.length;i++)
        {
            if(strs[i].length()<max)
            {
                max=strs[i].length();
            }
        }
        int flag=0;
        if(strs.length==1)
        {
            return strs[0];
        }
        for(int i=0;i<max;i++)
        {
            for(int j=0;j<strs.length-1;j++)
            {
                if(strs[j].charAt(i)==strs[j+1].charAt(i))
                {
                    flag=1;
                }
                else
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                str+=strs[0].charAt(i);
            }
            else if(flag==0)
            {
                break;
            }
        }
        return str;
    }
}