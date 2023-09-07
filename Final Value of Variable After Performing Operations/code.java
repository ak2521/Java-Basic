class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].charAt(1)=='+')
            {
                x+=1;
            }
            else if(operations[i].charAt(1)=='-')
            {
                x-=1;
            }
        }
        return x;
    }
}