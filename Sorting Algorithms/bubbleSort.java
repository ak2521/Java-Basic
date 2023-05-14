import java.util.*;
class bubbleSort
{
    static void sort(int[] arr)
    {
        int n=arr.length;
        boolean swapped=false;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(i>=1 && swapped!=true)
            {
                System.out.println(Arrays.toString(arr)+" O(n)");
                System.exit(0);
            }
        }
        System.out.println(Arrays.toString(arr)+" O(n*n)");
    }
    public static void main(String args[])
    {
        sort(new int[] {13,32,26,35,10}); //avg case 
        sort(new int[] {1,2,3,4,5}); //best case
    }
}