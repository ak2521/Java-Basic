class Solution {
    public String sortSentence(String s) {
        String []arr=s.split(" ");
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i].charAt(arr[i].length()-1)>arr[i+1].charAt(arr[i+1].length()-1))
            {
                String temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }
        }
        String res="";
        for(int i=0;i<arr.length-1;i++)
        {
            res+=arr[i].substring(0,arr[i].length()-1)+" ";
        }
        res+=arr[arr.length-1].substring(0,arr[arr.length-1].length()-1);
        return res;
    }
}