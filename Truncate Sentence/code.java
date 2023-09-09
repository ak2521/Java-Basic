class Solution {
    public String truncateSentence(String s, int k) {
        String []arr=s.split(" ");
        String res="";
        for(int i=0;i<k-1;i++)
        {
            res+=arr[i]+" ";
        }
        res+=arr[k-1];
        return res;
    }
}