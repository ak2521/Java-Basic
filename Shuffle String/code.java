class Solution {
    public String restoreString(String s, int[] indices) {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<indices.length;j++)
            {
                if(indices[j]==-1)
                {
                    continue;
                }
                if(indices[j]==i)
                {
                    res+=s.charAt(j);
                    indices[j]=-1;
                }
            }
        }
        return res;
    }
}