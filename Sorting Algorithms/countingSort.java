import java.util.*;
class countingSort
{
    static void sort(int[] arr)
    {
        int max=Arrays.stream(arr).max().getAsInt();
        int min=Arrays.stream(arr).min().getAsInt();
        int range=max-min+1;
        int[] count =new int[range];
        int[] output=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]-min]++;
        }
        int index=0;
        for(int i=0;i<count.length;i++)
        {
            for(int j=0;j<count[i];j++)
            {
                output[index++]=i+min;
            }
        }
        System.out.println(Arrays.toString(output));
    }
    public static void main(String args[])
    {
        int[] arr={5,5,5,4,4,3,3,3,6,6,6,6,6,-2,-2,-1,0,0};
        sort(arr);
    }
}