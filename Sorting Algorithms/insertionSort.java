import java.util.*;
class insertionSort
{
    static void sort(int[] arr)
    {
        int n=arr.length,i,j;
        for(i=1;i<n;i++)
        {
            int key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[])
    {
        sort(new int[] {4,3,2,10,12,1,5,6});
    }
}