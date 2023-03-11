import java.util.Scanner;
class Solution {
    public int fillTheCandies(int boxes, int candies) {
        int index=1;
        int forward=1;
        while(candies--!=0)
        {
             if(forward==1)
             {
                if(index<boxes)
                {
                    index++;
                }
                else
                {
                    index--;
                    forward=0;
                }
             }
             else
             {
                 if(index>1)
                 {
                     index--;
                 }
                 else
                 {
                     index++;
                     forward=1;
                 }
             }
        }
        return index-1;
             
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int tc=sc.nextInt();
        for(int i=0;i<tc;i++)
        {
        int n=sc.nextInt();
        int t=sc.nextInt();
        Solution s =new Solution();
        System.out.println(s.fillTheCandies(n,t));
        }
       
    }
}