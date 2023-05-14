import java.util.*;
class mergeSort
{
    void mergesort(int[] arr,int l,int r)
    {
        int mid=0;
        if(l<r)
        {
            mid=(l+r)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    
    void merge(int[] arr,int l,int m,int r)
    {
        int low=m-l+1;
        int high=r-m;
        int i=0,j=0;
        int[] Left=new int[low];
        int[] Right=new int[high];
        for(i=0;i<low;i++)
        {
            Left[i]=arr[l+i];
        }
        for(j=0;j<high;j++)
        {
            Right[j]=arr[m+1+j];
        }
        int k=l;
        i=0;j=0;
        while(i<low && j<high)
        {
            if(Left[i]<=Right[j])
            {
                arr[k]=Left[i];
                i++;
            }
            else
            {
                arr[k]=Right[j];
                j++;
            }
            k++;
        }
        while(i<low)
        {
            arr[k]=Left[i];
            i++;
            k++;
        }
        while(j<high)
        {
            arr[k]=Right[j];
            j++;
            k++;
        }
    }
    
    static void print(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String args[])
    {
        int[] arr=new int[]{4,2,1,5};
        System.out.println(Arrays.toString(arr));
        mergeSort m =new mergeSort();
        m.mergesort(arr,0,arr.length-1);
        print(arr);
    }
}