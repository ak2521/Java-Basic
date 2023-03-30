class Solution {
    public List<String> fizzBuzz(int n) {
        List<String>lt=new ArrayList<String>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                lt.add("FizzBuzz");
            }
            else if(i%3==0 && i%5!=0)
            {
                lt.add("Fizz");
            }
            else if(i%3!=0 && i%5==0)
            {
                lt.add("Buzz");
            }
            else
            {
                lt.add(String.valueOf(i));
            }
        }
        return lt;
    }
}
