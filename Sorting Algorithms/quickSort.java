import java.util.*;
class quickSort
{
    static void quicksort(int[] arr,int l,int h)
    {
        if(l<h)
        {
            int pi=partition(arr,l,h);
            quicksort(arr,l,pi-1);
            quicksort(arr,pi+1,h);
        }
    }
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int[] arr,int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
    }
    public static void main(String args[])
    {
        int[] arr=new int[]{4,2,1,5};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}