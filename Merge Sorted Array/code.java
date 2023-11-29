class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []arr1=new int[m];
        for(int i=0;i<m;i++)
        {
            arr1[i]=nums1[i];
        }
        int []arr2=new int[n];
        for(int i=0;i<n;i++)
        {
            arr2[i]=nums2[i];
        }
        int arr3[]=new int[m+n];
        int j,i;
        for(j=0,i=0;i<m;i++,j++)
        {
            arr3[j]=arr1[i];
        }
        for(i=0;i<n;i++,j++)
        {
            arr3[j]=arr2[i];
        }
        Arrays.sort(arr3);
        for(int k=0;k<(m+n);k++)
        {
            nums1[k]=arr3[k];
        }
    }
}