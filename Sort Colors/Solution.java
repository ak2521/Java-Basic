class Solution {
    public void mergeSort(int[] nums,int left,int right)
    {
        int middle=0;
        if(left<right)
        {
            middle=(right+left)/2;
            mergeSort(nums,left,middle);
            mergeSort(nums,middle+1,right);
            merge(nums, left, middle, right); 
        }

    }
    public void merge(int[] nums,int left,int middle,int right )
    {
        int low=middle-left+1;
        int high=right-middle;
        int[] Left =new int[low];
        int[] Right= new int[high];
        int i = 0, j = 0;
        for( i=0;i<low;i++)
        {
            Left[i]=nums[i+left];
        }
        for( j=0;j<high;j++)
        {
            Right[j]=nums[middle+1+j];
        }
        int k=left;
        i=0;
        j=0;
        while(i<low && j<high)
        {
            if(Left[i]<=Right[j])
            {
                nums[k]=Left[i];
                i++;
            }
            else
            {
                nums[k]=Right[j];
                j++;
            }
            k++;
            
        }
         while (i < low)                            
        {
            nums[k] = Left[i];
            i++;
            k++;
        }
 
        while (j < high)                           
        {
            nums[k] = Right[j];
            j++;
            k++;
        }
    }
    public void sortColors(int[] nums) {
        mergeSort(nums,0,nums.length-1);
    }
}
