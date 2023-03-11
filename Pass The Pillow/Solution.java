import java.util.Scanner;
class Solution {
    public int passThePillow(int n, int time) {
        int index=1;
        int forward=1;
        while(time--!=0)
        {
             if(forward==1)
             {
                if(index<n)
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
        return index;
             
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        Solution s =new Solution();
        System.out.println(s.passThePillow(n,t));
    }
}
