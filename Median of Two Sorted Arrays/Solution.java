  
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s=0,s1=0;
        double median=0.00;
        for(int n : nums1)
        {
            s++;
        } 
        for(int n1 : nums2)
        {
            s1++;
        } 
        int len=s+s1;
        int[] nums3 =new int[len];
        int pos=0;
        for(int n:nums1)
        {
            nums3[pos]=n;
            pos++;
        }
        for(int n:nums2)
        {
            nums3[pos]=n;
            pos++;
        }
        int temp;
        for(int a = 0; a <len; a++)
      {
         for(int b = 0; b < len-1; b++)
         {
            if(nums3[b] > nums3[b + 1])
            {
               temp = nums3[b];
               nums3[b] = nums3[b + 1];
               nums3[b + 1] = temp;
            }
         }
      }

        int index=len-1;
        if(len%2==1)
        {
                median=nums3[(index+1)/2];
        }
        else
        {
                median=(double)(nums3[(index/2)]+nums3[(index/2)+1])/2;
                
        }
        return median;
    }
}
