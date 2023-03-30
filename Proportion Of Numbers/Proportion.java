import java.util.*;
class Proportion 
{
    public static int postive(int[] nums)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                count++;
            }
        }
        return count;
    }
    public static int negative(int[] nums)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                count++;
            }
        }
        return count;
    }
    public static int neutral(int[] nums)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int[] arr=new int[size];
       for(int i=0;i<size;i++)
       {
           arr[i]=sc.nextInt();
       }
       float pos=(float)postive(arr)/size;
       float neg=(float)negative(arr)/size;
       float neu=(float)neutral(arr)/size;
       System.out.println((int)(pos*size)+"/"+size+" , "+(int)(neu*size)+"/"+size+" , "+(int)(neg*size)+"/"+size);
       System.out.println(pos+" , "+neu+" , "+neg);
    }
}
