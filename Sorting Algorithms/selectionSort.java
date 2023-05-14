import java.util.*;
class selectionSort
{
    public void sort(int arr[])
    {
        int size=arr.length;
        int min,i=0,j=0;
        for(i=0;i<size-1;i++)
        {
            min=i;
            for(j=i+1;j<size;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        
    }
    public static void main(String args[])
    {
        selectionSort s =new selectionSort();
        s.sort(new int[] {5,6,1,2,8,9,3,12,10,0,20,17,15,12,30,92,100,55,-1,6,-2});
    }
}