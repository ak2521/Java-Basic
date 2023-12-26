class Solution {
    public int divisorSubstrings(int num, int k) {
        ArrayList <String> arr=new ArrayList<String>();
        String str=Integer.toString(num);
        if(str.length()==k)
        {
            return 1;
        }
        for(int i=0;i<=str.length()-k;i++)
        {
            arr.add(str.substring(i,i+k));
        }
        int count=0;
        System.out.println(arr);
        for(String i:arr)
        {
            int check=Integer.parseInt(i);
            if(check==0)
            {
                continue;
            }
            if(num%check==0)
            {
                count++;
            }
        }
        return count;
    }
}