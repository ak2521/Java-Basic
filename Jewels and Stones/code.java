class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        for(int i=0;i<jewels.length();i++)
        {
            for(int j=0;j<stones.length();j++)
            {
                if(jewels.charAt(i)==stones.charAt(j))
                {
                    c++;
                }
            }
        }
        return c;
    }
}